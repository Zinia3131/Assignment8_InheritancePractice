// NumericQuestion class extending Question
public class NumericQuestion extends Question {
    private double numericAnswer;

    // Set the numeric answer
    public void setAnswer(double correctAnswer) {
        numericAnswer = correctAnswer;
    }

    // Override checkAnswer to allow a margin of error
    @Override
    public boolean checkAnswer(String response) {
        try {
            double responseValue = Double.parseDouble(response);
            return Math.abs(responseValue - numericAnswer) <= 0.01;
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric response.");
            return false;
        }
    }
}

