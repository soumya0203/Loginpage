package Projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame
{
   JTextField usernameField;
   JPasswordField passwordField;
  
  public LoginPage()
  {
	  setTitle("Login Page");
	  setSize(300,200);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setLocationRelativeTo(null);
	  
	  JPanel panel = new JPanel();
	  panel.setLayout(new GridLayout(3, 2));
	  
	  JLabel usernameLabel = new JLabel("Username:");
	  JLabel passwordLabel = new JLabel("Password:");
	  
	  usernameField = new JTextField();
	  passwordField = new JPasswordField();
	  
	  JButton loginButton = new JButton("Login");
	  loginButton.addActionListener(new ActionListener()
			  {
		  public void actionPerformed(ActionEvent e)
		  {
			  authenticate();
		  }
		 });
  
	     panel.add(usernameLabel);
	     panel.add(usernameField);
	     panel.add(passwordLabel);
	     panel.add(passwordField);
	     panel.add(new JLabel());
	     panel.add(loginButton);
	     
	     add(panel);
	     setVisible(true);
  }
  
  public void authenticate()
  {
	  String username = usernameField.getText();
	  char[] password = passwordField.getPassword();
	  String enteredPassword = new String(password);
	  
	  if(username.equals("admin")&& enteredPassword.equals("password"))
	  {
		  JOptionPane.showMessageDialog(this,  "Login Successful!");
	  }
	  else 
	  {
		  JOptionPane.showMessageDialog(this, "Invalid username or password");
	  }
	  usernameField.setText("");
	  passwordField.setText("");
  }
	public static void main(String[] args) {

				new LoginPage();
			}
	

	}


