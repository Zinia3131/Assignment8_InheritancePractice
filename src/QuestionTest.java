
public class QuestionTest {
    public static void main(String[] args) {
        Question q1 = new Question();
        q1.setText("What is the capital of France?");
        q1.setAnswer("Paris");

        NumericQuestion q2 = new NumericQuestion();
        q2.setText("What is the value of π (up to 2 decimal places)?");
        q2.setAnswer(3.14);

        System.out.println("Question 1:");
        q1.display();
        System.out.println("Your answer: Paris");
        System.out.println("Correct? " + q1.checkAnswer("Paris"));

        System.out.println("\nQuestion 2:");
        q2.display();
        System.out.println("Your answer: 3.13");
        System.out.println("Correct? " + q2.checkAnswer("3.13")); // Within margin of error

        System.out.println("Your answer: 3.16");
        System.out.println("Correct? " + q2.checkAnswer("3.16")); // Outside margin of error
    }
}

