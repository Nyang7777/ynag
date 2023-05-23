package day18.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.ScrollPane;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05_join extends JFrame {
	public Ex05_join() {
		super("회원가입");

		JPanel pg1 = new JPanel(new GridLayout(6,1));

		// 왼쪽정렬 new FlowLayout(FlowLayout.LEFT)
		JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		JTextField name = new JTextField(10);
		JRadioButton man = new JRadioButton("남");
		JRadioButton woman = new JRadioButton("여");
		ButtonGroup bg = new ButtonGroup();
		bg.add(man);
		bg.add(woman);

		jp1.add(new JLabel("이름: "));
		jp1.add(name);
		jp1.add(new JLabel("성별: "));
		jp1.add(man);
		jp1.add(woman);

		pg1.add(jp1);

		// 왼쪽 정렬 new FlowLayout(FlowLayout.LEFT)
		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		JTextField birth = new JTextField(10);

		jp2.add(new JLabel("생년월일"));
		jp2.add(birth);

		pg1.add(jp2);

		JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		JTextField addr = new JTextField(10);

		jp3.add(new JLabel("주소"));
		jp3.add(addr);

		pg1.add(jp3);
		
		JPanel jp4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		String[] items = {"부서","기획부","총무부","홍보부","생산부"};
		JComboBox<String> com = new JComboBox<>(items);
		
		jp4.add(new JLabel("부서"));
		jp4.add(com);
		
		pg1.add(jp4);
		
		JPanel jp5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JCheckBox jc1= new JCheckBox("운동");
		JCheckBox jc2= new JCheckBox("영화");
		JCheckBox jc3= new JCheckBox("독서");
		JCheckBox jc4= new JCheckBox("컴퓨터");
		
		jp5.add(new JLabel("취미: "));
		jp5.add(jc1);
		jp5.add(jc2);
		jp5.add(jc3);
		jp5.add(jc4);
		
		pg1.add(jp5);
		
		JPanel jp6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp6.add(new JLabel("자기소개"));
		
		JTextArea jta = new JTextArea(10,0);
		// 자동 줄바꾸기
		jta.setLineWrap(true);
		//편집 불가능
		// jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		pg1.add(jp6);
		
		
		add(jsp);
		
		JPanel jp7 = new JPanel();
		JButton jb1 = new JButton("저장");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");
		
		jp7.add(jb1);
		jp7.add(jb2);
		jp7.add(jb3);
		
		add(pg1,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(jp7,BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
//		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
//		setBounds(ds.width/2-200, ds.height/2-200, 400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ex05_join();

	}
}
