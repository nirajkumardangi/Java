class Student {
    // Private Data Members (Encapsulated)
    private String name;
    private int marks;
    private int rollNumber;

    // Public Getter for Name
    public String getName() {
        return name;
    }

    // Public Setter for name with optional validation
    public void setName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.name = newName;
        } else {
            System.out.println("Invalid name. Cannot be empty.");
        }
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Setter for marks with range check
    public void setMarks(int newMarks) {
        if (newMarks >= 0 && newMarks <= 100) {
            this.marks = newMarks;
        } else {
            System.out.println("Invalid marks. Must be between 0 and 100.");
        }
    }

    // Getter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter for rollNumber
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}

public class Encapsulation {
    // Main Method
    public static void main(String[] args) {
        Student niraj = new Student();

        // set valid name, marks, rollNumber via setter method
        niraj.setName("Niraj Kumar Dangi");
        niraj.setMarks(98);
        niraj.setRollNumber(27);

        // Accessing private data via public getter methods
        System.out.println("Name: " + niraj.getName());
        System.out.println("Roll No: " + niraj.getRollNumber());
        System.out.println("Marks: " + niraj.getMarks());

        // can't do this
        // niraj.name = 'Dangi';
    }
}
