package day09.com.cit.edu;

import java.util.Scanner;

public class Ex06_Array {
	public static void main(String[] args) {
		
		// 인원수 입력받기
		// 이름 국어 영어 수학 입력받기
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("인원수 : ");
		int su = scan.nextInt();
		
		char[] k1 = new char[su];
		
		String[] name = new String[su];
		int[] kor = new int[su];
		int[] eng =new int[su];
		int[] math =new int[su];
		int[] sum =new int[su];
		double[] avg = new double[su];
		int[] rank = new int[su];
		String[] hak = new String[su];
		
		for (int i = 0; i < su; i++) {
			
			System.out.print("이름 : ");
			name[i] = scan.next();
			
			System.out.print("국어 : ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어 : ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학 : ");
			math[i] = scan.nextInt();
			
			sum[i] = kor[i] + eng[i] + math[i];
			
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			if(avg[i]>=90) {
				hak[i] = "A학점";
			}else if(avg[i]>=80) {
				hak[i] = "B학점";
			}else if(avg[i]>=70) {
				hak[i] = "C학점";
			}else {
				hak[i] = "F학점";
			}
			
			rank[i]=1;
			
		}
		
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if(i==j) continue;
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		for (int i = 0; i < su; i++) {
			System.out.print(name[i]+" ");
			System.out.print(sum[i]+" ");
			System.out.print(avg[i]+" ");
			System.out.print(hak[i]+" ");
			System.out.println(rank[i]+" ");
		}
		
		
		
		
		
		
	}
}
