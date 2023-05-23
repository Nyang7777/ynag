package day11.com.ict.edu;

public class Ex05_AnimalTest {
	public static void main(String[] args) {
		// 객체 생성
		Ex05_Animal t1 = new Ex05_Animal();{
			
			
			// 이름 : 큰뿔소
			t1.setname("큰뿔소");
						
			// 나이 : 3살
			t1.setage(3);
			
			// 생존여부 : 살아있다
			t1.setlive(true);
						
			// 결과 출력 
			String m1 = t1.qksgksname();
			System.out.println(m1);
			
			int m2 = t1.qksghksage();
			System.out.println(m2);
			
			boolean m3 = t1.qksghkslive();
			System.out.println(m3);
			
			// 이름을 펭귄으로 나이를 1살 생존여부는 살아있음으로 바꾼다
			t1.setname("펭귄");
			t1.setage(1);
			t1.setlive(true);
			
			// 결과
			String r1 = t1.qksgksname();
			System.out.println(r1);
			
			int r2 = t1.qksghksage();
			System.out.println(r2);
			
			boolean r3 = t1.qksghkslive();
			System.out.println(r3);
			
			t1.play("펭귄", false, 2);
			t1.prn();
			
			t1.play("남자", true,1 );
			t1.prn();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
