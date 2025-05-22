// program to check if the given array is sorted.

public class IsSortedArray {
    public static void main(String[] args) {

        // input array from the user
        int[] numArray = ArrayUtils.inputArray();

        // check if array is empty
        if (numArray.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        // flag to check ascending and descending order
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < numArray.length - 1; i++) {
            if (numArray[i] > numArray[i + 1]) {
                isAscending = false; // Not in ascending order
            }
            if (numArray[i] < numArray[i + 1]) {
                isDescending = false; // Not in descending order
            }
        }

        // Print the result
        if (isAscending) {
            System.out.println("Sorted in ascending order.");
        } else if (isDescending) {
            System.out.println("Sorted in descending order.");
        } else {
            System.out.println("Not sorted.");
        }
    }
}
