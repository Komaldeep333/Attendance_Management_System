package project;
import project.class1;

import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Employee extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField id;
	private JTextField name;
	private JTextField fname;
	private JTextField pnumber;
	private JTextField eid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setBounds(0, 0, 1065, 549);
//		setBounds(100, 100, 1006, 678);
//		setSize(750,600);
//		setSize(998,651);	
		getContentPane().setLayout(null);
		
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBounds(0, 0, 1052, 519);
		getContentPane().add(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 153, 169, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Employee Name");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 228, 181, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Father Name");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(10, 308, 169, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(10, 386, 169, 31);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Department");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(10, 459, 169, 31);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Designation");
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(453, 308, 163, 31);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Phone Number");
		lblNewLabel_6_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_6_1.setBounds(453, 228, 163, 31);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Email ID");
		lblNewLabel_6_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_6_2.setBounds(453, 153, 163, 31);
		contentPane.add(lblNewLabel_6_2);
		
		name = new JTextField();
		name.setColumns(10);
		name.setBounds(201, 235, 206, 25);
		contentPane.add(name);
		
		fname = new JTextField();
		fname.setColumns(10);
		fname.setBounds(201, 315, 206, 25);
		contentPane.add(fname);
		
		pnumber = new JTextField();
		pnumber.setColumns(10);
		pnumber.setBounds(637, 228, 181, 25);
		contentPane.add(pnumber);
		
		eid = new JTextField();
		eid.setColumns(10);
		eid.setBounds(637, 153, 181, 25);
		contentPane.add(eid);
		
		JLabel lblNewLabel_6_3 = new JLabel("Status");
		lblNewLabel_6_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_6_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_6_3.setBounds(453, 386, 163, 31);
		contentPane.add(lblNewLabel_6_3);
		
		JComboBox gender = new JComboBox();
		gender.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gender.setModel(new DefaultComboBoxModel(new String[] {"--select--", "Male", "Female", "Others"}));
		gender.setBounds(199, 393, 206, 21);
		contentPane.add(gender);
		
	
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_1.setBounds(628, 459, 117, 31);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(47, 79, 79));
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(10, 10, 1032, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Employee");
		lblNewLabel.setForeground(new Color(255, 250, 205));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 59));
		lblNewLabel.setBounds(289, 10, 466, 77);
		panel.add(lblNewLabel);
		
		id = new JTextField();
		id.setBounds(201, 153, 206, 25);
		contentPane.add(id);
		id.setColumns(10);
		
		JComboBox dept = new JComboBox();
		dept.setFont(new Font("Tahoma", Font.PLAIN, 15));
		dept.setBounds(201, 464, 206, 25);
		contentPane.add(dept);
		
		JComboBox design = new JComboBox();
		design.setFont(new Font("Tahoma", Font.PLAIN, 15));
		design.setModel(new DefaultComboBoxModel(new String[] {"--select--", "Senior Manager", "Manager", "Assistant Manager", "Associate ", "Executive", "Clerks", "Interns", "Trainees"}));
		design.setBounds(637, 308, 181, 25);
		contentPane.add(design);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--select--", "Active", "Not-Active"}));
		comboBox.setBounds(637, 393, 181, 21);
		contentPane.add(comboBox);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					 // Get input values
		            String phoneNumber = pnumber.getText();
		            String email = eid.getText();

		            // Validation for phone number: it should be exactly 10 digits
		            if (phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) {
		                JOptionPane.showMessageDialog(btnNewButton, "Phone number must be exactly 10 digits", "Invalid Input", JOptionPane.ERROR_MESSAGE);
		                return; // Exit if validation fails
		            }

		            // Validation for email: it should end with @gmail.com
		            if (!email.endsWith("@gmail.com")) {
		                JOptionPane.showMessageDialog(btnNewButton, "Email must end with @gmail.com", "Invalid Input", JOptionPane.ERROR_MESSAGE);
		                return; // Exit if validation fails
		            }
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection obj=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");
				    Statement object=(Statement)obj.createStatement();
				    String value = gender.getSelectedItem().toString();
				    
				   class1 selectedname=(class1)dept.getSelectedItem();
					 
				    class1 selectedDepartment = (class1)dept.getSelectedItem();
				   
//				    String value1=gender.getSelectedItem().toString();
				    
				    String value2 = design.getSelectedItem().toString();
				    
				    String status = comboBox.getSelectedItem().toString();
				    
				    int typevalue=selectedname.getId();
				    //-------------------------------------------------		    
				    String query_1="Insert into employees(EmployeeId,EmployeeName,FatherName,Gender,Designation,PhoneNumber,EmailId,Status_of_employee,DepartmentKey) values('"+id.getText()+"','"+name.getText()+"','"+fname.getText()+"','"+value+"','"+value2+"','"+pnumber.getText()+"','"+eid.getText()+"','"+status+"','"+typevalue+"')";
//				    "Insert into employees(EmployeeId,EmployeeName,FatherName,Gender,Designation,PhoneNumber,EmailId,Status_of_employee,DepartmentKey) values('"+id.getText()+"','"+name.getText()+"','"+fname.getText()+"','"+value+"','"+value2+"','"+pnumber.getText()+"','"+eid.getText()+"','"+status+"','"+typevalue+"')";
				    System.out.println(query_1);
				    object.execute(query_1);
				    
			    JOptionPane.showMessageDialog(btnNewButton,"Record Inserted");
				 
				}
				catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton.setBounds(474, 459, 117, 31);
		contentPane.add(btnNewButton);
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		try
    	{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection objconnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance management system","root","");
              
           Statement objstatement= (Statement)objconnection.createStatement();

           
           String query="SELECT DepartmentKey,DepartmentName from departments";
              

           ResultSet record=objstatement.executeQuery(query);     
              

           while(record.next())

           {
                int deptkey=record.getInt("DepartmentKey");
                
                String deptname=record.getString("DepartmentName");
             dept.addItem(new class1(deptkey,deptname));

           }

}
catch(Exception e){
System.out.println(e.getMessage());
}




	}
}
