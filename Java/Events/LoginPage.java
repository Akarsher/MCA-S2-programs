import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    public static void main(String[] args) {
        // Creating the frame
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(240, 240, 240)); // Light theme background
        
        // Creating components
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 30, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(120, 30, 180, 25);
        frame.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(30, 70, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(120, 70, 180, 25);
        frame.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(120, 110, 100, 30);
        frame.add(loginButton);

        // Button action
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                // Hardcoded login credentials for demonstration
                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Setting frame visibility
        frame.setVisible(true);
    }
}

