import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextArea;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;


public class Newcustomer extends JFrame {

	private JPanel contentPane;
	private JTextField mobile_field;
	private JTextField customer_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Newcustomer frame = new Newcustomer();
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
	private JTextField address_field;
	private JTextField bill_amount;
	private JTextField received_amount;
	private JTextField due_amount;
	private JTextField items_field;
	private JTextField remarks_field;
	public Newcustomer() {
		
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
		setBounds(100, 100, 1364, 832);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.setBounds(288, 11, 789, 694);
		panel.setBorder(new TitledBorder(null, "New Customer", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblCustomerName = new JLabel("CUSTOMER NAME\r\n");
		lblCustomerName.setBorder(null);
		lblCustomerName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCustomerName.setBounds(38, 45, 216, 42);
		panel.add(lblCustomerName);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO.");
		lblMobileNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMobileNo.setBounds(38, 158, 198, 31);
		panel.add(lblMobileNo);
		
		JLabel lblAddress = new JLabel("ADDRESS");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddress.setBounds(38, 101, 198, 31);
		panel.add(lblAddress);
		
		mobile_field = new JTextField();
		mobile_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		mobile_field.setHorizontalAlignment(SwingConstants.CENTER);
		mobile_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (mobile_field.getText().length()>=10  ) 
					 e.consume(); 
		       InvoiceDAO.onlyNumber(e);
			}
		});
		
			
		mobile_field.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		mobile_field.setBounds(369, 158, 389, 31);
		panel.add(mobile_field);
		mobile_field.setColumns(10);
		
		customer_field = new JTextField();
		customer_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		customer_field.setHorizontalAlignment(SwingConstants.CENTER);
		customer_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				InvoiceDAO.charUperCase(e);
				   if (customer_field.getText().length() >= 30 ) 
			            e.consume(); 
					InvoiceDAO.noNumber(e);
			}
		});
		
		customer_field.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		customer_field.setColumns(10);
		customer_field.setBounds(369, 46, 389, 31);
		panel.add(customer_field);
		
		address_field = new JTextField();
		address_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		address_field.setHorizontalAlignment(SwingConstants.CENTER);
		address_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				InvoiceDAO.charUperCase(e);
				 if (address_field.getText().length() >= 40 ) 
			            e.consume(); 
			}
		});
		
		
		address_field.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		address_field.setBounds(369, 101, 389, 31);
		panel.add(address_field);
		address_field.setColumns(10);
		
		JButton button = new JButton("BACK");
		button.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		button.setFont(new Font("Tahoma", Font.BOLD, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Bandhak h=new Bandhak();
				h.setVisible(true);
				h.setResizable(false);
			}
		});
		button.setBounds(135, 635, 234, 48);
		panel.add(button);
		
	
		
		JLabel lblTotalBillAmount = new JLabel("TOTAL BILL AMOUNT");
		lblTotalBillAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotalBillAmount.setBounds(38, 284, 278, 31);
		panel.add(lblTotalBillAmount);
		
		JLabel lblTotalAmountReceived = new JLabel("TOTAL AMOUNT RECEIVED");
		lblTotalAmountReceived.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotalAmountReceived.setBounds(38, 346, 278, 31);
		panel.add(lblTotalAmountReceived);
		
		JLabel lblTotalDueAmount = new JLabel("TOTAL DUE AMOUNT");
		lblTotalDueAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotalDueAmount.setBounds(38, 409, 216, 31);
		panel.add(lblTotalDueAmount);
		
		JLabel lblRemarks = new JLabel("DATE RECEIVED\r\n");
		lblRemarks.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRemarks.setBounds(38, 471, 166, 31);
		panel.add(lblRemarks);
		
		bill_amount = new JTextField();
		bill_amount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bill_amount.setHorizontalAlignment(SwingConstants.CENTER);
		bill_amount.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (bill_amount.getText().length()>=10  ) 
					 e.consume(); 
		       InvoiceDAO.onlyNumber(e);
			}
		});
		
		bill_amount.setColumns(10);
		bill_amount.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		bill_amount.setBounds(369, 284, 389, 31);
		panel.add(bill_amount);
		
		received_amount = new JTextField();
		received_amount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		received_amount.setHorizontalAlignment(SwingConstants.CENTER);
		received_amount.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				if (received_amount.getText().length()>=10  ) 
					 e.consume(); 
		       InvoiceDAO.onlyNumber(e);
			}
		});
		received_amount.setColumns(10);
		received_amount.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		received_amount.setBounds(369, 346, 389, 31);
		panel.add(received_amount);
		
		due_amount = new JTextField();
		due_amount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		due_amount.setHorizontalAlignment(SwingConstants.CENTER);
		due_amount.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (due_amount.getText().length()>=10  ) 
					 e.consume(); 
		       InvoiceDAO.onlyNumber(e);
			}
		});
		
		due_amount.setColumns(10);
		due_amount.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		due_amount.setBounds(369, 409, 389, 31);
		panel.add(due_amount);
		
		JLabel lblDueDate = new JLabel("DUE DATE");
		lblDueDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDueDate.setBounds(38, 525, 166, 31);
		panel.add(lblDueDate);
		
		final JDateChooser receiveddate_field = new JDateChooser();
		receiveddate_field.setDateFormatString("yyyy-MM-dd");
		receiveddate_field.setBounds(369, 471, 389, 31);
		panel.add(receiveddate_field);
		
		final JDateChooser duedate_field = new JDateChooser();
		duedate_field.setDateFormatString("yyyy-MM-dd");
		duedate_field.setBounds(369, 525, 389, 31);
		panel.add(duedate_field);
		
		items_field = new JTextField();
		items_field.setHorizontalAlignment(SwingConstants.CENTER);
		items_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		items_field.setColumns(10);
		items_field.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		items_field.setBounds(369, 218, 389, 31);
		panel.add(items_field);
		
		JLabel lblItems = new JLabel("ITEMS");
		lblItems.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblItems.setBounds(38, 218, 198, 31);
		panel.add(lblItems);
		
		remarks_field = new JTextField();
		remarks_field.setHorizontalAlignment(SwingConstants.CENTER);
		remarks_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		remarks_field.setColumns(10);
		remarks_field.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		remarks_field.setBounds(369, 576, 389, 31);
		panel.add(remarks_field);
		
		JLabel lblRemarks_1 = new JLabel("REMARKS");
		lblRemarks_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRemarks_1.setBounds(38, 576, 216, 31);
		panel.add(lblRemarks_1);
		
		JButton button_1 = new JButton("SAVE");
		button_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		button_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(customer_field .getText().length()==0
						||bill_amount.getText().length()==0){
					JOptionPane.showMessageDialog(null,"Please fill atleast customer name and bill amount");
				}
				else{
					Connection connection= null;
					PreparedStatement statement=null;
					ResultSet set1=null;
					try{
						
					connection=ConnectionUtility.getConnection();
					String customerdetails = "insert into cjwellers.bandhak(name,mobile,address,items,billamount,amountreceived,dueamount,received_date,due_date,Remarks)"
					+ " values(?,?,?,?,?,?,?,?,?,?) ";

					statement=connection.prepareStatement(customerdetails);
					statement.setString(1,customer_field.getText());
					statement.setString(2,mobile_field.getText());
					statement.setString(3,address_field.getText());
					statement.setString(4,items_field.getText());
					statement.setString(5, bill_amount.getText());
					statement.setString(6, received_amount.getText());
					statement.setString(7, due_amount.getText());
					statement.setString(8,((JTextField)receiveddate_field.getDateEditor().getUiComponent()).getText());
					statement.setString(9,((JTextField)duedate_field.getDateEditor().getUiComponent()).getText());
					statement.setString(10, remarks_field.getText());

					statement.execute();
					}
					catch (SQLException e) {
					// TODO Auto-generated catch block 
					e.printStackTrace();
					}
					finally {
					ConnectionUtility.closeConnection(connection, statement, set1);
					}

				JOptionPane.showMessageDialog(null,"Saved");
				customer_field.setText("");
				mobile_field.setText("");
				address_field.setText("");
				items_field.setText("");
				bill_amount.setText("");
				received_amount.setText("");
				due_amount.setText("");
				remarks_field.setText("");

				
				}
			}
		});
		button_1.setBounds(408, 635, 234, 48);
		panel.add(button_1);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
