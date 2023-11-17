package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lalaalla {
//Simle GUI with java 
    private JTextField nameField, nimField, numberField;
    private JButton guessButton;

    public NumberGuessingGame() {
        // Set up the frame
        setTitle("Number Guessing Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JLabel nimLabel = new JLabel("NIM:");
        JLabel numberLabel = new JLabel("Guess a Number (1-10):");

        nameField = new JTextField(20);
        nimField = new JTextField(10);
        numberField = new JTextField(5);
        guessButton = new JButton("Guess");

        // Add action listener to the guessButton
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        // Set layout
        setLayout(new GridLayout(4, 2));

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(nimLabel);
        add(nimField);
        add(numberLabel);
        add(numberField);
        add(guessButton);

        // Make the frame visible
        setVisible(true);
    }

    private void checkGuess() {
        try {
            // Get user input
            String name = nameField.getText();
            String nim = nimField.getText();
            int guessedNumber = Integer.parseInt(numberField.getText());

            // Generate a random number between 1 and 10
            int randomNumber = (int) (Math.random() * 10) + 1;

            // Check if the guessed number is correct
            if (guessedNumber == randomNumber) {
                JOptionPane.showMessageDialog(this, "Congratulations " + name + " (" + nim + ")! You WIN!");
            } else {
                JOptionPane.showMessageDialog(this, "Sorry " + name + " (" + nim + "), you guessed wrong. The correct number was " + randomNumber + ".");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NumberGuessingGame();
            }
        });
    }
} 

