// Base Question class
public class Question {
    private String text;
    private String answer;

    // Constructor
    public Question() {
        text = "";
        answer = "";
    }

    // Set the question text
    public void setText(String questionText) {
        text = questionText;
    }

    // Set the answer
    public void setAnswer(String correctAnswer) {
        answer = correctAnswer;
    }

    // Check if the given response is correct
    public boolean checkAnswer(String response) {
        return answer.equalsIgnoreCase(response);
    }

    // Display the question text
    public void display() {
        System.out.println(text);
    }
}

