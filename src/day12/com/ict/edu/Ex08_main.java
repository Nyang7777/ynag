package day12.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {

		Ex08_constructor coffee = new Ex08_constructor("커피", 1000);
		Ex08_constructor ion = new Ex08_constructor("이온", 1500);
		Ex08_constructor cola = new Ex08_constructor("탄산", 1200);
		Ex08_constructor juice = new Ex08_constructor("과일", 1800);

		Ex08_constructor[] arr = { coffee, ion, cola, juice };

		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 넣으세요");
		int input = scan.nextInt();
		
		// 반환 할거냐
			
		System.out.println("돈 돌려줄까"+"\n1.반환 or 2.구매");
		int money = scan.nextInt();
		
		// 조건문 넣어서 만들기 Y or N
			esc:
			if (money == 1) {
				break esc;
			} else {
				// 음료들의 최소금액을 구하자
				if (input < 1000) {
					System.out.println("금액부족");
					System.out.println(("잔돈: " + input));
					
				} else {
					System.out.println("커피 이온 탄산 과일");
				}
				
				// 입력금액과 각 음료수의 가격을 비교
				for (int i = 0; i < args.length; i++) {
					if (arr[i].getPrice() <= input) {
						System.out.print("o");
					} else {
						System.out.println("x");
					}
				}
				System.out.println();
				
				System.out.print("선택 :");
				String drink = scan.next();
				
				switch (drink) {
				case "커피":
					input = input - arr[0].getPrice();
					break;
				case "이온":
					input = input - arr[1].getPrice();
					break;
				case "주스":
					input = input - arr[2].getPrice();
					break;
				case "탄산":
					input = input - arr[3].getPrice();
					break;
				default:
					System.out.println("잘못 선택");
					input = input;
				}
				
				
				// 잔돈이 남으면 다시 선택or반환버튼
				// 잔돈이 -라면 금액부족 잔돈 출력
				
				
			}
			System.out.println("잔돈: " + input);
		
		
	}
}
