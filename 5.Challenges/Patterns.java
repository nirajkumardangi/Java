import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
//        Create a program that print patterns
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter max rows: ");
        int num = scanner.nextInt();
//        rightHalfPyramid(num);
//        reverseRightHalfPyramid(num);
        leftHalfPyramid(num);
    }

    /*
     *    print this pattern -
     *    *
     *    *  *
     *    *  *  *
     *    *  *  *  *
     *    *  *  *  *  *
     *
     */
    public static void rightHalfPyramid(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    /*
     *    print this pattern -
     *    *   *   *   *   *
     *    *   *   *   *
     *    *   *   *
     *    *   *
     *    *
     *
     */
    public static void reverseRightHalfPyramid(int num) {
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    /*
     *    print this pattern -
     *                    *
     *                *   *
     *            *   *   *
     *        *   *   *   *
     *    *   *   *   *   *
     *
     */
    public static void leftHalfPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("\t");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*\t");
            }

            System.out.println();
        }
    }
}
