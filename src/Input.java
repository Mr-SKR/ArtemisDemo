import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//Akhil Krishna 10:20 AM Tuesday, 11 October 2016 (IST)
public class Input {

	private JFrame frame;
	private JTextField textField;

	/*
	 * Launch the application.
	 */
	public static void Inputscreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Input window = new Input();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the application.
	 */
	public Input() {
		initialize();
	}

	/*
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 495, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel Background = new JLabel("Welcome"); // Background label
		Background.setBounds(0, 0, 479, 330);
		Image img = new ImageIcon(this.getClass().getResource("/Background2.png")).getImage();
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField(); // User Input Field
		textField.setBackground(new Color(204, 255, 153));
		textField.setBounds(76, 286, 326, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		Background.setIcon(new ImageIcon(img));
		frame.getContentPane().add(Background);
		sqlconnect.sqlcon();
	}
}
