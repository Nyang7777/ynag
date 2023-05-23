package day13.com.ict.edu;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex05_date {
	public static void main(String[] args) {
		
		// 날짜
		// 1. Date 2. Calendar 3. LocalDate
		
		// Date 클래스 : 기본 생성자로 생성하면 PC 시스템 시간으로 설정된다
		// Deprecated : 이 단어가 설명서에 쓰여있다면 언제든지 시스템 지원이 끊길 수 있으니 가능하면 다른거 써라
		Date date = new Date();
		System.out.println(date);
		
		// 2. 기본 형태로 변환하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd	hh:mm:ss");
		System.out.println(sdf.format(date));
		
		System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDate());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		
		// 0~6, 0->일요일 6->토요일
		int k = date.getDay();
		switch (k) {
		case 0:System.out.println("일요일"); break;
		case 1:System.out.println("월요일"); break;
		case 2:System.out.println("화요일"); break;
		case 3:System.out.println("수요일"); break;
		case 4:System.out.println("목요일"); break;
		case 5:System.out.println("금요일"); break;
		case 6:System.out.println("토요일"); break;

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
