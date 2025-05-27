// Create a program to calculate the absolute value of a given integer.

import java.util.Scanner;

public class FindEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = scanner.nextInt();
        findEvenOrOdd(num);
    }

    public static void findEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
