// Create a program using for loop multiplication table for a number.

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Generate a Table of: ");
        int tableNumber = InputHelper.getInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + tableNumber + " = " + i * tableNumber);
        }
    }
}


// OUTPUT:::
// 1 * 5 = 5
// 2 * 5 = 10
// 3 * 5 = 15
// 4 * 5 = 20
// 5 * 5 = 25
// 6 * 5 = 30
// 7 * 5 = 35
// 8 * 5 = 40
// 9 * 5 = 45
// 10 * 5 = 50