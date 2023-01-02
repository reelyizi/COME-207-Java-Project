import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KrediHesaplamaPanel {

	static JPanel krediHesaplamaAraci;
	
	public static JPanel KrediHesaplamaPanel() {
		JLabel MusteriTipLabel = JTypeBuilder.CreateLabel("Müşteri Tipi: Bireysel", 0, 0);

		krediHesaplamaAraci = JTypeBuilder.CreatePanel(Color.gray, 0, 0, 0, 0);
		//krediHesaplamaAraci.setBorder(BorderFactory.createEmptyBorder(-50, 0, 0, 0));
		//krediHesaplamaAraci.setPreferredSize(new Dimension(435, 0));
		krediHesaplamaAraci.add(MusteriTipLabel);
		
		return krediHesaplamaAraci;
		// calculationPanel.add(krediHesaplamaAraci);
	}
}
