package day03.com.ict.edu2;

public class Test05 {
	public static void main(String[] args) {
		
		int su = 3781;
		
		// 결과 
		// 천의자리 : 3
		// 백의자리 : 7
		// 십의자리 : 8
		// 일의자리 : 1
		
		int c =0;
		int b =0;
		int s =0;
		int i =0;
		int res =0;
		
		c = su / 1000;
		res = su % 1000;
		
		b = res / 100;
		res = res % 100;
		
		s = res / 10;
		i = res % 10;
		
		System.out.println("천의 자리 : "+c);
		
		System.out.println("백의 자리 : "+b);
		
		System.out.println("십의 자리 : "+s);
		
		System.out.println("일의 자리 : "+i);

	}
}
