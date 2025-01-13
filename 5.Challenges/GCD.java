import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int first = scanner.nextInt();
        System.out.print("Please enter your second number: ");
        int second = scanner.nextInt();
        int result = findGCD(first, second);
        System.out.println("Factorial of " + first + " & " + second + " = " + result);
    }

    // Function to compute GCD using the Euclidean Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // Compute remainder
            a = temp;  // Assign the value of b to a
        }
        return a; // The last non-zero value of a is the GCD
    }
}
