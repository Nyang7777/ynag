package day19.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01_ActionEvent extends JFrame implements ActionListener {
	// 이벤트: 사용자가 어떠한 행동, 동작을 하는것을 말한다
	// 이벤트 소스: 이벤트가 발생되는 컴포넌트(버튼,체크박스 등)
	// 이벤트 리스너: 이벤트 감지, 이벤트가 발생되면 실제적으로 이벤트를 처리할 수 있도록 만든 인터페이스
	// 이벤트 핸들러: 리스너에 전달된 이벤트를 실제로 처리할 수 있도록 이벤트 리스너에 포함되어 있는 메서드(추상메서드)
	//				발생된 이벤트 객체를 받아서 실제적으로 처리해주는 기능을 하는 메서드
	
	// ActionEvent: 컴포넌트를 누렀거나, 선택되었을 때, 엔터키를 눌렀을 때 발생하는 이벤트
	// ActionListener: ActionPerformed()추상 메서드를 갖고있다
	// addActionListener: 컴포넌트에 ActionListener를 추가해서 이벤트를 감지할 수 있도록 하는 메서드
	
	JPanel jp;
	JButton jb1, jb2, jb3;
	
	public Ex01_ActionEvent() {
		super("Actionevent");
		
		jp = new JPanel();
		jb1 = new JButton("입력1");
		jb2 = new JButton("입력2");
		jb3 = new JButton("EXIT");
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-50, 300, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		// 이벤트 소스에 리스너를 붙이자
		// this -> 현재 객체에 ActionListener가 있다
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	
	}
	
	// ActionListener일때 이벤트 처리를 받아서 실제 처리해주는 메서드
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("버튼 누름");
		JButton obj = (JButton) e.getSource();
		if (obj == jb1) {
			System.out.println("1번 누름");	
		} else if (obj == jb2) {
			System.out.println("2번 누름");
		} else if (obj == jb3) {
			System.exit(0);
		}

	}
	
	public static void main(String[] args) {
		
		new Ex01_ActionEvent();
		
	}
	
}
