package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Ex10_Green extends JPanel {
	public Ex10_Green() {
		setBackground(Color.GREEN);
		
		JCheckBox jck1 = new JCheckBox("+");
		JCheckBox jck2 = new JCheckBox("-");
		JCheckBox jck3 = new JCheckBox("*");
		JCheckBox jck4 = new JCheckBox("/");
		
		add(jck1);
		add(jck2);
		add(jck3);
		add(jck4);
	}
}
