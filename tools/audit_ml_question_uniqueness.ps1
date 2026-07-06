$ErrorActionPreference = 'Stop'

$files = Get-ChildItem "$PSScriptRoot\..\WIA1006-ML\Exercise\Chapter-*-100-Extreme-Hard-Questions.md"
if ($files.Count -ne 8) { throw "Expected 8 chapter files, found $($files.Count)" }

foreach ($file in $files) {
    $text = Get-Content -Raw -Encoding UTF8 $file.FullName
    if ($text -match '\$\\mu_lti\$') { throw "$($file.Name): contains corrupted multi-step LaTeX" }
    foreach ($line in ($text -split "`r?`n")) {
        if (([regex]::Matches($line, '(?<!\\)\$').Count % 2) -ne 0) { throw "$($file.Name): unbalanced inline LaTeX on line: $line" }
    }
    $rawMath = 'sum\(|sqrt\(|exp\(|log2|theta_[01]|Theta_[01]|alpha=|gamma=|sigma\^2=|pi=\[|mu=\[|w\^T|\|\|w\|\||P\(\+\|C\)|P\(\+\|not C\)'
    $plainText = [regex]::Replace($text, '\$[^$\r\n]+\$', '')
    if ($plainText -match $rawMath) { throw "$($file.Name): contains an unformatted raw-math token: $($Matches[0])" }
    $questions = @([regex]::Matches($text, '(?m)^\*\*Question:\*\* (.+)$') | ForEach-Object { $_.Groups[1].Value.Trim() })
    $answers = @([regex]::Matches($text, '(?m)^\*\*Correct Answer:\*\* (.+)$') | ForEach-Object { $_.Groups[1].Value.Trim() })
    $explanations = @([regex]::Matches($text, '(?m)^\*\*Explanation:\*\* (.+)$') | ForEach-Object { $_.Groups[1].Value.Trim() })

    if ($questions.Count -ne 100) { throw "$($file.Name): expected 100 questions" }
    if ($questions -match '\bCase \d+:') { throw "$($file.Name): contains artificial Case numbering" }
    if (@($answers | Group-Object | Where-Object Count -gt 1).Count) { throw "$($file.Name): repeats correct-answer text" }
    if (@($explanations | Group-Object | Where-Object Count -gt 1).Count) { throw "$($file.Name): repeats explanation text" }

    # Numbers are erased so parameter-only clones collapse into the same family.
    $families = @($questions | ForEach-Object {
        ($_ -replace '-?\d+(?:\.\d+)?', '#' -replace '\s+', ' ').ToLowerInvariant()
    })
    $duplicates = @($families | Group-Object | Where-Object Count -gt 1)
    if ($duplicates.Count) { throw "$($file.Name): contains $($duplicates.Count) parameter-only duplicate families" }

    $headings = @([regex]::Matches($text, '(?m)^## Question (\d+)\s*$'))
    $distribution = @{ A = 0; B = 0; C = 0; D = 0 }
    $longestCorrect = 0
    for ($i = 0; $i -lt 100; $i++) {
        if ([int]$headings[$i].Groups[1].Value -ne $i + 1) { throw "$($file.Name): broken numbering at $($i + 1)" }
        $start = $headings[$i].Index + $headings[$i].Length
        $end = if ($i -lt 99) { $headings[$i + 1].Index } else { $text.IndexOf('### Answer distribution', $start) }
        $block = $text.Substring($start, $end - $start)
        $options = @([regex]::Matches($block, '(?m)^- \*\*([ABCD])\.\*\* (.+)$'))
        if ($options.Count -ne 4) { throw "$($file.Name) Q$($i + 1): expected four choices" }
        $values = @($options | ForEach-Object { $_.Groups[2].Value.Trim() })
        if (($values | Sort-Object -Unique).Count -ne 4) { throw "$($file.Name) Q$($i + 1): duplicate choices" }
        $answer = [regex]::Match($block, '(?m)^\*\*Correct Answer:\*\* (.+)$').Groups[1].Value.Trim()
        $resolved = @($options | Where-Object { $_.Groups[2].Value.Trim() -eq $answer })
        if ($resolved.Count -ne 1) { throw "$($file.Name) Q$($i + 1): answer resolves $($resolved.Count) times" }
        $letter = $resolved[0].Groups[1].Value
        $distribution[$letter]++
        $lengths = @($values | ForEach-Object { $_.Length })
        $answerIndex = 'ABCD'.IndexOf($letter)
        if ($lengths[$answerIndex] -eq ($lengths | Measure-Object -Maximum).Maximum -and @($lengths | Where-Object { $_ -eq $lengths[$answerIndex] }).Count -eq 1) { $longestCorrect++ }
    }
    if ($distribution.A -ne 25 -or $distribution.B -ne 25 -or $distribution.C -ne 25 -or $distribution.D -ne 25) { throw "$($file.Name): answer positions are not 25/25/25/25" }
    if ($longestCorrect -gt 15) { throw "$($file.Name): correct answer is uniquely longest $longestCorrect times" }

    "PASS $($file.Name): 100 distinct prompts; A/B/C/D=25 each; longest-answer clues=$longestCorrect"
}
