import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JTypeBuilder {

	public static JFrame CreateFrame(int x, int y) {
		JFrame frame = new JFrame(); // Create a frame
		frame.setTitle("Money Is Money"); // Frame title
		frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		frame.setResizable(false); //prevent frame from being resized
		frame.setSize(x,y); //sets the x-dimension, and y-dimension of frame
		frame.setVisible(true); //make frame visible
		frame.setLayout(null);

		frame. getContentPane().setBackground(new Color(100,100,100)); //change color of background
		return frame;
	}
	
	/**
	* Create label by given text and location
	* */
	public static JLabel CreateLabel(String text, Integer horizontalPosition, Integer verticalPosition) {
		JLabel label = new JLabel();
		label.setText(text);
		
		if(horizontalPosition != null)label.setHorizontalAlignment(horizontalPosition);
		if(verticalPosition != null)label.setVerticalAlignment(verticalPosition);		
		
		return label;
	}
	
	/**
	* Create panel by given color and size
	* */
	public static JPanel CreatePanel(Color backgroundColor, int x, int y) {
		JPanel jPanel = new JPanel();
		jPanel.setBackground(backgroundColor);
		jPanel.setBounds(0,0,x, y);
		
		return jPanel;
	}
	
	/**
	* Create panel with new dimension and buttons
	* */
	public static JPanel CreatePanel(int width, int height, int padding) {
		JPanel jPanel = new JPanel();
		jPanel.setPreferredSize(new Dimension(width,height));
		
		jPanel.setLayout(new GridLayout(1,4, padding ,padding));
		
		jPanel.add(new JButtonBuilder("Akbank"));
		jPanel.add(new JButtonBuilder("Yapı Kredi"));
		jPanel.add(new JButtonBuilder("Ziraat"));
		jPanel.add(new JButtonBuilder("HSBC"));
		
		return jPanel;
	}
}
