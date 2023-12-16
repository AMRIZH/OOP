import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class DemRadioButton {
    public static void main(String[] args) {
        Utama u = new Utama();  // Create an instance of the Utama class (assuming it's a JFrame)
        u.setSize(1000, 100);
        // Create an array of JRadioButton for different teams
        JRadioButton[] teams = new JRadioButton[5];
        teams[0] = new JRadioButton("Very Disagree");
        teams[1] = new JRadioButton("Disagree");
        teams[2] = new JRadioButton("Neutral");
        teams[3] = new JRadioButton("Agree");
        teams[4] = new JRadioButton("Very Agree");
        // Create a JPanel to hold the components
        JPanel panel = new JPanel();
        // Create a JLabel for the question
        JLabel question = new JLabel("Being a programmer is very difficult. Do you agree?");
        panel.add(question);  // Add the question label to the panel

        // Create a ButtonGroup to group the radio buttons (ensure only one can be selected)
        ButtonGroup group = new ButtonGroup();
        // Add each radio button to the panel and the ButtonGroup
        for (int i = 0; i < teams.length; i++) {
            panel.add(teams[i]);
            group.add(teams[i]);
        }
        // Add the panel to the JFrame (Utama)
        u.add(panel);
        // Make the JFrame visible
        u.setVisible(true);
    }
}
