import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;








import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.border.EtchedBorder;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Settings extends JFrame {

	private JPanel contentPane;
	private JTextField user_na;
	private JPasswordField password;
	private JPasswordField password_update1;
	private JTextField service_tax;
	private JTextField swachh_bharat;
	private JTextField education_cess;
	private JTextField sales_tax;
	private JTextField vat;
	private JTextField custom_duty;
	private JTextField others;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 Settings frame = new Settings();
					 
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
	Connection connection=null;
	private JPasswordField password_update2;
	public Settings() {
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
		setBounds(100, 100, 1612, 1042);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(66, 36, 565, 562);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password Change");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 0, 613, 47);
		panel.add(lblNewLabel);
		
		JLabel label = new JLabel("USERNAME\r\n");
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		label.setBounds(28, 118, 166, 31);
		panel.add(label);
		
		JLabel label_1 = new JLabel("PASSWORD\r\n");
		label_1.setFont(new Font("Dialog", Font.BOLD, 20));
		label_1.setBounds(28, 198, 144, 31);
		panel.add(label_1);
		
		JLabel lblNewPassword = new JLabel("NEW PASSWORD\r\n");
		lblNewPassword.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewPassword.setBounds(28, 278, 182, 31);
		panel.add(lblNewPassword);
		
		user_na = new JTextField();
		user_na.setHorizontalAlignment(SwingConstants.CENTER);
		user_na.setFont(new Font("Tahoma", Font.PLAIN, 20));
		user_na.setColumns(10);
		user_na.setBounds(269, 113, 281, 42);
		panel.add(user_na);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password.setHorizontalAlignment(SwingConstants.CENTER);
		password.setBounds(269, 193, 281, 42);
		panel.add(password);
		
		password_update1 = new JPasswordField();
		password_update1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password_update1.setHorizontalAlignment(SwingConstants.CENTER);
		password_update1.setBounds(269, 273, 281, 42);
		panel.add(password_update1);
		
		JButton btnNewButton = new JButton("UPDATE");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				SettingsDAO.passwordSetup(user_na, password, password_update1, password_update2);
                
			}	                     
			
		});
		
					
	    btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(234, 459, 166, 54);
		panel.add(btnNewButton);
		
		JLabel lblConfirmPassword = new JLabel("CONFIRM PASSWORD\r\n");
		lblConfirmPassword.setFont(new Font("Dialog", Font.BOLD, 20));
		lblConfirmPassword.setBounds(28, 366, 226, 31);
		panel.add(lblConfirmPassword);
		
		password_update2 = new JPasswordField();
		password_update2.setHorizontalAlignment(SwingConstants.CENTER);
		password_update2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password_update2.setBounds(269, 361, 281, 42);
		panel.add(password_update2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1.setBounds(713, 36, 565, 562);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTaxConfiguration = new JLabel("Tax Configuration");
		lblTaxConfiguration.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaxConfiguration.setForeground(Color.BLUE);
		lblTaxConfiguration.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTaxConfiguration.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTaxConfiguration.setBounds(0, 0, 565, 46);
		panel_1.add(lblTaxConfiguration);
		
		JLabel lblServiceTax = new JLabel("SERVICE TAX\r\n");
		lblServiceTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblServiceTax.setBounds(25, 71, 166, 31);
		panel_1.add(lblServiceTax);
		
		JLabel lblSwachhBharatCess = new JLabel("SWACHH BHARAT CESS");
		lblSwachhBharatCess.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSwachhBharatCess.setBounds(25, 125, 247, 31);
		panel_1.add(lblSwachhBharatCess);
		
		JLabel lblEducationCess = new JLabel("EDUCATION CESS");
		lblEducationCess.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEducationCess.setBounds(25, 181, 247, 31);
		panel_1.add(lblEducationCess);
		
		JLabel lblSalesTax = new JLabel("SALES TAX");
		lblSalesTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSalesTax.setBounds(25, 240, 166, 31);
		panel_1.add(lblSalesTax);
		
		JLabel lblVat = new JLabel("GST");
		lblVat.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblVat.setBounds(25, 298, 166, 31);
		panel_1.add(lblVat);
		
		JLabel lblCustomDutyTax = new JLabel("CUSTOM DUTY TAX");
		lblCustomDutyTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCustomDutyTax.setBounds(25, 349, 221, 31);
		panel_1.add(lblCustomDutyTax);
		
		JLabel lblOthers = new JLabel("OTHERS");
		lblOthers.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOthers.setBounds(25, 398, 166, 31);
		panel_1.add(lblOthers);
		
		

		
		JButton button = new JButton("UPDATE");
		button.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(service_tax.getText().length()==0
				    ||swachh_bharat.getText().length()==0
					||education_cess.getText().length()==0
					||sales_tax.getText().length()==0
					||vat.getText().length()==0
					||custom_duty.getText().length()==0
					||others.getText().length()==0)
				{
					JOptionPane.showMessageDialog(null, "please fill all the fields");
				}   	
				else{
				SettingsDAO.taxSetup(service_tax, swachh_bharat, education_cess, sales_tax, vat, custom_duty, others);
				}  
			}    
		});
	
			
		button.setForeground(new Color(0, 128, 0));
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(219, 465, 186, 54);
		panel_1.add(button);
		
		service_tax = new JTextField();
		service_tax.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (service_tax.getText().length()>=4 ) 
					 e.consume(); 
				InvoiceDAO.numberdecimal(e);
			}
		});
		service_tax.setHorizontalAlignment(SwingConstants.CENTER);
		service_tax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		service_tax.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		service_tax.setColumns(10);
		service_tax.setBounds(356, 71, 106, 31);
		panel_1.add(service_tax);
		
		swachh_bharat = new JTextField();
		swachh_bharat.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (swachh_bharat.getText().length()>=4 ) 
					 e.consume(); 
				InvoiceDAO.numberdecimal(e);
			}
		});
		swachh_bharat.setHorizontalAlignment(SwingConstants.CENTER);
		swachh_bharat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		swachh_bharat.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		swachh_bharat.setColumns(10);
		swachh_bharat.setBounds(356, 125, 106, 31);
		panel_1.add(swachh_bharat);
		
		education_cess = new JTextField();
		education_cess.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (education_cess.getText().length()>=4 ) 
					 e.consume(); 
				InvoiceDAO.numberdecimal(e);
			}
		});
		education_cess.setHorizontalAlignment(SwingConstants.CENTER);
		education_cess.setFont(new Font("Tahoma", Font.PLAIN, 20));
		education_cess.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		education_cess.setColumns(10);
		education_cess.setBounds(356, 183, 106, 31);
		panel_1.add(education_cess);
		
		sales_tax = new JTextField();
		sales_tax.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (sales_tax.getText().length()>=4 ) 
					 e.consume(); 
				InvoiceDAO.numberdecimal(e);
			}
		});
		sales_tax.setHorizontalAlignment(SwingConstants.CENTER);
		sales_tax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sales_tax.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		sales_tax.setColumns(10);
		sales_tax.setBounds(356, 240, 106, 31);
		panel_1.add(sales_tax);
		
		vat = new JTextField();
		vat.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (vat.getText().length()>=4 ) 
					 e.consume(); 
				InvoiceDAO.numberdecimal(e);
				
			}
		});
		vat.setHorizontalAlignment(SwingConstants.CENTER);
		vat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		vat.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		vat.setColumns(10);
		vat.setBounds(356, 302, 106, 31);
		panel_1.add(vat);
		
		custom_duty = new JTextField();
		custom_duty.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (custom_duty.getText().length()>=4 ) 
					 e.consume(); 
				InvoiceDAO.numberdecimal(e);
			}
		});
		custom_duty.setHorizontalAlignment(SwingConstants.CENTER);
		custom_duty.setFont(new Font("Tahoma", Font.PLAIN, 20));
		custom_duty.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		custom_duty.setColumns(10);
		custom_duty.setBounds(356, 358, 106, 31);
		panel_1.add(custom_duty);
		
		others = new JTextField();
		others.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (others.getText().length()>=4 ) 
					 e.consume(); 
				InvoiceDAO.numberdecimal(e);
			}
		});
		others.setHorizontalAlignment(SwingConstants.CENTER);
		others.setFont(new Font("Tahoma", Font.PLAIN, 20));
		others.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		others.setColumns(10);
		others.setBounds(356, 407, 106, 31);
		panel_1.add(others);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBackground(new Color(0, 206, 209));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Home second=new Home();
				second.setVisible(true);
				second.setResizable(false);
			}
		});
		btnNewButton_1.setBounds(604, 631, 165, 60);
		contentPane.add(btnNewButton_1);
		SettingsDAO.taxData(service_tax, swachh_bharat, education_cess, sales_tax, vat, custom_duty, others);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
	
	
	  
		   
		       
	
}
