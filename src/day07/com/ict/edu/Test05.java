package day07.com.ict.edu;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("첫번째 수: ");
		int s1 = scan.nextInt();
		
		System.out.print("세번째 수: ");
		int s2 = scan.nextInt();
		
		System.out.println("연산: \n1 -> + \n2 -> - \n3 -> * \n4 -> /");
		int s3 = scan.nextInt();
		
		double res = 0.0;
		String oper="";
		
		if(s3 == 1) {
			res = s1 + s2;
			oper="+";
		}else if(s3==2) {
			res = s1 - s2;
			oper="-";
		}else if(s3==3) {
			res = s1 * s2;
			oper="*";
		}else if(s3==4) {
			res = (int)(s1 * 10 / s2 ) / 10.0;
			oper="/";
		}
		System.out.println(s1 +oper+ s2+"="+res);
		
		
	}
}
