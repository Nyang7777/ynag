package day05.com.ict.edu;

public class Ex03_for2 {
	public static void main(String[] args) {
		
		// 중첩 for문 : for문 안에 또 다른 for문 넣기
		for (int i = 2; i < 10; i++) {
			System.out.println(i+"단");
			
			for (int j = 1; j < 10; j++) {
				System.out.println(i+"*"+j+ "="+ (i*j));
			} // 안쪽 for문 끝나는 지점
			System.out.println();
		} // 바깥쪽 for문 끝나는 지점
		
		System.out.println("==========================");
		for (int i = 2; i < 10; i++) {
			System.out.println();
			
			for (int j = 1; j < 10; j++) {
				System.out.print(i+"*"+j+ "="+ (i*j)+" ");
			} // 안쪽 for문 끝나는 지점
			System.out.println();
		} // 바깥쪽 for문 끝나는 지점
		System.out.println("==========================");
		
		for (int j = 1; j < 10; j++) {
			System.out.println();
			
			for (int i = 2; i < 10; i++) {
				System.out.print(i+"*"+j+ "="+ (i*j)+" ");
			} // 안쪽 for문 끝나는 지점
			System.out.println();
		} // 바깥쪽 for문 끝나는 지점
		
		
	}
}
