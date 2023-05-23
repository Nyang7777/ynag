package day18.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex03_grade extends JFrame implements ActionListener,ItemListener{
	
	JButton jb1,jb2,jb3;
	JTextField kor,eng,math;
	JTextArea jta;
	JTextField name;
	
	public Ex03_grade() {
		super("성적계산");

		JPanel jp1 = new JPanel();
		name = new JTextField(10);
		jp1.add(new JLabel("이름: "));
		jp1.add(name);

		JPanel jp2 = new JPanel();

		kor = new JTextField(10);
		eng = new JTextField(10);
		math = new JTextField(10);
		jp2.add(new JLabel("국어"));
		jp2.add(kor);
		jp2.add(new JLabel("영어"));
		jp2.add(eng);
		jp2.add(new JLabel("수학"));
		jp2.add(math);

		jta = new JTextArea(20, 0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		JPanel jp3 = new JPanel();
		jb1 = new JButton("계산");
		jb2 = new JButton("종료");
		jb3 = new JButton("초기화");

		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);

		JPanel jp4 = new JPanel();
		jp4.setLayout(new BorderLayout());
		jp4.add(jp2, BorderLayout.NORTH);
		jp4.add(jsp, BorderLayout.CENTER);
		jp4.add(jp3, BorderLayout.SOUTH);

		add(jp1, BorderLayout.NORTH);
		add(jp4, BorderLayout.CENTER);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		
		if(obj==jb1) {
			int num1 = Integer.parseInt(kor.getText());
			int num2 = Integer.parseInt(eng.getText());
			int num3 = Integer.parseInt(math.getText());
			int total = num1+num2+num3;
			double avg = (int)(total/3.0*10)/10.0;
			String name2 = name.getText();
			
			if (avg>=90) {
				jta.append(name2+" \n"+total+" \n"+avg+" \n"+"A학점"+" \n");
			} else if (avg>=80) {
				jta.append(name2+" \n"+total+" \n"+avg+" \n"+"B학점"+" \n");
			} else if (avg>=70) {
				jta.append(name2+" \n"+total+" \n"+avg+" \n"+"C학점"+" \n");
			} else {
				jta.append(name2+" \n"+total+" \n"+avg+" \n"+"F학점"+" \n");
			}

		}else if (obj==jb2) {
			System.exit(0);
		}else if (obj==jb3) {
			name.setText("");
			kor.setText("");
			eng.setText("");
			math.setText("");
			jta.setText("");
			
		}
		
	}

	public static void main(String[] args) {
		new Ex03_grade();
	}

	
}
