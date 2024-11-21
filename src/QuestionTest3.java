public class QuestionTest3 {
    public static void main(String[] args) {
        // Create an instance of AnyCorrectChoiceQuestion
        AnyCorrectChoiceQuestion q1 = new AnyCorrectChoiceQuestion(
                "Who invented Java?", "James Gosling Sun Microsystems");

        // Display instructions for the user
        q1.displayInstructions();

        // Test cases
        String response1 = "James Gosling";
        String response2 = "Sun Microsystems";
        String response3 = "Bill Gates";

        // Display results
        System.out.println("Response: '" + response1 + "' is correct: " + q1.checkAnswer(response1));
        System.out.println("Response: '" + response2 + "' is correct: " + q1.checkAnswer(response2));
        System.out.println("Response: '" + response3 + "' is correct: " + q1.checkAnswer(response3));
    }
}

