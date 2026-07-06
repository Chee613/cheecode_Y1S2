Just a quick reminder before we generate the assets for **bird.png**: **GPT-2** is an older text-only model and cannot generate images. To bring this new IP to life, you will need to plug these prompts into a modern image generator like **DALL-E 3** or **Midjourney**. If you use Midjourney, remember to use the `--cref <image_url>` parameter with your bird.png file to lock in the character's exact design.

To make sure you don't have to rewrite any code or rename files in your web app's repository, I have kept the exact same 68 `snake_case` filenames from your previous list.

Here is the master prompt system adapted for your new cheerful bird character.

### 1. The Master Prompts

Always paste your chosen Master Prompt first, and then append the specific Action Modifier for each image.

**Standard Master Prompt (Matches the reference art):**

> "A 2D vector flat illustration of a cute, chubby red bird character. The bird has bright coral red feathers, large expressive eyes, and a yellow beak. It is wearing a mint-green headband and a matching mint-green cleaning apron with pockets and a leaf emblem. The art style is clean, modern, and cheerful, featuring thick dark outlines, soft cel-shading, vibrant colors, set against a pure white background."

**Alternative Retro UI Master Prompt (Optimized for digital components):**

> "A retro 32-bit pixel art illustration of a cute chubby red bird character wearing a mint-green apron and headband. The art style mimics classic Windows 98 flat UI design, using strict aliased edges, crisp pixels, limited web-safe vibrant colors, and a pure white background."

---

### 2. Action Modifiers & Asset List

Append the action modifier (the text in quotes) to your chosen Base Prompt to generate the corresponding asset.

#### 1. Main Hero Pose

* `felix_hero_pose.png`: "...Standing proudly, smiling, holding a green spray bottle in one wing."

#### 2. Character Turnaround

* `turnaround_front.png`: "...Standing neutral, front view."
* `turnaround_3_4_front.png`: "...Standing neutral, 3/4 front perspective."
* `turnaround_side.png`: "...Standing neutral, side profile."
* `turnaround_back.png`: "...Standing neutral, back view."
* `turnaround_3_4_back.png`: "...Standing neutral, 3/4 back perspective."

#### 3. Expression Sheet

* `expression_neutral_blank.png`: "...Close-up, calm neutral eyes and beak."
* `expression_happy.png`: "...Close-up, happy smiling eyes and open beak."
* `expression_confused.png`: "...Close-up, confused expression, floating question marks."
* `expression_thinking.png`: "...Close-up, focused and thinking expression."
* `expression_proud.png`: "...Close-up, proud expression, chest puffed out."
* `expression_sleepy.png`: "...Close-up, sleepy closed eyes, floating Zzzs."
* `expression_tired.png`: "...Close-up, tired and exhausted expression, heavy eyelids."
* `expression_surprised.png`: "...Close-up, wide surprised eyes with exclamation marks."
* `expression_worried.png`: "...Close-up, worried expression, sweating slightly."
* `expression_relieved.png`: "...Close-up, relieved expression, sighing happily."
* `expression_determined.png`: "...Close-up, sharply determined eyes, fiery focus."
* `expression_embarrassed.png`: "...Close-up, embarrassed expression, blushing cheeks."
* `expression_excited.png`: "...Close-up, excited expression, sparkling star eyes."
* `expression_supportive.png`: "...Close-up, supportive gentle smile, tear of joy."

#### 4. Home Cleaning Poses

* `cleaning_sweeping_floor.png`: "...Sweeping the floor with a wooden broom."
* `cleaning_mopping_floor.png`: "...Mopping the floor with a mop and bucket."
* `cleaning_wiping_table.png`: "...Wiping a small table with a blue cloth."
* `cleaning_dusting_shelves.png`: "...Using a feather duster on a shelf."
* `cleaning_vacuuming.png`: "...Pushing a modern vacuum cleaner."
* `cleaning_spray_and_wipe.png`: "...Holding a spray bottle and a wiping cloth."
* `cleaning_washing_dishes.png`: "...Washing a plate in a basin of soapy water."
* `cleaning_folding_laundry.png`: "...Folding a stack of clean towels."
* `cleaning_carrying_laundry_basket.png`: "...Carrying a heavy laundry basket."
* `cleaning_taking_out_trash.png`: "...Carrying a tied trash bag."
* `cleaning_organizing_boxes.png`: "...Organizing cardboard moving boxes."
* `cleaning_cleaning_windows.png`: "...Using a squeegee to clean a glass window."
* `cleaning_scrubbing_small_stain.png`: "...Scrubbing a floor stain with a brush."

#### 5. Home Routine Poses

* `routine_cooking_in_kitchen.png`: "...Holding a spatula, cooking in a pot."
* `routine_holding_grocery_list.png`: "...Checking a paper grocery list."
* `routine_watering_plant.png`: "...Watering a potted indoor plant with a can."
* `routine_arranging_pillows.png`: "...Fluffing and arranging a comfy pillow."
* `routine_sitting_on_floor_resting.png`: "...Resting on a soft cushion peacefully."
* `routine_drinking_tea.png`: "...Sitting and drinking from a teacup."
* `routine_sleeping_after_chores.png`: "...Sleeping soundly next to cleaning supplies."
* `routine_stretching_during_break.png`: "...Standing and stretching wings happily."
* `routine_lying_down_lazily.png`: "...Lying down flat, feeling lazy."

#### 6. App-Specific Poses

* `app_pointing_start_cleaning.png`: "...Pointing forward at a UI 'Start' button."
* `app_holding_cleaning_checklist.png`: "...Holding up a clipboard with a checklist."
* `app_holding_calendar.png`: "...Holding up a monthly calendar."
* `app_showing_todays_chores.png`: "...Pointing to a daily chore list."
* `app_holding_reminder_card.png`: "...Holding a reminder card with a bell icon."
* `app_celebrating_completed_chores.png`: "...Celebrating with a gold trophy and sparkles."
* `app_cheering_cleaning_streak.png`: "...Cheering happily with a streak badge."
* `app_looking_shocked_overdue.png`: "...Looking shocked, holding a magnifying glass."
* `app_sitting_beside_empty_list.png`: "...Sitting calmly next to a blank paper."
* `app_holding_big_checkmark.png`: "...Holding a giant green checkmark symbol."
* `app_showing_all_done.png`: "...Jumping happily, surrounded by sparkles for 'All Done'."
* `app_confused_user_skipped_task.png`: "...Looking confused, scratching its head."
* `app_gently_encouraging_continue.png`: "...Holding a megaphone, cheering encouragingly."

#### 8. App-Ready Versions

* `asset_full_body_mascot.png`: "...Full body standing, simple forward pose."
* `asset_app_icon_1024px.png`: "...Close-up face only, framed tightly as a square app icon."
* `asset_small_avatar_128px.png`: "...Small simplified avatar face."
* `asset_monochrome_version.png`: "...Black, white, and grey grayscale version only, no colors."
* `asset_notification_icon.png`: "...Tiny minimalist face for a UI notification."
* `asset_simplified_tiny_ui.png`: "...Ultra-simplified tiny UI icon version."

#### 9. Sticker / Emote Set

* `sticker_thumbs_up.png`: "...Giving a cheerful wing thumbs-up, sticker style."
* `sticker_sleepy.png`: "...Curled up sleeping with Zzzs, sticker style."
* `sticker_cheering.png`: "...Jumping and cheering happily, sticker style."
* `sticker_confused.png`: "...Confused face with question mark, sticker style."
* `sticker_love.png`: "...Smiling face with floating hearts, sticker style."
* `sticker_all_done.png`: "...Sitting happily surrounded by sparkles, sticker style."
* `sticker_tea_break.png`: "...Sitting and drinking a warm cup of tea, sticker style."