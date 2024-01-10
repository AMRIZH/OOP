import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

public class Evote extends JFrame implements EvoteInterface {
    public static int votecount1 = 0;
    public static int votecount2 = 0;
    public static int unattendding = 10;

    public Evote() {
        // Create a frame
        JFrame frame = new JFrame();
        frame.setTitle("Program E-voting");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(700, 700);
        frame.getContentPane().setBackground(new Color(254, 249, 164));
        frame.setLocationRelativeTo(null);

        // Add image icon
        ImageIcon image = new ImageIcon("8.png");
        frame.setIconImage(image.getImage());

        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Give program title
        JLabel judul = new JLabel("Program Pemilihan Kepala Desa", SwingConstants.CENTER);
        judul.setBounds(250, 10, 200, 20);
        panel.add(judul);

        // Picture of 1st candidate
        URL img = Evoting1.class.getResource("HitlerPhoto.png");
        ImageIcon ikon = new ImageIcon(img);
        JLabel calon1 = new JLabel("Pakde Hitler", ikon, SwingConstants.CENTER);
        calon1.setBounds(10, 40, 100, 100);
        panel.add(calon1);

        // Picture of 2nd candidate
        URL img2 = Evoting1.class.getResource("kaisar hirohito.jpg");
        ImageIcon ikon2 = new ImageIcon(img2);
        JLabel calon2 = new JLabel("Pakde Hirohito", ikon2, SwingConstants.CENTER);
        calon2.setBounds(110, 40, 100, 100);
        panel.add(calon2);

        // Radio buttons to choose between candidates
        JRadioButton pilih1 = new JRadioButton("1");
        pilih1.setBounds(50, 150, 50, 20);
        panel.add(pilih1);

        JRadioButton pilih2 = new JRadioButton("2");
        pilih2.setBounds(150, 150, 50, 20);
        panel.add(pilih2);

        // Combine radio buttons into a group
        ButtonGroup pilihan = new ButtonGroup();
        pilihan.add(pilih1);
        pilihan.add(pilih2);

        // Label NIK
        JLabel nik = new JLabel("NIK");
        nik.setBounds(200, 150, 50, 20);
        panel.add(nik);

        // Text field NIK
        JTextField textnik = new JTextField();
        textnik.setBounds(250, 150, 150, 20);
        panel.add(textnik);

        // Label password
        JLabel password = new JLabel("Password");
        password.setBounds(200, 180, 100, 20);
        panel.add(password);

        // Text field password
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(250, 180, 150, 20);
        panel.add(passwordField);

        // Button SUBMIT password
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(200, 210, 100, 30);
        panel.add(submitButton);

        // Button Administrator
        JButton adminButton = new JButton("Admin");
        adminButton.setBounds(320, 210, 100, 30);
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Show password input dialog
                    String enteredPassword = JOptionPane.showInputDialog(frame, "Enter Password:");
                    // Check if the password is correct (for demonstration purposes, use "password" as the correct password)
                    if (enteredPassword != null && enteredPassword.equals("password")) {
                        // Open another program (replace the code below with the logic to open your program)
                        JOptionPane.showMessageDialog(frame, "Password is correct. Opening another program...");
                    } else {
                        // Display an error message if the password is incorrect
                        throw new Exception("Incorrect password. Try again.");
                    }
                } catch (Exception ex) {
                    // Handle exception (e.g., show an error message)
                    JOptionPane.showMessageDialog(frame, ex.getMessage());
                } finally {
                    // Additional cleanup or code that should run regardless of whether an exception occurred
                }
            }
        });
        panel.add(adminButton);

        frame.add(panel);
        frame.setVisible(true); // make frame visible
    }

    // Play the sound repeatedly until the window is closed
    public static void playSound(String soundFilePath) throws Exception {
        File soundFile = new File(soundFilePath);
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the sound continuously
        clip.start();
    }

    public static void main(String[] args) throws Exception {
        Evoting1 p = new Evoting1();
        playSound("NeverGonnaGiveYouUp.mp3");
    }
}
