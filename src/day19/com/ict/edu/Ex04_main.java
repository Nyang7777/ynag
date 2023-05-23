package day19.com.ict.edu;

public class Ex04_main {
	public static void main(String[] args) {
		Ex04_dog dog = new Ex04_dog();
		Ex04_cat cat = new Ex04_cat();
		
		Thread thread_dog = new Thread(dog);
		// 데몬 스레드: 일반 스레드의 작업을 돋는 보조적인 역할을 수생하는 스레드
		//				일반 스레드가 종료되면 데몬 스레드는 강제로 종료된다
		thread_dog.setDaemon(true);		
		thread_dog.start();
		
		Thread thread_cat = new Thread(cat);
		thread_cat.setDaemon(true);		
		thread_cat.start();
		
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				
			}
			System.out.println(i);
		}
		System.out.println("종료");
	}
}
