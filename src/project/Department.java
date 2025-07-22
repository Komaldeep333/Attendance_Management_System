package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Department extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JTable table;
    private JTextField name;
    private JTextField id;
    private JComboBox<String> combo;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                   // Department frame = new Department();
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
    public Department(Integer ID) {
        setBounds(0, 0, 1065, 549);
        getContentPane().setLayout(null);

        JPanel contentPane_3 = new JPanel();
        contentPane_3.setLayout(null);
        contentPane_3.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane_3.setBackground(new Color(128, 128, 128));
        contentPane_3.setBounds(467, 126, 585, 393);
        getContentPane().add(contentPane_3);

        table = new JTable();
        table.setBounds(255, 232, 1, 1);
        contentPane_3.add(table);

        JLabel lblNewLabel_1_1 = new JLabel("Department Name");
        lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel_1_1.setBounds(20, 131, 257, 29);
        contentPane_3.add(lblNewLabel_1_1);

        name = new JTextField();
        name.setColumns(10);
        name.setBounds(301, 52, 228, 29);
        contentPane_3.add(name);

        JLabel lblNewLabel_2 = new JLabel("Department Head");
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel_2.setBounds(20, 52, 257, 29);
        contentPane_3.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Department ID");
        lblNewLabel_3.setForeground(new Color(0, 0, 0));
        lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel_3.setBounds(20, 219, 202, 29);
        contentPane_3.add(lblNewLabel_3);

        id = new JTextField();
        id.setColumns(10);
        id.setBounds(296, 219, 233, 29);
        contentPane_3.add(id);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        JButton btnNewButton = new JButton("Done");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 
            	
                insertDepartmentRecord();
            }
            
        });
        btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
        btnNewButton.setBounds(22, 314, 109, 37);
        contentPane_3.add(btnNewButton);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        JButton btnNewButton_1 = new JButton("Cancel");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        	
        });
        btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
        btnNewButton_1.setBounds(386, 314, 137, 37);
        contentPane_3.add(btnNewButton_1);

        combo = new JComboBox<>();
        combo.setModel(new DefaultComboBoxModel(new String[] {"--select--", "Finance", "Human Resource", "Sales", "Marketing", "Production", "Technical", "Software Development", "Customer Service", "Design"}));
        combo.setBounds(301, 131, 228, 29);
        contentPane_3.add(combo);

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
                
                JPanel panel_1 = new JPanel();
                panel_1.setBackground(new Color(47, 79, 79));
                panel_1.setBounds(467, 0, 585, 127);
                getContentPane().add(panel_1);
                panel_1.setLayout(null);
                
                        JLabel lblDepatment = new JLabel("Department");
                        lblDepatment.setBounds(79, 31, 423, 72);
                        panel_1.add(lblDepatment);
                        lblDepatment.setForeground(new Color(250, 250, 210));
                        lblDepatment.setFont(new Font("Arial Black", Font.BOLD, 59));
    
    
    }

    private void insertDepartmentRecord() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/attendance management system", "root", "");
            Statement stmt = conn.createStatement();
            String value = combo.getSelectedItem().toString();
            String query = "INSERT INTO departments (DepartmentName, DepartmentHead, DepartmentId) VALUES ('" + value + "', '" + name.getText() + "', '" + id.getText() + "')";
            stmt.execute(query);
            JOptionPane.showMessageDialog(this, "Record Inserted");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
        }
}