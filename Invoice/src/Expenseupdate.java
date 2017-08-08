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
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;


public class Expenseupdate extends JFrame {

	private JPanel contentPane;
	public static JComboBox<String> expense_type;
	public static JTextField update_amount_field;
	public static  JComboBox<String>month_field;
	public static JTextField update_comment_field;
	public static JTextField idexpense_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Expenseupdate frame = new Expenseupdate();
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
	public Expenseupdate() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 563, 522);
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
		expense_type.setBounds(243, 80, 179, 30);
		
		contentPane.add(expense_type);
		
		update_amount_field = new JTextField();
		update_amount_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (update_amount_field.getText().length()>=9  ) 
					 e.consume(); 
				 InvoiceDAO.onlyNumber(e);
			}
		});
		update_amount_field.setHorizontalAlignment(SwingConstants.CENTER);
		update_amount_field.setBorder(new LineBorder(Color.BLACK, 1, true));
		update_amount_field.setBounds(243, 138, 179, 36);
		contentPane.add(update_amount_field);
		update_amount_field.setColumns(10);
		
		update_comment_field = new JTextField();
		update_comment_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if (update_comment_field.getText().length() >= 60 ) 
			            e.consume(); 
			}
		});
		update_comment_field.setHorizontalAlignment(SwingConstants.CENTER);
		update_comment_field.setBorder(new LineBorder(Color.BLACK, 1, true));
		update_comment_field.setColumns(10);
		update_comment_field.setBounds(243, 351, 290, 36);
		contentPane.add(update_comment_field);
		
		
	    final JDateChooser date_field = new JDateChooser();
		date_field.setDateFormatString("yyyy-MM-dd");
		Date date=new Date();
		date_field.setDate(date);
		date_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		date_field.setBounds(243, 220, 179, 36);
		date_field.setDate(Calendar.getInstance().getTime());
		contentPane.add(date_field);
		
		JButton btnBack = new JButton("Delete");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
					Connection connection=null;
					PreparedStatement statement=null;
					ResultSet set=null;
					
					try{
						connection=ConnectionUtility.getConnection();
						String delete ="delete from cjwellers.expense WHERE idexpense=? ";
						statement=connection.prepareStatement(delete);
						statement.setString(1, idexpense_field.getText());
						statement.executeUpdate();
						JOptionPane.showMessageDialog(null, "deleted");
			}
					catch(Exception e){
						JOptionPane.showMessageDialog(null,e);
					  }
					finally{
						ConnectionUtility.closeConnection(connection, statement, set);
					}
			}
		});
		btnBack.setBackground(Color.WHITE);
		btnBack.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnBack.setBounds(154, 443, 97, 25);
		contentPane.add(btnBack);
		
		JButton btnSave = new JButton("Update");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Connection con=null;
				PreparedStatement st=null;
				ResultSet rs=null;
				
				String value1=idexpense_field.getText();
				String value2=expense_type.getSelectedItem().toString();
				String value3=update_amount_field.getText();
		        String value4=((JTextField)date_field.getDateEditor().getUiComponent()).getText();
		        String value5=month_field.getSelectedItem().toString();
		        String value6=update_comment_field.getText();
		     
				
				try{
					con=ConnectionUtility.getConnection();
					 String expenseUpdate=  "update cjwellers.expense set typeofexpense='"+value2+"',"
		        		        + "amount='"+value3+"',"
		        				+ "date='"+value4+"',month='"+value5+"',"
		        		        + "comment='"+value6+"'"
		        		        		+ "where idexpense='"+value1+"'";
		        st = con.prepareStatement(expenseUpdate);
		        st.executeUpdate(expenseUpdate);
		          JOptionPane.showMessageDialog(null,"Updated Successfully !!");
		}
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				  }
				finally{
					ConnectionUtility.closeConnection(con, st, rs);
				}
				dispose();
			
			}
		});
		btnSave.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnSave.setBackground(Color.WHITE);
		btnSave.setBounds(376, 443, 97, 25);
		contentPane.add(btnSave);
		
		 month_field = new JComboBox<String>();
		/* month_field.addItem("JAN");
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
		 month_field.addItem("DEC");*/
		 
		month_field.setBounds(243, 287, 106, 30);
		contentPane.add(month_field);
		
		idexpense_field = new JTextField();
		idexpense_field.setBorder(null);
		idexpense_field.setVisible(false);
		idexpense_field.setBounds(439, 24, 72, 22);
		contentPane.add(idexpense_field);
		idexpense_field.setColumns(10);
	}
}
