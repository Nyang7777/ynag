package day05.com.ict.edu;

import java.util.Iterator;

public class Ex02_for {
	public static void main(String[] args) {
		
		// for 정해진 규칙에 따라 반복처리하는 반복문
		/* for(초기식;조건식;증감식){
		 	조건식이 참일때 실행할 문장;
		 	조건식이 참일때 실행할 문장;
		 	조건식이 참일때 실행할 문장;
		 	}
		 	
		 for문을 만나면 무조건 초기식으로 이동 
		 초기식 : 가장 먼저 수행 후 조건식으로 이동
		 조건식 : 조건식이 참이면 실행 거짓이면 탈출, 실행 후 for문 끝을 만나면 증감식으로 이동
		 증감식 : 증가, 감소 시킨 후 조건식 이동
		 
		 {}에서 만들어진 변수는 {}밖으로 벗어나면 사라진다(사용불가)*/
		
		//안녕하세요 열번 출력하기
		for (int i = 1/*초기식 시작점*/; i <=10/*조건식 끝내는 지점*/; i++/*증감식*/) {
			
			System.out.println(i +" = 안녕하세요");
		}
		System.out.println(" ======================");
		
		// 0~10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(i+" ");
			// \t 텝 키만큼 수평으로 띄움
			// \n 다음줄로 이동됨
		}
		System.out.println();
		System.out.println(" ======================");
		
		// 0~10까지 짝수만 출력
		for (int i = 1; i<11 ; i++) {
			if (i%2==1) {
				System.out.print(i+" ");
				System.out.println();
			}
		}
		// 구구단 7단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("7 * " + i +" = " + (7*i));
		}
		
		System.out.println(" ======================");
		
		// 1~10까지 합계구하기
		// 저장변수 = 0
		// 누적합 : 저장변수 = 저장변수 + 현재값; 
		
		// 저장변수 = 1
		// 누적곱 : 저장변수 = 저장변수 * 현재값; 
		
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		// 0~10까지 짝수의 누적합
		int sum2 = 0;
		for (int i = 0; i < 11; i++) {
			if(i%2==1) {
				sum2 = sum2 + i;
			}
		}
		System.out.println(sum2);
		System.out.println(" ======================");
		
		// 7! 구하기
		int sum3 = 1;
		for (int i = 1; i < 8; i++) {
			sum3 = sum3 * i;
		}
		System.out.println(sum3);
		
		// 1+(-2)+3+(-4)+5+(-6)+7+(-8)+9+(-10) = ?
		// for문 이용한 누적합
		
		sum = 0;
		for (int i = 0; i < 200; i++) {
			sum = sum + i;
			if (i%2==0) {
				sum = -1*sum+i;
			}
		}
		System.out.println(sum);
		
		
		
		
	}
}
