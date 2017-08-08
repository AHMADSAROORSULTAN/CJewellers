//CREATED BY AHMAD SAROOR SULTAN
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;

import com.itextpdf.text.Image;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPCellEvent;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Date;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
//import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPCellEvent;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextArea;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

import java.beans.VetoableChangeListener;
import java.beans.PropertyChangeEvent;
import java.io.OutputStream;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import com.itextpdf.text.pdf.security.LtvVerification.Level;
import com.toedter.calendar.JDateChooser;
import com.itextpdf.text.Font.FontStyle;

import java.io.*;
import java.awt.Frame;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import sun.tools.jar.Main;

import java.awt.Dialog.ModalExclusionType;


public class Permanentbill extends JFrame {

	private JPanel contentPane;
	public JTextField name_field;
	private JTextField bill_no;
	private JTextField int_toword;
	private JTextField remarks_field;
	private JTextField discount_field;
	private JTextField vat_percent;
	private JTextField addvat_amount;
	private JTextField rnddiscount_field;
	private JTextField bill_amount;
	private JTextField textField_14;
	private JTextField totalreceipt_field;
	private JTextField credits_field;
	private JTextField netamount_field;
	private JTextField previous_field;
	private JTextField balance_field;
	private JTextField received_amount;
	private JTextField due_amount;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					 Permanentbill frame = new Permanentbill();
					frame.setVisible(true);
					 
				    frame.setResizable(false);
				
			}

			
		});
		
	}

	/**
	 * Create the frame.
	 */
	//CREATED BY AHMAD SAROOR SULTAN
	
	Connection connection=null;   
	private  JTextField item_field;
	private JTextField crt_field;
	private JTextField pcs_field;
	private JTextField gross_field;
	private JTextField net_field;
	private JTextField metal_field;
	private JTextField labour_field;
	private JTextField stone_field;
	private JTextField address_field;
	private JTextField mobile_field;
	private JTextField amount_field;
	private JTextField taxable_amount;
	private JTable table;
	private JTextField vat_amount;
	private JTextField trx_field;
	private JTextField sumpcs_field;
	private JTextField sumgross_field;
	private JTextField sumnett_field;
	
	   Permanentbill() {
	   	
	   	
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
			

		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setOpaque(false);
		contentPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.setForeground(SystemColor.text);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("SHRI CHAUDHARY JEWELLERS");
		lblNewLabel.setBounds(39, 0, 730, 22);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel lblEmailKmjikalamandirltdcom = new JLabel("EMAIL: kmji@kalamandirltd.com");
		lblEmailKmjikalamandirltdcom.setBounds(39, 23, 287, 22);
		lblEmailKmjikalamandirltdcom.setVerticalAlignment(SwingConstants.TOP);
		lblEmailKmjikalamandirltdcom.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel = new JPanel();
		panel.setBounds(41, 46, 783, 114);
		panel.setMaximumSize(new Dimension(2480, 3508));
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel.setLayout(null);
		
		JLabel lblShrismt = new JLabel("Shri/Smt   :");
		lblShrismt.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblShrismt.setBounds(12, 15, 101, 26);
		panel.add(lblShrismt);
		
		name_field = new JTextField();
		name_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				InvoiceDAO.charUperCase(e);
			   if (name_field.getText().length() >= 30 ) 
		            e.consume(); 
				InvoiceDAO.noNumber(e);
			}
		});
		name_field.setFont(new Font("Tahoma", Font.BOLD, 14));
		name_field.setBorder(null);
		name_field.setBounds(114, 17, 335, 22);
		panel.add(name_field);
		name_field.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address     :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddress.setBounds(12, 53, 91, 26);
		panel.add(lblAddress);
		
		JLabel lblPhoneNo = new JLabel("Phone No   :");
		lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPhoneNo.setBounds(12, 91, 91, 11);
		panel.add(lblPhoneNo);
		
		address_field = new JTextField();
		address_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				InvoiceDAO.charUperCase(e);
				 if (address_field.getText().length() >= 85 ) 
			            e.consume(); 
			}
		});
		address_field.setFont(new Font("Tahoma", Font.BOLD, 14));
		address_field.setBorder(null);
		address_field.setBounds(114, 56, 658, 22);
		panel.add(address_field);
		address_field.setColumns(1);
		
		mobile_field = new JTextField();
		mobile_field.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {
				
				 if (mobile_field.getText().length()>=10  ) 
					 e.consume(); 
		       InvoiceDAO.onlyNumber(e);   
			}
		});
		mobile_field.setFont(new Font("Tahoma", Font.BOLD, 14));
		mobile_field.setBorder(null);
		mobile_field.setBounds(142, 86, 186, 22);
		panel.add(mobile_field);
		mobile_field.setColumns(10);
		
		JLabel label_2 = new JLabel("+91");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(105, 87, 39, 19);
		panel.add(label_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(848, 47, 400, 114);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		panel_1.setLayout(null);
		
		JLabel lblDate = new JLabel("Date    :\r\n");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setBounds(26, 26, 63, 26);
		panel_1.add(lblDate);
		
		JLabel lblBillNo = new JLabel("PAN No :");
		lblBillNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBillNo.setBounds(26, 76, 69, 26);
		panel_1.add(lblBillNo);
		
		bill_no = new JTextField();
		bill_no.setBackground(Color.WHITE);
		bill_no.setDisabledTextColor(Color.WHITE);
		bill_no.setEditable(false);
		bill_no.setFont(new Font("Tahoma", Font.BOLD, 15));
		bill_no.setBounds(107, 78, 222, 24);
		panel_1.add(bill_no);
		bill_no.setBorder(null);
		bill_no.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(39, 460, 908, 44);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(SystemColor.textHighlightText);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Amount in Words :");
		lblNewLabel_2.setBounds(new Rectangle(1, 0, 1, 0));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(12, 13, 145, 16);
		panel_2.add(lblNewLabel_2);
		
		int_toword = new JTextField();
		int_toword.setDisabledTextColor(Color.BLACK);
		int_toword.setForeground(Color.DARK_GRAY);
		int_toword.setBackground(Color.WHITE);
		int_toword.setEnabled(false);
		
		int_toword.setFont(new Font("Tahoma", Font.BOLD, 13));
		int_toword.setColumns(10);
		int_toword.setBorder(null);
		int_toword.setBounds(153, 12, 743, 20);
		panel_2.add(int_toword);
		
		remarks_field = new JTextField();
		remarks_field.setBounds(145, 593, 652, 22);
		remarks_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
					InvoiceDAO.charUperCase(e);
					 if (address_field.getText().length() >= 60 ) 
				            e.consume(); 
			}
		});
		remarks_field.setFont(new Font("Tahoma", Font.PLAIN, 13));
		remarks_field.setColumns(10);
		remarks_field.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(597, 516, 350, 65);
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_4.setBackground(Color.WHITE);
		
		JLabel lblCredits_1 = new JLabel("Credits");
		lblCredits_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCredits_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		lblCredits_1.setBounds(12, 13, 65, 24);
		panel_4.add(lblCredits_1);
		
		due_amount = new JTextField();
		due_amount.setFont(new Font("Tahoma", Font.BOLD, 15));
		due_amount.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		due_amount.setBounds(142, 28, 196, 30);
		panel_4.add(due_amount);
		due_amount.setColumns(10);
		
		JLabel label_13 = new JLabel("Rs.");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_13.setBorder(null);
		label_13.setBounds(117, 25, 24, 34);
		panel_4.add(label_13);
		
		discount_field = new JTextField();
		discount_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ev) {
				if(ev.getKeyCode()==KeyEvent.VK_ENTER){
					 InvoiceDAO.tempAmount(discount_field, bill_amount, int_toword);
				}
			}
		});
		discount_field.setBounds(1096, 450, 143, 17);
		discount_field.setHorizontalAlignment(SwingConstants.CENTER);
		discount_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		discount_field.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		discount_field.setColumns(10);
		
		vat_percent = new JTextField();
		vat_percent.setBounds(1096, 467, 143, 17);
		vat_percent.setHorizontalAlignment(SwingConstants.CENTER);
		vat_percent.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		vat_percent.setColumns(10);
		vat_percent.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		addvat_amount = new JTextField();
		addvat_amount.setBounds(1096, 518, 143, 17);
		addvat_amount.setHorizontalAlignment(SwingConstants.CENTER);
		addvat_amount.setFont(new Font("Tahoma", Font.BOLD, 15));
		addvat_amount.setColumns(10);
		addvat_amount.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		rnddiscount_field = new JTextField();
		rnddiscount_field.setBounds(1096, 535, 143, 17);
		rnddiscount_field.setHorizontalAlignment(SwingConstants.CENTER);
		rnddiscount_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		rnddiscount_field.setColumns(10);
		rnddiscount_field.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		bill_amount = new JTextField();
		bill_amount.setBounds(1096, 552, 143, 17);
		bill_amount.setHorizontalAlignment(SwingConstants.CENTER);
		bill_amount.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		
				
		bill_amount.setColumns(10);
		bill_amount.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		textField_14 = new JTextField();
		textField_14.setBounds(1096, 569, 143, 17);
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_14.setColumns(10);
		textField_14.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		totalreceipt_field = new JTextField();
		totalreceipt_field.setBounds(1096, 586, 143, 17);
		totalreceipt_field.setHorizontalAlignment(SwingConstants.CENTER);
		totalreceipt_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		totalreceipt_field.setColumns(10);
		totalreceipt_field.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		credits_field = new JTextField();
		credits_field.setBounds(1096, 603, 143, 17);
		credits_field.setHorizontalAlignment(SwingConstants.CENTER);
		credits_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		credits_field.setColumns(10);
		credits_field.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		netamount_field = new JTextField();
		netamount_field.setBounds(1096, 620, 143, 17);
		netamount_field.setHorizontalAlignment(SwingConstants.CENTER);
		netamount_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		netamount_field.setColumns(10);
		netamount_field.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		previous_field = new JTextField();
		previous_field.setBounds(1096, 637, 143, 17);
		previous_field.setHorizontalAlignment(SwingConstants.CENTER);
		previous_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		previous_field.setColumns(10);
		previous_field.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		balance_field = new JTextField();
		balance_field.setBounds(1096, 654, 143, 17);
		balance_field.setHorizontalAlignment(SwingConstants.CENTER);
		balance_field.setFont(new Font("Tahoma", Font.BOLD, 15));
		balance_field.setColumns(10);
		balance_field.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(39, 516, 549, 65);
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_3.setBackground(Color.WHITE);
		
		JLabel label = new JLabel("Total Receipt");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		label.setBounds(12, 0, 106, 24);
		panel_3.add(label);
		
		JLabel label_1 = new JLabel("Cash:\r\n");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBorder(null);
		label_1.setBounds(22, 31, 39, 28);
		panel_3.add(label_1);
		
		received_amount = new JTextField();
		received_amount.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
		}
			@Override
			public void keyPressed(KeyEvent ev) {
				
				if (received_amount.getText().length()>=10  ) 
					 ev.consume();
				 InvoiceDAO.onlyNumber(ev);
				 if(ev.getKeyCode()==KeyEvent.VK_ENTER){
						
				 InvoiceDAO.dueAmount(bill_amount, received_amount, due_amount);
				 }
			}
		});
		
		received_amount.setFont(new Font("Tahoma", Font.BOLD, 15));
		received_amount.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		received_amount.setBounds(142, 29, 205, 24);
		panel_3.add(received_amount);
		received_amount.setColumns(10);
		
		JLabel lblRs = new JLabel("Rs.");
		lblRs.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRs.setBorder(null);
		lblRs.setBounds(110, 28, 24, 34);
		panel_3.add(lblRs);
		
		item_field = new JTextField();
		item_field.setBounds(43, 205, 292, 35);
		item_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		item_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				InvoiceDAO.charUperCase(e);
			}
		});
		item_field.setHorizontalAlignment(SwingConstants.CENTER);
		item_field.setForeground(Color.BLACK);
		item_field.setColumns(10);
		item_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		item_field.setBackground(Color.WHITE);
		
		crt_field = new JTextField();
		crt_field.setBounds(347, 205, 88, 35);
		crt_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		crt_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (crt_field.getText().length()>=4  ) 
					 e.consume(); 
				 InvoiceDAO.onlyNumber(e);
			}
		});
		crt_field.setHorizontalAlignment(SwingConstants.CENTER);
		crt_field.setForeground(Color.BLACK);
		crt_field.setColumns(10);
		crt_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		crt_field.setBackground(Color.WHITE);
		
		pcs_field = new JTextField();
		pcs_field.setBounds(450, 205, 77, 35);
		pcs_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pcs_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (pcs_field.getText().length()>=2  ) 
					 e.consume(); 
				 InvoiceDAO.onlyNumber(e);
			}
		});
		pcs_field.setHorizontalAlignment(SwingConstants.CENTER);
		pcs_field.setForeground(Color.BLACK);
		pcs_field.setColumns(10);
		pcs_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		pcs_field.setBackground(Color.WHITE);
		
		gross_field = new JTextField();
		gross_field.setBounds(541, 205, 116, 35);
		gross_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gross_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (pcs_field.getText().length()>=10 ) 
					 e.consume(); 
				InvoiceDAO.numberdecimal(e);
			}
		});
		gross_field.setHorizontalAlignment(SwingConstants.CENTER);
		gross_field.setForeground(Color.BLACK);
		gross_field.setColumns(10);
		gross_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		gross_field.setBackground(Color.WHITE);
		
		net_field = new JTextField();
		net_field.setBounds(664, 205, 113, 35);
		net_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		net_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (net_field.getText().length()>=10 ) 
					 e.consume(); 
				InvoiceDAO.numberdecimal(e);
			}
		});
		net_field.setHorizontalAlignment(SwingConstants.CENTER);
		net_field.setForeground(Color.BLACK);
		net_field.setColumns(10);
		net_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		net_field.setBackground(Color.WHITE);
		
		metal_field = new JTextField();
		metal_field.setBounds(783, 205, 105, 35);
		metal_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		metal_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (metal_field.getText().length()>=10 ) 
					 e.consume(); 
				InvoiceDAO.numberdecimal(e);
			}
		});
		metal_field.setHorizontalAlignment(SwingConstants.CENTER);
		metal_field.setForeground(Color.BLACK);
		metal_field.setColumns(10);
		metal_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		metal_field.setBackground(Color.WHITE);
		
		labour_field = new JTextField();
		labour_field.setBounds(894, 205, 109, 35);
		labour_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labour_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (labour_field.getText().length()>=10 ) 
					 e.consume(); 
				 InvoiceDAO.onlyNumber(e);
			}
		});
		labour_field.setHorizontalAlignment(SwingConstants.CENTER);
		labour_field.setForeground(Color.BLACK);
		labour_field.setColumns(10);
		labour_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		labour_field.setBackground(Color.WHITE);
		
		final JDateChooser billing_date = new JDateChooser();
		billing_date.setBackground(new Color(255, 255, 255));
		billing_date.getCalendarButton().setBorder(null);
		billing_date.setBorder(null);
		billing_date.setFont(new Font("Tahoma", Font.BOLD, 15));
		Date date=new Date();
		billing_date.setDate(date);
		
		billing_date.setDateFormatString("yyyy-MM-dd");
		billing_date.setBounds(106, 30, 174, 22);
	//	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	//	final String DateString = dateFormat.format(billing_date.getDate());
	//	 String from=((JTextField)billing_date.getDateEditor().getUiComponent()).getText();
		panel_1.add(billing_date);
		
		
		stone_field = new JTextField();
		stone_field.setBounds(1011, 205, 103, 35);
		stone_field.setFont(new Font("Tahoma", Font.PLAIN, 15));
		stone_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (stone_field.getText().length()>=10 ) 
					 e.consume(); 
				 InvoiceDAO.onlyNumber(e);
			}
			@Override
			public void keyPressed(KeyEvent ev) {
				if(ev.getKeyCode()==KeyEvent.VK_ENTER){
					amountCalculations();
					if( item_field.getText().length()==0
							
							)
					{
				    	JOptionPane.showMessageDialog(null,"Item field can't be empty");
				    }
					 
					else{
						Connection connection=null;
						PreparedStatement statement=null;
						ResultSet set=null;
					try {
						connection = ConnectionUtility.getConnection();

							if (table.getRowCount()<1) {
							//	table.updateUI();
								String customerdetails = "insert into cjwellers.customer(name,mobile,address) values(?,?,?) ";
								statement = connection.prepareStatement(customerdetails);
								statement .setString(1, name_field.getText());
								statement .setString(2, mobile_field.getText());
								statement .setString(3, address_field.getText());
								statement .execute();
								// fetch recent customer id.
								
							}
							statement  = connection
									.prepareStatement("SELECT cust_id FROM cjwellers.customer order by cust_id desc limit 1");
							 set = statement .executeQuery();
							int custId = 0;
							while (set.next()) {
								custId = set.getInt("cust_id");

							}
							if (custId > 0) {
								try{
									connection = ConnectionUtility.getConnection();
						
								String transactions = "insert into cjwellers.transactions(bill_no,trx_date,items,crt,"
										+ "pcs,gross_wt,nett_wt,metal_rate,labor_chrg,stone,total_amt,cust_id)"
										+ " values(?,?,?,?,?,?,?,?,?,?,?,?) ";
								String date=((JTextField)billing_date.getDateEditor().getUiComponent()).getText();
								statement  = connection.prepareStatement(transactions);
								//statement .setInt(1, custId);
								statement .setString(1, bill_no.getText());
								statement .setString(2, date);
								statement .setString(3, item_field.getText());
								statement .setString(4, crt_field.getText());
								statement .setString(5, pcs_field.getText());
								statement .setString(6, gross_field.getText());
								statement .setString(7, net_field.getText());
								statement .setString(8, metal_field.getText());
								statement .setString(9, labour_field.getText());
								statement .setString(10, stone_field.getText());
								statement .setString(11, amount_field.getText());
								statement .setInt(12, custId);
								statement .execute();
								
								model.setRowCount(0);
					           
								List<BillConfigure> trxList=InvoiceDAO.getTransactions(table, custId);
								if(trxList!=null && trxList.size()>0){
									model = (DefaultTableModel) table.getModel();
									for(BillConfigure billConfigure:trxList){
									
										model.insertRow(model.getRowCount(),new Object[] {
	                                                                                      billConfigure.getSno(),
											                                              billConfigure.getItems(),
											                                              billConfigure.getCrt(),
											                                              billConfigure.getPcs(),
											                                              billConfigure.getGrosswt(),
											                                              billConfigure.getNettwt(),
											                                              billConfigure.getMetal(),
											                                              billConfigure.getLabour(),
											                                              billConfigure.getStone(),
											                                              billConfigure.getAmount(),
											                                              billConfigure.getTrxId()
											                                              });
										table.getRowCount();
								
									}
								}
								
								
								
								 InvoiceDAO.emptyJtextFields( item_field, crt_field, pcs_field, gross_field, 
								    		net_field, metal_field, labour_field, stone_field, amount_field);
								 InvoiceDAO.sum(table, taxable_amount);
								InvoiceDAO.taxAmount(taxable_amount, vat_percent, vat_amount);
								InvoiceDAO.billAmount(taxable_amount, vat_amount, bill_amount, int_toword);
								
								InvoiceDAO.sumPcs(table, sumpcs_field);
								InvoiceDAO.sumGross(table, sumgross_field);
								InvoiceDAO.sumNett(table, sumnett_field);
								
							
					}
								catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
							}
					}
					catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
									
					}
					}
			}
		});
		
		
		
		final JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(1253, 302, 85, 44);
		btnUpdate.setVisible(false);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdate.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(  item_field.getText().length()==0)
						
				{
			    	JOptionPane.showMessageDialog(null,"Item field can't be empty");
			    }
				else{
					   amountCalculations();
				Connection con = null;
				PreparedStatement st = null;
				ResultSet set = null;
				      String value1=trx_field.getText();
				      String value2=  item_field.getText();
				      String value3= crt_field.getText();
				      String value4=  pcs_field.getText();
				      String value5= gross_field.getText();
				      String value6=  net_field.getText();
				      String value7=  metal_field.getText();
				      String value8= labour_field.getText();
				      String value9= stone_field.getText();
				      String value10=  amount_field.getText();
				
				try {
					Connection con1=null;
					PreparedStatement st1=null;
					ResultSet set1=null;
					con1=ConnectionUtility.getConnection();
					 String expenseUpdate=  "update cjwellers.transactions set items='"+value2+"',"
		        		        + "crt='"+value3+"',"
		        				+ "pcs='"+value4+"',gross_wt='"+value5+"',"
		        		        + "nett_wt='"+value6+"',"
		        		        + "metal_rate='"+value7+"',labor_chrg='"+value8+"',"
		        		        + "stone='"+value9+"',total_amt='"+value10+"'"
		        		        		+ "where trx_id='"+value1+"'";
		        st1 = con1.prepareStatement(expenseUpdate);
		        st1.executeUpdate(expenseUpdate);
		          JOptionPane.showMessageDialog(null,"Updated Successfully !!");
		       
		          int i=table.getSelectedRow();
		      	int row=table.getSelectedRows()[0];
				String Click=(table.getModel().getValueAt(row,1).toString());
				   model.removeRow(i);
		          st1  = con1
							.prepareStatement("SELECT cust_id FROM cjwellers.customer order by cust_id desc limit 1");
					 set1 = st1.executeQuery();
					int custId = 0;
					while (set1.next()) {
						custId = set1.getInt("cust_id");
             
					}
					if (custId > 0) {
						try{
							connection = ConnectionUtility.getConnection();
							 
//				
//						String transactions = "insert into cjwellers.transactions(bill_no,trx_date,items,crt,"
//								+ "pcs,gross_wt,nett_wt,metal_rate,labor_chrg,stone,total_amt,cust_id)"
//								+ " values(?,?,?,?,?,?,?,?,?,?,?,?) ";
//						String date=((JTextField)billing_date.getDateEditor().getUiComponent()).getText();
//						st1  = connection.prepareStatement(transactions);
//						//statement .setInt(1, custId);
//						st1 .setString(1, bill_no.getText());
//						st1 .setString(2, date);
//						st1 .setString(3, item_field.getText());
//						st1 .setString(4, crt_field.getText());
//						st1 .setString(5, pcs_field.getText());
//						st1 .setString(6, gross_field.getText());
//						st1 .setString(7, net_field.getText());
//						st1 .setString(8, metal_field.getText());
//						st1 .setString(9, labour_field.getText());
//						st1.setString(10, stone_field.getText());
//						st1.setString(11, amount_field.getText());
//						st1.setInt(12, custId);
//						st1.execute();
//						
					
						model.setRowCount(0);
			           
						List<BillConfigure> trxList=InvoiceDAO.getTransactions(table, custId);
						if(trxList!=null && trxList.size()>0){
							model = (DefaultTableModel) table.getModel();
							for(BillConfigure billConfigure:trxList){
							
								model.insertRow(model.getRowCount(),new Object[] {
                                                                                billConfigure.getSno(),
									                                              billConfigure.getItems(),
									                                              billConfigure.getCrt(),
									                                              billConfigure.getPcs(),
									                                              billConfigure.getGrosswt(),
									                                              billConfigure.getNettwt(),
									                                              billConfigure.getMetal(),
									                                              billConfigure.getLabour(),
									                                              billConfigure.getStone(),
									                                              billConfigure.getAmount(),
									                                              billConfigure.getTrxId()
									                                              });
								table.getRowCount();
								
							}
						}
						
						 InvoiceDAO.emptyJtextFields( item_field, crt_field, pcs_field, gross_field, 
						    		net_field, metal_field, labour_field, stone_field, amount_field);
						 InvoiceDAO.sum(table, taxable_amount);
						InvoiceDAO.taxAmount(taxable_amount, vat_percent, vat_amount);
						InvoiceDAO.billAmount(taxable_amount, vat_amount, bill_amount, int_toword);
							
						InvoiceDAO.sumPcs(table, sumpcs_field);
						InvoiceDAO.sumGross(table, sumgross_field);
						InvoiceDAO.sumNett(table, sumnett_field);
					
				} 
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e);
				  }
					}
					}
						catch(Exception e){
							JOptionPane.showMessageDialog(null,e);
						  }
				
				
				finally {
					ConnectionUtility.closeConnection(con, st, set);
				}
					}
						}	
		});
		
		stone_field.setHorizontalAlignment(SwingConstants.CENTER);
		stone_field.setForeground(Color.BLACK);
		stone_field.setColumns(10);
		stone_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		stone_field.setBackground(Color.WHITE);
		  table = new JTable();
		  table.setBounds(40, 274, 1201, 174);
		  table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		  table.setRowHeight(22);
		  table.addMouseListener(new MouseAdapter() {
		  	@Override
		  	public void mouseClicked(MouseEvent arg0) {
		  		btnUpdate.setVisible(true);
		  	   	int row=table.getSelectedRow();
		  	   	String value1=(table.getModel().getValueAt(row,1).toString());
		  	   	String value2=(table.getModel().getValueAt(row,2).toString());
		  	   	String value3=(table.getModel().getValueAt(row,3).toString());
		  	   	String value4=(table.getModel().getValueAt(row,4).toString());
		  	   	String value5=(table.getModel().getValueAt(row,5).toString());
		  	   	String value6=(table.getModel().getValueAt(row,6).toString());
		  	   	String value7=(table.getModel().getValueAt(row,7).toString());
		  	   	String value8=(table.getModel().getValueAt(row,8).toString());
		  	   	String value9=(table.getModel().getValueAt(row,9).toString());
		  	    String value10=(table.getModel().getValueAt(row,10).toString());
		  	   			
		  	   			
		  	   			item_field.setText(value1);
		  	            crt_field.setText(value2);
		  	   			pcs_field.setText(value3);		
		  	   			gross_field.setText(value4);
		  	   			net_field.setText(value5);
		  	   			metal_field.setText(value6);
		  	   			labour_field.setText(value7);
		  	   			stone_field.setText(value8);
		  	   			amount_field.setText(value9);
		  	   			trx_field.setText(value10);
		  	}
		  });
		  table.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		model=new DefaultTableModel();
		Object[] columns={"S.no","items","crt","pcs","gross_wt","nett_wt","metal_rate","labor_chrg","stone","amount"};
		//final  Object[] row =new Object[10];  
			model.setColumnIdentifiers(columns);
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					" S.no", "ITEMS", "CRT", "PCS", "GROSS WT.", "NETT WT.", "METAL RATE", "LABOUR", "STONE", "AMOUNT", ""
				}
			) {
				Class[] columnTypes = new Class[] {
					Object.class, Object.class, Object.class, String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			table.getColumnModel().getColumn(0).setPreferredWidth(30);
			table.getColumnModel().getColumn(1).setResizable(false);
			table.getColumnModel().getColumn(1).setPreferredWidth(187);
			table.getColumnModel().getColumn(2).setResizable(false);
			table.getColumnModel().getColumn(2).setPreferredWidth(64);
			table.getColumnModel().getColumn(3).setResizable(false);
			table.getColumnModel().getColumn(3).setPreferredWidth(64);
			table.getColumnModel().getColumn(4).setResizable(false);
			table.getColumnModel().getColumn(4).setPreferredWidth(80);
			table.getColumnModel().getColumn(5).setResizable(false);
			table.getColumnModel().getColumn(6).setResizable(false);
			table.getColumnModel().getColumn(7).setResizable(false);
			table.getColumnModel().getColumn(8).setResizable(false);
			table.getColumnModel().getColumn(9).setResizable(false);
			table.getColumnModel().getColumn(9).setPreferredWidth(80);
			table.getColumnModel().getColumn(10).setResizable(false);
			table.getColumnModel().getColumn(10).setPreferredWidth(0);
			table.getColumnModel().getColumn(10).setMinWidth(0);
			table.getColumnModel().getColumn(10).setMaxWidth(0);
			DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
			rightRenderer.setHorizontalAlignment( JLabel.CENTER );
			    table.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
				table.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
				table.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
				table.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
				table.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
				table.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
				table.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
				table.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
				table.getColumnModel().getColumn(8).setCellRenderer(rightRenderer);
				table.getColumnModel().getColumn(9).setCellRenderer(rightRenderer);
				
		//	 JScrollPane scrollPane = new JScrollPane(table);
		JLabel lblItems = new JLabel("ITEMS");
		lblItems.setBounds(147, 182, 77, 16);
		lblItems.setForeground(new Color(153, 50, 204));
		lblItems.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblCrt = new JLabel("CRT");
		lblCrt.setBounds(369, 183, 56, 16);
		lblCrt.setForeground(new Color(153, 50, 204));
		lblCrt.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblPcs = new JLabel("PCS");
		lblPcs.setBounds(467, 182, 56, 16);
		lblPcs.setForeground(new Color(153, 50, 204));
		lblPcs.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblGrossWt = new JLabel("GROSS. WT");
		lblGrossWt.setBounds(560, 183, 97, 16);
		lblGrossWt.setForeground(new Color(153, 50, 204));
		lblGrossWt.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblNettWt = new JLabel("NETT WT.");
		lblNettWt.setBounds(692, 184, 88, 16);
		lblNettWt.setForeground(new Color(153, 50, 204));
		lblNettWt.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblMetalRate = new JLabel("METAL RATE");
		lblMetalRate.setBounds(794, 183, 97, 16);
		lblMetalRate.setForeground(new Color(153, 50, 204));
		lblMetalRate.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblLabour = new JLabel("LABOUR");
		lblLabour.setBounds(909, 185, 77, 16);
		lblLabour.setForeground(new Color(153, 50, 204));
		lblLabour.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblStone = new JLabel("STONE");
		lblStone.setBounds(1035, 186, 64, 16);
		lblStone.setForeground(new Color(153, 50, 204));
		lblStone.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblAmount = new JLabel("AMOUNT");
		lblAmount.setBounds(1144, 181, 97, 16);
		lblAmount.setForeground(new Color(153, 50, 204));
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		amount_field = new JTextField();
		amount_field.setBounds(1122, 205, 119, 35);
		amount_field.setFont(new Font("Tahoma", Font.PLAIN, 20));
		amount_field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (amount_field.getText().length()>=10 ) 
					 e.consume();
				InvoiceDAO.onlyNumber(e); 
			}
			@Override
			public void keyPressed(KeyEvent ev) {
				if(ev.getKeyCode()==KeyEvent.VK_ENTER){
					
					if( item_field.getText().length()==0
							)
					{
				    	JOptionPane.showMessageDialog(null,"Item field can't be empty");
				    }
					 
					else{
						Connection connection=null;
						PreparedStatement statement=null;
						ResultSet set=null;
					try {
						connection = ConnectionUtility.getConnection();

							if (table.getRowCount()<1) {
							//	table.updateUI();
								String customerdetails = "insert into cjwellers.customer(name,mobile,address) values(?,?,?) ";
								statement = connection.prepareStatement(customerdetails);
								statement .setString(1, name_field.getText());
								statement .setString(2, mobile_field.getText());
								statement .setString(3, address_field.getText());
								statement .execute();
								// fetch recent customer id.
								
							}
							statement  = connection
									.prepareStatement("SELECT cust_id FROM cjwellers.customer order by cust_id desc limit 1");
							 set = statement .executeQuery();
							int custId = 0;
							while (set.next()) {
								custId = set.getInt("cust_id");

							}
							if (custId > 0) {
								try{
									connection = ConnectionUtility.getConnection();
						
								String transactions = "insert into cjwellers.transactions(bill_no,trx_date,items,crt,"
										+ "pcs,gross_wt,nett_wt,metal_rate,labor_chrg,stone,total_amt,cust_id)"
										+ " values(?,?,?,?,?,?,?,?,?,?,?,?) ";
								String date=((JTextField)billing_date.getDateEditor().getUiComponent()).getText();
								statement  = connection.prepareStatement(transactions);
								//statement .setInt(1, custId);
								statement .setString(1, bill_no.getText());
								statement .setString(2, date);
								statement .setString(3, item_field.getText());
								statement .setString(4, crt_field.getText());
								statement .setString(5, pcs_field.getText());
								statement .setString(6, gross_field.getText());
								statement .setString(7, net_field.getText());
								statement .setString(8, metal_field.getText());
								statement .setString(9, labour_field.getText());
								statement .setString(10, stone_field.getText());
								statement .setString(11, amount_field.getText());
								statement .setInt(12, custId);
								statement .execute();
								
								model.setRowCount(0);
					           
								List<BillConfigure> trxList=InvoiceDAO.getTransactions(table, custId);
								if(trxList!=null && trxList.size()>0){
									model = (DefaultTableModel) table.getModel();
									for(BillConfigure billConfigure:trxList){
									
										model.insertRow(model.getRowCount(),new Object[] {
	                                                                                      billConfigure.getSno(),
											                                              billConfigure.getItems(),
											                                              billConfigure.getCrt(),
											                                              billConfigure.getPcs(),
											                                              billConfigure.getGrosswt(),
											                                              billConfigure.getNettwt(),
											                                              billConfigure.getMetal(),
											                                              billConfigure.getLabour(),
											                                              billConfigure.getStone(),
											                                              billConfigure.getAmount(),
											                                              billConfigure.getTrxId()
											                                              });
										table.getRowCount();
								
									}
								}
								
								
								
								 InvoiceDAO.emptyJtextFields( item_field, crt_field, pcs_field, gross_field, 
								    		net_field, metal_field, labour_field, stone_field, amount_field);
								 InvoiceDAO.sum(table, taxable_amount);
								InvoiceDAO.taxAmount(taxable_amount, vat_percent, vat_amount);
								InvoiceDAO.billAmount(taxable_amount, vat_amount, bill_amount, int_toword);
									
								InvoiceDAO.sumPcs(table, sumpcs_field);
								InvoiceDAO.sumGross(table, sumgross_field);
								InvoiceDAO.sumNett(table, sumnett_field);
									
							
					}
								catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
							}
					}
					catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
									
					}
					}
			}
		});
		amount_field.setHorizontalAlignment(SwingConstants.CENTER);
		amount_field.setForeground(Color.BLACK);
		amount_field.setColumns(10);
		amount_field.setBorder(new LineBorder(new Color(0, 0, 0)));
		amount_field.setBackground(Color.WHITE);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(1251, 358, 87, 44);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i=table.getSelectedRow();
				if(i>=0){
					Connection connection=null;
					PreparedStatement statement=null;
					ResultSet set=null;
					
					try{
						connection=ConnectionUtility.getConnection();
						String delete ="delete from cjwellers.transactions WHERE trx_id=?";
						statement=connection.prepareStatement(delete);
						statement.setString(1, trx_field.getText());
						statement.executeUpdate();
						
						JOptionPane.showMessageDialog(null, "deleted");
						int row=table.getSelectedRows()[0];
						String Click=(table.getModel().getValueAt(row,1).toString());
						   model.removeRow(i);
//						   
//						   for(int y=row ;y<model.getRowCount();y++){
//
//						          model.setValueAt(y, y, 0); //setValueAt(data,row,column)
//						       }
//						   
						   model.setRowCount(0);
						   statement  = connection
									.prepareStatement("SELECT cust_id FROM cjwellers.customer order by cust_id desc limit 1");
							 set = statement .executeQuery();
							int custId = 0;
							while (set.next()) {
								custId = set.getInt("cust_id");

				           
							List<BillConfigure> trxList=InvoiceDAO.getTransactions(table, custId);
							if(trxList!=null && trxList.size()>0){
								model = (DefaultTableModel) table.getModel();
								for(BillConfigure billConfigure:trxList){
								
									model.insertRow(model.getRowCount(),new Object[] {
                                                                                     billConfigure.getSno(),
										                                              billConfigure.getItems(),
										                                              billConfigure.getCrt(),
										                                              billConfigure.getPcs(),
										                                              billConfigure.getGrosswt(),
										                                              billConfigure.getNettwt(),
										                                              billConfigure.getMetal(),
										                                              billConfigure.getLabour(),
										                                              billConfigure.getStone(),
										                                              billConfigure.getAmount(),
										                                              });
									table.getRowCount();
							
								}
							}
						    InvoiceDAO.emptyJtextFields( item_field, crt_field, pcs_field, gross_field, 
						    		net_field, metal_field, labour_field, stone_field, amount_field);

							InvoiceDAO.sum(table, taxable_amount);
							InvoiceDAO.taxAmount(taxable_amount, vat_percent, vat_amount);
							InvoiceDAO.billAmount(taxable_amount, vat_amount, bill_amount, int_toword);
							trx_field.setText("");
							
							InvoiceDAO.sumPcs(table, sumpcs_field);
							InvoiceDAO.sumGross(table, sumgross_field);
							InvoiceDAO.sumNett(table, sumnett_field);
					}
					}
					catch(Exception e){
						JOptionPane.showMessageDialog(null,e);
					  }
					finally{
						ConnectionUtility.closeConnection(connection, statement, set);
					}
				
					  
				}
			}
		});
		btnDelete.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		
		
		InvoiceDAO.randomNumbers(bill_no);
		
	
		InvoiceDAO.taxVat(vat_percent);
        
        JLabel label_12 = new JLabel("AMOUNT");
        label_12.setBounds(1118, 248, 123, 27);
        label_12.setHorizontalAlignment(SwingConstants.CENTER);
        label_12.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_12.setForeground(new Color(153, 50, 204));
        label_12.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        taxable_amount = new JTextField();
        taxable_amount.setBounds(1096, 484, 143, 17);
        taxable_amount.setHorizontalAlignment(SwingConstants.CENTER);
        taxable_amount.setFont(new Font("Tahoma", Font.BOLD, 15));
        taxable_amount.setColumns(10);
        taxable_amount.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        
        vat_amount = new JTextField();
        vat_amount.setBounds(1096, 501, 143, 17);
        vat_amount.setHorizontalAlignment(SwingConstants.CENTER);
        vat_amount.setFont(new Font("Tahoma", Font.BOLD, 15));
        vat_amount.setColumns(10);
        vat_amount.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        
        JLabel lblRemarks = new JLabel("REMARKS");
        lblRemarks.setBounds(39, 593, 88, 22);
        lblRemarks.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblRemarks.setBorder(null);
        
        trx_field = new JTextField();
        trx_field.setBounds(12, 315, 22, 22);
        trx_field.setVisible(false);
        trx_field.setColumns(10);
        contentPane.setLayout(null);
        contentPane.add(lblNewLabel);
        contentPane.add(lblEmailKmjikalamandirltdcom);
        contentPane.add(panel);
        contentPane.add(panel_1);
        contentPane.add(lblItems);
        contentPane.add(lblCrt);
        contentPane.add(lblPcs);
        contentPane.add(lblGrossWt);
        contentPane.add(lblNettWt);
        contentPane.add(lblMetalRate);
        contentPane.add(lblLabour);
        contentPane.add(lblStone);
        contentPane.add(lblAmount);
        contentPane.add(item_field);
        contentPane.add(crt_field);
        contentPane.add(pcs_field);
        contentPane.add(gross_field);
        contentPane.add(net_field);
        contentPane.add(metal_field);
        contentPane.add(labour_field);
        contentPane.add(stone_field);
        contentPane.add(amount_field);
        contentPane.add(label_12);
        contentPane.add(btnUpdate);
        contentPane.add(trx_field);
        contentPane.add(table);
        contentPane.add(btnDelete);
        contentPane.add(panel_2);
        contentPane.add(discount_field);
        contentPane.add(vat_percent);
        contentPane.add(taxable_amount);
        contentPane.add(vat_amount);
        contentPane.add(panel_4);
        contentPane.add(panel_3);
        contentPane.add(addvat_amount);
        contentPane.add(rnddiscount_field);
        contentPane.add(bill_amount);
        contentPane.add(textField_14);
        contentPane.add(totalreceipt_field);
        contentPane.add(lblRemarks);
        contentPane.add(remarks_field);
        contentPane.add(credits_field);
        contentPane.add(netamount_field);
        contentPane.add(previous_field);
        contentPane.add(balance_field);
        
      
        
        
        
        JLabel label_17 = new JLabel("TIME 11-00 AM TO 08-30 PM");
        label_17.setHorizontalAlignment(SwingConstants.LEFT);
        label_17.setFont(new Font("Tahoma", Font.BOLD, 15));
        label_17.setBorder(null);
        label_17.setBounds(39, 634, 329, 22);
        contentPane.add(label_17);
        
        JButton button = new JButton("Back");
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		Home hn=new Home();
        		hn.setVisible(true);
        	}
        });
        button.setForeground(new Color(0, 100, 0));
        button.setFont(new Font("Tahoma", Font.BOLD, 20));
        button.setBounds(399, 627, 194, 54);
        contentPane.add(button);
       
        
        JLabel label_3 = new JLabel("S.NO.");
        label_3.setHorizontalAlignment(SwingConstants.CENTER);
        label_3.setForeground(new Color(153, 50, 204));
        label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
        label_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_3.setBounds(40, 249, 69, 28);
        contentPane.add(label_3);
        
        JLabel label_4 = new JLabel("ITEMS");
        label_4.setHorizontalAlignment(SwingConstants.CENTER);
        label_4.setForeground(new Color(153, 50, 204));
        label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
        label_4.setBorder(new LineBorder(new Color(0, 0, 0)));
        label_4.setBounds(109, 249, 229, 28);
        contentPane.add(label_4);
        
        JLabel label_5 = new JLabel("CRT");
        label_5.setHorizontalAlignment(SwingConstants.CENTER);
        label_5.setForeground(new Color(153, 50, 204));
        label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
        label_5.setBorder(new LineBorder(new Color(0, 0, 0)));
        label_5.setBounds(338, 249, 103, 28);
        contentPane.add(label_5);
        
        JLabel label_6 = new JLabel("PCS");
        label_6.setHorizontalAlignment(SwingConstants.CENTER);
        label_6.setForeground(new Color(153, 50, 204));
        label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
        label_6.setBorder(new LineBorder(new Color(0, 0, 0)));
        label_6.setBounds(441, 249, 103, 28);
        contentPane.add(label_6);
        
        JLabel label_7 = new JLabel("GROSS. WT");
        label_7.setHorizontalAlignment(SwingConstants.CENTER);
        label_7.setForeground(new Color(153, 50, 204));
        label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
        label_7.setBorder(new LineBorder(new Color(0, 0, 0)));
        label_7.setBounds(542, 249, 122, 28);
        contentPane.add(label_7);
        
        JLabel label_8 = new JLabel("NETT WT.");
        label_8.setHorizontalAlignment(SwingConstants.CENTER);
        label_8.setForeground(new Color(153, 50, 204));
        label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
        label_8.setBorder(new LineBorder(new Color(0, 0, 0)));
        label_8.setBounds(664, 249, 115, 28);
        contentPane.add(label_8);
        
        JLabel label_9 = new JLabel("METAL RATE");
        label_9.setHorizontalAlignment(SwingConstants.CENTER);
        label_9.setForeground(new Color(153, 50, 204));
        label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
        label_9.setBorder(new LineBorder(new Color(0, 0, 0)));
        label_9.setBounds(779, 249, 111, 28);
        contentPane.add(label_9);
        
        JLabel label_10 = new JLabel("LABOUR");
        label_10.setHorizontalAlignment(SwingConstants.CENTER);
        label_10.setForeground(new Color(153, 50, 204));
        label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
        label_10.setBorder(new LineBorder(new Color(0, 0, 0)));
        label_10.setBounds(890, 249, 114, 28);
        contentPane.add(label_10);
        
        JLabel label_11 = new JLabel("STONE");
        label_11.setHorizontalAlignment(SwingConstants.CENTER);
        label_11.setForeground(new Color(153, 50, 204));
        label_11.setFont(new Font("Tahoma", Font.BOLD, 15));
        label_11.setBorder(new LineBorder(new Color(0, 0, 0)));
        label_11.setBounds(1004, 249, 114, 28);
        contentPane.add(label_11);
        
        JLabel label_14 = new JLabel("Balance");
        label_14.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_14.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_14.setBounds(953, 654, 143, 17);
        contentPane.add(label_14);
        
        JLabel label_19 = new JLabel("Previous Ols.");
        label_19.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_19.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_19.setBounds(953, 637, 143, 17);
        contentPane.add(label_19);
        
        JLabel label_20 = new JLabel("Net Amount");
        label_20.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_20.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_20.setBounds(953, 620, 143, 17);
        contentPane.add(label_20);
        
        JLabel label_21 = new JLabel("Credits");
        label_21.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_21.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_21.setBounds(953, 603, 143, 17);
        contentPane.add(label_21);
        
        JLabel label_22 = new JLabel("Total Receipt");
        label_22.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_22.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_22.setBounds(953, 586, 143, 17);
        contentPane.add(label_22);
        
        JLabel label_23 = new JLabel("");
        label_23.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_23.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_23.setBounds(953, 569, 143, 17);
        contentPane.add(label_23);
        
        JLabel label_24 = new JLabel("Add. VAT Amount");
        label_24.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_24.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_24.setBounds(953, 518, 143, 17);
        contentPane.add(label_24);
        
        JLabel label_25 = new JLabel("Rnd Dis/Discount");
        label_25.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_25.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_25.setBackground(new Color(240, 255, 255));
        label_25.setBounds(953, 535, 143, 17);
        contentPane.add(label_25);
        
        JLabel lblGstAmount = new JLabel("GST Amount");
        lblGstAmount.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblGstAmount.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblGstAmount.setBounds(953, 501, 143, 17);
        contentPane.add(lblGstAmount);
        
        JLabel label_27 = new JLabel("Taxable Amount");
        label_27.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_27.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_27.setBounds(953, 484, 143, 17);
        contentPane.add(label_27);
        
        JLabel lblGst = new JLabel("GST");
        lblGst.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblGst.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        lblGst.setBounds(953, 467, 143, 17);
        contentPane.add(lblGst);
        
        JLabel label_29 = new JLabel("Discount");
        label_29.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_29.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_29.setBackground(Color.GREEN);
        label_29.setBounds(953, 450, 143, 17);
        contentPane.add(label_29);
        
        JLabel label_30 = new JLabel("Bill Amount");
        label_30.setFont(new Font("Tahoma", Font.BOLD, 13));
        label_30.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        label_30.setBounds(953, 552, 143, 17);
        contentPane.add(label_30);
        
        
        JButton btnPrint = new JButton("Print");
        btnPrint.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnPrint.setForeground(new Color(0, 100, 0));
        btnPrint.setBounds(680, 626, 194, 54);
        contentPane.add(btnPrint);
        
        sumpcs_field = new JTextField();
        sumpcs_field.setBounds(13, 358, 22, 20);
        contentPane.add(sumpcs_field);
        sumpcs_field.setColumns(10);
        sumpcs_field.setVisible(false);
        
        sumgross_field = new JTextField();
        sumgross_field.setBounds(13, 392, 22, 20);
        contentPane.add(sumgross_field);
        sumgross_field.setColumns(10);
        sumgross_field.setVisible(false);
        
        sumnett_field = new JTextField();
        sumnett_field.setBounds(12, 424, 22, 20);
        contentPane.add(sumnett_field);
        sumnett_field.setColumns(10);
        sumnett_field.setVisible(false);
        
        
		
		// Printing
        
        btnPrint.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		Connection connection=null;
				PreparedStatement statement=null;
				ResultSet set=null;
			try {
				connection = ConnectionUtility.getConnection();

					
					statement  = connection
							.prepareStatement("SELECT cust_id FROM cjwellers.customer order by cust_id desc limit 1");
					 set = statement .executeQuery();
					int custId = 0;
					while (set.next()) {
						custId = set.getInt("cust_id");

					}
					if (custId > 0) {
        		Connection connection1= null;
        		PreparedStatement statement1=null;
        		ResultSet set1=null;
        		try{
        			String value1=bill_amount.getText();
    				String value2=received_amount.getText();
    				String value3=due_amount.getText();
    		        String value4=remarks_field.getText();
        		connection1=ConnectionUtility.getConnection();
        		 String billUpdate=  "update cjwellers.customer set billamount='"+value1+"',"
	        		        + "amountreceived='"+value2+"',"
	        				+ "dueamount='"+value3+"',"
	        		        + "Remarks='"+value4+"'"
	        		        		+ "where cust_id='"+custId+"'";

        		statement1=connection1.prepareStatement(billUpdate);
 
        		statement1.executeUpdate(billUpdate);
        		}
        		catch (SQLException e) {
        		// TODO Auto-generated catch block 
        		e.printStackTrace();
        		}
					
        		finally {
            		ConnectionUtility.closeConnection(connection1, statement1, set1);
            		}
					}
			}
					catch (SQLException e) {
		        		// TODO Auto-generated catch block 
		        		e.printStackTrace();
		        		}
					finally {
	            		ConnectionUtility.closeConnection(connection, statement, set);
	            		}

//Documentation starts
        		
        		  try {
        	            Document doc2 = new Document(PageSize.A4);
        	            
        	            PdfWriter writer = PdfWriter.getInstance((Document)doc2, (OutputStream)new FileOutputStream("PInvoice.pdf"));
        	            doc2.open();
        	            // Header
        	            
        	            
        	            PdfPTable headertable = new PdfPTable(4);
        	            headertable.setWidths(new int[]{10,60,15,4});
        	            headertable.setWidthPercentage(101.0f);
        	            headertable.getDefaultCell().setBorder(0);
        	            PdfPCell cell14;
        	            cell14= new PdfPCell(new Phrase(""));
        	            cell14.setBorder(0);
        	            cell14.setPaddingLeft(2.0f);
        	            headertable.addCell(cell14);
        	            
        	            PdfPTable headertable1 = new PdfPTable(1);
        	         //   headertable1.setWidths(new int[]{10,20,10,3});
        	           
        	             cell14 = new PdfPCell(new Phrase("             SHRI CHAUDHARY", FontFactory.getFont((String)"Times-Bold", (float)24.0f)));
        	            cell14.setBorder(0);
        	          
        	            cell14.setPaddingLeft(2.0f);
        	            headertable1.addCell(cell14);
        	            cell14 = new PdfPCell(new Phrase("                                 Jewellers ", FontFactory.getFont((String)"Times-Bold", (float)18.0f)));
        	            cell14.setBorder(0);
        	            headertable1.addCell(cell14);
        	            
        	            cell14= new PdfPCell(headertable1);
        	            cell14.setBorder(0);
        	            cell14.setPadding(8.0f);
        	            headertable.addCell(cell14);  
        	            
        	            PdfPTable headertable2 = new PdfPTable(1);
        	            cell14 = new PdfPCell(new Phrase("RETAIL INVOICE", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell14.setBorder(0);
        	            cell14.setPaddingLeft(2.0f);
        	            headertable2.addCell(cell14);
        	            cell14 = new PdfPCell(new Phrase("ORIGINAL", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell14.setBorder(0);
        	            headertable2.addCell(cell14);
        	            cell14 = new PdfPCell(new Phrase("CASH", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell14.setBorder(0);
        	            headertable2.addCell(cell14);
        	            
        	            cell14= new PdfPCell(headertable2);
        	            cell14.setBorder(0);
        	            cell14.setPadding(8.0f);
        	            headertable.addCell(cell14);  
        	            
        	            cell14= new PdfPCell(new Phrase(""));
        	            cell14.setBorder(0);
        	            cell14.setPaddingLeft(2.0f);
        	            headertable.addCell(cell14);
        	            
        	            doc2.add(headertable);
        	            LineSeparator ls = new LineSeparator();
        	            ls.setLineWidth(2);
        	            doc2.add(new Chunk(ls));
        	         
        	            
        	            try{
        	            	URL imageUrl = Main.class.getResource(
                                    "/resources/2.png");
        	            //	  String imageUrl = "Resources/2.png";
        	            	 Image logo = Image.getInstance(imageUrl);
        	            	 logo.scaleAbsolute(100f, 17f);
        	            	 logo.setAbsolutePosition(260f, 800f);
        	            	
        	            	 URL imageUrl2 = Main.class.getResource(
                                     "/resources/1.jpg");
        	            	// String imageUrl2 = "Resources/1.jpg";
        	            	 Image logo2 = Image.getInstance(imageUrl2);
        	            	 logo2.scaleAbsolute(200f, 50f);
        	            	 logo2.setAbsolutePosition(60f, 735f);
        	            	
        	            	 
        	            
        	            	 
        	            doc2.add(logo);
        	            doc2.add(logo2);
        	       
        	            }
        	            catch(Exception e){
        	                e.printStackTrace();
        	              }
        	            
        	            
        	            // After Header
        	            PdfContentByte cb = writer.getDirectContent();
        	            cb.saveState();
        	            cb.rectangle(16.0f, 10.0f, 562.0f, 820.0f);
        	            
        	            cb.stroke();
        	            cb.restoreState();
        	            doc2.add((Element)new Paragraph("SHRI CHAUDHARY JEWELLERS,Koily Bazar,Sitamarhi,Bihar-843333,INDIA   PH.9534453825,9431400352", FontFactory.getFont((String)"Times-Bold", (float)12.0f)));
        	            doc2.add((Element)new Paragraph("EMAIL: sk1234571@gmail.com", FontFactory.getFont((String)"Times-Bold", (float)9.0f)));
        	            
        	            doc2.add((Element)new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
        	            doc2.add((Element)new Paragraph(""));
        	            com.itextpdf.text.Font f = FontFactory.getFont((String)"Times-Bold", (float)9.0f);
        	            PdfPTable table2 = new PdfPTable(2);
        	            table2.setWidths(new int[]{7, 3});
        	            Paragraph p1 = new Paragraph(16.0f, "NAME: " + Permanentbill.this.name_field.getText() + "\n\n" + "ADDRESS: " + Permanentbill.this.address_field.getText() + "\n\n" + "MOBILE: " + Permanentbill.this.mobile_field.getText(), f);
        	            table2.addCell((Phrase)p1);
        	            String from=((JTextField)billing_date.getDateEditor().getUiComponent()).getText();
        	            p1 = new Paragraph(16.0f, "\nDATE: "  +from+ "\n\n" + "BILL NO: " + Permanentbill.this.bill_no.getText(), f);
        	            table2.addCell((Phrase)p1);
        	         
        	            table2.setWidthPercentage(100.0f);
        	            doc2.add((Element)table2);
        	            doc2.add((Element)new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
        	            PdfPTable pdfTable = new PdfPTable(table.getColumnCount() - 1);
        	            pdfTable.setHorizontalAlignment(1);
        	            pdfTable.setWidths(new float[]{1.2f, 4.5f, 1.0f, 1.0f, 2.2f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f});
        	            pdfTable.setTotalWidth(doc2.getPageSize().getWidth() - 70.0f);
        	            pdfTable.getDefaultCell().setUseAscender(true);
        	            pdfTable.getDefaultCell().setUseDescender(true);
        	            pdfTable.setLockedWidth(true);
        	            PdfPCell cell = new PdfPCell(new Phrase("S.NO", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("ITEMS", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("CRT", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("PCS", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("GROSS.WT", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("NETT.WT", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("METAL RATE", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("LABOUR", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("STONE", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            cell = new PdfPCell(new Phrase("AMOUNT", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell.setHorizontalAlignment(1);
        	            cell.setColspan(1);
        	            pdfTable.addCell(cell);
        	            for (int rows = 0; rows < table.getRowCount(); rows++) {
        	            	 cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                         	cell.setHorizontalAlignment(1);
                             cell.setColspan(1);
                            for (int cols = 0; cols < table.getColumnCount()-1; cols++) {
                            	cell = new PdfPCell(new Phrase(table.getModel().getValueAt(rows, cols).toString(), FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
                	        
                	            cell.setHorizontalAlignment(1);
                	            cell.setColspan(1);
                                pdfTable.addCell(cell);
                                
                            }
                        }
        	            
        	            PdfPTable pdfTable1 = new PdfPTable(table.getColumnCount() - 1);
        	            pdfTable1.setWidths(new float[]{1.2f, 4.5f, 1.0f, 1.0f, 2.2f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f});
        	            pdfTable1.setTotalWidth(doc2.getPageSize().getWidth() - 70.0f);
        	            pdfTable1.getDefaultCell().setUseAscender(true);
        	            pdfTable1.getDefaultCell().setUseDescender(true);
        	            pdfTable1.setLockedWidth(true);
        	            PdfPCell cell1 = new PdfPCell(new Phrase("", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            cell1.setColspan(1);
        	            pdfTable1.addCell(cell1);
        	            cell1 = new PdfPCell(new Phrase("TOTAL", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            cell1.setColspan(1);
        	            pdfTable1.addCell(cell1);
        	            cell1 = new PdfPCell(new Phrase("", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            cell1.setColspan(1);
        	            pdfTable1.addCell(cell1);
        	            cell1 = new PdfPCell(new Phrase(sumpcs_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            cell1.setColspan(1);
        	            pdfTable1.addCell(cell1);
        	            cell1 = new PdfPCell(new Phrase(sumgross_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            cell1.setColspan(1);
        	            pdfTable1.addCell(cell1);
        	            cell1 = new PdfPCell(new Phrase(sumnett_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            cell1.setColspan(1);
        	            pdfTable1.addCell(cell1);
        	            cell1 = new PdfPCell(new Phrase("", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            cell1.setColspan(1);
        	            pdfTable1.addCell(cell1);
        	            cell1 = new PdfPCell(new Phrase("", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            cell1.setColspan(1);
        	            pdfTable1.addCell(cell1);
        	            cell1 = new PdfPCell(new Phrase("", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            cell1.setColspan(1);
        	            pdfTable1.addCell(cell1);
        	            cell1 = new PdfPCell(new Phrase("", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            cell1.setColspan(1);
        	            pdfTable1.addCell(cell1);
        	            
                        doc2.add(pdfTable);
                        doc2.add(pdfTable1);
        	            PdfPTable heighttable = new PdfPTable(1);
        	            cell1 = new PdfPCell();
        	            cell1.setColspan(1);
        	            cell1.setFixedHeight(10.0f);
        	            cell1.setBorder(0);
        	            heighttable.addCell(cell1);
        	            doc2.add((Element)heighttable);
        	            RoundRectangle roundRectangle = new RoundRectangle();
        	            PdfPTable outertable = new PdfPTable(3);
        	            outertable.setWidths(new int[]{20, 1, 8});
        	            outertable.setWidthPercentage(101.0f);
        	            outertable.getDefaultCell().setBorder(0);
        	            PdfPTable innertable = new PdfPTable(1);
        	            PdfPTable inwordstable1 = new PdfPTable(2);
        	            inwordstable1.setWidths(new int[]{4, 16});
        	            PdfPCell cell8 = new PdfPCell(new Phrase("Amount in Words:", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell8.setBorder(0);
        	            cell8.setPaddingLeft(2.0f);
        	            inwordstable1.addCell(cell8);
        	            cell8 = new PdfPCell(new Phrase(Permanentbill.this.int_toword.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell8.setBorder(0);
        	            inwordstable1.addCell(cell8);
        	            cell8 = new PdfPCell();
        	            cell8.setColspan(5);
        	            cell8.setFixedHeight(3.0f);
        	            cell8.setBorder(0);
        	            inwordstable1.addCell(cell8);
        	            cell1 = new PdfPCell(inwordstable1);
        	            cell1.setCellEvent((PdfPCellEvent)roundRectangle);
        	            cell1.setBorder(0);
        	            cell1.setPadding(8.0f);
        	            innertable.addCell(cell1);
        	            PdfPTable receipttable2 = new PdfPTable(2);
        	            PdfPTable cashtable = new PdfPTable(4);
        	            cashtable.setWidths(new int[]{1, 4, 8, 1});
        	            cell8 = new PdfPCell(new Phrase(""));
        	            cell8.setBorder(0);
        	            cell8.setPaddingLeft(2.0f);
        	            cashtable.addCell(cell8);
        	            cell8 = new PdfPCell(new Phrase("Cash:", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell8.setBorder(0);
        	            cell8.setPaddingLeft(2.0f);
        	            cashtable.addCell(cell8);
        	            cell8 = new PdfPCell(new Phrase("Rs. " + Permanentbill.this.received_amount.getText(), FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell8.setBorder(0);
        	            cell8.setPaddingLeft(2.0f);
        	            cashtable.addCell(cell8);
        	            cell8 = new PdfPCell(new Phrase(""));
        	            cell8.setBorder(0);
        	            cell8.setPaddingLeft(2.0f);
        	            cashtable.addCell(cell8);
        	            cell1 = new PdfPCell();
        	            cell1.setColspan(1);
        	            cell1.setFixedHeight(10.0f);
        	            cell1.setBorder(0);
        	            cashtable.addCell(cell1);
        	            cell1 = new PdfPCell(cashtable);
        	            cell1.setCellEvent((PdfPCellEvent)roundRectangle);
        	            cell1.setBorder(0);
        	            cell1.setPadding(8.0f);
        	            receipttable2.addCell(cell1);
        	            PdfPTable credittable = new PdfPTable(4);
        	            credittable.setWidths(new int[]{1, 4, 8, 1});
        	            cell8 = new PdfPCell(new Phrase(""));
        	            cell8.setBorder(0);
        	            cell8.setPaddingLeft(2.0f);
        	            credittable.addCell(cell8);
        	            cell8 = new PdfPCell(new Phrase("Credit:", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell8.setFixedHeight(0.1f);
        	            cell8.setBorder(0);
        	            cell8.setPaddingLeft(2.0f);
        	            credittable.addCell(cell8);
        	            cell8 = new PdfPCell(new Phrase("Rs. " + Permanentbill.this.due_amount.getText(), FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell8.setBorder(0);
        	            cell8.setPaddingLeft(2.0f);
        	            credittable.addCell(cell8);
        	            cell8 = new PdfPCell(new Phrase(""));
        	            cell8.setBorder(0);
        	            cell8.setPaddingLeft(2.0f);
        	            credittable.addCell(cell8);
        	            cell1 = new PdfPCell();
        	            cell1.setColspan(1);
        	            cell1.setFixedHeight(10.0f);
        	            cell1.setBorder(0);
        	            credittable.addCell(cell1);
        	            cell1 = new PdfPCell(credittable);
        	            cell1.setCellEvent((PdfPCellEvent)roundRectangle);
        	            cell1.setBorder(0);
        	            cell1.setPadding(8.0f);
        	            receipttable2.addCell(cell1);
        	            cell1 = new PdfPCell(receipttable2);
        	            cell1.setCellEvent((PdfPCellEvent)roundRectangle);
        	            cell1.setBorder(0);
        	            cell1.setPadding(8.0f);
        	            innertable.addCell(cell1);
        	            PdfPTable remarkstable = new PdfPTable(2);
        	            remarkstable.setWidths(new int[]{4, 16});
        	            cell8 = new PdfPCell(new Phrase("Remarks:", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell8.setBorder(0);
        	            cell8.setPaddingLeft(2.0f);
        	            remarkstable.addCell(cell8);
        	            cell8 = new PdfPCell(new Phrase(Permanentbill.this.remarks_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell8.setBorder(0);
        	            remarkstable.addCell(cell8);
        	            cell8 = new PdfPCell();
        	            cell8.setColspan(5);
        	            cell8.setFixedHeight(3.0f);
        	            cell8.setBorder(0);
        	            remarkstable.addCell(cell8);
        	            cell1 = new PdfPCell(remarkstable);
        	            cell1.setCellEvent((PdfPCellEvent)roundRectangle);
        	            cell1.setBorder(0);
        	            cell1.setPadding(8.0f);
        	            innertable.addCell(cell1);
        	            outertable.addCell(new PdfPCell(innertable));
        	            cell1.setBorder(0);
        	            outertable.addCell("");
        	            PdfPTable innertable3 = new PdfPTable(2);
        	            cell1 = new PdfPCell();
        	            cell1 = new PdfPCell(new Phrase("Discount", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Permanentbill.this.discount_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("VAT%", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Permanentbill.this.vat_percent.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("Taxable Amount", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Permanentbill.this.taxable_amount.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("VAT Amount", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Permanentbill.this.vat_amount.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("Add.VAT Amount", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Permanentbill.this.addvat_amount.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("Rnd Dis/Discount", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Permanentbill.this.rnddiscount_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("Bill Amount", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Permanentbill.this.bill_amount.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("Total Receipt", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Permanentbill.this.totalreceipt_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("Credits", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Permanentbill.this.credits_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("Net Amount", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Permanentbill.this.netamount_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("Previous Ols.", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Permanentbill.this.previous_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase("Balance", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            cell1 = new PdfPCell(new Phrase(Permanentbill.this.balance_field.getText(), FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        	            cell1.setHorizontalAlignment(1);
        	            innertable3.addCell(cell1);
        	            cell1.setFixedHeight(0.1f);
        	            outertable.addCell(new PdfPCell(innertable3));
        	            doc2.add((Element)outertable);
        	            PdfPTable heighttable2 = new PdfPTable(1);
        	            cell1 = new PdfPCell();
        	            cell1.setColspan(1);
        	            cell1.setFixedHeight(10.0f);
        	            cell1.setBorder(0);
        	            heighttable2.addCell(cell1);
        	            doc2.add((Element)heighttable2);
        	         //   doc2.add((Element)new Paragraph("TIME 11-00 AM TO 08-30 PM", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            Phrase phrase = new Phrase();
        	            phrase.add(new Chunk("TIME 11-00 AM TO 08-30 PM",FontFactory.getFont(FontFactory.TIMES_BOLD, 10)));
        	       
        	            phrase.add(new Chunk("     A Place of Diamond & Gold Jewellery",FontFactory.getFont(FontFactory.TIMES_BOLDITALIC,15, BaseColor.ORANGE)));
        	            doc2.add(phrase);
        	           
        	            doc2.add((Element)new Paragraph("CONDITION APPLIED AS MENTIONED BEHIND",FontFactory.getFont(FontFactory.TIMES_ITALIC,10) ));
        	            PdfPTable heighttable3 = new PdfPTable(1);
        	            cell1 = new PdfPCell();
        	            cell1.setColspan(1);
        	            cell1.setFixedHeight(4.0f);
        	            cell1.setBorder(0);
        	            heighttable3.addCell(cell1);
        	            doc2.add((Element)heighttable3);
        	            Paragraph p = new Paragraph(); 
        	            
        	            URL imageUrl3 = Main.class.getResource(
                                "/resources/bis.png");
        	          //  String imageUrl3 = "Resources/bis.png";
   	            	    Image logo3 = Image.getInstance(imageUrl3);
   	            	    logo3.scaleAbsolute(50f, 50f);
        	            p.add(new Chunk(logo3, 190,0, true));   
        	            
        	            URL imageUrl4 = Main.class.getResource(
                                "/resources/3.png");
        	       //	    String imageUrl4 = "Resources/3.png";
	            	    Image logo4 = Image.getInstance(imageUrl4);
	            	    logo4.scaleAbsolute(50f, 50f);
	            	    logo4.scaleAbsolute(50f, 50f);
        	            p.add(new Chunk(logo4, 220,0, true));  
	            	    doc2.add(p); 
	            	    
        	            PdfPTable heighttable31 = new PdfPTable(1);
        	            cell1 = new PdfPCell();
        	            cell1.setColspan(1);
        	            cell1.setFixedHeight(4.0f);
        	            cell1.setBorder(0);
        	            heighttable31.addCell(cell1);
        	            doc2.add((Element)heighttable31);
        	            com.itextpdf.text.Font f1 = FontFactory.getFont(FontFactory.TIMES_BOLD,8, BaseColor.ORANGE);
        	         
        	            doc2.add((Element)new Paragraph("   CUSTOMER'S SIGNATURE                                                                                                       For, SHRI CHAUDHARY JEWELLERS   ", f1));
        	           
        	            //Footer
        	            PdfPTable footertable = new PdfPTable(3);
        	            footertable.setWidths(new int[]{10,13,10});
        	            footertable.setWidthPercentage(101.0f);
        	            footertable.getDefaultCell().setBorder(0);
        	            PdfPCell cell141;
        	            cell141= new PdfPCell(new Phrase(""));
        	            cell141.setBorder(0);
        	            cell141.setPaddingLeft(2.0f);
        	            footertable.addCell(cell141);
        	           
        	            PdfPTable tintable1 = new PdfPTable(1);
        	         
        	            cell141 = new PdfPCell(new Phrase("GST TIN: 10346074013", FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell141.setBorder(0);
        	            cell141.setPaddingLeft(2.0f);
        	            cell141.setBackgroundColor(BaseColor.ORANGE);
        	            tintable1.addCell(cell141);
        	            cell141 = new PdfPCell(new Phrase("CST TIN: 10346074013" , FontFactory.getFont((String)"Times-Bold", (float)10.0f)));
        	            cell141.setBorder(0);
        	            cell141.setPaddingLeft(2.0f);
        	            cell141.setBackgroundColor(BaseColor.ORANGE);
        	            tintable1.addCell(cell141);
        	            
        	            PdfPCell cell343;
        	            cell343 = new PdfPCell(tintable1);
        	            cell343.setCellEvent((PdfPCellEvent)roundRectangle);
        	           
        	            cell343.setBorder(0);
        	            cell343.setPadding(8.0f);
        	            footertable.addCell(cell343);
        	            
        	            cell141= new PdfPCell(new Phrase(""));
        	            cell141.setBorder(0);
        	            cell141.setPaddingLeft(2.0f);
        	            footertable.addCell(cell141);
        	           
        	            doc2.add(footertable);
        	            
        	            doc2.add((Element)new Paragraph("****************************************************************************************************************"));
        	            PdfPTable headertable21 = new PdfPTable(3);
        	           
        	           
        	            cell14= new PdfPCell(new Phrase(""));
        	            cell14.setBorder(0);
        	            cell14.setPaddingLeft(2.0f);
        	            headertable.addCell(cell14);
        	            headertable21.addCell(cell14);
        	            
        	            cell14 = new PdfPCell(new Phrase("Thank You, Please visit us again!!", FontFactory.getFont((String)"Times-Bold", (float)8.0f)));
        	            cell14.setBorder(0);
        	            cell14.setPaddingLeft(2.0f);
        	            headertable21.addCell(cell14);
        	            
        	            cell14= new PdfPCell(new Phrase(""));
        	            cell14.setBorder(0);
        	            cell14.setPaddingLeft(2.0f);
        	            headertable.addCell(cell14);
        	            headertable21.addCell(cell14);
        	            doc2.add(headertable21);
        	            doc2.add((Element)new Paragraph("****************************************************************************************************************"));
        	           
        	            
        	            doc2.close();
        	            System.out.println("done");
        	        }
        	        catch (DocumentException doc2) {
        	        }
        	        catch (FileNotFoundException doc2) {
        	            // empty catch block
        	        } catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
        		  Desktop desktop = Desktop.getDesktop();
        		    try {
        		           desktop.print(new File("PInvoice.pdf"));
        		    } catch (IOException e) {
        		        e.printStackTrace();
        		    }
        		  
        		      
 
        	}
        });
      
		
	}
	   
       private void initComponents() {
		// TODO Auto-generated method stub
		
	}
       public  void amountCalculations(){
    	   try{
   			float i = Float.parseFloat(net_field.getText());
   			float j=Float.parseFloat(metal_field.getText());
   			
   			if(stone_field.getText().equals("")) {
   				stone_field.setText("0");;
   		    }
   			float k=Float.parseFloat(stone_field.getText());
   			float l=Float.parseFloat(labour_field.getText());
   			float o=(i*j)+k+l;
   			amount_field.setText(Float.toString(o));
       }
      	  catch(Exception e){
      		  
      	  }
       }
       private void update(){
    	   
       }
       public static void OnClick(JTable table,JTextField item_field, JTextField crt_field, JTextField pcs_field,
               JTextField gross_field, JTextField net_field, JTextField metal_field, 
               JTextField labour_field,
               JTextField stone_field, JTextField amount_field, JTextField trx_field)
   	{
   
   			//System.err.println("2424"+value10);
   	  }
}