import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = scanner.nextInt();
        fibonacci(num);
    }

    public static void fibonacci(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");
        int first = 0, second = 1;
        while (first + second <= num) {
            int next = first + second;     // calculate the next term
            System.out.print(next + " ");  // print current term
            first = second;               // update first
            second = next;               // update second
        }
    }
}
