package project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//import Practice.Attendenceclass;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Employee2 extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txt;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt5;
	private JTextField txt6;
	private JTextField txt7;
	private JTextField txt3;
	private JTextField txt8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//ModifyEmp frame = new ModifyEmp();
					//frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Employee2(Integer ID) {
		getContentPane().setBackground(new Color(128, 128, 128));
		setBounds(0, 0, 1065, 549);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee ID");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 148, 178, 24);
		getContentPane().add(lblNewLabel_1);
		
		txt = new JTextField();
		txt.setBounds(207, 148, 178, 24);
		getContentPane().add(txt);
		txt.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Employee Name");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 219, 178, 37);
		getContentPane().add(lblNewLabel_1_1);
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		txt1.setBounds(207, 230, 178, 24);
		getContentPane().add(txt1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Father's Name");
		lblNewLabel_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(10, 297, 178, 37);
		getContentPane().add(lblNewLabel_1_1_1);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(207, 308, 178, 24);
		getContentPane().add(txt2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_1_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(10, 370, 178, 37);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Department");
		lblNewLabel_1_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_1_2.setBounds(10, 440, 178, 37);
		getContentPane().add(lblNewLabel_1_1_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(0, 0, 1039, 94);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Update Employee");
		lblNewLabel.setForeground(new Color(255, 250, 205));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 59));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email ID");
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(404, 148, 136, 24);
		getContentPane().add(lblNewLabel_1_2);
		
		txt5 = new JTextField();
		txt5.setColumns(10);
		txt5.setBounds(600, 153, 188, 24);
		getContentPane().add(txt5);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Phone Number");
		lblNewLabel_1_1_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_3.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_1_3.setBounds(404, 219, 169, 37);
		getContentPane().add(lblNewLabel_1_1_3);
		
		txt6 = new JTextField();
		txt6.setColumns(10);
		txt6.setBounds(600, 230, 188, 24);
		getContentPane().add(txt6);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Designation");
		lblNewLabel_1_1_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_2_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_1_2_1.setBounds(404, 297, 178, 37);
		getContentPane().add(lblNewLabel_1_1_2_1);
		
		txt7 = new JTextField();
		txt7.setColumns(10);
		txt7.setBounds(600, 308, 188, 24);
		getContentPane().add(txt7);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Status");
		lblNewLabel_1_1_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(404, 370, 160, 37);
		getContentPane().add(lblNewLabel_1_1_1_1_1);
//		JComboBox comboBox = new JComboBox();
//		comboBox.setBounds(207, 278, 112, 22);
//		getContentPane().add(comboBox);

				//----------------------------------------------------------Cancel-------------------------------------------------------------------------
		JButton btnCancel = new JButton("Clear All");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 txt.setText("");
				    txt1.setText("");
				   txt2.setText("");
				   txt3.setText("");
//				   .setText("");
				   txt5.setText("");
				   txt6.setText("");
				   txt7.setText("");
				   txt8.setText("");
				  
				
				
			}
		});
		btnCancel.setForeground(new Color(0, 0, 0));
		btnCancel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnCancel.setBounds(533, 443, 146, 31);
		getContentPane().add(btnCancel);
	//-----------------------------------------------------------------------------------------------------------------------------------------------------------------	
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(207, 381, 178, 24);
		getContentPane().add(txt3);
		
		txt8 = new JTextField();
		txt8.setColumns(10);
		txt8.setBounds(600, 381, 188, 24);
		getContentPane().add(txt8);
		
		JComboBox dep = new JComboBox();
		dep.setBounds(207, 451, 178, 22);
		getContentPane().add(dep);
//		//----------------------------------------------------------------------ok button///////////
//		
//				JButton btnNewButton = new JButton("OK");
//				btnNewButton.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//					///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//						try {
//							Class.forName("com.mysql.cj.jdbc.Driver");
//							Connection obj=DriverManager.getConnection("jdbc:mysql://localhost/attendencemanagementsystem","root","");
//						    Statement object=(Statement)obj.createStatement();
//		/////////////////////////////////++++++++
//		//departmentclass selectedname=(departmentclass)dep.getSelectedItem();
//							//departmentclass selectedDepartment = ( departmentclass) dep.getSelectedItem();
//							//int typevalue=selectedname.getId();	
//									
//		///////////////////////////////////////////++++
//
//		String query="Update employees set EmployeeName='"+txt1.getText()+"',FatherName='"+txt2.getText()+"',Gender='"+txt3.getText()+"',DepartmentKey='"/+txt4.getText()/+typevalue+"',EmailId='"+txt5.getText()+"',PhoneNumber='"+txt6.getText()+"',Designation='"+txt7.getText()+"',StatusOfEmployee='"+txt8.getText()+"' where EmployeeId='"+ID+"'";
//						    System.out.println(query);				   
//						    object.execute(query);
//					    JOptionPane.showMessageDialog(btnNewButton,"Record Updated");
//					   txt.setText("");
//					    txt1.setText("");
//					   txt2.setText("");
//					   txt3.setText("");
//					   txt4.setText("");
//					   txt5.setText("");
//					   txt6.setText("");
//					   txt7.setText("");
//					   txt8.setText("");
//					    
//						}
//						catch(Exception ex) {
//							System.out.println(ex.getMessage());
//						}
//						
//						
//					
//						/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//						
//						
//					}
//				});
//				btnNewButton.setForeground(new Color(0, 191, 255));
//				btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 15));
//				btnNewButton.setBounds(45, 378, 81, 23);
//				getContentPane().add(btnNewButton);
//
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////++++++
try
{



Class.forName("com.mysql.cj.jdbc.Driver");
Connection objconnection=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");

Statement objstatement= (Statement)objconnection.createStatement();
String query="SELECT Departmentkey,DepartmentName from departments";

ResultSet record=objstatement.executeQuery(query);     

while(record.next())
{

int deptkey=record.getInt("Departmentkey");
String deptname=record.getString("DepartmentName");



dep.addItem(new class1(deptkey,deptname));

//System.out.println(deptkey);
//System.out.println(deptname);
// txt4.addItem(new Attendce(deptkey,deptname));  

//class1 selectedname=(class1)dep.getSelectedItem();
//
//class1 selectedDepartment = (class1) dep.getSelectedItem();



}

}
catch(Exception e){
	
System.out.println(e.getMessage());

}
/////////////////////////////////++++++++
		//departmentclass selectedname=(departmentclass)comboBox.getSelectedItem();
		//departmentclass selectedDepartment = ( departmentclass) comboBox.getSelectedItem();
//int typevalue=selectedname.getId();	
		

///////////////////////////////////////////++++


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------------------------------------------ok button///////////

JButton btnNewButton = new JButton("Done");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		try {
			 // Phone number validation
            String phoneNumber = txt6.getText();
            if (phoneNumber.length() != 10 || !phoneNumber.matches("\\d+")) {
                JOptionPane.showMessageDialog(btnNewButton, "Phone number must be exactly 10 digits.");
                return; // Stop further execution
            }

            // Email validation
            String email = txt5.getText();
            if (!email.endsWith("@gmail.com")) {
                JOptionPane.showMessageDialog(btnNewButton, "Email must end with '@gmail.com'.");
                return; // Stop further execution
            }

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection obj=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");
		    Statement object=(Statement)obj.createStatement();
/////////////////////////////////++++++++
		    class1 selectedname=(class1)dep.getSelectedItem();
		    class1 selectedDepartment = ( class1) dep.getSelectedItem();
			int typevalue=selectedname.getId();	
					
///////////////////////////////////////////++++

String query="Update employees set EmployeeName='"+txt1.getText()+"',FatherName='"+txt2.getText()+"',Gender='"+txt3.getText()+"',Departmentkey='"+typevalue+"',EmailId='"+txt5.getText()+"',PhoneNumber='"+txt6.getText()+"',Designation='"+txt7.getText()+"',Status_of_employee='"+txt8.getText()+"' where EmployeeId='"+ID+"'";
		    System.out.println(query);				   
		    object.execute(query);
	    JOptionPane.showMessageDialog(btnNewButton,"Record Updated");
	   txt.setText("");
	    txt1.setText("");
	   txt2.setText("");
	   txt3.setText("");
//	   .setText("");
	   txt5.setText("");
	   txt6.setText("");
	   txt7.setText("");
	   txt8.setText("");
	    
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		
	
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
	}
});
btnNewButton.setForeground(new Color(0, 0, 0));
btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
btnNewButton.setBounds(404, 443, 117, 31);
getContentPane().add(btnNewButton);



		data(dep,ID);
		
		JButton btnExit = new JButton("Cancel");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnExit.setBounds(689, 443, 117, 31);
		getContentPane().add(btnExit);
	}
	
	public void data(JComboBox<class1> dep,Integer ID)
	{
		 try
	      {
	          
	          Class.forName("com.mysql.cj.jdbc.Driver");
	          Connection objconnection=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");
	          
	          Statement objstatement= (Statement)objconnection.createStatement();
          String query="SELECT * from employees where EmployeeId='"+ID+"'";
	          
	          ResultSet datalist=objstatement.executeQuery(query);  
	          
	          if(datalist.next()) {
	        	  
	        	  txt.setText(datalist.getString("EmployeeId"));
	        	  txt1.setText(datalist.getString("EmployeeName"));
	        	 txt2.setText(datalist.getString("FatherName"));
	        	 txt3.setText(datalist.getString("Gender"));
	        
	        	  
	        	 
	        	
	        	 int departmentKey = datalist.getInt("DepartmentKey");
	        	 System.out.println(departmentKey);
	        	 
	        	 
	        	 for(int i=0;i< dep.getItemCount();i++)
	        	 {
	        		 class1 department= dep.getItemAt(i);
	        		 
	        		 if(department.getId()== departmentKey)
	        		 {
	        			 dep.setSelectedIndex(i);
	        			 break;
	        		 }
	        		 
	        		 
	        		 
	        	 }
	        	 
	        	 
//	             String departmentName = getDepartmentName(objconnection, departmentKey);
//	             txt4.setText(departmentName); // Display department name instead of key
	             //txt4.setText(datalist.getString("DepartmentKey"));
	        	 //int typevalue=selectedname.getId();
	        	 dep.setSelectedItem(departmentKey);
	        	 txt5.setText(datalist.getString("EmailId"));
	        	 txt6.setText(datalist.getString("PhoneNumber"));
	        	 txt7.setText(datalist.getString("Designation"));
	        	 txt8.setText(datalist.getString("Status_of_employee"));
	        	
	        	
	        	 
	        	 
	        	 
	        	 
	        	  
	          }
	          else
	          {
	        	  System.out.println("Record not exist");
	          }
	        }
		 catch(Exception e)
	      {
	           System.out.println(e.getMessage());
	          e.printStackTrace();
	      }

	}
}