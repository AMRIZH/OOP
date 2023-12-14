import java.awt.Container;
import javax.swing.JButton;

public class FrameA extends javax.swing.JFrame {

    // Constructor without parameters
    public FrameA() {
        // Call the JFrame constructor with a default title
        super("Frame and Button");

        // Set the size of the JFrame
        setSize(100, 50);

        // Set the default close operation to exit the application
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Make the JFrame visible
        setVisible(true);

        // Center the JFrame on the screen
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create an instance of FrameA
        FrameA fa = new FrameA();

        // Get the content pane of the JFrame
        Container kontainer = fa.getContentPane();

        // Create a JButton with the label "OK"
        JButton btn = new JButton("OK");

        // Add the JButton to the content pane
        kontainer.add(btn);
    }
}
