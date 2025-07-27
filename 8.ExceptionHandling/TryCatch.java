public class TryCatch {
    public static void main(String[] args) {
        // Try-Catch
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can not divided by zero: " + e.getMessage());
        }
    }
}
