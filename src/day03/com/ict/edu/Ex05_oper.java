package day03.com.ict.edu;

public class Ex05_oper {
	public static void main(String[] args) {
		// ||=or(논리합) 합집합, 조건중 하나라도 true일때 true 값이 나온다
		// true 만나는 순간 뒤에있는 값 계산 안함
		
		int su1= 10;
		int su2= 7;
		
		boolean result;
		
		result = (su1 >= 7) || (su2 >= 5);
		System.out.println("결과 :"+result);
		
		result = (su1 <= 7) || (su2 >= 5);
		System.out.println("결과 :"+result);
		
		result = (su1 >= 7) || (su2 <= 5);
		System.out.println("결과 :"+result);
		
		result = (su1 <= 7) || (su2 <= 5);
		System.out.println("결과 :"+result);
		
		System.out.println("=================================");
		
		result=((su1=su1+2)>su2)||(su1==(su2=su2+5));
		System.out.println("결과 : "+result);
		System.out.println("su1 : "+su1);
		System.out.println("su2 : "+su2);
		
		System.out.println("=================================");
		
		// ! = not(부정) 논리부정
		// 주어진 논리값을 반대로 출력
		// true -> false , false -> true
		
		boolean res = true;
		System.out.println(res);
		System.out.println(!res);
		
		
	}

}
