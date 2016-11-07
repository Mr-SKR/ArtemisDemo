// Akhil Krishna 10:20 AM Tuesday, 11 October 2016 (IST)
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alpha {
	
	public static String Input="";
	public static int emoval_local=0;
	private JFrame frame;
	private JTextField textField;

	/*
	 * 
	 *  Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alpha window = new Alpha();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Alpha() {
		initialize(); //call function
	}

	/*
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Alpha.class.getResource("/1141.png")));
		frame.getContentPane().setBackground(new Color(153, 51, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 495, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(126, 29, 246, 239);
		Image img = new ImageIcon(this.getClass().getResource("/5.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel);
		Image back = new ImageIcon(this.getClass().getResource("/Background.png")).getImage();
		
		
		textField = new JTextField(); // User Input Field
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(153, 102, 255));
		textField.setBounds(76, 286, 352, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Background = new JLabel(""); // Background Label
		Background.setBounds(0, 0, 489, 340);
		Background.setIcon(new ImageIcon(back));
		frame.getContentPane().add(Background);
		
		
		
		textField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent Arg0)
				{	
					   Input = textField.getText();				  
					   emoval_local=UserSplit.splittext(Input);
					   textField.setText("");
					   
					   if (emoval_local==9)
					   {
					
						   Image img = new ImageIcon(this.getClass().getResource("/9.png")).getImage();
						   lblNewLabel.setIcon(new ImageIcon(img));
						   frame.getContentPane().add(lblNewLabel);
						   frame.getContentPane().add(Background);
						   
					   }
					   else if(emoval_local==8)
					   {
						   Image img = new ImageIcon(this.getClass().getResource("/8.png")).getImage();
						   lblNewLabel.setIcon(new ImageIcon(img));
						   frame.getContentPane().add(lblNewLabel);
						   frame.getContentPane().add(Background);
						   
					   }
					   else if(emoval_local==7)
					   {
						   Image img = new ImageIcon(this.getClass().getResource("/7.png")).getImage();
						   lblNewLabel.setIcon(new ImageIcon(img));
						   frame.getContentPane().add(lblNewLabel);
						   frame.getContentPane().add(Background);
						   
					   }
					   else if(emoval_local==6)
					   {
						   Image img = new ImageIcon(this.getClass().getResource("/6.png")).getImage();
						   lblNewLabel.setIcon(new ImageIcon(img));
						   frame.getContentPane().add(lblNewLabel);
						   frame.getContentPane().add(Background);
						   
					   }
					   
					   else if(emoval_local==5)
					   {
						   Image img = new ImageIcon(this.getClass().getResource("/5.png")).getImage();
						   lblNewLabel.setIcon(new ImageIcon(img));
						   frame.getContentPane().add(lblNewLabel);
						   frame.getContentPane().add(Background);
						   
					   }
					   
					   else if(emoval_local==4)
					   {
						   Image img = new ImageIcon(this.getClass().getResource("/4.png")).getImage();
						   lblNewLabel.setIcon(new ImageIcon(img));
						   frame.getContentPane().add(lblNewLabel);
						   frame.getContentPane().add(Background);
						   
					   }
					   
			
					   
					   else if(emoval_local==3)
					   {
						   Image img = new ImageIcon(this.getClass().getResource("/3.png")).getImage();
						   lblNewLabel.setIcon(new ImageIcon(img));
						   frame.getContentPane().add(lblNewLabel);
						   frame.getContentPane().add(Background);
						   
					   }
					   else if(emoval_local==2)
					   {
						   Image img = new ImageIcon(this.getClass().getResource("/2.png")).getImage();
						   lblNewLabel.setIcon(new ImageIcon(img));
						   frame.getContentPane().add(lblNewLabel);
						   frame.getContentPane().add(Background);
						   
					   }
					   else if(emoval_local==1)
					   {
						   Image img = new ImageIcon(this.getClass().getResource("/1.png")).getImage();
						   lblNewLabel.setIcon(new ImageIcon(img));
						   frame.getContentPane().add(lblNewLabel);
						   frame.getContentPane().add(Background);
						   
					   }
			}
		});		
	}
} 
