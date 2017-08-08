import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;

import net.proteanit.sql.DbUtils;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.EtchedBorder;
import javax.swing.table.JTableHeader;


public class Expense extends JFrame {
private JComboBox<String> expense_field;
public static JTable table;
private JTextField sum_field;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				 Expense frame = new Expense();
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
	public Expense() {
		setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
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
		setBounds(100, 100, 1435, 744);
		JPanel contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EXPENSE");
		lblNewLabel.setBounds(652, 11, 181, 29);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Search Expense\r\n");
		lblNewLabel_1.setBounds(624, 79, 148, 29);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_1);
		
		expense_field = new JComboBox<String>();
		expense_field.setBackground(new Color(255, 255, 255));
		expense_field.setBounds(762, 81, 216, 60);
		expense_field.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		expense_field.setFont(new Font("Tahoma", Font.BOLD, 20));
		expense_field.addItem("Home Expense");
		expense_field.addItem("Education");
		expense_field.addItem("Land Property");
		expense_field.addItem("Other Expense");
		contentPane.add(expense_field);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setBounds(1020, 84, 76, 16);
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(1020, 137, 121, 16);
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblTo);
		//JScrollPane scrollPane = new JScrollPane(table);

		
		final JDateChooser Date_from = new JDateChooser();
		Date_from.setBounds(1106, 82, 181, 26);
		Date_from.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Date_from.setDateFormatString("yyyy-MM-dd");
		contentPane.add(Date_from);
		
		final JDateChooser Date_to = new JDateChooser();
		Date_to.setBounds(1106, 137, 181, 29);
		Date_to.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Date_to.setDateFormatString("yyyy-MM-dd");
		contentPane.add(Date_to);
		
		JButton button_2 = new JButton("Back");
		button_2.setBounds(595, 623, 216, 60);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Home hn=new Home();
				hn.setVisible(true);
				hn.setResizable(false);
			}
		});
		button_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		button_2.setBackground(new Color(224, 255, 255));
		contentPane.add(button_2);
		
		JButton addexpense_field = new JButton("Add Expense");
		addexpense_field.setBounds(286, 71, 234, 76);
		addexpense_field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Expenseform ef=new Expenseform();
				ef.setVisible(true);
				ef.setResizable(false);
			}
		});
		addexpense_field.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		addexpense_field.setBackground(new Color(224, 255, 255));
		addexpense_field.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(addexpense_field);
		
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(1106, 177, 181, 34);
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection connection= null;
				PreparedStatement statement=null;
				ResultSet set=null;
				String from=((JTextField)Date_from.getDateEditor().getUiComponent()).getText();
		        String to=((JTextField)Date_to.getDateEditor().getUiComponent()).getText();
		        String ExpenseType=expense_field.getSelectedItem().toString();
		        if(ExpenseType=="Home Expense" ||ExpenseType=="Education"||ExpenseType=="Land Property"||ExpenseType=="Other Expense"){
				try{
					connection=ConnectionUtility.getConnection();
		        String expensedetails = "select * from cjwellers.expense where typeofexpense='"+ExpenseType+"' and date between '"+from+"' and '"+to+"'";
				statement=connection.prepareStatement(expensedetails);
				set=statement.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(set));
				sum1();
				}
				catch (Exception e) {
			  		// TODO Auto-generated catch block 
			  		e.printStackTrace();
			  	}
				finally {
			  		ConnectionUtility.closeConnection(connection, statement, set);
			  	}
		       }
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Expense Table", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(65, 222, 1235, 337);
		contentPane.add(scrollPane);
		
		table = new JTable();
		 JTableHeader header = table.getTableHeader();
		 table.getTableHeader().setPreferredSize(new Dimension(30,30));
		  header.setBackground(Color.yellow);
		  table.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 20));
		  table.getTableHeader().setForeground(Color.BLUE);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Expenseupdate ep=new Expenseupdate();
				   ep.setVisible(true);
				ExpenseDAO.OnClickExpensetable(table,
						                         Expenseupdate.idexpense_field,
						                         Expenseupdate.expense_type,
						                         Expenseupdate.update_amount_field,
						                      //   Expenseupdate.date_field,
						                         Expenseupdate.month_field,
						                         Expenseupdate.update_comment_field);
				
				  
			}
		});
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		
		sum_field = new JTextField();
		sum_field.setHorizontalAlignment(SwingConstants.CENTER);
		sum_field.setForeground(Color.WHITE);
		sum_field.setFont(new Font("Tahoma", Font.BOLD, 20));
		sum_field.setEditable(false);
		sum_field.setColumns(10);
		sum_field.setBackground(Color.BLACK);
		sum_field.setBounds(1036, 566, 264, 58);
		contentPane.add(sum_field);
		
		JLabel label = new JLabel("Total   Rs.");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(878, 564, 148, 60);
		contentPane.add(label);
	}
	public  void sum1(){
		
		float sum=0;
		for(int i=0;i<table.getRowCount();i++)
		{
			
			sum=sum+Float.parseFloat(table.getValueAt(i, 2).toString());
			
			sum_field.setText(Float.toString(sum));
		
		}
	}
	
	private void search(){
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
