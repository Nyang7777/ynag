package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex01_scanner {
	public static void main(String[] args) {
		// Scanner 클래스 : 키보드에 입력된 정보를 받아서 처리함
		// System.out -> 표준 출력장치
		// System.in -> 표준 입력장치
		
		// 회사에서 제공하는 클래스를 사용하기 위해서 import를 해야된다
		// java.lang 패키지안에 존재하는 클래스는 제약없이 사용가능
		// 외에 존재하는 클래스는 import를 해야한다
		
		// import 클래스 이름 뒤에서 컨트롤+스페이스
		//			컨트롤+쉬프트+o
		
		// 해당 클래스 뒤에 마우스 놓고 쉬프트+f2 -> API 설명서 나옴
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("이름 : ");
		// .next(); 입력한 내용을 String으로 처리하는 메서드 
		String name = scan.next();
		System.out.println("받은 내용 : "+name);
		
		System.out.print("나이 : ");
		// .next(); 입력한 내용을 String으로 처리하는 메서드 
		String age = scan.next();
		System.out.println("받은 내용 : "+(age+1));
		
		System.out.print("나이 : ");
		// .nextInt(); 입력한 내용을 int로 처리하는 메서드 (숫자외 문자 넣으면 오류)
		int age2 = scan.nextInt();
		System.out.println("받은 내용 : "+(age2+1));
		
		// next와 nextline의 차이
		
		
		
		System.out.print("키 : ");
		// .nextDouble() : 입력한 내용을 double로 처리한다 (숫자 외 문자 입력하면 오류)
		double ke = scan.nextDouble();
		System.out.println("받은 내용 : "+(ke));
		
		System.out.println("당신은 남성입니까?");
		// .nextBoolean() : 입력한 내용을 boolean으로 처리한다 
		boolean gender = scan.nextBoolean();
		System.out.println("받은 내용 : "+ gender);
		if (gender) {
			System.out.println("남성입니다");
		} else {
			System.out.println("여성입니다");
		}
		
		// nextChar()는 없다
		
		
		
	}
}
