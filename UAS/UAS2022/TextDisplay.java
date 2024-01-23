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
    frame.setSize(250,100);
    frame.setVisible(true);
  }
  public static void main(String[] args) {
    new TextDisplay();
  }
}
