import javax.swing.*;
import java.awt.event.*;

public class DemoEvent extends Utama implements ActionListener {
  DemoEvent (){
   JButton tombol = new JButton("Klik donk");
   tombol.addActionListener(this);
   JPanel panel = new JPanel();
   panel.add(tombol);
   this.add(panel);
  }
  public void actionPerformed(ActionEvent e) {
   setTitle("Judul diganti");
   }
  public static void main(String args[]){
   DemoEvent dme = new DemoEvent();
  }
}

