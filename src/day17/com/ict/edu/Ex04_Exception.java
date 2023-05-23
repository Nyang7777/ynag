package day17.com.ict.edu;

import java.util.Scanner;

// throws : 예외전가, 양도
//			현재 메서드에서는 할 수 없는 예외가 발생하면 자신을 호출한 곳으로 전달
//			예외객체를 전달, 나중에라고 예외처리(try~catch~)를 하는것이 좋다

public class Ex04_Exception {
	
	public void setData(String str) {
		if(str.length()>=1) {
			String res = str.substring(0,1);
			prnData(res);
		} try {
			
		} catch (Exception e) {
			System.out.println("첫글자는 숫자");
		}
	}
	// str 길이가 0보다 크면 ( str에 정보가 있으면)
	


	public void prnData(String res) {
		int dan = Integer.parseInt(res);
		System.out.println(dan+"단");
		for (int i = 1;  i< 10; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
	
	public static void main(String[] args) {
		Ex04_Exception test = new Ex04_Exception();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수입력: ");
		String msg = scan.next();
		try {
			test.setData(msg);
		} catch (Exception e) {
			System.out.println("첫 글자는 숫자");
		} 
		
	}
}