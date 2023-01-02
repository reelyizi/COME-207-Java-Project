import javax.swing.JButton;

public class JButtonBuilder extends JButton {
	
	JButtonBuilder(String text){
		this.setText(text);		
					
		this.addActionListener(e -> {
			System.out.println(text);
			GUIManager.bankText.setText(text);
		});
		
		this.setBorderPainted(true); // set border outline while clicking
		this.setContentAreaFilled(false);

	}
}