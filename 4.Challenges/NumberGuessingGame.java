// Create a program using do-while to implement a number guessing game.

public class NumberGuessingGame {
    public static void main(String[] args) {
        int num = 5, guess;
        do {
            System.out.print("Please enter your number: ");
            guess = InputHelper.getInt();
        } while (num != guess);
        System.out.println("You successfully guessed a number!");
    }
}
