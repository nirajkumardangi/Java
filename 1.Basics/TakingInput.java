import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {

        // scanner object
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // taking string input
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("You are enter: " + name);

        // taking integer input
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You are enter: " + num);
    }
}
