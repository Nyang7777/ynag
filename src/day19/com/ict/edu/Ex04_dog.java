package day19.com.ict.edu;

public class Ex04_dog implements Runnable{

	@Override
	public void run() {
		while (true) {
			// 3초마다 하나씩
			try {
				Thread.sleep(1000*3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("멍 멍");
		}
	}

}
