package day10.ict.com.edu;

public class Ex02_main {
	public static void main(String[] args) {
		System.out.println(Ex02_class.AVG);
		System.out.println(Ex02_class.sum);
			
		// instance는 객체 생성 후 접근
		// 객체 생성
		// 클래스이름 참조변수 = new 생성자();
		// 해당 클래스의 생성자가 없으면 기본 생성자 사용
		// 기본 생성자 : 인자가 없는 생성자
		Ex02_class test = new Ex02_class();
		// 접근법 : 참조변수.멤버필드
		System.out.println(test);
		System.out.println(test.GENDER);
		System.out.println(test.AVG);
		System.out.println(test.sum);
		
		test.name = "일지매"; // 변수 변경 가능
		// test.GENDER = "여성"; // 상수 변경 불가능
		
		Ex02_class.sum=1000; // 변수 변경 가능
		// Ex02_class.AVG=12345; // 상수 변경 불가능
		
		System.out.println(test.name);
		System.out.println(Ex02_class.sum);
		
	}
}
