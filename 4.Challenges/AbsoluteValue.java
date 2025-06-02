// Create a program to calculate the absolute value of a given integer.

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num = scanner.nextInt();
        int result = num > 0 ? num : -num;
        System.out.println(result);
    }
}
