import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTable;

import com.toedter.calendar.JDateChooser;

import java.awt.Button;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.ScrollPaneConstants;


public class Report extends JFrame {
	private JComboBox report_field;
	private JPanel contentPane;
	private static JTable table;
	private JTextField sum_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 Report frame = new Report();
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
	public Report() {
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
		setBounds(100, 100, 1794, 1042);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new TitledBorder(null, "Transaction Table", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JDateChooser date_to = new JDateChooser();
		date_to.setFont(new Font("Tahoma", Font.PLAIN, 15));
		date_to.setDateFormatString("yyyy-MM-dd");
		date_to.setBounds(999, 127, 181, 29);
		contentPane.add(date_to);
		
		final JDateChooser date_from = new JDateChooser();
		date_from.setFont(new Font("Tahoma", Font.PLAIN, 15));
		date_from.setDateFormatString("yyyy-MM-dd");
		date_from.setBounds(996, 80, 181, 26);
		contentPane.add(date_from);
		
		Button button = new Button("Search\r\n");
		button.setFont(new Font("Dialog", Font.BOLD, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection connection= null;
				PreparedStatement statement=null;
				ResultSet set=null;
				String from=((JTextField)date_from.getDateEditor().getUiComponent()).getText();
		        String to=((JTextField)date_to.getDateEditor().getUiComponent()).getText();
		       String ReportType=report_field.getSelectedItem().toString();
		       if(ReportType=="Expense Report"){
				try{
					connection=ConnectionUtility.getConnection();
		       String expensedetails = "select * from cjwellers.expense where date between '"+from+"' and '"+to+"'";
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
		       if(ReportType=="Transaction Report"){
					try{
						connection=ConnectionUtility.getConnection();
			        String expensedetails = "select bill_no,trx_date,items,crt,pcs,gross_wt,nett_wt,metal_rate,labor_chrg,stone,total_amt,discount from cjwellers.transactions where trx_date between '"+from+"' and '"+to+"'";
					statement=connection.prepareStatement(expensedetails);
					set=statement.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(set));
					sum2();
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
		button.setBackground(new Color(176, 224, 230));
		button.setBounds(996, 167, 156, 40);
		contentPane.add(button);
		
		
		
		JLabel label = new JLabel("REPORT");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBounds(636, 13, 181, 29);
		contentPane.add(label);
		
		report_field = new JComboBox();
		report_field.addItem("Transaction Report");
		report_field.addItem("Expense Report");
		report_field.setFont(new Font("Tahoma", Font.BOLD, 20));
		report_field.setBounds(575, 87, 245, 45);
		contentPane.add(report_field);
		
		JLabel label_1 = new JLabel("Search Expense\r\n");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_1.setBounds(376, 87, 173, 26);
		contentPane.add(label_1);
		
		JButton button_1 = new JButton("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Home hn=new Home();
				hn.setVisible(true);
				hn.setResizable(false);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		button_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		button_1.setBackground(new Color(224, 255, 255));
		button_1.setBounds(570, 619, 192, 59);
		contentPane.add(button_1);
		
		JLabel label_2 = new JLabel("From");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(859, 81, 121, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("To");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(863, 133, 121, 16);
		contentPane.add(label_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Transaction Table", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		scrollPane.setBackground(new Color(0, 0, 205));
		scrollPane.setBounds(68, 221, 1246, 339);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setRowMargin(3);
		 JTableHeader header = table.getTableHeader();
		 table.getTableHeader().setPreferredSize(new Dimension(30,30));
		//  header.setBackground(Color.yellow);
		  table.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 20));
		 // table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalTextPosition(DefaultTableCellRenderer.CENTER);
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		table.setRowHeight(20);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		
		sum_field = new JTextField();
		sum_field.setFont(new Font("Tahoma", Font.BOLD, 23));
		sum_field.setBackground(new Color(0, 0, 0));
		sum_field.setForeground(new Color(255, 255, 255));
		sum_field.setHorizontalAlignment(SwingConstants.CENTER);
		sum_field.setEditable(false);
		sum_field.setBounds(960, 567, 346, 58);
		contentPane.add(sum_field);
		sum_field.setColumns(20);
		
		JLabel lblTotal = new JLabel("Total   Rs.");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setBounds(799, 566, 148, 60);
		contentPane.add(lblTotal);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
	public  void sum1(){
		
		float sum=0;
		for(int i=0;i<table.getRowCount();i++)
		{
			
			sum=sum+Float.parseFloat(table.getValueAt(i, 2).toString());
			
			sum_field.setText(Float.toString(sum));
		
		}
	}
public  void sum2(){
		
		long sum=0;
		for(int i=0;i<table.getRowCount();i++)
		{
			
			sum=(long) (sum+Float.parseFloat(table.getValueAt(i, 10).toString()));
			
			
			sum_field.setText(Long.toString(sum));
		
		}
	}
}
