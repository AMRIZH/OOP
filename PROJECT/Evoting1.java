// package project
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Evoting1 extends JFrame implements EvoteInterface{
  public static int votecount1 = 0;
  public static int votecount2 = 0;
  public static int unattendding = 10;

  public Evoting1(){
    JFrame frame = new JFrame(); // create a frame
    frame.setTitle("Program E-voting"); //set title of frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
    frame.setResizable(false); //prevent frame from being resized
    frame.setSize(700,700); //set the x-dimension and y-dimension of frmae size
    frame.getContentPane().setBackground(new Color(254,249,164)); //change color of background
    frame.setLocationRelativeTo(null); // put frame in mid of screen

    //add image icon
    ImageIcon image = new ImageIcon("7.jpg"); //create an image icon
    frame.setIconImage(image.getImage()); // change icon of frame

    // Create a JPanel to hold components
    JPanel panel = new JPanel();

    // Give program title
    JLabel judul = new JLabel("Program Pemilihan Kepala Desa",SwingConstants.CENTER);
    judul.setBounds(250,10,10,10);
    panel.add(judul);

    // picture of 1st candidate
    URL img = Evoting1.class.getResource("HitlerPhoto.png");
    ImageIcon ikon = new ImageIcon(img);
    JLabel calon1 = new JLabel("Pakde Hitler", ikon, SwingConstants.CENTER);
    calon1.setBounds(10, 40, 100, 100);
    panel.add(calon1);

    // picture of 2nd candidate
    URL img2 = Evoting1.class.getResource("HitlerPhoto.png");
    ImageIcon ikon2 = new ImageIcon(img);
    JLabel calon2 = new JLabel("Pakde Hirohito", ikon, SwingConstants.CENTER);
    calon2.setBounds(110, 40, 100, 100);
    panel.add(calon2);

    // radio buttons to choose between candidates
    JRadioButton pilih1 = new JRadioButton();
    pilih1.setText("1");
    pilih1.setBounds(50,150,10,10);
    panel.add(pilih1);

    JRadioButton pilih2 = new JRadioButton();
    pilih2.setText("2");
    pilih2.setBounds(1500,150,10,10);
    panel.add(pilih2);

    // menyatukan pilihan 
    ButtonGroup pilihan = new ButtonGroup();
    pilihan.add(pilih1);
    pilihan.add(pilih2);

    // label NIK
    JLabel nik = new JLabel();
    nik.setText("NIK");
    nik.setBounds(0, 0, 0, 0);
    panel.add(nik);

    // text field NIK
    JTextField textnik = new JTextField();
    textnik.setBounds(0, 0, 0, 0);
    panel.add(textnik);

    // label password
    JLabel password = new JLabel();
    password.setText("Password");
    password.setBounds(0, 0, 0, 0);
    panel.add(password);

    // text field password
    JPasswordField passwordField = new JPasswordField();
    passwordField.setBounds(0, 0, 0, 0);
    panel.add(passwordField);

    // button SUBMIT password
    JButton submitButton = new JButton();
    submitButton.setText("Submit");
    submitButton.setBounds(0, 0,0,0);
    panel.add(submitButton);

    // button Administrator
    JButton adminButton = new JButton();
    adminButton.setText("Admin");
    adminButton.setBounds(0, 0, 0, 0);
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
  // play the sound repeatedly until window closed
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
