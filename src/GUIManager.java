import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIManager {
	GUIManager(){
		
		JLabel label = CreateLabel("DENEMEEEEEEEE", null, JLabel.TOP);				
		
		JFrame frame =  CreateFrame();
		frame.add(label);
	}


	public JFrame CreateFrame() {
		JFrame frame = new JFrame(); // Create a frame
		frame.setTitle("Title"); // Frame title
		frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		frame.setResizable(false); //prevent frame from being resized
		frame.setSize(800,800); //sets the x-dimension, and y-dimension of frame
		frame.setVisible(true); //make frame visible

		frame. getContentPane().setBackground(new Color(100,100,100)); //change color of background
		return frame;
	}
	
	
	public JLabel CreateLabel(String text, Integer horizontalPosition, Integer verticalPosition) {
		JLabel label = new JLabel();
		label.setText(text);
		if(horizontalPosition != null)label.setHorizontalAlignment(horizontalPosition);
		if(verticalPosition != null)label.setVerticalAlignment(verticalPosition);
		return label;
	}
}
