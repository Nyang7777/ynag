package day03.com.ict.edu;

public class Ex04_oper {
	public static void main(String[] args) {

		// 컨트롤+쉬프트+F = 정렬

		// 논리연산자 : && || !
		// 논리연산자 결과 참 거짓으로 나옴 연산 대상은 boolean
		// 결과는 boolean형 조건식에 사용함

		
		// &&=and(논리곱), 교집합 모든 조건이 true일때만 true 값이 나온다
		// false가 있으면 결과는 false
		// false를 만나는 순간 뒤에있는 값 계산 안함
		// ** and 조건을 이용하면 범위를 지정할 수 있다
		// a>=10 && a<=20 -> a는 10부터 20까지의 범위를 지정한 것

		int su1 = 10;
		int su2 = 7;
		boolean result;
		result = (su1 >= 7) && (su2 >= 5);
		System.out.println(result);

		result = (su1 <= 7) && (su2 >= 5);
		System.out.println(result);

		result = (su1 >= 7) && (su2 <= 5);
		System.out.println(result);

		result = (su1 <= 7) && (su2 <= 5);
		System.out.println(result);

		System.out.println("========================");

		result = ((su1 = su1 + 2) > su2) && (su1 == (su2 = su2 + 5));
		System.out.println("결과 : " + result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		System.out.println("========================");
		
		su1 = 10;
		su2 = 7;

		result = ((su1 = su1 + 2) < su2) && (su1 == (su2 = su2 + 5));
		System.out.println("결과 : " + result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		System.out.println("========================");
		
		//범위 지정하기
		int su3 = 34;
		
		// su3은 20~30 사이에 존재하는 값이다
		result = su3 >=20 && su3 <=40;
		System.out.println(result);
		
		// char c1 소문자인가
		char c1 = 'G';
		
		result = c1 >= 'a' && c1 <= 'z';
		System.out.println(result);
		

	}
}
