/**
 * Represents a laboratory course in the system.
 * This class implements the Course interface and provides specific details
 * and calculations related to lab-based courses.
 */
public class LabCourse implements Course {
    private String courseCode;
    private String courseTitle;
    private String instructorName;
    private double labHoursPerWeek;
    private int numberOfSessions;

    /**
     * Constructs a new LabCourse with the specified details.
     *
     * @param courseCode       The unique code identifying the course
     * @param courseTitle      The title of the course
     * @param instructorName   The name of the instructor teaching the lab
     * @param labHoursPerWeek  The number of lab hours scheduled per week
     * @param numberOfSessions The number of lab sessions per week
     */
    public LabCourse(String courseCode, String courseTitle, String instructorName, 
                     double labHoursPerWeek, int numberOfSessions) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.instructorName = instructorName;
        this.labHoursPerWeek = labHoursPerWeek;
        this.numberOfSessions = numberOfSessions;
    }

    /**
     * Retrieves the course code.
     *
     * @return The course code
     */
    @Override
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Retrieves the course title.
     *
     * @return The course title
     */
    @Override
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Retrieves the instructor's name.
     *
     * @return The instructor's name
     */
    @Override
    public String getInstructorName() {
        return instructorName;
    }

    /**
     * Calculates the total workload for the lab course over a standard 14-week semester.
     * Total workload is computed as: lab hours per week * number of sessions * 14 weeks.
     *
     * @return The total workload in hours
     */
    @Override
    public int calculateTotalWorkload() {
        // Workload is labHoursPerWeek * numberOfSessions * 14 weeks
        return (int) (labHoursPerWeek * numberOfSessions * 14);
    }

    /**
     * Prints the complete details of the lab course to the standard output.
     * The output includes the course title, code, instructor, hours, sessions, and total workload.
     */
    @Override
    public void printCourseDetails() {
        System.out.println("Lab Course: " + courseTitle + " (" + courseCode + ")");
        System.out.println(" Instructor: " + instructorName);
        System.out.println(" Lab Hours/Week: " + labHoursPerWeek);
        System.out.println(" Number of Sessions: " + numberOfSessions);
        System.out.println(" Total Workload (Semester): " + calculateTotalWorkload() + " hours");
    }
}