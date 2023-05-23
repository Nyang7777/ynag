package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex08_JTextComponent extends JFrame{
	public Ex08_JTextComponent() {
		super("JTextComponent");
		
		JPanel jp = new JPanel();
		
		// JLable : 글자를 표시한다 수정 불가능
		JLabel jlabel = new JLabel();
		jlabel.setText("I D: ");
		
		JLabel jlabel2 = new JLabel("P W: ");
		JLabel jlabel3 = new JLabel("자기소개: ");
		
		// 한줄 입력 : JTextField
		JTextField ftp1 = new JTextField();
		ftp1.setText("아이디 입력");
		ftp1.setColumns(20); // 보이는 글자길이
		
		//JTextField ftp2 = new JTextField("비밀번호 입력",20);
		// 입력된 글자 가리기 JPasswordField
		JPasswordField ftp2 = new JPasswordField("비밀번호 입력",20);
		
		// 여러줄 입력 :JTextArea(행, 열);
		JTextArea  jta = new JTextArea(5, 20);
		
		//JTextArea는 두가지 옵션을 생각해야한다
		// 자동으로 줄 바꾸기
		jta.setLineWrap(true);
		
		// 스크롤바 만들기
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED/*세로 스크롤*/,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER/*가로 스크롤*/);
		
		
		jp.add(jlabel);
		jp.add(ftp1);
		jp.add(jlabel2);
		jp.add(ftp2);
		jp.add(jlabel3);
		jp.add(jsp);
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-500, ds.height/2-300, 1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex08_JTextComponent();
	}
}
