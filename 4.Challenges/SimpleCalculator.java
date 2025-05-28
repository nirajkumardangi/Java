// Create a program to create a simple calculator that uses a switch statement to perform basic arithmetic operations like addition, subtraction, multiplication, and division.

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your operand (+, -, *, /): ");
        String operand = scanner.next();
        System.out.print("Choose number1: ");
        int num1 = scanner.nextInt();
        System.out.print("Choose number2: ");
        int num2 = scanner.nextInt();

        // calculator function
        calculator(operand, num1, num2);
    }

    public static void calculator(String operand, int num1, int num2) {
        float result;
        switch (operand) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = (float) num1 / num2;
                break;
            default:
                System.out.println("Invalid Operands");
                return;
        }
        System.out.println(result);
    }
}
