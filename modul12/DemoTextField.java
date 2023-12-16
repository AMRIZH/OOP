import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class DemoTextField {
    public static void main(String[] args) {
        Utama u = new Utama();  // Create an instance of the Utama class (assuming it's a JFrame)
        // Create JLabels for name and password
        JLabel name = new JLabel("Name: ");
        JLabel password = new JLabel("Password: ");
        // Create JTextFields for user input
        JTextField inputName = new JTextField(15);
        JPasswordField inputPw = new JPasswordField(15);
        // Create a JPanel to hold the JLabels and JTextFields
        JPanel panel = new JPanel();
        // Add components to the JPanel
        panel.add(name);
        panel.add(inputName);
        panel.add(password);
        panel.add(inputPw);
        // Add the JPanel to the JFrame (Utama)
        u.add(panel);
    }
}

