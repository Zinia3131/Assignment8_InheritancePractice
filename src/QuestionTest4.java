public class QuestionTest4 {
    public static void main(String[] args) {
        // Create an instance of MultiChoiceQuestion with a question and multiple correct choices
        MultiChoiceQuestion q1 = new MultiChoiceQuestion(
                "Which of the following are programming languages?",
                "Java Python C++");

        // Display instructions for the user
        q1.displayInstructions();

        // Test cases
        String response1 = "Java Python C++";
        String response2 = "C++ Python Java";
        String response3 = "Java Ruby C++";

        // Display results
        System.out.println("Response: '" + response1 + "' is correct: " + q1.checkAnswer(response1));
        System.out.println("Response: '" + response2 + "' is correct: " + q1.checkAnswer(response2));
        System.out.println("Response: '" + response3 + "' is correct: " + q1.checkAnswer(response3));
    }
}
