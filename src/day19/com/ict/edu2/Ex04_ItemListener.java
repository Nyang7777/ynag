package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

// JCheckBox등등 -> ItemListener 사용
public class Ex04_ItemListener extends JFrame implements ItemListener, ActionListener {
	JPanel jp;
	JPanel jp2;
	JCheckBox jb1, jb2, jb3, jb4;
	JButton b1,b2;
	JTextArea jta;
	JScrollPane jsp;
	
	public Ex04_ItemListener() {
		super("체크박스 이벤트");
		
		jp = new JPanel();
		jb1 = new JCheckBox("");
		jb1.setText("축구");
		jb2 = new JCheckBox("야구");
		jb3 = new JCheckBox("농구");
		jb4 = new JCheckBox("배구");
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		
		jta = new JTextArea(10,0);
		jsp = new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// 자동 줄바꾸기
		jta.setLineWrap(true);
		//편집 불가능
		jta.setEditable(false);
		
		jp2 = new JPanel();
		b1 = new JButton("exit");
		b2 = new JButton("clear");
		
		jp2.add(b1);
		jp2.add(b2);
		
		add(jp,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(jp2,BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		// 체크박스에
		jb1.addItemListener(this);
		jb2.addItemListener(this);
		jb3.addItemListener(this);
		jb4.addItemListener(this);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	// itemlistener 해결하는 추상 메서드
	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox obj = (JCheckBox)e.getSource();
		if(e.getStateChange()==e.SELECTED) {
			jta.append(obj.getText()+"선택\n");
		}else if(e.getStateChange()==e.DESELECTED) {
			jta.append(obj.getText()+"해제\n");
		}
	}
	// actionlistener 해결하는 추상 메서드
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton)e.getSource();
		if (obj==b1) {
			System.exit(0);
		}else if (obj==b2) {
			// clear
			// 체크박스에 선택된거 다 지우기
			jb1.setSelected(false);
			jb2.setSelected(false);
			jb3.setSelected(false);
			jb4.setSelected(false);
			jta.setText("");
		}
	}
	
	public static void main(String[] args) {
		new Ex04_ItemListener();
	}
}
