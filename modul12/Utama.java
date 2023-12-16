import javax.swing.JFrame;

public class Utama extends JFrame {

    // Constructor without parameters
    public Utama() {
        // Call the JFrame constructor with a default title
        super("Belajar mengenal GUI");

        // Set the size of the JFrame
        setSize(300, 100);

        // Set the default close operation to exit the application
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Make the JFrame visible
        setVisible(true);

        // Center the JFrame on the screen
        setLocationRelativeTo(null);
    }

    // Constructor with a parameter for the title
    public Utama(String judul) {
        // Call the JFrame constructor with the specified title
        super(judul);

        // Set the size of the JFrame
        setSize(300, 100);j

        // Set the default close operation to exit the application
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Make the JFrame visible
        setVisible(true);

        // Center the JFrame on the screen
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create an instance of Utama without specifying a title
        Utama u = new Utama();
    }
}
