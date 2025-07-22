package project;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class report extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    report frame = new report();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public report() {
        getContentPane().setBackground(new Color(128, 128, 128));
        setBounds(0, 0, 1065, 549);
        getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(47, 79, 79));
        panel.setBounds(10, 10, 1031, 86);
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("REPORT");
        lblNewLabel.setBounds(364, 0, 391, 90);
        lblNewLabel.setForeground(new Color(255, 250, 205));
        panel.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 59));
        
        
        // Creating a scroll pane to contain the table
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 152, 1029, 335);
        getContentPane().add(scrollPane);
        
        
        
        table = new JTable();
        table.setBackground(new Color(255, 255, 255));
        table.setBounds(10, 152, 1029, 335);
        getContentPane().add(table);
        scrollPane.setViewportView(table);
        
        
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel();
        table.setModel(model);

        // Adding columns once outside the try block
       
        model.addColumn("EmployeeId");					     
        model.addColumn("EmployeeName");
        model.addColumn("AttendanceType");
        
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(10, 112, 175, 30);
        getContentPane().add(dateChooser);
        dateChooser.setDate(new Date());

        JButton btnNewButton = new JButton("Search");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
//                	model.addRow(new Object[]{"EmployeeId","EmployeeName","AttendanceType"} );
                    model.setRowCount(0);  // Clear existing rows
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection objconnection = DriverManager.getConnection("jdbc:mysql://localhost/attendance management system", "root", "");
                    Statement objstatement = objconnection.createStatement();
                    SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd");
                    String formatteddate = outputFormat.format(dateChooser.getDate());
                    String query = "SELECT EmployeeId, EmployeeName, AttendanceType " +
                                   "FROM employees " +
                                   "INNER JOIN attendances ON employees.Employeekey = attendances.Employeekey " +
                                   "WHERE Attendance_Date = '" + formatteddate + "'";
                    System.out.println(query);
                    ResultSet datalist = objstatement.executeQuery(query);  
                    while (datalist.next()) {
                        model.addRow(new Object[] {
                           
                            datalist.getString("EmployeeId"),
                            datalist.getString("EmployeeName"),
                            datalist.getString("AttendanceType")
                        });
                    }
                    objconnection.close();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
        btnNewButton.setBounds(908, 112, 131, 30);
        getContentPane().add(btnNewButton);
    }
}
