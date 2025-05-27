// Design a Course class.
// • Instance variables: courseName, enrolledStudents.
// • Static variable: maxCapacity, the maximum number of students for any course.
// • Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).
// • Static method: setMaxCapacity(int capacity), to set the maximum capacity for courses.

public class Course {
    // instance variable
    String courseName;
    String[] enrolledStudents;
    int currentCount = 0;

    // static variable
    static int maxCapacity;

    // constructor
    Course(String courseName) {
        this.courseName = courseName;
        enrolledStudents = new String[maxCapacity];
        currentCount = 0;
    }

    // instance method to enroll a student
    public void enrolledStudents(String studentName) {
        if (currentCount < maxCapacity) {
            enrolledStudents[currentCount] = studentName;
            currentCount++;
            System.out.println(studentName + " has been enrolled in " + courseName);
        } else {
            System.out.println("Cannot enroll " + studentName + ". Course is at full capacity.");
        }
    }

    // static method to unenroll a student
    public void unenrolledStudents(String studentName) {
        boolean found = false;
        for (int i = 0; i < currentCount; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                // Shift remaining students left
                for (int j = i; j < currentCount - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[currentCount - 1] = null; // Clear last slot
                currentCount--;
                found = true;
                System.out.println(studentName + " has been unenrolled from " + courseName);
                break;
            }
        }
        if (!found) {
            System.out.println(studentName + " is not enrolled in " + courseName);
        }
    }

    // Static method to set max capacity
    public static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

    // Display enrolled students
    public void displayStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (int i = 0; i < currentCount; i++) {
            System.out.println("- " + enrolledStudents[i]);
        }
    }

    public static void main(String[] args) {
        // set maximum capacity
        Course.setMaxCapacity(3);

        // creating course
        Course python = new Course("Python");

        // enroll student
        python.enrolledStudents("Alice");
        python.enrolledStudents("Bob");
        python.enrolledStudents("Charlie");
        python.enrolledStudents("David"); // Should show capacity full

        // display student details
        python.displayStudents();

        // unenroll student
        python.unenrolledStudents("Bob");

        // display student details
        python.displayStudents();
    }
}

// OUTPUT:::

// Alice has been enrolled in Python
// Bob has been enrolled in Python
// Charlie has been enrolled in Python
// Cannot enroll David. Course is at full capacity.

// Students enrolled in Python:
// - Alice
// - Bob
// - Charlie

// Bob has been unenrolled from Python

// Students enrolled in Python:
// - Alice
// - Charlie