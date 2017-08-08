import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import com.toedter.calendar.JDateChooser;


public class ExpenseDAO {

	/*public static void expenseDetails(JTextField amt_field,JTextField comment_field,JComboBox<String> expense_type,JComboBox<String>month_field,Date Date){
		Connection connection= null;
		PreparedStatement statement=null;
		ResultSet set1=null;
		try{
			connection=ConnectionUtility.getConnection();
			String expensedetails = "insert into cjwellers.expense(typeofexpense,amount,date,month,comment)"
		      		+ " values(?,?,?,?,?) ";
			statement=connection.prepareStatement(expensedetails);
			String expenseType=expense_type.getSelectedItem().toString();
			String monthType= month_field.getSelectedItem().toString();
			statement.setString(1,expenseType);
			statement.setString(2,amt_field.getText());
			statement.setString(3,((JTextField)Date.getDateEditor().getUiComponent()).getText());
			statement.setString(4,monthType);
			statement.setString(5,comment_field.getText());
			
			statement.execute();
			JOptionPane.showMessageDialog(null, "Saved");
		}
		
	catch (SQLException e) {
  		// TODO Auto-generated catch block 
  		e.printStackTrace();
  	}
finally {
		ConnectionUtility.closeConnection(connection, statement, set1);
	}
  	
      
}
	*/
public static void OnClickExpensetable(JTable table,JTextField expenseid__field,
		                                    JComboBox <String> expense_type,
		                                    JTextField update_amount_field,
		                             //       JDateChooser date_field ,
		                                JComboBox<String> month_field,
		                                JTextField update_comment_field){
	int row=table.getSelectedRow();
	String value1=(table.getModel().getValueAt(row,0).toString());
	String value2=(table.getModel().getValueAt(row,1).toString());
	String value3=(table.getModel().getValueAt(row,2).toString());
//	String value4=(table.getModel().getValueAt(row,3).toString());
	String value5=(table.getModel().getValueAt(row,4).toString());
	String value6=(table.getModel().getValueAt(row,5).toString());
	
	
	         expenseid__field.setText(value1);
	         expense_type.addItem(value2);
	        update_amount_field.setText(value3);
	//        date_field.setDateFormatString(value4);
            month_field.addItem(value5);
			update_comment_field.setText(value6);
			
}

}
