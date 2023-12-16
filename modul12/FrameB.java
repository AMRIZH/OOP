import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FrameB extends javax.swing.JFrame {

    // Constructor without parameters
    public FrameB() {
        // Call the JFrame constructor with a default title
        super("Frame and Button");

        // Set the size of the JFrame
        setSize(800, 450);

        // Set the default close operation to exit the application
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Center the JFrame on the screen
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create an instance of FrameB
        FrameB fb = new FrameB();

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Get the URL of the image (replace the path with the correct image file path)
        URL img = FrameB.class.getResource("fdkingston.png");

        // Create a JButton with text "OK"
        JButton jbtOK = new JButton("OK");

        // Create a JButton with an ImageIcon using the specified image URL
        JButton jbtImg = new JButton(new ImageIcon(img));

        // Add the text button and image button to the panel
        panel.add(jbtOK);
        panel.add(jbtImg);

        // Add the panel to the FrameB
        fb.add(panel);

        // Make the JFrame visible
        fb.setVisible(true);
    }
}

