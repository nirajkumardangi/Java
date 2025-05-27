// Create a program to find the minimum of two numbers.

import java.util.Scanner;

public class MinimumOfTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter your 2nd number: ");
        int num2 = scanner.nextInt();
        findMinOfTwoNumber(num1, num2);
    }

    public static void findMinOfTwoNumber(int num1, int num2) {
        if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is minimum");
        } else {
            System.out.println(num2 + " is minimum");
        }
    }
}
