public class Question2 {

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

    // Modified checkAnswer method to ignore spaces and case
    public boolean checkAnswer(String response) {
        // Normalize the response and the correct answer by removing extra spaces and converting to lowercase
        String normalizedAnswer = answer.replaceAll("\\s+", " ").trim().toLowerCase();
        String normalizedResponse = response.replaceAll("\\s+", " ").trim().toLowerCase();

        // Compare the normalized strings
        return normalizedAnswer.equals(normalizedResponse);
    }
}

