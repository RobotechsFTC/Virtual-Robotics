import java.awt.Canvas;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;

public class GUI {

	private JFrame frame;
	private MyPanel panel;
	public static Image head;
	public static Image blankhead;
	public static Image bg;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try{
            URL imagePath = MyPanel.class.getResource("head.png");
            head=Toolkit.getDefaultToolkit().getImage(imagePath);
        }catch(Exception e){
             
        }
        try{
            URL imagePath = MyPanel.class.getResource("headblank.png");
            blankhead=Toolkit.getDefaultToolkit().getImage(imagePath);
        }catch(Exception e){
             
        }
        try{
            URL imagePath = MyPanel.class.getResource("scouting image.png");
            bg=Toolkit.getDefaultToolkit().getImage(imagePath);
        }catch(Exception e){
             
        }
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 968, 729);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		final MyPanel panel = new MyPanel();
		panel.setBounds(115, 123, 410, 410);
		panel.paintComponent(panel.getGraphics());
		frame.getContentPane().add(panel);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(627, 59, 379, 608);
		frame.getContentPane().add(textArea);
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setMargin(new Insets(10, 10, 10, 10));
		JLabel lblCodeGoesHere = new JLabel("Code");
		lblCodeGoesHere.setBackground(Color.BLACK);
		lblCodeGoesHere.setBounds(625, 11, 317, 36);
		frame.getContentPane().add(lblCodeGoesHere);
		lblCodeGoesHere.setFont(new Font("Calibri", Font.PLAIN, 29));
		lblCodeGoesHere.setForeground(Color.WHITE);
		lblCodeGoesHere.setHorizontalAlignment(SwingConstants.CENTER);

		
		JButton btnNewButton = new JButton("Run Code");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.moveRht(50);
			}
		});
		btnNewButton.setBounds(627, 667, 325, 23);
		frame.getContentPane().add(btnNewButton);
		
        System.out.println(bg);
	}
}
