package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

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

public class Ex05_ex extends JFrame implements ActionListener, ItemListener{
	
	JPanel jp1, jp2, jp3;
	JRadioButton jrb1,jrb2,jrb3,jrb4;
	JTextArea jta;
	JButton b1,b2,b3;
	ButtonGroup jb;
	JTextField f1,f2;
	
	public Ex05_ex() {
		super("라디오 버튼 이벤트");

		jp1 = new JPanel();
		
		f1 = new JTextField(10);
		f2 = new JTextField(10);
		
		jp1.add(new JLabel("숫자1: "));
		jp1.add(f1);
		jp1.add(new JLabel("숫자2: "));
		jp1.add(f2);
		jp1.add(new JLabel("연산자"));
		
		jrb1 = new JRadioButton("+");
		jrb2 = new JRadioButton("-");
		jrb3 = new JRadioButton("*");
		jrb4 = new JRadioButton("/");
		
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		jp1.add(jrb4);
		
		jb = new ButtonGroup();
		jb.add(jrb1);
		jb.add(jrb2);
		jb.add(jrb3);
		jb.add(jrb4);
		
		jta = new JTextArea(10,10);
		JScrollPane jsp = new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		jp2 = new JPanel();
		b1 = new JButton("계산");
		b2 = new JButton("종료");
		b3 = new JButton("초기화");
		jp2.add(b1);
		jp2.add(b2);
		jp2.add(b3);
		
		add(jp1,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(jp2,BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		jrb3.addItemListener(this);
		jrb4.addItemListener(this);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}
	
	
	// 라디오 버튼
	@Override
	public void itemStateChanged(ItemEvent e) {
			
	}
	
	// 버튼
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		if (obj==b2) {
			System.exit(0);
		} else if (obj==b3) {
			jb.clearSelection();
			jta.setText("");
			f1.setText("");
			f2.setText("");
		} else if(obj==b1){
			
			if(jrb1.isSelected()) {
				int num1 = Integer.parseInt(f1.getText());
				int num2 = Integer.parseInt(f2.getText());
				int sum = num1 + num2;
				jta.append(f1.getText()+"+"+f2.getText()+"="+sum+" \n");
				
			}
		}
			
	}
	
	public static void main(String[] args) {
		new Ex05_ex();
	}

}
