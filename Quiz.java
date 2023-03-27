import javax.swing.JOptionPane;

public class Quiz {
    static int questions = 0;
    static int correctAnswers = 0;

    public static String ask(String question) {
        String answer = JOptionPane.showInputDialog(question);
        return answer.toUpperCase();
    }

    public static void check(String question, String correctAnswer) {
        String userAnswer = ask(question);
        if (userAnswer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, "Correct!");
            correctAnswers++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect.");
        }
        questions++;
    }

    public static void main(String[] args) {
        check("What is the capital of France?", "PARIS");
        check("What is the largest ocean on Earth?", "PACIFIC OCEAN");
        check("What is the currency used in Japan?", "YEN");
        JOptionPane.showMessageDialog(null, "You answered " + correctAnswers + " out of " + questions + " questions correctly.");
    }
}
