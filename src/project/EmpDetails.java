package project;
import java.sql.*;
//import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
//import javax.swing.JPanel;
//import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

//import javax.swing.ListSelectionModel;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class EmpDetails extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					EmpDetails frame = new EmpDetails(desktoppane);
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
	public EmpDetails(JDesktopPane desktoppane) {
		getContentPane().setBackground(new Color(128, 128, 128));
		setBounds(0, 0, 1065, 549);
		setSize(1065,549);
		getContentPane().setLayout(null);
		
		// Initialize JTable and DefaultTableModel
//        model = new DefaultTableModel(new String[]{"EmployeeId", "EmployeeName", "FatherName", "Gender", "Designation", "PhoneNumber", "EmailId", "Status_of_employee"}, 0);
//        table = new JTable(model);
//        JScrollPane scrollPane = new JScrollPane(table);
		
		table = new JTable();
		table.setBounds(7, 106, 1034, 357);
		getContentPane().add(table);
		
		// Wrap the JTable in a JScrollPane
	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(7, 106, 1034, 357);
	    getContentPane().add(scrollPane);
	    
	    DefaultTableModel model = new DefaultTableModel();
	    table.setModel(model);
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnNewButton_6 = new JButton("Add");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee d=new Employee();
				desktoppane.add(d);
				d.setVisible(true);
				
			}
		});
		btnNewButton_6.setFont(new Font("Arial Black", Font.PLAIN, 25));
		btnNewButton_6.setBounds(305, 471, 136, 39);
		getContentPane().add(btnNewButton_6);
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnNewButton_3_2 = new JButton("Exit");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_3_2.setFont(new Font("Arial Black", Font.PLAIN, 25));
		btnNewButton_3_2.setBounds(840, 471, 136, 39);
		getContentPane().add(btnNewButton_3_2);
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
//		javax.swing.table.DefaultTableModel model=new javax.swing.table.DefaultTableModel();
//		table.setModel(model);
		// Initialize JTable and DefaultTableModel
//        model = new DefaultTableModel(new String[]{"ID", "Name", "Department ID", "Date","Status"}, 0);
//        table = new JTable(model);
//        JScrollPane scrollPane = new JScrollPane(table);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);
       
		
		search = new JTextField();
		search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				System.out.println("keypressed");
				
				  String text = search.getText();
				  
				  System.out.println(text);
                  if (text.trim().length() == 0) {
                 
                      sorter.setRowFilter(null);
                  }
                  else
                  {
                      sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                      System.out.println("else part");
                  }
                 
			
				
			}
		});
		search.setBounds(17, 470, 258, 39);
		getContentPane().add(search);
		search.setColumns(10);
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(47, 79, 79));
		panel.setBackground(new Color(47, 79, 79));
		panel.setBounds(10, 10, 1031, 86);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Employee Details");
		lblNewLabel.setBackground(new Color(255, 250, 205));
		lblNewLabel.setForeground(new Color(255, 250, 205));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 59));
		lblNewLabel.setBounds(237, 10, 784, 66);
		panel.add(lblNewLabel);
		loadData(model);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnNewButton_1_2 = new JButton("Update");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
				System.out.println(selectedRow);
				if (selectedRow != -1)
				{
				Integer id=(Integer)model.getValueAt(selectedRow, 0);
				System.out.println("Selected Employee ID: " + id);
				String name = (String) model.getValueAt(selectedRow, 1);
				String fname = (String) model.getValueAt(selectedRow,2);
				String gender = (String) model.getValueAt(selectedRow,3);
				String dept = (String) model.getValueAt(selectedRow,4);
				String eid = (String) model.getValueAt(selectedRow,5);
				String pnumber = (String) model.getValueAt(selectedRow,6);
				String design = (String) model.getValueAt(selectedRow,7);
//				String status = (String) model.getValueAt(selectedRow,8);
//				System.out.println("Selected Row Data:");
//				System.out.println("Head: " + head);
//				System.out.println("Name: "+ name);
//				//System.out.println("District: " + district);
				//System.out.println("Population: " + population);
//			    JOptionPane.showMessageDialog(null, "ID is "+ id);
			    Employee2 d=new Employee2(id);
				//Container desktoppane;
				desktoppane.add(d);
				d.setVisible(true);

				}
				else {
				System.out.println("No row selected");
				}

				
			}
		});
		btnNewButton_1_2.setFont(new Font("Arial Black", Font.PLAIN, 25));
		btnNewButton_1_2.setBounds(478, 471, 136, 39);
		getContentPane().add(btnNewButton_1_2);
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnNewButton_2_2 = new JButton("Delete");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection obj=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");
				    Statement object=(Statement)obj.createStatement();
				    int selectedRow= table.getSelectedRow();
				   // JTable model = null;
					Integer ID=(Integer)model.getValueAt(selectedRow,0);
					System.out.println(ID);
				    String query="delete from employees where EmployeeId='"+ID+"'";
				   
				    
				    System.out.println(query);
				    
				    int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE); 

					// Check the response 
					if (response == JOptionPane.OK_OPTION) 
					{ 
					 System.out.println("User clicked OK.");
					 object.execute(query);
					 JOptionPane.showMessageDialog(btnNewButton_2_2,"Record Deleted");
					 }
					 else if (response == JOptionPane.CANCEL_OPTION) 
					{ 
					 System.out.println("User clicked Cancel.");
					 }
					  else
					{
					 System.out.println("User closed the dialog."); 
					 }
				   
				}
				catch(Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		});
		btnNewButton_2_2.setFont(new Font("Arial Black", Font.PLAIN, 25));
		btnNewButton_2_2.setBounds(656, 471, 136, 39);
		getContentPane().add(btnNewButton_2_2);
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		public void loadData(DefaultTableModel model) {
			model.addColumn("EmployeeId");
			model.addColumn("EmployeeName");
			model.addColumn("FatherName");
			model.addColumn("Gender");
			model.addColumn("Department");
			model.addColumn("Designation");
			model.addColumn("PhoneNumber");
			model.addColumn("EmailId");
			model.addColumn("Status_of_employee");
			try
			{
				
//				model.addRow(new Object[]{"EmployeeId","EmployeeName","FatherName","Gender","DepartmentName","Designation","PhoneNumber","EmailId","Status_of_employee"} );
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection objconnection=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");
			Statement objstatement=(Statement)objconnection.createStatement();
			String query="Select EmployeeId,EmployeeName,FatherName,Gender,EmailId,PhoneNumber,Designation,DepartmentName,Status_of_employee from employees inner join departments on employees.DepartmentKey=departments.DepartmentKey";
			ResultSet datalist=objstatement.executeQuery(query);

			while(datalist.next())
			{
			model.addRow(new Object[]{datalist.getInt("EmployeeId"),datalist.getString("EmployeeName"),datalist.getString("FatherName"),datalist.getString("Gender"),datalist.getString("DepartmentName"),datalist.getString("Designation"),datalist.getString("PhoneNumber"),datalist.getString("EmailId"),datalist.getString("Status_of_employee")} );
			}
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());
			e.printStackTrace();
			}
			///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		}
}