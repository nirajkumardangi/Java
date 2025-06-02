import java.util.Scanner;

public class InputHelper {
    public static final Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static int getInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid integer. Try again: ");
            }
        }
    }

    public static double getDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid number. Try again: ");
            }
        }
    }

    public static boolean getBoolean() {
        return Boolean.parseBoolean(scanner.nextLine());
    }
}
