public class QuestionTest2 {
    public static void main(String[] args) {
        // Create an instance of the Question class
        Question q1 = new Question();

        // Set the question and answer
        q1.setText("Who is the inventor of Java?");
        q1.setAnswer("James Gosling");

        // Test cases
        String response1 = "James Gosling";
        String response2 = "   JAMES   gosling   ";
        String response3 = "   james  gosling";
        String response4 = "john doe";

        // Display results
        System.out.println("Response: '" + response1 + "' is correct: " + q1.checkAnswer(response1));
        System.out.println("Response: '" + response2 + "' is correct: " + q1.checkAnswer(response2));
        System.out.println("Response: '" + response3 + "' is correct: " + q1.checkAnswer(response3));
        System.out.println("Response: '" + response4 + "' is correct: " + q1.checkAnswer(response4));
    }
}
