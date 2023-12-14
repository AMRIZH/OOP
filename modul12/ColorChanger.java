import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChanger {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Ubah Warna Background");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu colorMenu = new JMenu("Ubah Warna");
        menuBar.add(colorMenu);

        String[] colors = {"Merah", "Kuning", "Hijau"};

        for (String color : colors) {
            JMenuItem menuItem = new JMenuItem(color);
            menuItem.addActionListener(new ColorChangeListener(frame, color));
            colorMenu.add(menuItem);
        }

        frame.setVisible(true);
    }

    private static class ColorChangeListener implements ActionListener {
        private JFrame frame;
        private String color;

        public ColorChangeListener(JFrame frame, String color) {
            this.frame = frame;
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (color) {
                case "Merah":
                    frame.getContentPane().setBackground(Color.RED);
                    break;
                case "Kuning":
                    frame.getContentPane().setBackground(Color.YELLOW);
                    break;
                case "Hijau":
                    frame.getContentPane().setBackground(Color.GREEN);
                    break;
            }
        }
    }
}