import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = scanner.nextInt();
        palindromNumber(num);
    }

    public static void palindromNumber(int num) {
        int originalNum = num;
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        if (newNum == originalNum) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a palindrome Number");
        }
    }
}
