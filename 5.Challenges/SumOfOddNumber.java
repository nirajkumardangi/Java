import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        oddNumberSum(number);
    }

    // Create a program to sum all odd numbers from 1 to a specified number N.
    public static void oddNumberSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
