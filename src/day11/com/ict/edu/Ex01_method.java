package day11.com.ict.edu;

public class Ex01_method {

	// 클래스 : 멤버필드, 멤버메서드, 생성자
	// 멤버필드 : 인스턴스변수, 인스턴스상수, static변수, static상수
	
	String name = "홍길동"; // 인스턴스 변수
	int kor = 80; // 인스턴스 변수
	int eng = 95; // 인스턴스 변수
	int math = 85; // 인스턴스 변수
	int total = 0; // 인스턴스 변수
	double avg = 0.0; // 인스턴스 변수
	
	static double k = 178.5;

	// 멤버 메서드() : 동작 기능 실행하는것
	//				메서드는 반드시 호출해야만 실행 가능하며 실행 후 반드시 되돌아간다
	// 형식 : 접근제한자 메서드종류 반환형 메서드이름(인자){실행할 내용}
	//		반환형 : 메서드는 반드시 호출한 곳으로 되돌아가는데 실행결과를 갖고 갈때 실행결과의 자료형을 반환형이라한다
	//				실행결과를 가지고 가지않으면 void라는 예약어를 사용한다
	
	// instance 메서드
	public void getTotal() {
		total = kor + eng + math;
		return;
	}
	public int getTotal2() {
		int sum = kor + eng + math;
		// 반환형이 void가 아니라면 마지막에 return 데이터나 해당 자료형 변수
		return sum;
	}
	public int getTotal3() {
		// 반환형이 void가 아니라면 마지막에 return 데이터나 해당 자료형 변수
		return kor + eng + math;
	}
	public static void getAvg() {
		// static일 경우는 instance 변수 사용 불가
		// avg = total/3.0;
		
		// k가 static 이므로 사용가능
		k= k+5;
	}
	public static double getAvg2() {
		return k = k + 0.7;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
