import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        // Create a program that computes the sum of the digits of an integer.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a digit: ");
        int num = scanner.nextInt();
        int result = sumOfDigit(num);
        System.out.println("Sum of digit " + num + " = " + result);
    }

    public static int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10; // Remove the last digit
        }
        return sum;
    }
}
