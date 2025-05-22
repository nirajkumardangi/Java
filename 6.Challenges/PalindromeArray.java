// program to check number is palindrome or not

public class PalindromeArray {
  public static void main(String[] args) {
    int[] numArray = ArrayUtils.inputArray();

    boolean isPalindrome = checkPalindrome(numArray);

    if (isPalindrome) {
      System.out.println("Array is Palindrome");
    } else {
      System.out.println("Array is not palindrome");
    }
  }

  public static boolean checkPalindrome(int[] numArray) {
    for (int i = 0; i < numArray.length / 2; i++) {
      if (numArray[i] != numArray[numArray.length - 1 - i]) {
        return false;
      }
    }
    return true;
  }
}
