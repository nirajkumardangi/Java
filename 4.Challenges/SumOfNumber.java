// Create a program using continue to sum all positive numbers entered by the user; skip any negative numbers.

public class SumOfNumber {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            int number = InputHelper.getInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                continue;
            }

            sum += number;
        }
        System.out.println("Sum of positive number: " + sum);
    }
}


// OUTPUT:::
// Enter a number (0 to stop): 10
// Enter a number (0 to stop): 10
// Enter a number (0 to stop): -10
// Enter a number (0 to stop): -10
// Enter a number (0 to stop): 0
// Sum of positive number: 20