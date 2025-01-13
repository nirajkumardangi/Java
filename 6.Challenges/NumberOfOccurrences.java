import java.util.Scanner;

public class NumberOfOccurrences {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // program to find number of occurrences of an element in an array

    // input array from the user
    int[] numArray = ArrayUtils.inputArray();

    // input the target value
    System.out.print("Enter the value to find occurrences of: ");
    int target = scanner.nextInt();
    
    // find number of occurrences
    int totalOccurs = numOfOccurrences(numArray, target);
    
    // print the result
    System.out.println("The value " + target + " occurs " + totalOccurs + " times in the array");

    // close scanner
    scanner.close();
  }

  // method to find number of occurrences
  public static int numOfOccurrences(int[] numArray, int target) {
    int count = 0;
    for (int i : numArray) {
      if (i == target) {
        count++;
      }
    }
    return count;
  }
}
