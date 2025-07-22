package project;

import java.awt.EventQueue;
import java.awt.Image;
//import java.awt.image.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;

public class mdiProgramming extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mdiProgramming frame = new mdiProgramming();
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
	public mdiProgramming() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(0, 0, 1079, 666);
//		setSize(1068,585);	
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageDesktopPane desktopPane =  new ImageDesktopPane("img/attendance_management-copy.png");
		desktopPane.setBounds(0, 80, 1065, 549);
		contentPane.add(desktopPane);
		
//		JLabel lblNewLabel = new JLabel("");
//		Image img= new ImageIcon(this.getClass().getResource("/AMS2/img/Online-Attendance-Management-System-scaled.jpg")).getImage();
//		lblNewLabel.setIcon(new ImageIcon(img));
//		lblNewLabel.setBounds(0, 0, 1065, 597);
//		desktopPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(20, 0, 1000, 22);
		contentPane.add(menuBar);
		
		 menuBar.add(Box.createHorizontalGlue());
		
		JMenu mnNewMenu = new JMenu("menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Profile");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				profile dt=new profile();
				desktopPane.add(dt);
				dt.setVisible(true);
			
			}
			
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Logout");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LogIn loginPage = new LogIn(); // Assuming your login page class is named LoginPage
				loginPage.setVisible(true);
			}
		});
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				about dt=new about();
				desktopPane.add(dt);
				dt.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JButton btnNewButton = new JButton("Employee");
		btnNewButton.setForeground(new Color(245, 255, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EmpDetails d=new EmpDetails(desktopPane);
				desktopPane.add(d);
				d.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(47, 79, 79));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(151, 32, 120, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Department");
		btnNewButton_1.setForeground(new Color(255, 250, 205));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deprtDetails dt=new deprtDetails(desktopPane,0);
				desktopPane.add(dt);
				dt.setVisible(true);
				
			}
		});
		btnNewButton_1.setBackground(new Color(47, 79, 79));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(20, 32, 120, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Leave");
		btnNewButton_2.setForeground(new Color(255, 250, 205));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Leave dt=new Leave();
				desktopPane.add(dt);
				dt.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(new Color(47, 79, 79));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setBounds(411, 32, 120, 38);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Report");
		btnNewButton_3.setForeground(new Color(255, 250, 205));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				report dt=new report();
				desktopPane.add(dt);
				dt.setVisible(true);
			}
		});
		btnNewButton_3.setBackground(new Color(47, 79, 79));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setBounds(541, 32, 120, 38);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Attendance");
		btnNewButton_4.setForeground(new Color(255, 250, 205));
		btnNewButton_4.setBackground(new Color(47, 79, 79));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				attendance dt=new attendance();
				desktopPane.add(dt);
				dt.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(281, 32, 120, 38);
		contentPane.add(btnNewButton_4);
	}
//	// Custom JDesktopPane class to draw a background image
    class ImageDesktopPane extends JDesktopPane
    {
        private Image image;

        public ImageDesktopPane(String imagePath)
        {
            try
            {
                this.image = ImageIO.read(new File(imagePath));
               
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            if (image != null)
            {
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        } 
    }
}