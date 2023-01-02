import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class GUIManager {

	static JLabel bankText;
	static JPanel calculationPanel;
	static JFrame frame;

	GUIManager(int x, int y) {

		JLabel label = JTypeBuilder.CreateLabel("DENEME", null, JLabel.TOP);
		bankText = JTypeBuilder.CreateLabel("", null, JLabel.TOP);

		JPanel panelTop = JTypeBuilder.CreatePanel(Color.red, 0, 0, x, y / 4);
		JPanel panelTopInner = JTypeBuilder.CreateBankPanel(x, y / 10, 20);

		JPanel panelBottom = JTypeBuilder.CreatePanel(Color.blue, 0, y / 4, x, y - y / 4);
		panelBottom.setLayout(new BorderLayout(0, 0));

		JPanel calculationButtonPanel = JTypeBuilder.CreateCalculationButtonsPanel(Color.gray, x / 3);

		calculationPanel = JTypeBuilder.CreatePanel(Color.orange, 0, 100, 0, 0);
		calculationPanel.setLayout(new GridLayout(12, 1, 10, 0));
		calculationPanel.setPreferredSize(new Dimension(x - x / 3, 0));

		JPanel calculationButtonPanelInnerTop = JTypeBuilder.CreatePanel(Color.orange, 0, 0, x - x / 3, 15);
		calculationButtonPanelInnerTop.add(bankText);
		
		calculationPanel.add(calculationButtonPanelInnerTop);

		frame = JTypeBuilder.CreateFrame(x, y);
		// frame.add(label);
		panelTop.add(label);
		panelTop.add(panelTopInner);

		panelBottom.add(calculationButtonPanel, BorderLayout.WEST);
		panelBottom.add(calculationPanel, BorderLayout.EAST);

		frame.add(panelTop);
		frame.add(panelBottom);

		System.out.println("Frame Created");
	}

	public static void RefreshFrame() {
		SwingUtilities.updateComponentTreeUI(frame);

	}
}
