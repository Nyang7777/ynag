package day07.com.ict.edu;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 원하는 횟수 받기
		// 원하는 숫자 받기
		// 매 숫자가 홀수냐 짝수냐
		
		System.out.print("원하는 횟수 : ");
		int su = scan.nextInt();
		
		for (int i = 0; i < su; i++) {
			System.out.print("숫자 입력: ");
			int num = scan.nextInt();
			String res = "";
			if (num%2==0) {
				res = "짝수";
			}else {
				res = "홀수";
			}
			System.out.println("입력한 "+num+"는 "+res);
		}
		
		
		
		
		
	}
}
