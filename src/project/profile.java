package project;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class profile extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					profile frame = new profile();
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
	public profile() {
		getContentPane().setBackground(new Color(128, 128, 128));
		setBounds(0, 0, 1065, 549);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(0, 112, 532, 407);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 37, 211, 36);
		panel.add(lblNewLabel);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblGender.setBounds(10, 97, 211, 36);
		panel.add(lblGender);
		
		JLabel lblCity = new JLabel("DOB");
		lblCity.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblCity.setBounds(10, 165, 211, 36);
		panel.add(lblCity);
		
		JLabel lblCity_1 = new JLabel("City");
		lblCity_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblCity_1.setBounds(10, 226, 211, 36);
		panel.add(lblCity_1);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblMobileNumber.setBounds(10, 298, 211, 36);
		panel.add(lblMobileNumber);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblEmail.setBounds(10, 360, 211, 36);
		panel.add(lblEmail);
		
		textField = new JTextField(" Mohit Dhanuka");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(241, 37, 273, 34);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("Male");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(241, 99, 273, 34);
		panel.add(textField_1);
		
		textField_2 = new JTextField("08-11-2004");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(241, 165, 273, 34);
		panel.add(textField_2);
		
		textField_3 = new JTextField("Amritsar");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(241, 226, 273, 34);
		panel.add(textField_3);
		
		textField_4 = new JTextField("9780875407");
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(241, 300, 273, 34);
		panel.add(textField_4);
		
		textField_5 = new JTextField("mohitdhanuka1@gmail.com");
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(241, 360, 273, 34);
		panel.add(textField_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 10, 1031, 86);
		getContentPane().add(panel_2);
		panel_2.setBackground(new Color(47, 79, 79));
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Admin\r\n Profile");
		lblNewLabel_2.setBounds(319, 0, 446, 86);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(255, 250, 205));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 59));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setLayout(null);
		panel_1.setBounds(525, 112, 524, 407);
		getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(10, 37, 211, 36);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblGender_1 = new JLabel("Gender");
		lblGender_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblGender_1.setBounds(10, 97, 211, 36);
		panel_1.add(lblGender_1);
		
		JLabel lblCity_2 = new JLabel("DOB");
		lblCity_2.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblCity_2.setBounds(10, 165, 211, 36);
		panel_1.add(lblCity_2);
		
		JLabel lblCity_1_1 = new JLabel("City");
		lblCity_1_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblCity_1_1.setBounds(10, 226, 211, 36);
		panel_1.add(lblCity_1_1);
		
		JLabel lblMobileNumber_1 = new JLabel("Mobile Number");
		lblMobileNumber_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblMobileNumber_1.setBounds(10, 298, 211, 36);
		panel_1.add(lblMobileNumber_1);
		
		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblEmail_1.setBounds(10, 360, 211, 36);
		panel_1.add(lblEmail_1);
		
		textField_6 = new JTextField("Komaldeep Kaur");
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(241, 37, 273, 34);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField("Female");
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(241, 99, 273, 34);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField("25-07-2003");
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(241, 165, 273, 34);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField("Amritsar");
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_9.setColumns(10);
		textField_9.setBounds(241, 226, 273, 34);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField("7707881846");
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_10.setColumns(10);
		textField_10.setBounds(241, 300, 273, 34);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField("komaldeepkaur@gmail.com");
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_11.setColumns(10);
		textField_11.setBounds(241, 360, 273, 34);
		panel_1.add(textField_11);

	}
}
