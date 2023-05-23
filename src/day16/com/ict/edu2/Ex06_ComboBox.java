package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_ComboBox extends JFrame{
	public Ex06_ComboBox() {
		super("콤보박스");
		
		JPanel jp = new JPanel();
		
		// 콤보박스에 들어갈 내용을 배열로 만든다
		String[] items = {"좋아하는 운동","축구","야구","농구","배구"};
		JComboBox<String> jcom = new JComboBox<>(items/*그리고 넣는다*/);
		
		// 특정항목 먼저 나오게하는 방법
		jcom.setSelectedIndex(3);
		jp.add(jcom);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setVisible(true);
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex06_ComboBox();
	}
}
