import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Evoting extends JFrame{
  public Evoting(){
    //Jframe = a gui window to add components to
    JFrame frame = new JFrame(); // create a frame
    frame.setTitle("Program E-voting"); //set title of frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
    // frame.setResizable(false); //prevent frame from being resized
    frame.setSize(500,500); //set the x-dimension and y-dimension of frmae size
    frame.getContentPane().setBackground(new Color(254,249,164)); //change color of background
 
    //add image icon
    ImageIcon image = new ImageIcon("7.jpg"); //create an image icon
    frame.setIconImage(image.getImage()); // change icon of frame

    Border border = BorderFactory.createLineBorder(Color.green);

    //Jlabel = a GUI display area for a string of text, an image, or both
    // JLabel label1 = new JLabel(); //create a new label
    // label1.setText("Program Evoting"); //set text label
    // frame.add(label1); //add label into frame

    JLabel label2 = new JLabel(); 
    ImageIcon image1 = new ImageIcon("HitlerPhoto.png"); //add image
    label2.setIcon(image1); //set image of label

    label2.setText("Pakde Hitler"); //set text of label
    label2.setVerticalTextPosition(JLabel.TOP); //set text position (TOP,CENTER,BOTTOM) of imageicon
    // label2.setForeground(new Color(0)); //set color of text
    // label2.setFont(new Font("MV Boli",Font.PLAIN,20)); //set fotn, type and size of font
    // label2.setIconTextGap(-25); //set gap between icon and image
    // label2.setBackground(Color.BLACK); //set bg color of label
    // label2.setOpaque(true);
    // label2.setBorder(border);
    frame.add(label2); // add label into frame


        frame.setVisible(true); // make frame visible
  }
  
  public static void main(String[] args) {
    Evoting evote = new Evoting();
  }
}
