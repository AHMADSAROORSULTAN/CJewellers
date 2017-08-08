import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Bandhak extends JFrame {

	private JPanel contentPane;
	private JTextField search_field;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bandhak frame = new Bandhak();
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
	public Bandhak() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search");
		lblNewLabel.setBounds(436, 74, 175, 34);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		search_field = new JTextField();
		search_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				Connection connection= null;
				PreparedStatement statement=null;
				ResultSet set=null;
				
				 String query = "SELECT name,mobile,address,items,billamount,amountreceived,dueamount,received_date,due_date,remarks FROM cjwellers.BANDHAK WHERE name LIKE '%" + search_field.getText() + "%'";
		      
				try{
					connection=ConnectionUtility.getConnection();
		      
				statement=connection.prepareStatement(query);
				set=statement.executeQuery();
				table.setModel(DbUtils.resultSetToTableModel(set));
		
				}
				catch (Exception e) {
			  		// TODO Auto-generated catch block 
			  		e.printStackTrace();
			  	}
				finally {
			  		ConnectionUtility.closeConnection(connection, statement, set);
			  	}
		       }
			
		});
		search_field.setBounds(607, 76, 308, 34);
		contentPane.add(search_field);
		search_field.setColumns(10);
		
		JLabel lblBandhak = new JLabel("BANDHAK\r\n");
		lblBandhak.setBounds(578, 11, 175, 34);
		lblBandhak.setHorizontalAlignment(SwingConstants.CENTER);
		lblBandhak.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblBandhak);
		
		JButton btnNewButton = new JButton("Add New\r\n");
		btnNewButton.setBounds(964, 74, 157, 34);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Newcustomer ef=new Newcustomer();
				ef.setVisible(true);
				ef.setResizable(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Bandhak Table", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(166, 199, 1012, 346);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("Back");
		button.setBounds(607, 593, 192, 59);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Home hn=new Home();
				hn.setVisible(true);
				hn.setResizable(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 25));
		button.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		button.setBackground(new Color(224, 255, 255));
		contentPane.add(button);
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
	}
}
