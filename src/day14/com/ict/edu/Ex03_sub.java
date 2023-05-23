package day14.com.ict.edu;

// 자식 클래스에서 부모 클래스를 선택해서 상속관계를 맺는다
// 상속관계 : 자식클래스가 부모클래스의 멤버필드와 멤버메서드를 마음대로 사용가능
//			모든 클래스는 하나의 부모클래스를 갖는다
//			부모클래스가 없으면 Object가 부모클래스
//			다중상속 불가능함
//			class 자식클래스 extends 부모클래스
public class Ex03_sub extends Ex03_super {

	String name = "홍반장";
	int age = 13;
	double weight = 78.9;
	private String cat = "야옹이";
	
	static String computer = "10세대";
	
	public Ex03_sub() {
		System.out.println("자식 클래스: "+this);
	}
	
	public void play() {
		String name = "홍두께";
		// 변수 우선 순위
		// 지역변수 > 전역변수(this) > 부모클래스변수(super)
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
		
		// 지역변수가 없고, 전역변수, 부모 클래스에게만 있으면
		System.out.println(weight);
		System.out.println(this.weight);
		
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);
		
		// private 경우
		System.out.println(cat);
		// 상속이라도 private 접근불가
		//System.out.println(dog);
		//System.out.println(super.dog);
		
		// static 경우
		System.out.println(playStation);
		System.out.println(Ex03_super.playStation);
		System.out.println(computer);
		System.out.println(Ex03_sub.computer);
		
		
		
	}
	
	
	
	
	
	
}
