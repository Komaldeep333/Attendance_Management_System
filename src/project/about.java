package project;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class about extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					about frame = new about();
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
	public about() {
		getContentPane().setBackground(new Color(128, 128, 128));
		setBounds(0, 0, 1065, 549);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(10, 10, 1031, 86);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("About");
		lblNewLabel.setForeground(new Color(255, 250, 205));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 59));
		lblNewLabel.setBounds(414, 10, 626, 73);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		panel_1.setBounds(0, 92, 1050, 426);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea txtrSoftwareInformationName = new JTextArea();
		txtrSoftwareInformationName.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrSoftwareInformationName.setText("Software Information:\r\n\r\nName of the Software: ATTENDANCE MANAGEMENT SYSTEM\r\nVersion: Latest\r\nRelease Date: 31st July 2024\r\n\r\nPurpose and Features:\r\nPurpose: \"This system is designed to help organizations track employee attendance efficiently and accurately\".\r\nKey Features: Some of the key features of the software, such as:\r\nEmployee attendance tracking\r\nAvailable Departments\r\nAttendance\r\nLeave management\r\nReport generation \r\n\r\nTeam:\r\nDevelopers: 1) Mohit Dhanuka  2) Komaldeep Kaur.\r\nContact Information: 1) mohitdhanuka@gmail.com  2) komaldeep@gmail.comcensing \r\n\r\nAcknowledgements: With our knowledge about the language and the eclips IDE we have made this project presentable and without\r\nthe help of NSPL team, our friends, crome, chatgpt, and several other tools this project was imposible to be completed .");
		txtrSoftwareInformationName.setBounds(0, 10, 1050, 416);
		panel_1.add(txtrSoftwareInformationName);

	}
}
