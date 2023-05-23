package day14.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		
		// 자식 클래스를 객체로 만들면 먼저 부모 클래스가 알아서 만들어진다
		Ex03_sub sub = new Ex03_sub();
		System.out.println("메인에서 생성자 호출:"+sub);
		
		System.out.println(sub.name);
		System.out.println(sub.age);
		System.out.println(sub.addr);
		
		// staic 접근한자에서 웃순위가 높다
		System.out.println(Ex03_sub.computer);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
