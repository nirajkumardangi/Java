//Create a program using for-each to find the maximum value in an integer array.

public class MaxValueFInder {
    public static void main(String[] args) {
        int[] numbers = {23, 17, 89, 12, 56, 91, 35};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum value in the array: " + max);
    }
}

// OUTPUT:::
// Maximum value in the array: 91