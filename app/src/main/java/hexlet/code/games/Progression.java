package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.QuestionAnswer;
import hexlet.code.Utils;

import java.util.StringJoiner;

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
        var progression = generateRandomProgression(firstElement, step, length);
        var question = buildMyProgression(progression, hiddenIndex);
        var answer = Integer.toString(progression[hiddenIndex]);

        return new QuestionAnswer(question, answer);

    }

    public static int[] generateRandomProgression(int first, int step, int length) {
        var progression = new int[length];
        for (var i = 0; i < length; i += 1) {
            progression[i] = first + step * i;
        }
        return progression;
    }

    static String buildMyProgression(int[] progression, int hiddenIndex) {
        var joiner = new StringJoiner(" ");

        for (var i = 0; i < progression.length; i += 1) {
            var element = i == hiddenIndex ? ".." : Integer.toString(progression[i]);
            joiner.add(element);
        }

        return joiner.toString();
    }
}
