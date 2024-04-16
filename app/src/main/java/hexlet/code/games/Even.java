package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.QuestionAnswer;
import org.apache.commons.lang3.RandomUtils;

public class Even {

    public static void play() {
        var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var questionAnswers = new QuestionAnswer[3];
        for (var i = 0; i < 3; i++) {
            questionAnswers[i] = generateQuestionAnswer();
        }

        Engine.runGame(description, questionAnswers);
    }
    static QuestionAnswer generateQuestionAnswer() {
        final int min = 1;
        final int max = 100;
        var number = RandomUtils.nextInt(min, max);
        var isEven = number % 2 == 0;
        var question = Integer.toString(number);
        var answer = isEven ? "yes" : "no";

        return new QuestionAnswer(question, answer);

    }
}
