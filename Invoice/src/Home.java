import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingConstants;


public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeCjewellers;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 Home frame = new Home();
					frame.setVisible(true);
					
				     
					  
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
	
		initComponents();
		 this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		 this.addWindowListener(new WindowAdapter() {
		      @Override
		      public void windowClosing(WindowEvent event) {
		        confirmAndExit();
		      }

			private void confirmAndExit() {
				 if (JOptionPane.showConfirmDialog(
					      null,
					      "Are you sure you want to quit?",
					      "Please confirm",
					      JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION
					    ) {
					      System.exit(0);
					    }
				
			}
		    });
		setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();

		GraphicsConfiguration gc = gd.getDefaultConfiguration();
		Rectangle bounds = gc.getBounds();
		
		JButton btnNewButton = new JButton("Bandhak");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Bandhak customer=new Bandhak();
				customer.setVisible(true);
				customer.setResizable(false);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.setBounds(559, 117, 317, 90);
		contentPane.add(btnNewButton);
		
		JButton btnTempBill = new JButton("Temp Bill");
		btnTempBill.setForeground(new Color(128, 0, 0));
		btnTempBill.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnTempBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Tempbill temp=new Tempbill();
				temp.setVisible(true);
				temp.setResizable(false);
			}
		});
		btnTempBill.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnTempBill.setBounds(559, 208, 317, 90);
		contentPane.add(btnTempBill);
		
		JButton btnOriginalBill = new JButton("Original Bill");
		btnOriginalBill.setForeground(new Color(0, 0, 0));
		btnOriginalBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Permanentbill pbill=new Permanentbill();
				pbill.setVisible(true);
				pbill.setResizable(false);
			}
		});
		btnOriginalBill.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnOriginalBill.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnOriginalBill.setBounds(559, 299, 317, 90);
		contentPane.add(btnOriginalBill);
		
		JButton btnExpense = new JButton("Expense");
		btnExpense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Expense eg=new Expense();
				eg.setVisible(true);
				eg.setResizable(false);
			}
		});
		btnExpense.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnExpense.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnExpense.setBounds(559, 390, 317, 90);
		contentPane.add(btnExpense);
		
		JButton btnReport = new JButton("Report");
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Report re=new Report();
				re.setVisible(true);
				re.setResizable(false);
			}
		});
		btnReport.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnReport.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnReport.setBounds(559, 481, 317, 90);
		contentPane.add(btnReport);
		
		JButton btnSettings = new JButton("Settings");
		btnSettings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Settings sett=new Settings();
				sett.setVisible(true);
				sett.setResizable(false);
			}
		});
		btnSettings.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSettings.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnSettings.setBounds(558, 573, 317, 90);
		contentPane.add(btnSettings);
		
		txtWelcomeCjewellers = new JTextField();
		txtWelcomeCjewellers.setForeground(new Color(153, 50, 204));
		txtWelcomeCjewellers.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtWelcomeCjewellers.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeCjewellers.setText("Welcome CJewellers !!");
		txtWelcomeCjewellers.setBorder(null);
		txtWelcomeCjewellers.setBounds(548, 33, 317, 42);
		contentPane.add(txtWelcomeCjewellers);
		txtWelcomeCjewellers.setColumns(10);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
