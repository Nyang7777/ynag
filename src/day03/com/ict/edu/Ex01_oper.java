package day03.com.ict.edu;

public class Ex01_oper {

	public static void main(String[] args) {
		//컨트롤+스페이스
		// 산술연산자 : + - / * %(나머지)
		
		int su1 = 9;
		int su2 = 4;
		int result = 0;
		
		result = su1 + su2 ;
		// sysout 컨트롤+스페이스
		
		System.out.println("결과 : " + result);
		// 컨트롤 + F11 = 바로 나옴
		// 범위 잡고 알트 방향키 = 이동
		// 범위 잡고 컨트롤+알트+방향키= 복사
		
		result = su1 -su2;
		System.out.println("결과 : " + result);
		
		result = su1 / su2;
		System.out.println("결과 : " + result);
		
		double res = su1 / su2;
		System.out.println("결과 : " + res);
		
		// 정수 -> 실수 만들기 = 소수점 결과 나옴
		// double, *()1.0
		
		res = (double)(su1) / su2;
		System.out.println("결과 : " + res);
		
		res = su1 /(double)(su2);
		System.out.println("결과 : " + res);
		
		res = su1 /(su2 *1.0);
		System.out.println("결과 : " + res);
		
		result = su1 % su2;
		System.out.println("결과 : " + result);
		
		
	}

}