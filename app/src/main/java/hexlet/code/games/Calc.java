package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.QuestionAnswer;
import hexlet.code.Utils;

import java.util.Random;

import static hexlet.code.Engine.COUNT_OF_ROUND;

public class Calc {
    public static void play() {
        var description = "What is the result of the expression?";
        var questionAnswers = new QuestionAnswer[COUNT_OF_ROUND];
        for (var i = 0; i < Engine.COUNT_OF_ROUND; i++) {
            questionAnswers[i] = generateQuestionAnswer();
        }

        Engine.runGame(description, questionAnswers);
    }

    static QuestionAnswer generateQuestionAnswer() {
        String[] operations = {"+", "-", "*"};
        var operationIndex = new Random().nextInt(operations.length);
        var operation = operations[operationIndex];
        final var min = 1;
        final var max = 40;
        var number1 = Utils.getRandomNumber(min, max);
        var number2 = Utils.getRandomNumber(min, max);
        var question = number1 + " " + operation + " " + number2;
        var answer = Integer.toString(calculate(operation, number1, number2));

        return new QuestionAnswer(question, answer);

    }

    static int calculate(String operation, int n1, int n2) {
        switch (operation) {
            case "+":
                return n1 + n2;
            case "-":
                return n1 - n2;
            case "*":
                return n1 * n2;
            default:
                System.err.println("Unknown operation");
                System.exit(1);
                return 0;
        }
    }
}


