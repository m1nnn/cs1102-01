import javax.swing.JOptionPane;

public class Quiz {
    public static void main(String[] args) {
        String question = "What is the capital of France?\n"
                        + "(A) Paris\n"
                        + "(B) London\n"
                        + "(C) Berlin\n"
                        + "(D) Rome\n"
                        + "(E) Madrid";
        String answer = "";
        boolean correct = false;
        while (!correct) {
            answer = JOptionPane.showInputDialog(question).toUpperCase();
            switch (answer) {
                case "A":
                    JOptionPane.showMessageDialog(null, "Correct!");
                    correct = true;
                    break;
                case "B":
                case "C":
                case "D":
                case "E":
                    JOptionPane.showMessageDialog(null, "Incorrect. Try again.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid answer. Try again.");
                    break;
            }
        }
    }
}
