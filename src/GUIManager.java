import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GUIManager {

	static JLabel bankText;

	GUIManager(int x, int y) {

		JLabel label = JTypeBuilder.CreateLabel("DENEME", null, JLabel.TOP);
		bankText = JTypeBuilder.CreateLabel("", null, JLabel.TOP);

		JPanel panelTop = JTypeBuilder.CreatePanel(Color.red, 0, 0, x, y / 4);
		JPanel panelTopInner = JTypeBuilder.CreateBankPanel(x, y / 10, 20);

		JPanel panelBottom = JTypeBuilder.CreatePanel(Color.blue, 0, y / 4, x, y - y / 4);
		panelBottom.setLayout(new BorderLayout(0, 0));

		JPanel calculationButtonPanel = JTypeBuilder.CreateCalculationButtonsPanel(Color.gray, x/3);		
		
		JPanel calculationPanel = JTypeBuilder.CreatePanel(Color.orange, 0, 100, 0, 0);
		
		calculationPanel.setPreferredSize(new Dimension(x-x/3, 0));
		
		bankText.setBounds(500,15,x-x/3,0);
		calculationPanel.add(bankText);
		
		JLabel MusteriTipLabel = JTypeBuilder.CreateLabel("Müşteri Tipi",0, 0);
		
		JPanel krediHesaplamaAraci = JTypeBuilder.CreatePanel(Color.gray, 0, 50, 0, 0);
		krediHesaplamaAraci.setBorder(BorderFactory.createEmptyBorder( 50,  0,  0,  0));
		krediHesaplamaAraci.setPreferredSize(new Dimension((x-x/3) - 100, 0));
		krediHesaplamaAraci.add(MusteriTipLabel);
		
		calculationPanel.add(krediHesaplamaAraci);

		JFrame frame = JTypeBuilder.CreateFrame(x, y);
		// frame.add(label);
		panelTop.add(label);
		panelTop.add(panelTopInner);

		panelBottom.add(calculationButtonPanel, BorderLayout.WEST);
		panelBottom.add(calculationPanel, BorderLayout.EAST);		
		

		frame.add(panelTop);
		frame.add(panelBottom);

		System.out.println("Frame Created");
	}
}
