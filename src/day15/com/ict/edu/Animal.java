package day15.com.ict.edu;

public class Animal {
	// final 변수 = 상수 = 데이터 변경 불가능
	// final 메서드 = 오버라이딩 방지 = 메서드 내용 변경 불가능
	// final 클래스 = 상속관계 불가능
	int eyes = 2;
	String color = "그레이";
	
	public void sound() {
		System.out.println("울음소리");
	}
	public void hobby() {
		System.out.println("좋아하는 행동");
	}
	public final void sleep() {
		System.out.println("8시간이상 잠자기");
	}
	
	
}
