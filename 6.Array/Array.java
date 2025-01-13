public class Array {
    public static void main(String[] args) {
        // syntax of array definition
        String[] fruits = new String[5]; // syntax-1
        int[] myNumber = {1, 2, 3, 4, 5, 6, 7, 8, 8, 10}; // syntax-2

        System.out.println(fruits.length);  // check length of array

        System.out.println(myNumber[0]); // access the 0th element of array

        fruits[2] = "Apple"; // adding array element in 2-index
        fruits[2] = "Orange"; // overwrite array element

        System.out.println(fruits[0]); // null
        System.out.println(fruits[2]); // apple


        // loop through an array
        for (int i = 0; i < myNumber.length; i++) {
            System.out.println(myNumber[i]); // print 1 - 10
        }

        // loop through and array using for each
        for (int i : myNumber) {
            System.out.println(i);  // print 1 - 10
        }
    }
}
