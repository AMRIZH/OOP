package Layout;

import java.awt.*;
import javax.swing.*;

public class BoxPanel extends JPanel {
    public BoxPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.green);
        JButton b1 = new JButton("BUTTON 1");
        JButton b2 = new JButton("BUTTON 2");
        JButton b3 = new JButton("BUTTON 3");
        JButton b4 = new JButton("BUTTON 4");
        JButton b5 = new JButton("BUTTON 5");
        add(b1);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(Box.createVerticalGlue());
        add(b2);
        add(Box.createVerticalGlue());
        add(b3);
        add(Box.createVerticalGlue());
        add(b4);
        add(Box.createRigidArea(new Dimension(0, 20)));
        add(Box.createVerticalGlue());
        add(b5);
    }
}