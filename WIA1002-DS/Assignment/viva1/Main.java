/**
 * Demonstrates usage of the Course ADT implementation.
 * Creates lecture and lab courses, manages them with CourseManager,
 * and performs workload-related operations.
 */
public class Main {
    /**
     * Entry point of the program.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // 1. Create two LectureCourse objects and two LabCourse objects
        LectureCourse lec1 = new LectureCourse("CS101", "Intro to Programming", "Dr. Smith", 3);
        LectureCourse lec2 = new LectureCourse("CS102", "Object-Oriented Programming", "Prof. Lee", 4);
        
        LabCourse lab1 = new LabCourse("CS201", "Data Structures Lab", "Prof. Jones", 2.5, 2);
        LabCourse lab2 = new LabCourse("CS202", "Algorithms Lab", "Dr. Brown", 2.0, 1);

        // 2. Create a CourseManager instance
        CourseManager<Course> manager = new CourseManager<>();

        // 3. Add all the created courses to the manager
        manager.addCourse(lec1);
        manager.addCourse(lec2);
        manager.addCourse(lab1);
        manager.addCourse(lab2);

        // 4. Print the details of the course with the highest total workload
        System.out.println("\n=== Course with Highest Workload ===");
        Course highest = manager.getCourseWithHighestWorkload();
        if (highest != null) {
            highest.printCourseDetails();
        }

        // 5. Sort the courses by their total workload and print all course details
        System.out.println("\n=== Courses Sorted by Workload (Ascending) ===");
        manager.sortCoursesByWorkload();
        manager.printAllCourses();

        // 6. Remove a course by its course code and print the remaining course details
        System.out.println("\n=== Removing CS101... ===");
        manager.removeCourse("CS101");
        
        System.out.println("\n=== Remaining Courses ===");
        manager.printAllCourses();
    }
}