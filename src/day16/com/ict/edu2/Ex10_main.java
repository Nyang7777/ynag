package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Ex10_main extends JFrame {
	public Ex10_main() {
		super("JTba_2");
		
		// JPanel을 상속한 클래스 객체로 만든다
		Ex10_Green green = new Ex10_Green();
		Ex10_Cyan cyan = new Ex10_Cyan();
		Ex_10Bule blue = new Ex_10Bule();
		
		// JPanel들을 JTab에 넣기
		JTabbedPane jtab = new JTabbedPane();
		jtab.addTab("그린", green);
		jtab.addTab("시안", cyan);
		jtab.addTab("블루", blue);
		
		// JTab을 JFrame에 넣자
		add(jtab);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		new Ex10_main();

	}
}
