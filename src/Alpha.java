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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Alpha.class.getResource("/com/sun/java/swing/plaf/windows/icons/image-delayed.png")));
		frame.getContentPane().setBackground(new Color(153, 51, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 495, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcome = new JLabel("EMOTIO\r\n");   //Initial Text Label
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBackground(new Color(135, 206, 250));
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblWelcome.setBounds(153, 47, 161, 78);
		frame.getContentPane().add(lblWelcome);
		
		
		JLabel Background = new JLabel("Welcome"); // Background Label
		Background.setBounds(0, 0, 489, 340);
		Image img = new ImageIcon(this.getClass().getResource("/Background.png")).getImage();
		
		textField = new JTextField(); // User Input Field
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(new Color(255, 255, 255));
		textField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent Arg0)
				{	
					   Input = textField.getText();				  
					   emoval_local=UserSplit.splittext(Input);
			}
		});
		textField.setBackground(new Color(153, 102, 255));
		textField.setBounds(76, 286, 352, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		Background.setIcon(new ImageIcon(img));
		frame.getContentPane().add(Background);
		
		
	}
} 
