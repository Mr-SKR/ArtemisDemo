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
public static int sqlcon()
	{
	
	
	
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/XXXX","XXXXX","XXXXXXXXXX");
			//JOptionPane.showMessageDialog(null,con); //debug code
			 String sql = "SELECT * FROM "; //used for debugging
			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery(sql);
		      // Extract data from result set
		      while(rs.next()){
		         //Retrieve data
		      }	    
		      rs.close(); //close db connection
		     
		}
		   catch(Exception e)
			{
			   //JOptionPane.showMessageDialog(null,e.getMessage());
			}
		finally
		{
			 
		}
		return 0; //to return something something;
			
	}
}