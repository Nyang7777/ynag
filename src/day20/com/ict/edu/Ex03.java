package day20.com.ict.edu;

// 동기화할때 현재 실행중인 스레드를 강제로 대기상태로 변경시킨다 wait
// wait 상태 스레드를 풀어주지 않으면 그대로 대기상태로 끝난다
// 풀어주는 예약어 notify notifyAll
public class Ex03 implements Runnable {
	
	int x = 0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x+" "+Thread.currentThread().getName());
			if (x==11) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}else {
				notify();
			}
		}
	}
}
