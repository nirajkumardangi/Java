public class Throw {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Access granted. Age is " + age);
    }

    public static void main(String[] args) {
        try {
            checkAge(14);
        } catch (IllegalArgumentException e) {
            System.out.println("Argument Exception: " + e.getMessage());
        }
    }
}
