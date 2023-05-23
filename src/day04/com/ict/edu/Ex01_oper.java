package day04.com.ict.edu;

public class Ex01_oper {
	public static void main(String[] args) {
		
		// 삼항 연산자 : 조건식 = 조건이 참 , 거짓을 구분해서 실행한다
		// 형식 자료형 변수이름 = (조건식) ? 조건식이 참일때 실행할 문장 (조건식) : 조건식이 거짓일때 실행할 문장
		// 주의사항 변수가 참일때 실행 결과, 거짓일때 실행 결과 모두 같은 자료형이어야 한다
		// 조건식에는 boolean(true fales), 비교연산자, 논리연산자
		
		String str = false ? "강아지" : "고양이" ;
		System.out.println(str);
		
		double avg = 55.3;
		//int avg = 50;
		str = avg>=60 ? "합격" : "불합격";
		System.out.println(str);

		char c1 = '1';
		str = c1 >= 'a' && c1 <= 'z'? "소문자" : "소문자 아님";
		System.out.println(str);
		
		// 1 또는 3 남자, 아니면 여자
		int gender = 0;
		str = gender == 1 || gender == 3 ? "남자" : "여자";
		System.out.println(str);
		
		// 홀수는 남자, 짝수는 여자
		gender = 2;
		str = gender % 2 == 1 ? "남자" : "여자";
		System.out.println(str);
		
		// 3의 배수 맞추기
		int su1 = 854879;
		str = su1 % 3 == 0 ? "3의 배수" : "3의 배수 아님";
		System.out.println(str);
		
		// 근무시간이 8시간까지는 시급 9620원
		// 8시간 초과시 시간당 1.5배
		// 근무시간 10시간일때 얼마 받아야됨?
		
		// 기본시간 8*시급
		// 초과시간 8초과일때 시간당 1.5배 시급
		
		// 8시간 초과 = 초과시간 * 1.5 * 시급
		// 8시간 이하 = 시간 * 시급
		int tlrmq = 9620;
		double chrhktlrmq = 9620*1.5;
		int dlfgkstlrks = 10;
		int rlqhstlrks = 8;
		int chrhktlrks = dlfgkstlrks - rlqhstlrks;
		
		double tlrks = dlfgkstlrks > 8 ? dlfgkstlrks-rlqhstlrks* tlrmq * 1.5 + tlrmq* 8  : tlrmq * rlqhstlrks;
		
		System.out.println("=============================");
		
		int time = 10;
		int dan = 9620;
		int pay = (time > 8) ? (int)((8*dan) + (time-8)*dan*1.5) : time*dan;
		System.out.println(pay);
		
		// 큰 숫자 찾기
		int num1 = 47;
		int num2 = 52;
		
		int res = (num1 > num2) ? num1 : num2 ;
		System.out.println(res);
		res = (num1 - num2 > 0) ? num1 : num2 ;
		System.out.println(res);
		
		int res2 = Math.addExact(num1,num2);
		// Math. class에 나오는 메소드 10개 조사하기
		System.out.println(res2);
		
		int res3 = -38;
		int res4 = (res3 > 0) ? res3 : res3*-1 ;
		System.out.println(res4);
		
		int res5 = Math.abs(res3);
		System.out.println(res5);
		
		
		
		
		// for문장 = 횟수 정함 , while문장 = 기간 정함
		
	}
}
