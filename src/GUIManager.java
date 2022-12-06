import java.awt.Color;

import javax.swing.JFrame;

public class GUIManager {
	GUIManager(){
		JFrame frame = new JFrame(); // Create a frame
		frame.setTitle("Title"); // Frame title
		frame. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		frame.setResizable(false); //prevent frame from being resized
		frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame
		frame.setVisible(true); //make frame visible

		frame. getContentPane().setBackground(Color.white); //change color of background
	}
}
