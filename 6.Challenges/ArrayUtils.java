import java.util.Scanner;

// input the size & elements of an array
public class ArrayUtils {
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] myArray = new int[size];
        int i = 0;

        while (i < size) {
            System.out.print("index: " + i + " : ");
            myArray[i] = scanner.nextInt();
            i++;
        }
        return myArray;
    }
}
