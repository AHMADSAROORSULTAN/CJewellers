import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Password extends JFrame {

	private JPanel contentPane;
	private JTextField validate_username;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Password frame = new Password();
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
	java.sql.Connection connection=null;
	private JTextField pass_field;
	public Password() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 300, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setBounds(33, 89, 97, 16);
		contentPane.add(lblNewLabel);
		
		validate_username = new JTextField();
		validate_username.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ev) {
				if(ev.getKeyCode()==KeyEvent.VK_ENTER){
					LoginDAO.fetchPassword(validate_username.getText(), pass_field);
				}}
			
		});
		validate_username.setBounds(142, 86, 155, 22);
		contentPane.add(validate_username);
		validate_username.setColumns(10);
		
		JButton btnNewButton = new JButton("Get Your Password");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginDAO.fetchPassword(validate_username.getText(), pass_field);
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(144, 133, 153, 25);
		contentPane.add(btnNewButton);
		
		pass_field = new JTextField();
		pass_field.setEditable(false);
		pass_field.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		pass_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		pass_field.setHorizontalAlignment(SwingConstants.CENTER);
		pass_field.setForeground(new Color(153, 50, 204));
		pass_field.setBounds(144, 170, 153, 22);
		contentPane.add(pass_field);
		pass_field.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Login lg=new Login();
				lg.setVisible(true);
				lg.setResizable(false);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(184, 215, 80, 25);
		contentPane.add(btnNewButton_1);
	}
	
}
