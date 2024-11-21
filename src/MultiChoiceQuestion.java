public class MultiChoiceQuestion extends Question4 {

    // Constructor to set the question text and the correct answers (separated by spaces)
    public MultiChoiceQuestion(String questionText, String correctChoices) {
        setText(questionText);
        setAnswer(correctChoices);
    }

    // Overridden checkAnswer method to handle multiple correct choices
    @Override
    public boolean checkAnswer(String response) {
        // Normalize the user's response and the correct choices
        String[] userChoices = response.split("\\s+");  // Split response by spaces
        String[] correctChoices = getAnswer().split("\\s+");  // Split correct answer by spaces

        // Check if the number of correct choices matches the user's response
        if (userChoices.length != correctChoices.length) {
            return false;  // If the number of answers is incorrect, return false
        }

        // Check if all user choices match the correct choices (order doesn't matter)
        for (String userChoice : userChoices) {
            boolean matchFound = false;
            for (String correctChoice : correctChoices) {
                if (userChoice.trim().equalsIgnoreCase(correctChoice.trim())) {
                    matchFound = true;
                    break;
                }
            }
            if (!matchFound) {
                return false;  // If any choice doesn't match, return false
            }
        }

        return true;  // All choices match correctly
    }

    // Method to display instructions for the user
    public void displayInstructions() {
        System.out.println("Please provide all the correct choices separated by spaces.");
        System.out.println("Choices: " + getAnswer());
    }
}
