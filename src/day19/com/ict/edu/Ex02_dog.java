package day19.com.ict.edu;

public class Ex02_dog extends Thread{
	
//	public void start() {
//		for(int i=0; i<20; i++) {
//			System.out.println("멍멍"+Thread.currentThread().getName());
//		}
//	}
	
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("멍멍"+Thread.currentThread().getName());
		}
	}

}
