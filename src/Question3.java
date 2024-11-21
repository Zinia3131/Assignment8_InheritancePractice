public class Question3 {
    private String text;    // Question text
    private String answer;  // Correct answer

    // Setter and getter methods for text and answer
    public void setText(String newText) {
        text = newText;
    }

    public void setAnswer(String newAnswer) {
        answer = newAnswer;
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    // Default checkAnswer method for single correct answer
    public boolean checkAnswer(String response) {
        return answer.equalsIgnoreCase(response.trim());
    }
}
