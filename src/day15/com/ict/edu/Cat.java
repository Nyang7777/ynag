package day15.com.ict.edu;

public class Cat extends Animal{
	String color = "삼색";
	
	public void play() {
		System.out.println("창밖을 바라본다");
	}
	
	@Override
	public void sound() {
		System.out.println("야옹 야옹");
	}
	
	// 부모클래스의 해당 메서드 final이 있다면 오버라이딩 안됨
//	@Override
//	public void sleep() {
//		System.out.println("12시간이상 잠자기");
//	}
	
}
