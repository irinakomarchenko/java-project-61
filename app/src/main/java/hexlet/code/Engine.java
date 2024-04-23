package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int COUNT_OF_ROUND = 3;

    public static void runGame(String description, QuestionAnswer[] questionAnswers) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(description);

        for (var questionAnswer : questionAnswers) {
            System.out.println("Question: " + questionAnswer.getQuestion());
            System.out.print("Your answer: ");
            var answer = questionAnswer.getAnswer();
            var userAnswer = scanner.next();

            if (!answer.equals(userAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");

        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
