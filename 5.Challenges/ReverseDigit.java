import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = scanner.nextInt();
        reverseDigit(num);
    }

    public static void reverseDigit(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        System.out.println(newNum);
    }
}
