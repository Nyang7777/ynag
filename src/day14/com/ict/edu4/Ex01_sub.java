package day14.com.ict.edu4;

public class Ex01_sub extends Ex01_super{
	String name = "홍반장";
	int age = 13;
	double weight = 78.4;
	
	// this(): 자기자신 생성자를 뜻한다
	//			생성자의 첫번째줄에 있어야 다른 생성자 호출
	
	// super() : 부모클래스 생성자
	
	public Ex01_sub() {
		this("홍두께",14);
	}
	public Ex01_sub(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
