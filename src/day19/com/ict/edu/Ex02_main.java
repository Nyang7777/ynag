package day19.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		System.out.println("main: "+Thread.currentThread().getName());
		
		Ex02_dog dog = new Ex02_dog();
		Ex02_cat cat = new Ex02_cat();
		
		// 멀티 스레드 : 여러개의 스레드를 만들어서 병렬 처리
		// 스레드 만들기 : start()를 호출 run() 가면 스레드 생성
		dog.start();
		cat.start();
		System.out.println("main: "+Thread.currentThread().getName());
	}
}
