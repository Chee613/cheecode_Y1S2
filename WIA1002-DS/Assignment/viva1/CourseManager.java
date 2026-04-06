import java.util.ArrayList;
import java.util.Comparator;

/**
 * Manages a collection of courses and provides utility operations
 * such as add, remove, search by workload, sorting, and printing.
 *
 * @param <T> A type that implements the Course interface
 */
public class CourseManager<T extends Course> {
    private ArrayList<T> courses;

    /**
     * Creates an empty course manager.
     */
    public CourseManager() {
        this.courses = new ArrayList<>();
    }

    /**
     * Adds a course to the manager.
     *
     * @param course The course to add
     */
    public void addCourse(T course) {
        courses.add(course);
    }

    /**
     * Removes course(s) that match the given course code.
     *
     * @param courseCode The unique course code to remove
     */
    public void removeCourse(String courseCode) {
        courses.removeIf(course -> course.getCourseCode().equals(courseCode));
    }

    /**
     * Finds the course with the highest total workload.
     *
     * @return The course with the highest workload, or null if no courses exist
     */
    public T getCourseWithHighestWorkload() {
        if (courses.isEmpty()) return null;
        
        T highestCourse = courses.get(0);
        for (T course : courses) {
            if (course.calculateTotalWorkload() > highestCourse.calculateTotalWorkload()) {
                highestCourse = course;
            }
        }
        return highestCourse;
    }

    /**
     * Sorts courses by total workload in ascending order.
     */
    public void sortCoursesByWorkload() {
        courses.sort(Comparator.comparingInt(Course::calculateTotalWorkload));
    }

    /**
     * Prints details for all courses currently stored in the manager.
     */
    public void printAllCourses() {
        System.out.println("--- All Courses ---");
        for (T course : courses) {
            course.printCourseDetails();
            System.out.println("-------------------");
        }
    }
}

