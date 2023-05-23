package day12.com.ict.edu;

import java.util.Scanner;

public class Ex03_main {
	public static void main(String[] args) {
		
		Ex03_getset coffee = new Ex03_getset();
		coffee.setName("커피음료");
		coffee.setPrice(1000);
		
		Ex03_getset ion = new Ex03_getset();
		ion.setName("이온음료");
		ion.setPrice(1500);
		
		Ex03_getset cola = new Ex03_getset();
		cola.setName("탄산음료");
		cola.setPrice(1200);
		
		Ex03_getset juice = new Ex03_getset();
		juice.setName("탄산음료");
		juice.setPrice(1200);
		
		Ex03_getset[] arr = {coffee, ion, cola,juice};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("금액을 넣으세요");
		int input = scan.nextInt();
		
		// 음료들의 최소금액을 구하자
		
		if(input < 1000) {
			System.out.println("금액부족");
			System.out.println(("잔돈: " + input));
					
		}else {
			System.out.println("커피 이온 탄산 과일");
		}
		
		// 입력금액과 각 음료수의 가격을 비교
		for (int i = 0; i < args.length; i++) {
			if(arr[i].getPrice() <= input) {
				System.out.print("o");
			}else {
				System.out.println("x");
			}
		}
		
		System.out.println();
		System.out.print("선택 :");
		String drink = scan.next();
		int output = 0;
		switch(drink) {
		case"커피":output = input - arr[0].getPrice(); break;
		case"이온":output = input - arr[1].getPrice(); break;
		case"주스":output = input - arr[2].getPrice(); break;
		case"탄산":output = input - arr[3].getPrice(); break;
		default :
			System.out.println("잘못 선택");
		output = input;
		
		}
		System.out.println("잔돈: "+output);
		
		
		
	}
}
