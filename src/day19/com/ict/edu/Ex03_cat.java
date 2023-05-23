package day19.com.ict.edu;

public class Ex03_cat implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("야옹"+Thread.currentThread().getName());
		}
	}

}
