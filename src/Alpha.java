import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
// Akhil Krishna 10:20 AM Tuesday, 11 October 2016 (IST)
public class Alpha {
	
	private JFrame frame;

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
		
		JLabel lblWelcome = new JLabel("Hi There!\r\n");   //Initial Text Label
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBackground(new Color(135, 206, 250));
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblWelcome.setBounds(176, 180, 161, 78);
		frame.getContentPane().add(lblWelcome);
		
		JLabel lblArtemis = new JLabel("Artemis_v0.1"); // Version Label
		lblArtemis.setBounds(410, 311, 79, 29);
		frame.getContentPane().add(lblArtemis);
		
		JButton btnNewButton = new JButton("Continue"); // Button On First Screen
		btnNewButton.setSelectedIcon(null);
		btnNewButton.setIcon(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose(); //Closes First Screen
				Input newbox = new Input();
				newbox.Inputscreen(); // Creates Input Screen : refer "Input.java"
				
				
			}
		});
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.setBounds(186, 239, 136, 42);
		frame.getContentPane().add(btnNewButton);
		
		
		JLabel Background = new JLabel("Welcome"); // Background Label
		Background.setBounds(0, 0, 489, 340);
		Image img = new ImageIcon(this.getClass().getResource("/Background.png")).getImage();
		Background.setIcon(new ImageIcon(img));
		frame.getContentPane().add(Background);
		
		
	}
} 
