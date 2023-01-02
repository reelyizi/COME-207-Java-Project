import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIManager {
	GUIManager(int x, int y){
		
		JLabel label = JTypeBuilder.CreateLabel("DENEME", null, JLabel.TOP);	
		
		JPanel panelTop = JTypeBuilder.CreatePanel(Color.red, x,y / 4);
		JPanel panelTopInner = JTypeBuilder.CreateBankPanel(x,y / 10, 20);

		JFrame frame =  JTypeBuilder.CreateFrame(x,y);
		//frame.add(label);
		panelTop.add(label);
		panelTop.add(panelTopInner);
		
		frame.add(panelTop);
		
		System.out.println("Frame Created");
	}
}
