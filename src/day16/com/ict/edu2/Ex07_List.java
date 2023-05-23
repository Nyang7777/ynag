package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Ex07_List extends JFrame {
	public Ex07_List() {
		super("리스트");
		
		JPanel jp = new JPanel();
		
		
		String[] items = {"농구","야구","배구","축구"};
		JList<String> jlist = new JList<>(items);
		
		jp.add(jlist);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex07_List();
	}
}
