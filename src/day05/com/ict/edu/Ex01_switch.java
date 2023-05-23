package day05.com.ict.edu;

public class Ex01_switch {
	public static void main(String[] args) {
		/*switch ~ case : 다중 if ~ else문과 같은 조건문
 		if문의 조건식은 boolean, 비교연산, 논리연산 : true, false에 사용
 		switch문은 int, char, String 들어감 (long, float, double 안됨)
 		형식 switch(인자값 = int, char, Srting){
 			case 조건값1 : 인자값과 조건값1이 같을 때 수행할 문장; break;
 			case 조건값2 : 인자값과 조건값2이가같을 때 수행할 문장;
 						 인자값과 조건값2가 같을 때 수행할 문장; break;
 			case 조건값3 : 인자값과 조건값3이 같을 때 수행할 문장; break;
 			default : 조건값 1, 2, 3 모두 아닐때 (나머지) 수행할 문장; break;
 			주의사항 : break가 없으면 만날때까지 모든 실행문을 실행한다
 			break 역할 : 실행중인 범위{}를 벗어나오는 역할
 			default 생략가능
		*/
		
		//int k1이 1이면 카페모카, 2 카페라떼, 3 아메리카노, 4 과일쥬스 출력
		int k1 = 3;
		String res = "";
		switch (k1) {
			case 1: res = "카페모카";break;
			case 2: res = "카페라떼";break;
			case 3: res = "아메리카노";break;
			case 4: res = "과일쥬스";break;
		}
		System.out.println(res);
		System.out.println("=========================");
		
		//break가 없을때 : break 만날때까지 다음 수행문을 실행한다
		int k2 = 1;
		switch (k2) {
			case 1: System.out.println("카페모카");
			case 2: System.out.println("카페라떼");
			case 3: System.out.println("아메리카노");
			case 4: System.out.println("과일쥬스");
	}
		System.out.println("=========================");
		
		// char k3이 A, a이면 아프리카, B, b이면 브라질 C, c이면 캐나다, 나머지 한국
		char k3 = 'a';
		switch (k3) {
			case 'A': res = "아프리카"; break;
			case 'a': res = "아프리카"; break;
			case 'B': res = "브라질"; break;
			case 'b': res = "브라질"; break;
			case 'C': res = "캐나다"; break;
			case 'c': res = "캐나다"; break;
			default: res = "한국";
			}
		System.out.println(res);
		System.out.println("=========================");
		char k4 = '2';
		switch (k4) {
			case 'A': 
			case 'a':
			case '1': res = "아프리카"; break;
			// 'A'해당 하지만 break 없어서 'a'로 넘어간 뒤 마찬가지 '1'로 넘어간 뒤 종료
			// 즉, or의 관계가 성립됨
			case 'B': 
			case 'b': 
			case '2': res = "브라질"; break;
			case 'C': 
			case 'c': 
			case '3': res = "캐나다"; break;
			default: res = "한국";
		}
		System.out.println(res);
		System.out.println("=========================");
		
		// String k4가 한국이면 서울, 중국이면 베이징, 일본이면 도쿄
		String k5 = "중국";
		switch (k5) {
			case "한국" : res = "서울";break;
			case "중국" : res = "베이징";break;
			case "일본" : res = "도쿄";break;
		}
		System.out.println(res);
		System.out.println("=========================");
		
		// int k6가 3~5 : 봄 6~8 : 여름 9~11 : 가을 12~2 : 겨울
		int k6 = 9;
		switch (k6) {
			case 3:
			case 4:
			case 5: res = "봄";break;
			case 6: 
			case 7: 
			case 8: res = "여름";break;
			case 9:
			case 10:
			case 11: res = "가을";break;
			case 12:
			case 1:
			case 2: res = "겨울";break;		
		}
			System.out.println(res);
			System.out.println("=========================");
			
		// switch에서 범위가 넓어지면 사용하지 말자 (if문 사용)
		// int k7의 점수가 90 이사이면 A학점 80이상이면 B학점 70이상이면 C학점 나머지 F학점
		int k7 =86;
		switch (k7) {
			case 100:
			case 99:
			case 98:
			case 97:
			case 96:
			case 95:
			case 94:
			case 93:
			case 92:
			case 91:
			case 90: res = "A학점"; break;
		}
		switch ((int)k7/10) {
		case 10:
		case 9: res = "A학점";break;
		case 8: res = "B학점";break;
		case 7: res = "C학점";break;
		default:res = "F학점";break;
		}
		
		System.out.println(res);
		System.out.println("=========================");
	}
}
