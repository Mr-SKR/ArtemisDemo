//Akhil Krishna 10:40 AM Sunday, 23 October 2016 (IST)


import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.image.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import java.awt.Component;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Panel;
import java.awt.Canvas;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFormattedTextField;
import java.awt.SystemColor;

public class UserSplit { 
	

   public static int splittext(String str)
   {  
	   int emoval=0;
	   int emovalsum=0;
	   int count=0;
      for (String retval: str.split(" "))
      {
    	  emoval=sqlconnect.sqlcon(retval);
    	  emovalsum+=emoval;
    	  count++;   	 
      }    
      emovalsum=emovalsum/count;   
      //JOptionPane.showMessageDialog(null,emovalsum);
      return emovalsum;
     
}
  
   
}