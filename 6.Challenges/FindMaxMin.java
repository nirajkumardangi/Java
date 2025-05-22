public class FindMaxMin {
    public static void main(String[] args) {
        // program to find the maximum and minimum element in an array.

        // input array from the user
        int[] numArray = ArrayUtils.inputArray();

        // check if array is empty
        if(numArray.length == 0){
            System.out.println("Array is empty.");
            return;
        }

        // Initialize max and min to the first element of the array
        int max = numArray[0];
        int min = numArray[0];

        for (int i = 0; i < numArray.length; i++){
            if(numArray[i] > max){
                max = numArray[i];
            }
            if(numArray[i] < min){
                min = numArray[i];
            }
        }

        // another shortcut
//        for (int j : numArray) {
//            if (j > max) {
//                max = j;
//            }
//            if (j < min) {
//                min = j;
//            }
//        }

        // Print the results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
