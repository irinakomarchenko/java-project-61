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
        final var min = 1;
        final var max = 50;
        var n1 = Utils.getRandomNumber(min, max);
        var n2 = Utils.getRandomNumber(min, max);
        var question = n1 + " " + n2;
        var answer = Integer.toString(gcd(n1, n2));


        return new QuestionAnswer(question, answer);

    }

    static int gcd(int n1, int n2) {
        return n2 == 0 ? n1 : gcd(n2, n1 % n2);
    }
}

