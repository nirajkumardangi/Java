import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = scanner.nextInt();
        armstrongNumber(num);
    }

    public static void armstrongNumber(int num) {

    }

    // method to count number of digit
    public static int noOfDigit(int num) {
        int digit = 0;
        while (num >= 0) {
            digit++;
            num /= 10;
        }
        return digit;
    }
}
