package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex04_Calc extends JFrame{
	public Ex04_Calc() {
		super("계산기");
		
		GridLayout grid = new GridLayout(0,6);
		setLayout(grid);
		
		JPanel name = new JPanel();
		
		add(new JLabel("이름: "));
		JTextField name1 = new JTextField(5);
		add(name.add(name1));
		add(name);
		
		
		
		//JLabel jl1 = new JLabel("수1: ");
		JTextField jtf1 = new JTextField(5);
		//JLabel jl2 = new JLabel("수2: ");
		JTextField jtf2 = new JTextField(5);
		//JLabel jl3 = new JLabel("연산: ");
		JTextField jtf3 = new JTextField(5);
		
		add(new JLabel("국어: "));
		add(jtf1);
		add(new JLabel("영어: "));
		add(jtf2);
		add(new JLabel("수학: "));
		add(jtf3);
		
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);// 자동 줄 바꿈
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// 편집 불가능하게 만들기
		jta.setEditable(false);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");
		
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		
		add(name,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex04_Calc();
	}
}
