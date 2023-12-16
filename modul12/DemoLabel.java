import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.net.URL;

public class DemoLabel {
    public static void main(String[] args) {
        // Create an instance of the Utama class (assuming it's a JFrame)
        Utama u = new Utama();
        // Set the size of the JFrame
        u.setSize(800, 450);
        // Get the URL of an image file (replace "fdkingston.png" with your image file path)
        URL img = FrameB.class.getResource("fdkingston.png");
        // Create an ImageIcon from the image URL
        ImageIcon ikon = new ImageIcon(img);
        // Create a JLabel with text "Label," using the ImageIcon and aligning it to the center
        JLabel label = new JLabel("King of flashsisk:3", ikon, SwingConstants.CENTER);
        // Create a JPanel to hold the JLabel
        JPanel panel = new JPanel();
        // Add the JLabel to the JPanel
        panel.add(label);
        // Add the JPanel to the JFrame
        u.add(panel);
    }
}
