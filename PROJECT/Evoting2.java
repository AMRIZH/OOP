import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.net.URL;
import java.io.File;
import javax.sound.sampled.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Evoting2 {
  public Evoting2(){
    JFrame frame = new JFrame(); // create a frame
    frame.setTitle("Polling Result"); //set title of frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
    frame.setResizable(false); //prevent frame from being resized
    frame.setSize(500,500); //set the x-dimension and y-dimension of frmae size
    frame.getContentPane().setBackground(new Color(254,249,164)); //change color of background
    frame.setLocationRelativeTo(null); // put frame in mid of screen

    //add image icon
    ImageIcon image = new ImageIcon("7.jpg"); //create an image icon
    frame.setIconImage(image.getImage()); // change icon of frame

    // Create a JPanel to hold components
    JPanel panel = new JPanel();

    // Give program title
    JLabel judul = new JLabel("Hasil Pemilihan Pemilu",SwingConstants.CENTER);
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

    //number of 1st candidate voters
    JLabel poll1 = new JLabel();
    poll1.setText("Hasil suara milik 1");
    poll1.setBounds(0, 0, 0, 0);
    panel.add(poll1);

    //number of 1st candidate voters
    JLabel poll2 = new JLabel();
    poll2.setText("Hasil suara milik 2");
    poll2.setBounds(0, 0, 0, 0);
    panel.add(poll2);

    //label of unattend voters
    JLabel unattended = new JLabel();
    unattended.setText("Golput");
    unattended.setBounds(0, 0, 0, 0);
    panel.add(unattended);
    
    //number of unattend voters
    JLabel unattend = new JLabel();
    unattend.setText("Golput");
    unattend.setBounds(0, 0, 0, 0);
    panel.add(unattend);

    // add all components into the frame
    frame.add(panel);
    frame.setVisible(true); // make frame visible

    // exit button
    JButton exit = new JButton("Exit");
    exit.setVisible(true);
    exit.setBounds(0, 0, 0, 0);
    panel.add(exit);
    // Add ActionListener to handle button click
    exit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Perform exit action here
            System.exit(0);
        }
    });
    
  }
}

// part color of the pie chart
class Part {
    double value;
    Color color;

    public Part(double value, Color color) {
        this.value = value;
        this.color = color;
    }
}

// create a new piechart
class MyComponent extends JComponent {
    Part[] slices = {
        new Part(15, Color.yellow), // 1st candidates voters
        new Part(30, Color.green), // 2nd candidates voters
        new Part(10, Color.white) // dont choose anything
    };

    public void paint(Graphics g) {
        drawPie((Graphics2D) g, getBounds(), slices);
    }

    void drawPie(Graphics2D g, Rectangle area, Part[] slices) {
        double total = 0.0D;
        for (int i = 0; i < slices.length; i++) {
            total += slices[i].value;
        }
        double curValue = 0.0D;
        int startAngle = 0;
        for (int i = 0; i < slices.length; i++) {
            startAngle = (int) (curValue * 360 / total);
            int arcAngle = (int) (slices[i].value * 360 / total);
            g.setColor(slices[i].color);
            g.fillArc(area.x, area.y, area.width, area.height, startAngle, arcAngle);
            curValue += slices[i].value;
        }
    }
}