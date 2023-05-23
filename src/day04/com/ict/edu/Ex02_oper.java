package day04.com.ict.edu;

public class Ex02_oper {
	public static void main(String[] args) {
		
		// 중첩 삼항 연산자
		// 예시) 자료형 변수이름 = (조건식1) ? ((조건식2) ? 조건식2 참 : 조건식2 거짓) : 조건식1 참 : 조건식1 거짓
		// 예시) 자료형 변수이름 = (조건식1) : 조건식1 참 : ((조건식2)? 조건식2 참 : 조건식2 거짓)
		
		// int k1이 90이상이면 "A학점" 80이상이면 "B학점" 나머지는 "F학점"
		
		int k1 = 88;
		String str = (k1 >= 90) ? "A학점" : (k1 >= 80) ? "B학점" : "F학점";
		System.out.println(str);
		
		// char k2가 대문자인지, 소문자인지, 기타문자인지 판별하기 a 97 A 65
		char k2 = 'Q';
		String res = k2 >= 'a' && k2 <'z' ? "소문자" : (k2 >='A' && k2 < 'a') ? "대문자" : "기타문자";
		System.out.println(res);
		
		// int k3이 1 또는 3이면 남자, 2 또는 4이면 여자
		//			1 또는 2이면 1900년대, 3 또는 4이면 2000년대 나머지는 외국인
		
		int k3 = 2;
		String g = k3 == 1 || k3 == 3 ? "남자" : k3 == 2 || k3 == 4 ? "여자" : "외국인";
		String g2 = k3 == 2 || k3 == 1 ? "1900년대" : k3 == 3 || k3 == 4 ? "2000년대" : "";
		System.out.println(g+g2);
		
		System.out.println("==================================");
		
		String g3 = (k3 == 1 || k3 == 3) ? (k3==1) ? "1900년 남자" : "2000년대남자" : 
			(k3 == 2 || k3 == 4) ? (k3==2) ? "1900년 여자" : "2000년대 여자" : "외국인";
		System.out.println(g3);
	}
}
