public class TryWithMultiCatch {
    public static void main(String[] args) {
        // Single Try with Multiple Catch
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
            int result = 10 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Can't divided by zero" + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception" + e.getMessage());
        }
    }
}
