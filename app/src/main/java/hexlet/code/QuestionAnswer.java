package hexlet.code;

public final class QuestionAnswer {
    private final String question;
    private final String answer;

    public QuestionAnswer(String roundQuestion, String roundAnswer) {
        this.question = roundQuestion;
        this.answer = roundAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
