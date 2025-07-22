package project;

import java.awt.Color;
import java.awt.EventQueue;



import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JScrollPane; // Import JScrollPane
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;



import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class attendance extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					attendance frame = new attendance();
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
	public attendance() {
		getContentPane().setBackground(new Color(128, 128, 128));
		setBounds(0, 0, 1065, 549);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(10, 10, 1031, 86);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("DAILY ATTENDENCE");
		lblNewLabel.setForeground(new Color(255, 250, 205));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 59));
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 146, 198, 27);
		getContentPane().add(comboBox);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setForeground(new Color(0, 0, 0));
		lblDepartment.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblDepartment.setBounds(10, 113, 166, 37);
		getContentPane().add(lblDepartment);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setForeground(new Color(0, 0, 0));
		lblDate.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblDate.setBounds(224, 118, 89, 27);
		getContentPane().add(lblDate);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(225, 146, 153, 27);
		getContentPane().add(dateChooser);
		
		
		JButton btnMl = new JButton("ML");
		btnMl.setForeground(new Color(0, 0, 0));
		btnMl.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnMl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
		         if (selectedRow != -1) {
		             table.setValueAt("Medical Leave", selectedRow, 2);
		         }
			}
		});
		btnMl.setBounds(731, 144, 60, 27);
		getContentPane().add(btnMl);
		
		JButton btnPl = new JButton("PL");
		btnPl.setForeground(new Color(0, 0, 0));
		btnPl.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnPl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
		         if (selectedRow != -1) {
		             table.setValueAt("Paid Leave", selectedRow, 2);
		         }
			}
		});
		btnPl.setBounds(801, 144, 66, 27);
		getContentPane().add(btnPl);
		
		JButton btnCl = new JButton("CL");
		btnCl.setForeground(new Color(0, 0, 0));
		btnCl.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnCl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
		         if (selectedRow != -1) {
		             table.setValueAt("Casual Leave", selectedRow, 2);
		         }
			}
		});
		btnCl.setBounds(872, 144, 60, 27);
		getContentPane().add(btnCl);
		//------------------------------------------------------Submit-----------------------------------------------------------------------------------------
		 JButton btnNewButton_1_1 = new JButton("Submit");
		 btnNewButton_1_1.setForeground(new Color(0, 0, 0));
         btnNewButton_1_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {


                        int selectedRow = table.getSelectedRow();

                        if (selectedRow != -1)
                        {
                            try
                            {
                                Class.forName("com.mysql.cj.jdbc.Driver");
                                Connection objconnection =DriverManager.getConnection("jdbc:mysql://localhost/attendance management system", "root","");
                                Statement objstatement= (Statement)objconnection.createStatement();
                                SimpleDateFormat outputFormat=new  SimpleDateFormat("YYYY/MM/dd");
                                int employeeId = (int)table.getValueAt(selectedRow, 0);
                                
                                String status = (String)table.getValueAt(selectedRow, 2);
                                System.out.println(employeeId);
                                String formatteddate=outputFormat.format(dateChooser.getDate());
                                String query="insert into attendances(Employeekey,Attendance_Date,AttendanceType)values('"+employeeId+"','"+formatteddate+"','"+status+"')";
//                                String query = "UPDATE attendances SET Attendance_Date ='"+formatteddate+"',Employeekey='"+employeeId+"',AttendanceType='"+status+"'WHERE Employeekey='" + employeeId+"'";
                                System.out.println(query);
                               // PreparedStatement pstmt =objconnection.prepareStatement(query);
                               // System.out.println(query);
                               // pstmt.setString(1, status);
                              //  pstmt.setInt(2, employeeId);
                              //  pstmt.executeUpdate();
                              //  pstmt.close();
                                objstatement.execute(query);
                                objconnection.close();
                                System.out.println("Attendance status inserted.");
                            } catch (Exception ex) {
                                System.out.println(ex.getMessage());
                            }
                        }
                    }


         });
         btnNewButton_1_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
         btnNewButton_1_1.setBounds(940, 144, 102, 27);
         getContentPane().add(btnNewButton_1_1);
     

		//---------------------------------------------------------------------------------------------------------------------------------------------------------
		
      // Create a scroll pane to contain the table
 		JScrollPane scrollPane = new JScrollPane();
 		scrollPane.setBounds(10, 183, 1032, 326);
 		getContentPane().add(scrollPane);
         
		table = new JTable();
		table.setBounds(10, 183, 1032, 326);
		getContentPane().add(table);
		scrollPane.setViewportView(table);
		
		
		javax.swing.table.DefaultTableModel model=new javax.swing.table.DefaultTableModel();
		//table.setModel(model);
		//--------------------------------------------------------------------------------------------------------------------------
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
		//System.out.println(deptkey);
		//System.out.println(deptname);
                
             comboBox.addItem(new class1(deptkey,deptname));
//             Attendenceclass selectedname=(Attendenceclass)comboBox.getSelectedItem();
//			 
//             Attendenceclass selectedDepartment = (Attendenceclass) comboBox.getSelectedItem();
//			    int typevalue=selectedname.getId();
}

}
catch(Exception e){
System.out.println(e.getMessage())
;}
		//-------------------------------------------------------date
		 dateChooser.setDate(new Date());

//------------------------------------------------------------------------------------------------------------------------------------------------
		//----------------------------------------------------------------------Get Employees-----------------------
		JButton btnNewButton = new JButton("Get Employees");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					model.setRowCount(0);
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection obj=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");
				    Statement objstatement=(Statement)obj.createStatement();
				    class1 selectedname=(class1)comboBox.getSelectedItem();
	 	             class1 selectedDepartment = (class1) comboBox.getSelectedItem();
	    int typevalue=selectedname.getId();	
		
		String query_1="Select * from employees where Departmentkey="+typevalue;
		System.out.println("Selected Department key: " + typevalue);
		ResultSet datalist=objstatement.executeQuery(query_1);
		table.setModel(model);
		
		if (model.getColumnCount() == 0) {
		model.addColumn("Employeekey");	
	      model.addColumn("EmployeeName");
	     model.addColumn("Attendance Type");
		}
	    
		//model.setRowCount(0);
		while(datalist.next()) {
			
			model.addRow(new Object[]{
				//datalist.getInt("EmployeeId"),
					datalist.getInt("Employeekey"),
				datalist.getString("EmployeeName"),
				//datalist.getString("FatherName"),
				//datalist.getString("Gender"),
				//datalist.getInt("DepartmentKey"),
				//datalist.getString("Designation"),
				//datalist.getString("PhoneNumber"),
			//	datalist.getString("EmailId"),
				//datalist.getString("StatusOfEmployee"),
			//datalist.getInt("EmployeeKey");
				"Absent" //Default Status

			});
		}
						}
				catch(Exception ex) {
					System.out.println(ex.getMessage());
					ex.printStackTrace();
				}
				
				
				
				
			}
				
				
				
			
		});
		btnNewButton.setBounds(388, 144, 151, 27);
		getContentPane().add(btnNewButton);
		//--------------------------------------------------------------------------------
		//-----------------------------------------------------------present------------------------------------------
		
				JButton btnPresent = new JButton("Present");
				btnPresent.setForeground(new Color(0, 0, 0));
				btnPresent.setFont(new Font("Arial Black", Font.PLAIN, 13));
				btnPresent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						 int selectedRow = table.getSelectedRow();
				         if (selectedRow != -1) {
				             table.setValueAt("Present", selectedRow, 2);//--------------Row of table
				         }
					}
				});
				
				btnPresent.setBounds(546, 144, 89, 27);
				getContentPane().add(btnPresent);
				
				JButton btnAbsent = new JButton("Absent");
				btnAbsent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int selectedRow = table.getSelectedRow();
				         if (selectedRow != -1) {
				             table.setValueAt("Absent", selectedRow, 2);//--------------Row of table
				         }
					}
				});
				btnAbsent.setForeground(new Color(0, 0, 0));
				btnAbsent.setFont(new Font("Arial Black", Font.PLAIN, 13));
				btnAbsent.setBounds(636, 144, 89, 27);
				getContentPane().add(btnAbsent);
				//--------------------------------------------------------------------------------
				
	}
}