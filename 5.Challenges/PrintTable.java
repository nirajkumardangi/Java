import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a number to generate table: ");
        int number = scanner.nextInt();
        printMultiplicationTable(number);
    }

    public static void printMultiplicationTable(int number) {
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " X " + i + " = " + i * number);
            i++;
        }
    }
}
