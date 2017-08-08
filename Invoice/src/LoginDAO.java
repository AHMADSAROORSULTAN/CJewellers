import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class LoginDAO {
	public static boolean  loginDetails (String validate_username,String validate_password)
	{
		
	
	Connection connection=null;
	PreparedStatement statement=null;
	ResultSet set=null;
	try {
		connection =ConnectionUtility.getConnection();
		String validate ="select * from cjwellers.user where user_name=? and pass=?";
		statement=connection.prepareStatement(validate);
		
		statement.setString(1,validate_username);
		statement.setString(2,validate_password);
		set=statement.executeQuery();
		if(set.next())
		{
			return true;
			
		}
		else
		{
			return false;
		}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block 
		e.printStackTrace();
	}
	finally {
		ConnectionUtility.closeConnection(connection, statement, set);
	}
	return false;
	}

	private static void dispose() {
		// TODO Auto-generated method stub
		
	}

	public static void fetchPassword(String validate_username,JTextField pass_field1){
		 
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet set=null;
		try {
			connection =ConnectionUtility.getConnection();
			String validate ="select * from cjwellers.user where user_name=? ";
			statement=connection.prepareStatement(validate);
			statement.setString(1,validate_username);
			set=statement.executeQuery();
			if(set.next())
			{
				pass_field1.setText(set.getString("pass"));
				
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please fill your username correctly !");
			}
		}
			catch (SQLException e) {
				// TODO Auto-generated catch block 
				e.printStackTrace();
			
			}
		finally {
			ConnectionUtility.closeConnection(connection, statement, set);
		}
		}
	
	
	

}
