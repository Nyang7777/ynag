package day14.com.ict.edu;

import java.util.Random;

public class Ex05_extends extends Random{
	int su = nextInt();
	
	public void play() {
		System.out.println(su);
	}
	
	// static 메서드는 static 변수만 사용가능
	public static void main(String[] args) {
	
	// 자기자신이라도 객체를 만든다
		Ex05_extends test = new Ex05_extends();
		test.play();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
