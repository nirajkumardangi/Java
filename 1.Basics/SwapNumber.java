public class SwapNumber {
    public static void main(String[] args) {
        // Declare three variables
        int a = 10;
        int b = 20;
        int temp;

        // Print the initial values
        System.out.println("Before swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Swap the values
        temp = a;
        a = b;
        b = temp;

        // Print the swapped values
        System.out.println("After swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
