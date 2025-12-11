class CourseProject {
    static int maxCapacity = 100;
    String CourseName;
    int enrollment;
    String[] enrolledStudents;

    CourseProject(String courseName){
        this.CourseName = courseName;
        this.enrollment = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        CourseProject.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        if (enrollment >= maxCapacity) {
            System.out.println("Cannot enroll. Capacity full!");
            return;
        }
        enrolledStudents[enrollment] = studentName;
        enrollment++;
        System.out.println(studentName + " enrolled successfully!");
    }

    void unenrollStudent(String studentName){
        int index = -1;
        for (int i = 0; i < enrollment; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Student not found!");
            return;
        }

        for (int i = index; i < enrollment - 1; i++) {
            enrolledStudents[i] = enrolledStudents[i + 1];
        }
        enrolledStudents[enrollment - 1] = null;
        enrollment--;
        System.out.println(studentName + " has been unenrolled.");
    }

    // <-- ADD THIS main METHOD to run the class directly
    public static void main(String[] args) {
        CourseProject cp = new CourseProject("Java 101");
        cp.enrollStudent("Arya");
        cp.enrollStudent("Rohit");
        cp.enrollStudent("Mehak");

        System.out.println("Enrollment before: " + cp.enrollment);
        cp.unenrollStudent("Rohit");
        System.out.println("Enrollment after: " + cp.enrollment);

        cp.unenrollStudent("Unknown"); // shows "Student not found!"
    }
}
