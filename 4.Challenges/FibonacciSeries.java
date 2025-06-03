// Create a program using recursion to display the Fibonacci series up-to a certain number.

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter a number of fibonacci terms to display: ");
        int num = InputHelper.getInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}