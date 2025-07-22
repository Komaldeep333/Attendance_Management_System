package project;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class Selection extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selection frame = new Selection();
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
	public Selection() {
		setBounds(100, 100, 1039, 584);
		getContentPane().setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBounds(0, 0, 1023, 548);
		getContentPane().add(contentPane);
		
		JButton btnNewButton = new JButton("Leave Policy");
		btnNewButton.setFont(new Font("Rockwell", Font.PLAIN, 25));
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setBounds(10, 220, 188, 83);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Department");
		btnNewButton_1.setFont(new Font("Rockwell", Font.PLAIN, 25));
		btnNewButton_1.setBackground(new Color(255, 140, 0));
		btnNewButton_1.setBounds(226, 220, 169, 83);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Employee");
		btnNewButton_2.setFont(new Font("Rockwell", Font.PLAIN, 25));
		btnNewButton_2.setBackground(new Color(50, 205, 50));
		btnNewButton_2.setBounds(416, 220, 169, 83);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Attendance");
		btnNewButton_3.setFont(new Font("Rockwell", Font.PLAIN, 25));
		btnNewButton_3.setBackground(Color.RED);
		btnNewButton_3.setBounds(615, 220, 169, 83);
		contentPane.add(btnNewButton_3);
		
		JList list = new JList();
		list.setBounds(954, 25, 1, 1);
		contentPane.add(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(834, 25, 115, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Date and Time");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(21, 25, 154, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\r\nYour attendance today shapes your success tomorrow. Make it count.");
		lblNewLabel_1.setFont(new Font("Rockwell", Font.BOLD, 25));
		lblNewLabel_1.setBounds(39, 94, 935, 68);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome");
		lblNewLabel_2.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(745, 29, 87, 17);
		contentPane.add(lblNewLabel_2);
		
		JButton btnReport = new JButton("Report");
		btnReport.setFont(new Font("Rockwell", Font.PLAIN, 25));
		btnReport.setBackground(new Color(0, 191, 255));
		btnReport.setBounds(802, 220, 188, 83);
		contentPane.add(btnReport);

	}
}
