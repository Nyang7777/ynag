package day06.com.ict.edu;

public class Ex03_break_continue {
	public static void main(String[] args) {
		
		// break와 continue
		// break : 현재 들어가있는 블록 탈출하기위한 예약
		// continue :  continue문을 만나면 아래 수행문을 포기하고 다음회차를 하기 위해서 증감식으로 이동
		// break는 for문, while문에서 사용 continue는 for문에서 사용
		// 보통 if문과 함께 사용됨
		
		// 1~10
		for (int i = 0; i < 11; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=================================");
		
		// 1~10 6일때 break
		for (int i = 0; i < 11; i++) {
			if (i == 6) break; 
			
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 0; i < 11; i++) {
			System.out.print(i+" ");
			
			if (i == 6) break; 
		}
		System.out.println();
		System.out.println("=================================");
		
		// 1~10 6일때 continue
		for (int i = 0; i < 11; i++) {
			if (i == 6) continue; 
					
			System.out.print(i+" ");
		}
		System.out.println();
				
		for (int i = 0; i < 11; i++) {
			System.out.print(i+" ");
					
			if (i == 6) continue; 
		}
		System.out.println("=================================");
		
		//0~10까지 홀수만
		for (int i = 0; i < 11; i++) {
			if (i%2==0) continue;
			
			System.out.println(i);
			}
		
		
		
	}
}
