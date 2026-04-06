/**
 * Represents a lecture-based course.
 * Stores lecture-specific data and calculates semester workload.
 */
public class LectureCourse implements Course {
    private String courseCode;
    private String courseTitle;
    private String instructorName;
    private int lectureHoursPerWeek;

    /**
     * Constructs a lecture course with the given details.
     *
     * @param courseCode The unique course code
     * @param courseTitle The title of the course
     * @param instructorName The instructor's name
     * @param lectureHoursPerWeek Weekly lecture hours
     */
    public LectureCourse(String courseCode, String courseTitle, String instructorName, int lectureHoursPerWeek) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.instructorName = instructorName;
        this.lectureHoursPerWeek = lectureHoursPerWeek;
    }

    /**
     * Returns the course code.
     *
     * @return The course code
     */
    @Override
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Returns the course title.
     *
     * @return The course title
     */
    @Override
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Calculates total lecture workload for a 14-week semester.
     *
     * @return Total workload in hours
     */
    @Override
    public int calculateTotalWorkload() {
        // Workload is lecture hours per week * number of weeks in a semester (assume 14 weeks)
        return lectureHoursPerWeek * 14;
    }

    /**
     * Returns the instructor's name.
     *
     * @return The instructor's name
     */
    @Override
    public String getInstructorName() {
        return instructorName;
    }

    /**
     * Prints complete lecture course details to the console.
     */
    @Override
    public void printCourseDetails() {
        System.out.println("Lecture Course: " + courseTitle + " (" + courseCode + ")");
        System.out.println(" Instructor: " + instructorName);
        System.out.println(" Lecture Hours/Week: " + lectureHoursPerWeek);
        System.out.println(" Total Workload (Semester): " + calculateTotalWorkload() + " hours");
    }
}