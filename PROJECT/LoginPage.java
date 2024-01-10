package PROJECT;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class LoginPage extends JFrame{
  public LoginPage(){
    super("Login Page");
    // Set size of GUI
    setSize(200,100);
    // Set the default close operation to exit the application
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    // Make the JFrame visible
    setVisible(true);
    // Center the JFrame on the screen
    setLocationRelativeTo(null);
    
  }
  public static void main(String[] args) {
    LoginPage login = new LoginPage();

  }
}
