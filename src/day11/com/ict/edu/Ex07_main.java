package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		
		Ex07_method test = new Ex07_method();
		
		for (int i = 0; i < hak.length; i++) {
			System.out.println("이름: ");
			name[i] = scan.next();
			
			System.out.println("국어: ");
			kor[i] = scan.nextInt();
			
			System.out.println("영어: ");
			eng[i] = scan.nextInt();
			
			System.out.println("수학: ");
			math[i] = scan.nextInt();
			
			// 총점
			test.getsum(kor[i], eng[i], math[i]);
			sum[i] = test.sum;
			
			// 평균
			test.getavg();
			avg[i] = test.avg;
			
			// 학점
			test.gethak();
			hak[i] = test.hak;
		}
		
		// 출력
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i]+" ");
			System.out.print(sum[i]+" ");
			System.out.print(avg[i]+" ");
			System.out.println(hak[i]+" ");
		}
	}
}
