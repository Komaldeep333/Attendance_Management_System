package project;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Department2 extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField head;
	private JTextField id;
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					Department2 frame = new Department2();
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Department2(Integer ID) {
		setBounds(0, 0, 1065, 549);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(211, 211, 211));
		panel.setBounds(0, 0, 467, 519);
		getContentPane().add(panel);
		
		JLabel lblNewLabel_3_1 = new JLabel("ATTENDANCE");
		lblNewLabel_3_1.setFont(new Font("Arial Black", Font.PLAIN, 50));
		lblNewLabel_3_1.setBounds(80, 170, 387, 86);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("MANAGEMENT SYSTEM");
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(198, 250, 269, 30);
		panel.add(lblNewLabel_4);
		
		JPanel contentPane_3 = new JPanel();
		contentPane_3.setLayout(null);
		contentPane_3.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_3.setBackground(new Color(128, 128, 128));
		contentPane_3.setBounds(467, 127, 585, 392);
		getContentPane().add(contentPane_3);
		
		table = new JTable();
		table.setBounds(255, 232, 1, 1);
		contentPane_3.add(table);
		
		JLabel lblNewLabel_1_1 = new JLabel("Department Name");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(10, 130, 257, 29);
		contentPane_3.add(lblNewLabel_1_1);
		
		head = new JTextField();
		head.setColumns(10);
		head.setBounds(296, 46, 228, 29);
		contentPane_3.add(head);
		
		JLabel lblNewLabel_2 = new JLabel("Department Head");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(10, 46, 257, 29);
		contentPane_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Department ID");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel_3.setBounds(10, 219, 202, 29);
		contentPane_3.add(lblNewLabel_3);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(291, 219, 233, 29);
		contentPane_3.add(id);
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				updateDepartmentRecord();
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton.setBounds(22, 314, 109, 37);
		contentPane_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1.setBounds(387, 314, 137, 37);
		contentPane_3.add(btnNewButton_1);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(296, 130, 228, 29);
		contentPane_3.add(name);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBounds(467, 0, 585, 127);
		getContentPane().add(panel_1);
		
		JLabel lblDepatment_1 = new JLabel("Department");
		lblDepatment_1.setForeground(new Color(250, 250, 210));
		lblDepatment_1.setFont(new Font("Arial Black", Font.BOLD, 59));
		lblDepatment_1.setBounds(79, 31, 423, 72);
		panel_1.add(lblDepatment_1);
		
		data(ID);

	}
	  private void updateDepartmentRecord() {
      	
      	int DepartmentID;

      	try
      	{

      	Class.forName("com.mysql.jdbc.Driver");
      	Connection objconnection=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");

      	Statement objstatement= (Statement)objconnection.createStatement();

      	DepartmentID=Integer.parseInt(id.getText());
//      	 String value = name.getSelectedItem().toString();
      	String query="UPDATE departments SET departmentname= '"+ name.getText()+"' ,departmenthead= '"+ head.getText()  +"' where departmentid='"+ DepartmentID + "'";

      	objstatement.execute(query);
      	JOptionPane.showMessageDialog(this, "Record Updated");
      	System.out.println("Record updated");

      	}
      	catch(Exception ex)
      	{
      	System.out.println("Not updated");
      	}
      	}



      	 public void data(Integer ID) {
      try
		{
			  Class.forName("com.mysql.cj.jdbc.Driver");
            Connection objconnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance management system","root","");
            
            Statement objstatement= (Statement)objconnection.createStatement();
            String query="SELECT * from departments where DepartmentId='"+ID+"'";
            
            
            System.out.println(query);
            
            ResultSet record=objstatement.executeQuery(query);     
            
            if(record.next())
            {
//          	  String value = combo.getSelectedItem().toString();
                head.setText(record.getString("DepartmentHead"));
                name.setText(record.getString("DepartmentName"));
                id.setText(record.getString("DepartmentId"));
                
            }
            else {
          	  System.out.println("record not inserted");
            }
		}
		catch(Exception e)
		{
			
				}
      }
}
