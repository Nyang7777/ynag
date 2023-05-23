package day07.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int p =0;
		int w =0;
		
		while(true) {
			
		System.out.print("숫자입력 : ");
		int su = scan.nextInt();
		p++;
		
		String str = "";
		if (su%2==0) {
			str = "짝수";
			w++;
		}else {
			str = "홀수";
		}
		System.out.println(su+"는 "+str+" 입니다");
		
		esc:
		while(true) {
			System.out.println("계속? (1. y 2. n)");
			String s1 = scan.next();
			if(s1.equalsIgnoreCase("y"))  {
				continue esc;
			}else if(s1.equalsIgnoreCase("n")){
				break esc;
				// 1, 2 외 다른 숫자 입력시 다시 입력 만들기
			}else {
				System.out.println("다시 입력");
				continue;
			}
			
							 // 전체 반복 횟수, 짝수 횟수, 짝수 입력 비율구하기 % (x.x%)
			} 
		}
		
		
		
		
		
		
		
		
		
		
	}
}
