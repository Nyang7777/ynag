package day04.com.ict.edu;

public class Ex04_else {
	public static void main(String[] args) {

		// if ~ else ans
		// 조건이 참일때와 거짓일때 각각 나눠서 처리
		// 형식 if(조건식){
		//		 조건식이 참 -> 실행할 문장;
		//		 조건식이 참 -> 실행할 문장;
		// 		}else{
		//		 조건식이 거짓 -> 실행할 문장;
		//		 조건식이 거짓 -> 실행할 문장;
		//		}
		
		// int k1이 60 이상이면 합격 아니면 불합격
		int k1 = 12;
		String str = "";
		if (k1>=60) {
			str="합격";
		} else {
			str="불합격";
		}
		System.out.println(str);
		
		// int k2가 홀수냐 짝수냐
		int k2 = 85649;
		if (k2%2==0) {
			str="짝수";
		} else {
			str="홀수";
		}
		System.out.println(str);
		
		// char k3가 대문자냐 아니냐
		char k3 = 'A';
		if (k3>='A'&& k3<='Z') {
			str = "대문자";
		} else {
			str = "대문자 아님";
		}
		System.out.println(str);
		
		// 시급 9620 기본 8시간 실제 10시간 초과수당 1.5배
		int tlrmq = 9620;
		int tlfwp = 20;
		int rlqhs = 8;
		int wlcnf = 0;
		
		if (tlfwp >8) {
			wlcnf = (tlrmq*rlqhs) + (tlfwp-rlqhs)*(int)(tlrmq*1.5);
		} else {
			wlcnf = tlfwp*tlrmq;
		}
		System.out.println(wlcnf);
		
		
		
	}
}
