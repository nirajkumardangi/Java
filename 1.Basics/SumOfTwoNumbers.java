import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your second number: ");
        int num2 = input.nextInt();
        input.close();

        // sum of num1 and num2
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " + " + num2 + " = " + sum);
    }
}
