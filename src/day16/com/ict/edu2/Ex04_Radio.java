package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex04_Radio extends JFrame{
	public Ex04_Radio() {
		super("라디오");
		
		JPanel jp = new JPanel();
		
		JRadioButton jpb1 = new JRadioButton();
		jpb1.setText("야구");
		jpb1.setSelected(true);
		
		JRadioButton jpb2 = new JRadioButton("축구",true);
		JRadioButton jpb3 = new JRadioButton("농구");
		JRadioButton jpb4 = new JRadioButton("배구");
		
		// 라디오 버튼은 체크박스와 다르게 여러개 선택지중에서 하나만 되야한다
		// 그러기위해서 라디오 버튼을 ButtonGroup에 넣어야한다
		// 하나만 고르는 버튼 기능
		ButtonGroup bg = new ButtonGroup();
		bg.add(jpb1);
		bg.add(jpb2);
		bg.add(jpb3);
		bg.add(jpb4);
		// 선택지 보여주기
		// 위 아래 둘 다 있어야됨
		jp.add(jpb1);
		jp.add(jpb2);
		jp.add(jpb3);
		jp.add(jpb4);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-300, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex04_Radio();
	}
}
