package day19.com.ict.edu;

// 스레드: 프로세스내에서 실행되는 세부 작업 단위
// 멀티 스레드: 하나의 스로세스에서 여러개의 스레드가 병행 처리되는것
// 싱글 스레드: 하나의 스로세스에서 하나의 스레드가 처리하는것

// 자바에서의 스레드 생성
// 자바에서는 start를 호출하여 run이 실행되면 스레드 실행 됐다고 할 수 있음
// 1. 스레드 클래스 상속받기: start(), run() 모두 있음
// 2. runnable 인터페이스 구현: run()만 존재

// 스레드 클래스 생성자: Thread(), Thread(Runnable 인터페이스를 구현한 객체)
//					Thread("스레드이름"),Thread(Runnable 인터페이스를 구현한 객체,"스레드 이름")
public class Ex01_Thread {
	
	public void play() {
		System.out.println("스레디이름 -2: "+Thread.currentThread().getName());
		System.out.println("컴으로 놀기");
		System.out.println("스레디이름 -3: "+Thread.currentThread().getName());
		
		
	}
	
	public String sound() {
		System.out.println("스레디이름 -5: "+Thread.currentThread().getName());
		return " 음막듣기";
		
	}
	
	public static void main(String[] args) {
		// 지금은 싱글스레드
		// Thread.currentThread().getName(): 현재 일하는 스레드 이름
		// main 메서드에서 일하는 스레드를 main 스레드
		System.out.println("스레디이름 -1: "+Thread.currentThread().getName());
		
		Ex01_Thread test = new Ex01_Thread();
		test.play();
		System.out.println("스레디이름 -4: "+Thread.currentThread().getName());
		
		String msg = test.sound();
		System.out.println("스레디이름 -6: "+Thread.currentThread().getName());
		System.out.println(msg);
		
	}
}
