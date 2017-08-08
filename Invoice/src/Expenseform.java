import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JDateChooser;

import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;


public class Expenseform extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> expense_type;
	private JTextField expense_amount_field;
	private JComboBox<String>month_field;
	private JTextField comment_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Expenseform frame = new Expenseform();
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
	public Expenseform() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 561, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Expense Type");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(71, 80, 131, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAmount.setBounds(66, 144, 106, 30);
		contentPane.add(lblAmount);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setBounds(38, 220, 131, 30);
		contentPane.add(lblDate);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMonth.setBounds(71, 282, 84, 30);
		contentPane.add(lblMonth);
		
		JLabel lblComment = new JLabel("Comment");
		lblComment.setHorizontalAlignment(SwingConstants.CENTER);
		lblComment.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblComment.setBounds(56, 353, 131, 30);
		contentPane.add(lblComment);
		
		expense_type = new JComboBox<String>();
		expense_type.addItem("Home Expense");
		expense_type.addItem("Education");
		expense_type.addItem("Land Property");
		expense_type.addItem("Other Expense");
		expense_type.setBounds(243, 80, 179, 30);
		contentPane.add(expense_type);
		
		expense_amount_field = new JTextField();
		expense_amount_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (expense_amount_field.getText().length()>=9  ) 
					 e.consume(); 
				 InvoiceDAO.onlyNumber(e);
			}
		});
		expense_amount_field.setHorizontalAlignment(SwingConstants.CENTER);
		expense_amount_field.setBorder(new LineBorder(Color.BLACK, 1, true));
		expense_amount_field.setBounds(243, 138, 179, 36);
		contentPane.add(expense_amount_field);
		expense_amount_field.setColumns(10);
		
		comment_field = new JTextField();
		comment_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (comment_field.getText().length() >= 60 ) 
			            e.consume(); 
			}
		});
		comment_field.setHorizontalAlignment(SwingConstants.CENTER);
		comment_field.setBorder(new LineBorder(Color.BLACK, 1, true));
		comment_field.setColumns(10);
		comment_field.setBounds(243, 351, 283, 36);
		contentPane.add(comment_field);
		
		
		final JDateChooser date_field = new JDateChooser();
		date_field.setDateFormatString("yyyy-MM-dd");
		Date date=new Date();
		date_field.setDate(date);
		date_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		date_field.setBounds(243, 220, 179, 36);
		contentPane.add(date_field);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			//	Expense Ef=new Expense();
			//	Ef.setVisible(true);
			}
		});
		btnBack.setBackground(Color.WHITE);
		btnBack.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnBack.setBounds(154, 443, 97, 25);
		contentPane.add(btnBack);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection connection= null;
				PreparedStatement statement=null;
				ResultSet set1=null;
				if(expense_amount_field.getText().length()==0)
				{
			    	JOptionPane.showMessageDialog(null,"Amount cannot be empty");
			    }
				else{
				try{
					connection=ConnectionUtility.getConnection();
					String expensedetails = "insert into cjwellers.expense(typeofexpense,amount,date,month,comment)"
				      		+ " values(?,?,?,?,?) ";
					statement=connection.prepareStatement(expensedetails);
					String expenseType=expense_type.getSelectedItem().toString();
					String monthType= month_field.getSelectedItem().toString();
					statement.setString(1,expenseType);
					statement.setString(2,expense_amount_field.getText());
					statement.setString(3,((JTextField)date_field.getDateEditor().getUiComponent()).getText());
					statement.setString(4,monthType);
					statement.setString(5,comment_field.getText());
					
					statement.execute();
					JOptionPane.showMessageDialog(null, "Saved");
					
				    expense_amount_field.setText("");
				    comment_field.setText("");
				    
				}
				
				catch (SQLException e) {
			  		// TODO Auto-generated catch block 
			  		e.printStackTrace();
			  	}
				finally {
			  		ConnectionUtility.closeConnection(connection, statement, set1);
			  	}
				}
			}
		});
		btnSave.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnSave.setBackground(Color.WHITE);
		btnSave.setBounds(376, 443, 97, 25);
		contentPane.add(btnSave);
		
		 month_field = new JComboBox<String>();
		 month_field.addItem("JAN");
		 month_field.addItem("FEB");
		 month_field.addItem("MARCH");
		 month_field.addItem("APRIL");
		 month_field.addItem("MAY");
		 month_field.addItem("JUNE");
		 month_field.addItem("JULY");
		 month_field.addItem("AUG");
		 month_field.addItem("SEP");
		 month_field.addItem("OCT");
		 month_field.addItem("NOV");
		 month_field.addItem("DEC");
		 
		month_field.setBounds(243, 287, 106, 30);
		contentPane.add(month_field);
	}
}
