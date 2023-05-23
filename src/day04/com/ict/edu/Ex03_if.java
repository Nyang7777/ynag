package day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
		
		// 단순 if문 : 조건식이 참 -> 실행 , 거짓이면 무시
		// 형식 if(조건식){
		//			조건식이 참 -> 실행할 문장;
		//			조건식이 참 -> 실행할 문장;
		//		}
		
		// 단, 실행문장이 한줄이면 {} 블록 생략 가능	
		// if(조건식) 조건식이 참 -> 실행할 문장;
		// if(조건식) 
		//		조건식이 참 -> 실행할 문장;
		
		// int k1이 60이상이면 합격
		int k1 = 50;
		String res = "초기값";
		if (k1 >= 60) {
			res = "합격";
		}
		if(k1<60) res = "불합격";
		
		System.out.println(res);
		
		//int k2 홀수냐 짝수냐
		int k2 = 37;
		res = "짝수";
		if (k2%2==1) {
			res = "홀수";
		}
		System.out.println(res);
		
		// char k3가 대문자냐 소문자냐
		char k3 = '4';
		res = "대문자 아님";
		if (k3>='A'&& k3<='Z') {
			res="대문자";
		}
		System.out.println(res);
		
		// 근무시간이 8시간까지는 시급 9620원
		// 8시간 초과시 시간당 1.5배
		// 근무시간 10시간일때 얼마 받아야됨?
		
		int k5 = 8;
		int k4 = 10;
		int tlrks = 9620;
		double dkfqk = (tlrks*1.5*(k4-k5)) + (tlrks*k5);
		if (k4<=8) {
			dkfqk = tlrks * k4;
		}
		System.out.println(dkfqk);
	}
}
