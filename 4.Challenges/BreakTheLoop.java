// Create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered.

public class BreakTheLoop {
    public static void main(String[] args) {
        int number;

        while (true) {
            System.out.print("Enter something (type 'exit' to quit): ");
            String input = InputHelper.getString();

            if (input.equalsIgnoreCase("exit")) {
                System.out.print("Exiting the loop...");
                break;
            }

            System.out.println("You entered: " + input);
        }
    }
}
