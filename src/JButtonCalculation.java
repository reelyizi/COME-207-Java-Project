import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JButtonCalculation extends JButton{
	JButtonCalculation(String text, KrediHesaplamaPanel mp){
		this.setText(text);		
					
		this.addActionListener(e -> {			
			if(!HasPanelComponent(mp.krediHesaplamaAraci)) {
				
				System.out.println(text + " created  " + mp.krediHesaplamaAraci);
				GUIManager.calculationPanel.add(mp.krediHesaplamaAraci);
				GUIManager.RefreshFrame();
			}
		});
		
		this.setBorderPainted(true); // set border outline while clicking
		this.setContentAreaFilled(false);

	}
	
	private boolean HasPanelComponent(JPanel panel) {
		if(panel == null || panel.equals(null)) {
			KrediHesaplamaPanel.krediHesaplamaAraci = KrediHesaplamaPanel.KrediHesaplamaPanel();
			return false;
		}

		return true;
	}
}
