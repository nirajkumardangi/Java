// Create a program using continue to print only even numbers using continue for odd numbers.

public class PrintEvenNumber {
    public static void main(String[] args) {
        System.out.print("Let's print even numbers from 1 to ");
        int num = InputHelper.getInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
