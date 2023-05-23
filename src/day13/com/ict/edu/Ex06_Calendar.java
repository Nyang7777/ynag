package day13.com.ict.edu;

import java.util.Calendar;

public class Ex06_Calendar {
	public static void main(String[] args) {
		
		// Calendar 클래스 : new 예약어를 사용하지 않고 getInstance()를 사용하면 현재 PC 날짜와 시간으로 설정된다
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println(now.getTime());
		System.out.println(now.getTimeZone());
		
		System.out.println();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.HOUR_OF_DAY));
		System.out.println(now.get(Calendar.MINUTE));
		System.out.println(now.get(Calendar.SECOND));
		
		// Am = 0, Pm = 1
		int res = now.get(Calendar.AM_PM);
		if (res == 0) {
			System.out.println("AM "+now.get(Calendar.HOUR));
		} else {
			System.out.println("PM "+now.get(Calendar.HOUR));
		}
		
		// 요일 1->일 7->토
		res = now.get(Calendar.DAY_OF_WEEK);
		switch (res) {
		case 1:System.out.println("일요일"); break;
		case 2:System.out.println("월요일"); break;
		case 3:System.out.println("화요일"); break;
		case 4:System.out.println("수요일"); break;
		case 5:System.out.println("목요일"); break;
		case 6:System.out.println("금요일"); break;
		case 7:System.out.println("토요일"); break;

		}
		
		// 날짜 변경
		now.set(2023, 03, 25);
		System.out.println(now.getTime());
		
		now.add(Calendar.DATE,13);
		System.out.println(now.getTime());
		
		
		
		
	}
}
