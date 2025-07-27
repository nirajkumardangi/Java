public class TryCatchFinally {
    public static void main(String[] args) {
        // try catch finally
        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        } finally {
            System.out.println("Execution of finally block.");
        }
    }
}
