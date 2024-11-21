public class AnyCorrectChoiceQuestion extends Question3{
    public AnyCorrectChoiceQuestion(String questionText, String correctChoices) {
        setText(questionText);
        setAnswer(correctChoices);
    }

    // Overridden checkAnswer method to accept any one of the correct choices
    @Override
    public boolean checkAnswer(String response) {
        // Normalize the response and compare it with the list of correct choices
        String[] correctChoices = getAnswer().split("\\s+");  // Split answer string by spaces

        // Check if the response matches any of the correct choices
        for (String choice : correctChoices) {
            if (choice.trim().equalsIgnoreCase(response.trim())) {
                return true;  // Return true if any choice matches
            }
        }
        return false;  // Return false if no match is found
    }

    // Method to display instructions for the user
    public void displayInstructions() {
        System.out.println("Please select one of the correct choices.");
        System.out.println("Choices: " + getAnswer());
    }
}
