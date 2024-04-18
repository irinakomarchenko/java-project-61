package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.QuestionAnswer;
import hexlet.code.Utils;


import static hexlet.code.Engine.COUNT_OF_ROUND;

public class Even {

    public static void play() {
        var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var questionAnswers = new QuestionAnswer[COUNT_OF_ROUND];
        for (var i = 0; i < COUNT_OF_ROUND; i++) {
            questionAnswers[i] = generateQuestionAnswer();
        }

        Engine.runGame(description, questionAnswers);
    }
    static QuestionAnswer generateQuestionAnswer() {
        var number = Utils.getRandomNumber();
        var isEven = number % 2 == 0;
        var question = Integer.toString(number);
        var answer = isEven ? "yes" : "no";

        return new QuestionAnswer(question, answer);

    }
}
