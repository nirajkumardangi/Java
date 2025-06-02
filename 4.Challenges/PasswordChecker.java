// Create a program using do-while to find a password checker until a valid password is entered.

public class PasswordChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to Password Checker");
        String password;
        do {
            System.out.print("Enter your password: ");
            password = InputHelper.getString();
        } while (!isValidPassword(password));
        System.out.println("✅ Valid password");
    }

    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }
}
