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

public class Ex03_Calc extends JFrame{
	public Ex03_Calc() {
		super("계산기");
		
		JPanel np = new JPanel();
		
		JTextField jtf1 = new JTextField(20);
		np.add(jtf1);
		
		
		JPanel jp = new JPanel(new GridLayout(5, 3, 5, 5));
		
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb10 = new JButton("0");
		JButton jb11 = new JButton("+");
		JButton jb12 = new JButton("-");
		JButton jb13 = new JButton("*");
		JButton jb14 = new JButton("/");
		JButton jb15 = new JButton("=");
		
		
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		jp.add(jb7);
		jp.add(jb8);
		jp.add(jb9);
		jp.add(jb10);
		jp.add(jb11);
		jp.add(jb12);
		jp.add(jb13);
		jp.add(jb14);
		jp.add(jb15);
		
		add(np,BorderLayout.NORTH);
		add(jp);
		
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 150, ds.height / 2 - 150, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex03_Calc();
	}
}
