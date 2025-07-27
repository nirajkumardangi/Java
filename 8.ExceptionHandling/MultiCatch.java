public class MultiCatch {
    public static void main(String[] args) {
        // Multi Catch
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Throws ArrayIndexOutOfBoundsException
            int result = 10 / 0; // Throws ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
