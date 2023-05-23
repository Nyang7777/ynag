package day05.com.ict.edu;

public class Ex04_while {
	public static void main(String[] args) {
		
		//while문 : for문과 같은 반복
		//형식
		//	초기식;
		//	while(조건식){
		//		조건식이 참이면 실행 문장;
		//		조건식이 참이면 실행 문장;
		//		증감식;
		//	}
		//	while 문의 끝을 만나면 조건식으로 간다
		
		//형식2
		//	초기식;
		//	while(true){
		//		if(빠져나갈 조건){
		//		break;
		//		}
		//		조건식이 참이면 실행 문장;
		//		조건식이 참이면 실행 문장;
		//		증감식;
		//	}
		//	while 문의 끝을 만나면 조건식으로 간다
		
		// 1~10까지
		int i = 1;
		while (i<11) {
			System.out.println("i = "+i);
			i++;
		}
		System.out.println("==========================");
		
		i=1;
		while (true) {
			if(i >= 11) break;
			System.out.println("i = "+i);
			i++;
		}
		System.out.println("==========================");
		
		// 0~10 짝수
		i = 0;
		while (i<11) {
			if(i%2==0) {
			System.out.println(i);
			}
			i++;
		}
		
		System.out.println("==========================");
		
		// 7단 구구단
		i = 2;
		while (i<10) {
			System.out.println(7+"*"+i+ "=" + 7*i);
			i++;
		}
		System.out.println("==========================");
		
		// 1~10 누적합
		i=0;
		int i2=0;
		while (i<11) {
			i2=i2+i;
			i++;
		}
		System.out.println(i2);
		System.out.println("==========================");
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		
		i=1;
		while (i<5) {
			System.out.println("0 0 0 0");
			i++;
		}
		System.out.println("==========================");
		
		i=1;
		while (i<17) {
			System.out.print("0 ");
			if (i%4==0) {
				System.out.println();
			}
			i++;
		}
		System.out.println("==========================");
		
		 // if else문 농구공 5개씩 한박스에 들어간다
		 // 40개면 8상자, 26개면 6상자이다
		 // int k1=127 몇 박스가 필요할까
		  int k1= 127;
		  int box=0;
		  if (k1%5>0) {
			box = k1/5+1;
		} else {
			box = k1/5;
		}
		System.out.println(box);
		System.out.println("==========================");
		
		 // for문으로 풀기
		 // 0 0 0 0 
		 // 0 0 0 0 
		 // 0 0 0 0 
		 // 0 0 0 0
		for (int j = 1; j < 17; j++) {
			System.out.print("0 ");
			if (j%4==0) {
				System.out.println();
			}
		} 
		System.out.println("==========================");
		
		 // 이중 for문으로 풀기
		 // 1 0 0 0
		 // 0 1 0 0
		 // 0 0 1 0 
		 // 0 0 0 1
		
				for (int j = 0; j < 4; j++) {
					
					for (int j2 = 0; j2 < 4 ; j2++) {
						if (j2==j) {
							System.out.print("1");
						} else 
							System.out.print("0");
					} System.out.println("");
				}
				
				System.out.println("==========================");
		  
		 // for문
		 // 1+ -2 + 3 + -4 + 5 + -6 +... 몇까지 더해야 총합이 100이 넘어갈까 199
		
		
		
		
		System.out.println("==========================");
		
		 // for문
		 // *
		 // **
		 // ***
		 // ****
		
		for (int j = 0; j < 4; j++) {
			for (int j2 = 0; j2<=j; j2++) {
					System.out.print(" ");
				} System.out.println("*");
			}
		

		  
		 //    *
		 //   **
		 //  ***
		 // ****
		
		 
	}
}
