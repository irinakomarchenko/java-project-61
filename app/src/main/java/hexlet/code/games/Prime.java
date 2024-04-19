package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.QuestionAnswer;
import hexlet.code.Utils;

import static hexlet.code.Engine.COUNT_OF_ROUND;

public class Prime {
    public static void play() {
        var description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var questionAnswers = new QuestionAnswer[COUNT_OF_ROUND];
        for (var i = 0; i < COUNT_OF_ROUND; i++) {
            questionAnswers[i] = generateQuestionAnswer();
        }

        Engine.runGame(description, questionAnswers);
    }
    static QuestionAnswer generateQuestionAnswer() {
        final int min = 1;
        final int max = 70;
        var number = Utils.getRandomNumber(min, max);
        var question = Integer.toString(number);
        var answer = isPrime(number) ? "yes" : "no";

        return new QuestionAnswer(question, answer);

    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
