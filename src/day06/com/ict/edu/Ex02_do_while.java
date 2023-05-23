package day06.com.ict.edu;

public class Ex02_do_while {
	public static void main(String[] args) {
		
		/*
		 * do~while문 : while문과 같은 반복문
		 * 				단, 먼저 실행하고 조건식에 대입한다
		 * 형식 
		 * 	초기식;
		 * 	do{
		 * 		실행문;
		 * 		증감식;
		 * 	}while(조건식);
		 */
		
		// 0~10
		int i=0;
		do {
			System.out.println(i);
			i++;
		} while (i<11);
		System.out.println("=========================");
		
		// 0~10 홀수 골라내기
		i=1;
		int j=0;
		do {
			if (i%2==1) {
				System.out.println(i);
			} 
			i++;
		} while (i<11);
		System.out.println("=========================");
		
		// 7단
		i =1;
		do {
			System.out.println(7+"*"+i+"= "+ 7*i);
			i++;
		} while (i<10);
		
		System.out.println("=========================");
		
		// 홀수의 합
		i=1;
		j=0;
		do {
			if (i%2==1) {
				j = i+j;
			}	
			i++;
		} while (i<11);
		System.out.println(j);
		
		System.out.println("=========================");
		
		
		
	}
}
