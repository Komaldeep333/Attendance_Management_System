package project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Leave extends JInternalFrame {

    private static final long serialVersionUID = 1L;
    private JSpinner med;
    private JSpinner casual;
    private JSpinner paid;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Leave frame = new Leave();
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
    public Leave() {
        setBounds(0, 0, 1065, 549);
        getContentPane().setLayout(null);
        
        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(128, 128, 128));
        contentPane.setBounds(0, 0, 1052, 519);
        getContentPane().add(contentPane);
        
        JLabel lblNewLabel_1 = new JLabel("Medical Leaves");
        lblNewLabel_1.setForeground(new Color(245, 255, 250));
        lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel_1.setBounds(75, 171, 317, 57);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Casual Leaves");
        lblNewLabel_2.setForeground(new Color(245, 255, 250));
        lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel_2.setBounds(75, 257, 317, 57);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Paid Leaves");
        lblNewLabel_3.setForeground(new Color(245, 245, 245));
        lblNewLabel_3.setBackground(new Color(245, 255, 250));
        lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 25));
        lblNewLabel_3.setBounds(75, 347, 317, 57);
        contentPane.add(lblNewLabel_3);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(47, 79, 79));
        panel.setForeground(new Color(47, 79, 79));
        panel.setBounds(10, 10, 1031, 86);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Leave Policy");
        lblNewLabel.setForeground(new Color(255, 250, 205));
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 59));
        lblNewLabel.setBounds(304, 23, 571, 53);
        panel.add(lblNewLabel);
        
        med = new JSpinner();
        med.setBounds(385, 171, 341, 46);
        contentPane.add(med);
        
        casual = new JSpinner();
        casual.setBounds(385, 257, 341, 46);
        contentPane.add(casual);
        
        paid = new JSpinner();
        paid.setBounds(385, 347, 341, 46);
        contentPane.add(paid);
        
        
        
        try
        {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection objconnection=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");
            
            Statement objstatement= (Statement)objconnection.createStatement();
            String query="SELECT * from  leave_policy";
            
            ResultSet datalist=objstatement.executeQuery(query);  
            
            if(datalist.next()) {
          	  
          	 // ml.setText(datalist.getString("AnnualMedicalLeaves"));
          	  //cl.setText(datalist.getString("AnnualCasualLeaves"));
          	  //pl.setText(datalist.getString("AnnualPaidLeaves"));
          	// spinner.setText(datalist.getInt("AnnualMedicalLeaves"));
          	 int annualMedicalLeaves = datalist.getInt("AnnualMedicalLeaves");
            SpinnerNumberModel spinnerModel = new SpinnerNumberModel(annualMedicalLeaves, 0, 100, 1);
            med.setModel(spinnerModel);
            
            int annualcasualLeaves = datalist.getInt("AnnualCasualLeaves");
            SpinnerNumberModel spinnerModel_1 = new SpinnerNumberModel(annualcasualLeaves, 0, 100, 1);
            casual.setModel(spinnerModel_1);
            
            int annualpaidLeaves = datalist.getInt("AnnualPaidLeaves");
            SpinnerNumberModel spinnerModel_2 = new SpinnerNumberModel(annualpaidLeaves, 0, 100, 1);
            paid.setModel(spinnerModel_2);
        
        
        
        
          	  
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
        
        
        JButton btnNewButton = new JButton("Done");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 try
			      {
			          
			          Class.forName("com.mysql.cj.jdbc.Driver");
			          Connection objconnection=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");
			          
			          Statement objstatement= (Statement)objconnection.createStatement();
			          
			          
//			          String query="Update leave_policy set AnnualMedicalLeaves='"+spinner.getText()+"',AnnualCasualLeaves='"+spinner_1.getText()+"',AnnualPaidLeaves="+spinner_2.getText()+"";
//			          
//			          System.out.println(query);
//			          
//			          objstatement.execute(query);  
//			          System.out.println("Record updated");
			          int medicalLeaves = (int) med.getValue();
			            int casualLeaves = (int) casual.getValue();
			            int paidLeaves = (int) paid.getValue();

			            // Construct the update query
			            String query = "UPDATE leave_policy SET AnnualMedicalLeaves='" + medicalLeaves + "', AnnualCasualLeaves='" + casualLeaves + "', AnnualPaidLeaves='" + paidLeaves + "'";
			            System.out.println(query);

			            // Execute the update query
			            objstatement.executeUpdate(query);
			            JOptionPane.showMessageDialog(null, "Record Updated");
			        }
				 catch(Exception ex)
			      {
			           System.out.println(ex.getMessage());
			          ex.printStackTrace();
					 System.out.println("Not updated");
			      }

				
				
        	}
        });
        btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
        btnNewButton.setBounds(385, 431, 109, 37);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Cancel");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		 try
			     {
			         
			         Class.forName("com.mysql.cj.jdbc.Driver");
			         Connection objconnection=DriverManager.getConnection("jdbc:mysql://localhost/attendance management system","root","");
			         
			         Statement objstatement= (Statement)objconnection.createStatement();
			         String query="SELECT * from  leave_policy";
			         
			         ResultSet datalist=objstatement.executeQuery(query);  
			         
			         if(datalist.next()) {
			       	  
			       	 // ml.setText(datalist.getString("AnnualMedicalLeaves"));
			       	  //cl.setText(datalist.getString("AnnualCasualLeaves"));
			       	  //pl.setText(datalist.getString("AnnualPaidLeaves"));
			       	// spinner.setText(datalist.getInt("AnnualMedicalLeaves"));
			       	 int annualMedicalLeaves = datalist.getInt("AnnualMedicalLeaves");
			         SpinnerNumberModel spinnerModel = new SpinnerNumberModel(annualMedicalLeaves, 0, 100, 1);
			         med.setModel(spinnerModel);
			         
			         int annualcasualLeaves = datalist.getInt("AnnualCasualLeaves");
			         SpinnerNumberModel spinnerModel_1 = new SpinnerNumberModel(annualcasualLeaves, 0, 100, 1);
			         casual.setModel(spinnerModel_1);
			         
			         int annualpaidLeaves = datalist.getInt("AnnualPaidLeaves");
			         SpinnerNumberModel spinnerModel_2 = new SpinnerNumberModel(annualpaidLeaves, 0, 100, 1);
			         paid.setModel(spinnerModel_2);
			     
			     
			     
			     
			       	  
			         }
			         else
			         {
			       	  System.out.println("Record not exist");
			         }
			       }
				 catch(Exception ex)
			     {
			          System.out.println(ex.getMessage());
			         ex.printStackTrace();
			     }
        	}
        });
        btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
        btnNewButton_1.setBounds(587, 431, 137, 37);
        contentPane.add(btnNewButton_1);

        // Call method to fetch leave data
        
    }

}
