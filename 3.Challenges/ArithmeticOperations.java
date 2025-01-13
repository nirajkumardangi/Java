import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // 1.Create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%).
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: "); // 10
        int num1 = input.nextInt();
        System.out.print("Enter second number: "); // 2
        int num2 = input.nextInt();
        input.close();

        System.out.println("Result of + operation: " + (num1 + num2)); // 12
        System.out.println("Result of - operation: " + (num1 - num2)); // 8
        System.out.println("Result of * operation: " + (num1 * num2)); // 20
        System.out.println("Result of / operation: " + (num1 / num2)); // 5
        System.out.println("Result of % operation: " + (num1 % num2)); // 0
    }
}
