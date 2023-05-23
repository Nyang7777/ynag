package day07.com.ict.edu;

public class Test01 {
	public static void main(String[] args) {
	
		// 1+ -2 +3 + -4 +5 + -6 +7 + -8 +9 + -10
		
		int sum =0;
		for (int i = 0; i < 11; i++) {
			if (i%2==0) {
				sum = sum + (i*-1);
			} else {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		System.out.println("============================");
		
		// 농구공 5개씩 한박스 26개면 6상자 127개이면 몇 상자?
		int k1 = 127;
		int res = k1 / 5;
		if (k1%5 !=0) {
			res = res +1;
		}
		System.out.println("결과 : "+res);
		System.out.println("============================");
		
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0

		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println("============================");
		
		for (int i = 1; i < 17; i++) {
			System.out.print("0");
			if (i%4==0) {
				System.out.println();
			}
		}
		System.out.println("============================");
		
		
		
		// 1 0 0 0 한줄 = 큰 for문 줄 안에 개별찍기 = 작은 for문
		// 0 1 0 0			
		// 0 0 1 0
		// 0 0 0 1
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i==j) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		System.out.println("============================");
		
		// 1+ -2 +3 + -4 +5 + -6 +7 + -8 +9 + -10 ... 100이상 값이 나올때는 언제냐
		
		int sum2 = 0;
		int cnt = 0;
		int i=1;
		while(true) {
			
			if(i%2==0) {
				sum2 = sum2 +(i*-1);
			}else {
				sum2 = sum2 + (i*1);
			}
			
			cnt=i;
			if (sum2>=100) {
				break;
			}
			
			i++;
		}
			System.out.println(cnt);
		
		
		
		
	}
}
