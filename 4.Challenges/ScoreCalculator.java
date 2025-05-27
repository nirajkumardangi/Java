// Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator
// (e.g., High for scores > 80, Moderate for 50-80, Low for < 50).

import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int scores = scanner.nextInt();
        studentScoreCategorizer(scores);
    }

    public static void studentScoreCategorizer(int scores) {
        String level = scores > 80
                ? "High"
                : scores > 50 && scores < 80
                ? "Moderate"
                : "Low";
        System.out.println(level);
    }
}
