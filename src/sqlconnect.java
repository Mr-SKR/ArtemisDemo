//Akhil Krishna 10:40 AM Sunday, 23 October 2016 (IST)
import java.awt.EventQueue;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;


public class sqlconnect {
	public static int ret=0;
public static int sqlcon(String str)
 {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/artemis","root","3jy6bDMLRFq8uVzD");
			//JOptionPane.showMessageDialog(null,"sql"); //debug code
			 String sql = "SELECT * FROM emoba where EmoWord='"+str+"'"; 
			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery(sql);
			 //JOptionPane.showMessageDialog(null,sql);
		      // Extract data from result set
		      while(rs.next()){
		         //Retrieve data
		    	  int emoval  = rs.getInt("emoval");
		    	  ret=emoval;		    	  
		      }	    
		      rs.close(); //close db connection
		     
		}
		   catch(Exception e)
			{
			  
			}
		finally
		{
			 
		}
		return ret;//to return something something;
			
	}
}
