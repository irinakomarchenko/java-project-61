package hexlet.code;

import java.util.Scanner;

public class Even {
    private static String playerName; // Declare playerName as a class-level variable

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        playerName = scanner.nextLine(); // Assign the user's input to playerName
        System.out.println("Hello, " + playerName + "!");
        play();
    }

    public static void play() {
        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int randomNumber = (int) (Math.random() * 100) + 1;
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();

            boolean isEven = randomNumber % 2 == 0;
            if ((isEven && userAnswer.equals("yes")) || (!isEven && userAnswer.equals("no"))) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is the wrong answer ;(. The correct answer was '" + (isEven ? "no" : "yes") + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                break;
            }
        }

        if (correctAnswers == 3) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
}
