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
import javax.swing.JScrollPane;

//import javax.swing.ListSelectionModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
//import java.awt.BorderLayout;
public class deprtDetails extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	protected static final Component Update = null;
	private JTable table;
	private JTable table_1;
	private JTextField search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					deprtDetails frame = new deprtDetails(desktopPane);
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
	public deprtDetails(JDesktopPane desktoppane,Integer ID) {
		getContentPane().setBackground(new Color(128, 128, 128));
		setBounds(0, 0, 1065, 549);
		getContentPane().setLayout(null);
		
		table = new JTable();
		table.setBounds(448, 160, 0, 176);
		getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(10, 116, 1034, 340);
		getContentPane().add(table_1);
		
		  // Wrap the table inside a JScrollPane to ensure the headers are displayed
	    JScrollPane scrollPane = new JScrollPane(table_1);
	    scrollPane.setBounds(10, 116, 1034, 340); // Set bounds for scrollPane
	    getContentPane().add(scrollPane);
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JButton btnNewButton_6 = new JButton("Add");
		//JDesktopPane desktoppane = null;
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Department d=new Department(0);
				desktoppane.add(d);
				d.setVisible(true);
				
			}
		});
		btnNewButton_6.setFont(new Font("Arial Black", Font.PLAIN, 25));
		btnNewButton_6.setBounds(304, 466, 136, 39);
		getContentPane().add(btnNewButton_6);
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
	    //////////////////////////////////////////////////////////////////////////////////sorter
		//////////////////////////////////////////////////////////////////////////////////
		JButton btnNewButton_3_2 = new JButton("Exit");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_3_2.setFont(new Font("Arial Black", Font.PLAIN, 25));
		btnNewButton_3_2.setBounds(861, 466, 136, 39);
		getContentPane().add(btnNewButton_3_2);
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
        javax.swing.table.DefaultTableModel model=new javax.swing.table.DefaultTableModel();
        table_1.setModel(model);
        
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table_1.setRowSorter(sorter);
       
		
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
		search.setBounds(10, 466, 258, 39);
		getContentPane().add(search);
		search.setColumns(10);
        
        JPanel panel = new JPanel();
        panel.setForeground(new Color(47, 79, 79));
        panel.setBackground(new Color(47, 79, 79));
        panel.setBounds(10, 10, 1034, 96);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Department Details");
        lblNewLabel.setForeground(new Color(255, 250, 205));
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 59));
        lblNewLabel.setBounds(212, 5, 812, 91);
        panel.add(lblNewLabel);
		 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  		JButton btnNewButton_1_2 = new JButton("Update");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int selectedRow = table_1.getSelectedRow();
				System.out.println(selectedRow);
				if (selectedRow != -1)
				{
				
				String head = (String) model.getValueAt(selectedRow, 0);
				String name = (String) model.getValueAt(selectedRow,1);
				Integer ID=(Integer)model.getValueAt(selectedRow, 2);
				System.out.println("Selected Row Data:");
				System.out.println("Head: " + head);
				System.out.println("Name: "+ name);
				//System.out.println("District: " + district);
				//System.out.println("Population: " + population);
			JOptionPane.showMessageDialog(Update, "ID is "+ ID);
				Department2 cfm=new Department2(ID);
				//Container desktoppane;
				desktoppane.add(cfm);
				cfm.setVisible(true);

				}
				else {
				System.out.println("No row selected");
				}
				
			}
		});
		btnNewButton_1_2.setFont(new Font("Arial Black", Font.PLAIN, 25));
		btnNewButton_1_2.setBounds(497, 466, 136, 39);
		getContentPane().add(btnNewButton_1_2);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JButton btnNewButton_2_2 = new JButton("Delete");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection obj=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");
				    Statement object=(Statement)obj.createStatement();
				    int selectedRow= table_1.getSelectedRow();
				   // JTable model = null;
					Integer ID=(Integer)model.getValueAt(selectedRow,2);
					System.out.println(ID);
				    String query="delete from departments where DepartmentId='"+ID+"'";
				   
				    
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
		btnNewButton_2_2.setBounds(680, 466, 136, 39);
		getContentPane().add(btnNewButton_2_2);
		loadData(model);
	}
	 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		public void loadData(DefaultTableModel model) {
			model.addColumn("DepartmentName");
			model.addColumn("DepartmentHead");
			model.addColumn("DepartmentId");
			
			try
			{
//				model.addRow(new Object[]{"DepartmentName","DepartmentHead","DepartmentId"} );
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection objconnection=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");
			Statement objstatement=(Statement)objconnection.createStatement();
			String query="SELECT * from departments";
			ResultSet datalist=objstatement.executeQuery(query);

			while(datalist.next())
			{
			model.addRow(new Object[]{datalist.getString("DepartmentName"),datalist.getString("DepartmentHead"),datalist.getInt("DepartmentId")} );
			}
			
			
			}
			catch(Exception e)
			{
			System.out.println(e.getMessage());
			e.printStackTrace();
			}	
			 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	}
}

