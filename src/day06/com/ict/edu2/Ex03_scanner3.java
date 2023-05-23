package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_scanner3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 나라 -> 수도
		// 한국 -> 서울, 중국 -> 베이징, 일본 -> 도쿄, 미국 -> 워싱턴, 데이터 없음
		// (switch~case)
		System.out.print("나라 : ");
		String skfk = scan.next();
		switch (skfk) {
			case "한국": skfk = "서울"; break;
			case "일본": skfk = "도쿄"; break;
			case "중국": skfk = "베이징"; break;
			case "미국": skfk = "워싱턴"; break;
				default: skfk = "데이터 없음"; break;
			}
		System.out.println("도시 : "+skfk);
		
		// 근무시간 8시간 시간당 9620
		// 초과시 시급 1.5배
		// 근무 10시간 얼마 받아야되냐
		System.out.print("근무시간 : ");
		int dlarma = 0;
		int i = scan.nextInt();
		if (i<=8) {
			dlarma = 9620*i;
		} else {
			dlarma = (int)(9620*1.5*(i-8))+(9620*8);
		}
		System.out.println("입금 : "+dlarma);
		
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
        // 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
        // 친구와 함께 2잔을 10000 내고 먹었다.
        // 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
        // (친구와 같은 음료을 먹어야 한다.)
         System.out.print("메뉴 고르기"+"\n"+"1. 카페모카"+"\n"+"2. 카페라떼"+"\n"+"3. 아메리카노"+"\n"+"4. 과일쥬스"+"\n"+"메뉴 : ");
         int chddor = 0;
         int sjgdmsehs =10000;
         int su = 2;
          int j= scan.nextInt();
          switch (j) {
			case 1:chddor = sjgdmsehs-(int)((3500*su)*1.1);break;
			case 2:chddor = sjgdmsehs-(int)((4000*su)*1.1);break;
			case 3:chddor = sjgdmsehs-(int)((3000*su)*1.1);break;
			case 4:chddor = sjgdmsehs-(int)((3500*su)*1.1);break;
	          }
		System.out.println("잔돈 : "+chddor);
		
		
	}
}
