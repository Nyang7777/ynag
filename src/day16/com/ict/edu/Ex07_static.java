package day16.com.ict.edu;

public class Ex07_static {
	public class Inner01 {
		String name = "홍길동";
		private int age = 24;
		static boolean gender = true;
		
		public Inner01() {
			System.out.println("외부: "+this);
		}
		
		public void paly() {
			int money = 1000;
			System.out.println("외부 메서드: "+name);
			System.out.println("외부 메서드: "+money);
		}
		
		// 내부클래스의 멤버변수가 static이면 class를 static으로 만들어야한다
		// 권장사항은 아님 ( 일반클래스에서는 static 사용 못함)
		public  class Inner02{
			String addr = "서울 마포구";
			static int roomNumber = 1;
			
			static int count= 30;
			
			public Inner02() {
				System.out.println("내부 생성자: "+this);
			}
			
			public void prn() {
				int weight = 79;
				System.out.println(addr);
				System.out.println(roomNumber);
				
				// 외부클래스의 멤버도 마은대로 사용하다
				System.out.println(name);
				System.out.println(age);
				System.out.println(gender);
				
				// 외부클래스의 메소드 호출가능
				paly();
			}
		}
}
}