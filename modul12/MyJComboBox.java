import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJComboBox {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Module OOP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        // Center the JFrame on the screen
        frame.setLocationRelativeTo(null);
        //Create JLabel Question
        JLabel questionLabel = new JLabel("Is Module OOP easy to understand?");
        // Create a JComboBox
        JComboBox<String> comboBox = new JComboBox<>();
        // Insert options into the JComboBox
        comboBox.addItem("Very Not Agreee");
        comboBox.addItem("Not Agree");
        comboBox.addItem("Don't Care");
        comboBox.addItem("Agree");
        comboBox.addItem("Very Agree");
        comboBox.addItem("Absolutely Agree");
        // Create a JButton to display the selected option
        JButton button = new JButton("Get Selected Opinion");
        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected option from the JComboBox
                String selectedOption = (String) comboBox.getSelectedItem();

                // Display the selected option
                JOptionPane.showMessageDialog(frame, "Selected Opininon: " + selectedOption);
            }
        });
        // Create a JPanel and add the JComboBox and JButton to it
        JPanel panel = new JPanel();
        panel.add(questionLabel);
        panel.add(comboBox);
        panel.add(button);
        // Add the panel to the frame
        frame.add(panel);
        // Set the frame to be visible
        frame.setVisible(true);
    }
}
