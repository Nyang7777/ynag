package day15.com.ict.edu5;

import javax.swing.JFrame;

public class Ex02_swing extends JFrame{
	
	public Ex02_swing() {
		super("Swing으로 만드 창");
		setSize(300, 300);
		setLocation(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		//Ex02_swing test = new Ex02_swing();
		new Ex02_swing();
		
	}
}
