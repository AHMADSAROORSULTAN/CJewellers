import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;







import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.KeyAdapter;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JSeparator;


public class Login extends JFrame {

	private static final String WindowEvent = null;
	private JPanel contentPane;
	public static  JTextField validate_username;
	public static JPasswordField validate_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 Login frame = new Login();
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
	private static JTextField txtPleaseCheckYour_1;
	private static JTextField txtPleaseCheckYour;
	private JButton btnClickHere;
	public Login()  {
		
		
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(505, 245, 166, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD\r\n");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(505, 289, 144, 31);
		contentPane.add(lblPassword);
		
		validate_username = new JTextField();
		validate_username.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		validate_username.setBounds(663, 245, 233, 29);
		contentPane.add(validate_username);
		validate_username.setColumns(10);
		
		validate_password = new JPasswordField();
		validate_password.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		validate_password.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ev) {
				if(ev.getKeyCode()==KeyEvent.VK_ENTER){
					if(LoginDAO.loginDetails(validate_username.getText(),validate_password.getText())){
						
						JOptionPane.showMessageDialog(null,"login successful");
						dispose();
						Home second=new Home();
						second.setVisible(true);
						second.setResizable(false);
						
							
					}else{
						Login.validate_username.setText("");
						Login.validate_password.setText("");
					    Login.highlightText();
					}
					}
				
			}
	   });
		
		validate_password.setBounds(663, 296, 233, 29);
		contentPane.add(validate_password);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setForeground(new Color(148, 0, 211));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			if(LoginDAO.loginDetails(validate_username.getText(),validate_password.getText())){
				
				JOptionPane.showMessageDialog(null,"login successful");
				dispose();
				Home second=new Home();
				second.setVisible(true);
				
					
			}else{
				Login.validate_username.setText("");
				Login.validate_password.setText("");
			    Login.highlightText();
			}
			
			}
		});
		
	   btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
	   btnNewButton.setBounds(669, 354, 97, 25);
		contentPane.add(btnNewButton);
		
		txtPleaseCheckYour_1 = new JTextField();
		txtPleaseCheckYour_1.setEditable(false);
		txtPleaseCheckYour_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txtPleaseCheckYour_1.setForeground(new Color(255, 0, 0));
		txtPleaseCheckYour_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPleaseCheckYour_1.setText("please check your username");
		txtPleaseCheckYour_1.setBackground(new Color(255, 255, 255));
		txtPleaseCheckYour_1.setColumns(10);
		txtPleaseCheckYour_1.setBorder(null);
		txtPleaseCheckYour_1.setBounds(663, 278, 233, 16);
		txtPleaseCheckYour_1.setVisible(false);
		contentPane.add(txtPleaseCheckYour_1);
		
		txtPleaseCheckYour = new JTextField();
		txtPleaseCheckYour.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txtPleaseCheckYour.setForeground(new Color(255, 0, 0));
		txtPleaseCheckYour.setEditable(false);
		txtPleaseCheckYour.setBackground(new Color(255, 255, 255));
		txtPleaseCheckYour.setHorizontalAlignment(SwingConstants.CENTER);
		txtPleaseCheckYour.setText("Please check your Password!");
		txtPleaseCheckYour.setColumns(10);
		txtPleaseCheckYour.setBorder(null);
		txtPleaseCheckYour.setBounds(663, 326, 233, 16);
		txtPleaseCheckYour.setVisible(false);
		contentPane.add(txtPleaseCheckYour);
		
		btnClickHere = new JButton("Click Here !");
		btnClickHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Password pass=new Password();
				pass.setVisible(true);
			}
		});
		btnClickHere.setForeground(new Color(75, 0, 130));
		btnClickHere.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnClickHere.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnClickHere.setBackground(new Color(255, 255, 255));
		btnClickHere.setBounds(683, 501, 105, 25);
		contentPane.add(btnClickHere);
		
		JLabel lblNewLabel_1 = new JLabel("Forgot your Password ?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(661, 474, 159, 16);
		contentPane.add(lblNewLabel_1);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
	public static void highlightText(){
	txtPleaseCheckYour.setVisible(true);
       txtPleaseCheckYour_1.setVisible(true);
	}	
}
