import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int first = scanner.nextInt();
        System.out.print("Please enter your second number: ");
        int second = scanner.nextInt();
        int result = lcm(first, second);
        System.out.println("Factorial of " + first + " & " + second + " = " + result);
    }

    // Create a program to find the Least Common Multiple (LCM) of two numbers.
    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
}
