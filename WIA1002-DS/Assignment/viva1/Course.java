/**
 * The Course interface acts as an Abstract Data Type (ADT) 
 * defining the core contract for all university courses.
 */
public interface Course {

    /**
     * Returns the course's unique code.
     * @return A String representing the unique course code.
     */
    String getCourseCode();

    /**
     * Returns the course's title.
     * @return A String representing the title of the course.
     */
    String getCourseTitle();

    /**
     * Returns the total workload hours for the course per semester.
     * @return An integer representing the total workload in hours.
     */
    int calculateTotalWorkload();

    /**
     * Returns the name of the assigned instructor.
     * @return A String representing the instructor's name.
     */
    String getInstructorName();

    /**
     * Prints all relevant information about the course to the console.
     */
    void printCourseDetails();
}