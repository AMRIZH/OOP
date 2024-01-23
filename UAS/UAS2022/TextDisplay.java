package UAS.UAS2022;
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TextDisplay {
  private JTextField textfield;
  private JLabel label;

  public TextDisplay(){
    // Create the text field and label
    textfield = new JTextField(10);
    label = new JLabel("Text will be displayed here");

    // add the key listener to the text field
    textfield.addKeyListener(new KeyAdapter(){
      public void keyReleased(KeyEvent e) {
        label.setText(textfield.getText());
      }
    });

    //create frae and add comonents
    JFrame frame = new JFrame("Display Text");
    frame.add(textfield);
    frame.add(label);
<<<<<<< HEAD
    frame.setSize(250,200);
=======
    frame.setSize(250,100);
>>>>>>> 587ffd38ad6ea12244d5c78e7ae369a3659ae3c5
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    new TextDisplay();
  }
}
