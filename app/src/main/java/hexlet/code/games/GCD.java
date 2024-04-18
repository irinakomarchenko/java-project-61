package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.QuestionAnswer;
import hexlet.code.Utils;



import static hexlet.code.Engine.COUNT_OF_ROUND;

public class GCD {
    public static void play() {
        var description = "Find the greatest common divisor of given numbers.";
        var questionAnswers = new QuestionAnswer[COUNT_OF_ROUND];
        for (var i = 0; i < COUNT_OF_ROUND; i++) {
            questionAnswers[i] = generateQuestionAnswer();
        }

        Engine.runGame(description, questionAnswers);
    }
    static QuestionAnswer generateQuestionAnswer() {
        var n1 = Utils.getRandomNumber();
        var n2 = Utils.getRandomNumber();
        var question = n1 + " " + n2;
        var answer = Integer.toString(gcdByBruteForce(n1, n2));

        return new QuestionAnswer(question, answer);

    }

    static int gcdByBruteForce(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
