import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class SettingsDAO {
	public static void passwordSetup(JTextField user_na,JTextField password,JTextField password_update1,
			JTextField password_update2){
		Connection con=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try{
	    	  String uname = user_na.getText();
			    String passsw = password.getText();
			    String newpass = password_update1.getText();
			    String conpass = password_update2.getText();

		    con =ConnectionUtility.getConnection();
			String user="Select * from  cjwellers.user";
			st = con.prepareStatement(user);
			  rs = st.executeQuery();
			  if(rs.next())
					{
					  String usrname = rs.getString("user_name");
					  String passwd = rs.getString("pass");
					      if(uname.equals(usrname) && passsw.equals(passwd))
					          {
                                 if(newpass.equals(conpass))
					                {
                                	 Connection con1=null;
                               		PreparedStatement st1=null;
                               		ResultSet rs1=null;
					        try{
					       	
					                			
					        	con1 =ConnectionUtility.getConnection();
					        	String update= "update cjwellers.user set pass = '"+password_update1.getText()+"'";
						          st1 = con1.prepareStatement(update);
						        	st1.executeUpdate(update);
						          JOptionPane.showMessageDialog(null,"Updated Successfully !!");			 
					            }
						        
	 catch(Exception ex){
			                		        	 
			              }
					                }
			                else
			                {
			                    JOptionPane.showMessageDialog(null, "PLEASE CONFIRM PASSWORD");
			                }
					      }
			            else if(uname.equals("") && passsw.equals("") && newpass.equals(""))
			            {
			                JOptionPane.showMessageDialog(null, "PLEASE ENTER ALL INFORMATION");
			            }
			            else
			            {
			                JOptionPane.showMessageDialog(null, "USERNAME NOT FOUND");
			            }
			        }
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		
		}
	    finally {
		ConnectionUtility.closeConnection(con, st, rs);
	        }
}
	public static void taxSetup(JTextField service_tax,JTextField swachh_bharat,JTextField education_cess,
			JTextField sales_tax,JTextField vat,JTextField custom_duty,JTextField others){
		Connection con=null;
		PreparedStatement st=null;
		ResultSet rs=null;
	      try{
	          con=ConnectionUtility.getConnection();  
	        String taxx=  "update cjwellers.tax_configuration set service_tax = '"+service_tax.getText()+"',"
	        		        + "swachch_bahart_tax='"+swachh_bharat.getText()+"',education_cess='"+education_cess.getText()+"',"
	        				+ "sales_tax='"+sales_tax.getText()+"',vat='"+vat.getText()+"',"
	        		        + "custom_dty_tax='"+custom_duty.getText()+"',others='"+others.getText()+"'";
	        st = con.prepareStatement(taxx);
	        st.executeUpdate(taxx);
	          JOptionPane.showMessageDialog(null,"Updated Successfully !!");
	      }catch(Exception ex){
	          JOptionPane.showMessageDialog(null,ex.getMessage());
	      }
	      finally {
	  		ConnectionUtility.closeConnection(con, st, rs);
	  	}
	}
	
	public static void taxData(JTextField service_tax,JTextField swachh_bharat,JTextField education_cess,
			                   JTextField sales_tax, JTextField vat,JTextField custom_duty,
			                   JTextField others
			                     ){
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet set=null;
	      try{
	          connection=ConnectionUtility.getConnection();  
	         String validate= "SELECT * FROM cjwellers.tax_configuration";
		//	String validate ="SELECT service_tax,swachch_bahart_tax,education_cess,sales_tax,vat,custom_dty_tax,others FROM cjwellers.tax_configuration";
			statement=connection.prepareStatement(validate);
			set=statement.executeQuery();
			if(set.next())
			{
				String value1 = set.getString("service_tax");
				String value2 = set.getString("swachch_bahart_tax");
				String value3 = set.getString("education_cess");
				String value4 = set.getString("sales_tax");
				String value5 = set.getString("vat");
				String value6 = set.getString("custom_dty_tax");
				String value7 = set.getString("others");
				
				service_tax.setText(value1); 
		        swachh_bharat.setText(value2); 
		        education_cess.setText(value3); 
		        sales_tax.setText(value4); 
		        vat.setText(value5); 
		        custom_duty.setText(value6); 
		        others.setText(value7); 
		       
				connection.close();
			}
			else
			{
				
			}
			 

		} catch (SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		finally {
	  		ConnectionUtility.closeConnection(connection, statement, set);
	  	}
	  }


}
