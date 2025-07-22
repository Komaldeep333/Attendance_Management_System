package project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LogIn extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    
    // Predefined username and password
    private final String fixedUsername = "mohit";
    private final String fixedUsername1 = "komaldeep";
    private final String fixedPassword = "123";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogIn frame = new LogIn();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public LogIn() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1065, 549);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(211, 211, 211));
        panel.setBounds(0, 0, 527, 512);
        contentPane.add(panel);
        
//        JLabel lblImage = new JLabel("");
//        lblImage.setBounds(10, 27, 507, 475);
//        
//        // Load the image and resize it to fit the panel
//        ImageIcon icon = new ImageIcon("img/login_image1.png"); // Change to the path of your image
//        Image image = icon.getImage(); // transform it 
//        Image scaledImage = image.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(),  Image.SCALE_SMOOTH); // scale it smoothly
//        icon = new ImageIcon(scaledImage);  // transform it back
//        
//        lblImage.setIcon(icon);
//        panel.add(lblImage);

        JLabel lblNewLabel_3 = new JLabel("ATTENDANCE");
        lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 59));
        lblNewLabel_3.setBounds(63, 172, 454, 86);
        panel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("MANAGEMENT SYSTEM");
        lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
        lblNewLabel_4.setBounds(258, 246, 269, 30);
        panel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setBounds(10, 27, 454, 475);
        panel.add(lblNewLabel_5);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(52, 71, 70));
        panel_1.setBounds(527, 0, 524, 512);
        contentPane.add(panel_1);
        
        JLabel lblNewLabel = new JLabel("LOGIN");
        lblNewLabel.setForeground(new Color(245, 245, 245));
        lblNewLabel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 59));
        lblNewLabel.setBounds(156, 33, 340, 85);
        panel_1.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Username");
        lblNewLabel_1.setForeground(new Color(245, 245, 245));
        lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.PLAIN, 25));
        lblNewLabel_1.setBounds(26, 150, 209, 37);
        panel_1.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(26, 197, 466, 37);
        panel_1.add(textField);
        
        JLabel lblNewLabel_2 = new JLabel("Password");
        lblNewLabel_2.setForeground(new Color(245, 245, 245));
        lblNewLabel_2.setFont(new Font("Baskerville Old Face", Font.PLAIN, 25));
        lblNewLabel_2.setBounds(26, 284, 209, 37);
        panel_1.add(lblNewLabel_2);
        
        JButton btnNewButton = new JButton("LOGIN");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = textField.getText();
                String enteredPassword = new String(passwordField.getPassword());

                // Validate the entered credentials
                if ((fixedUsername.equals(enteredUsername) || fixedUsername1.equals(enteredUsername) )  && fixedPassword.equals(enteredPassword)) {
                    mdiProgramming mymdi = new mdiProgramming();
                    mymdi.setVisible(true);
                    dispose();
                } else {
                    // Show error message
                    JOptionPane.showMessageDialog(btnNewButton, "Invalid Username or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnNewButton.setFont(new Font("Baskerville Old Face", Font.PLAIN, 25));
        btnNewButton.setBounds(26, 418, 246, 45);
        panel_1.add(btnNewButton);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(26, 329, 470, 37);
        panel_1.add(passwordField);
        
        getRootPane().setDefaultButton(btnNewButton);
        
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                passwordField.requestFocus(); // Move focus to the password field
            }
        });
    }
}
