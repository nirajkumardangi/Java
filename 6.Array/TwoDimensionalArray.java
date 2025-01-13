import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // defining 2D array
        String[][] fruits = new String[2][3]; // 2-row and 3-col
        int[][] myNum = {{1, 2, 3}, {4, 5, 6}}; // 2-row and 3-col

        System.out.println(Arrays.deepToString(myNum)); // convert a multidimensional array into a readable string format.

        // access the row-2 and column-2 element of an array
        System.out.println(myNum[1][2]); // 6

        // checking the array length
        System.out.println(myNum.length); // 2
        System.out.println(myNum[0].length); // 3

        // loop through an array
        for (int i = 0; i < myNum.length; i++) { // for row traverse
            for (int j = 0; j < myNum[i].length; j++) { // for col traverse
                System.out.print(myNum[i][j]);
            }
        }
    }
}
