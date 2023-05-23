package day13.com.ict.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex07_LocalDate {
	public static void main(String[] args) {
		
		// JAVA version 8.0이상 가능
		// LocalDate : 날짜 정보만
		// LocalTime : 시간 정보만
		// LocalDateTime : 날짜 시간만
		
		LocalDate cDate = LocalDate.now();
		System.out.println(cDate);
		
		LocalTime cTime = LocalTime.now();
		System.out.println(cTime);
		
		LocalDateTime cDateTime = LocalDateTime.now();
		System.out.println(cDateTime);
		System.out.println();
		
		System.out.println("날짜");
		System.out.println("getYear(): "+cDate.getYear());
		System.out.println("getMonth(): "+cDate.getMonth());
		System.out.println("getMonthValue(): "+cDate.getMonthValue());
		System.out.println("getDayOfYear(): "+cDate.getDayOfYear());
		System.out.println("getDayOfMonth(): "+cDate.getDayOfMonth());
		System.out.println("getDayOfWeek(): "+cDate.getDayOfWeek());
		System.out.println("siLeapYear(): 윤년여부 "+cDate.isLeapYear());
		
		System.out.println(" 시간 ");
		System.out.println("getHour(): "+cTime.getHour());
		System.out.println("getMinute(): "+cTime.getMinute());
		System.out.println("getSecond(): "+cTime.getSecond());
		// 1970년 1월 1일 UTC의 첫 번째 순간이후 현재시간까지의 나노초를 나타내는 값
		System.out.println("getNane(): "+cTime.getNano());
		System.out.println();
		
		System.out.println(cDate.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(cDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		System.out.println(cDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		System.out.println();
		
		System.out.println(" 날짜 차이 ");
		LocalDate sDate = LocalDate.now();
		LocalDate eDate = LocalDate.of(2023, 05, 20);
		Period period = Period.between(sDate, eDate);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
}
