package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.QuestionAnswer;
import hexlet.code.Utils;



import static hexlet.code.Engine.COUNT_OF_ROUND;


public class Progression {
    public static void play() {
        var description = "What number is missing in the progression?";
        var questionAnswers = new QuestionAnswer[COUNT_OF_ROUND];
        for (var i = 0; i < COUNT_OF_ROUND; i++) {
            questionAnswers[i] = generateQuestionAnswer();
        }

        Engine.runGame(description, questionAnswers);
    }
    static QuestionAnswer generateQuestionAnswer() {
        final var length = 10;
        final var min = 1;
        final var max = 10;
        var firstElement = Utils.getRandomNumber(min, max);
        var step = Utils.getRandomNumber(min, max);
        var hiddenIndex = Utils.getRandomNumber(min - 1, length - 1);
        String[] progression = generateRandomProgression(firstElement, step, length);
        String answer = progression[hiddenIndex];

        progression[hiddenIndex] = "..";
        String question = String.join(" ", progression);

        return new QuestionAnswer(question, answer);

    }

    public static String[] generateRandomProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i += 1) {
            progression[i] = Integer.toString(first + i * step);

        }
        return progression;
    }


}
