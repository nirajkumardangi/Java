import java.util.Scanner;

public class ArrayUtils {
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] myArray = new int[size];
        int i = 0;

        while (i < size) {
            System.out.print("Enter the array element of index-" + i + " : ");
            myArray[i] = scanner.nextInt();
            i++;
        }

        scanner.close();
        return myArray;
    }
}
