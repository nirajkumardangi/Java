// Create a program using for-each to the occurrences of a specific element in an array.

public class FindOccurrences {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 20, 20, 30, 50, 60};
        // Ask for user input
        System.out.print("Enter the number to count: ");
        int target = InputHelper.getInt();

        int count = 0;

        // for-each loop to count occurrences
        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }
        System.out.println("The number " + target + " occurs " + count + " time(s) in the array.");
    }
}

// OUTPUT:::
// Enter the number to count: 20
// The number 20 occurs 3 time(s) in the array.