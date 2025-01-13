public class SumAndAvg {
    public static void main(String[] args) {
        // Create a program to find the sum and average of all elements in an array.

        // input array from the user
        int[] numArray = ArrayUtils.inputArray();

        // find the sum
        double sum = sumOfArray(numArray);

        // calculate average
        double average = sum / numArray.length;

        // display result
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    // method to calculate sum of array
    public static int sumOfArray(int[] numArray){
        int sum = 0;
        for(int i: numArray){
            sum += i;
        }
        return sum;
    }
}
