package day09.com.cit.edu;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생 수: ");
		int su = scan.nextInt();
		double[][] arr2 = new double[su][8];
		for (int i = 0; i < arr2.length; i++) {
			// for문 실행 될 때마다 한사람의 정보를 담을 수 있는 배열을 만들자
			double[] p = new double[8];
			
			System.out.println("번호: ");
			p[0] = scan.nextInt();
			
			System.out.println("국어: ");
			p[1] = scan.nextInt();
			
			System.out.println("영어: ");
			p[2] = scan.nextInt();
			
			System.out.println("수학: ");
			p[3] = scan.nextInt();
			
			p[4] = p[1] + p[2] + p[3];
			
			p[5] = (int)(p[4]/3.0*10)/10.0;
			
			if(p[5]>=90) {
				p[6] = 'A';
			}else if(p[5]>=80) {
				p[6] = 'B';
			}else if(p[5]>=70) {
				p[6] = 'C';
			}else {
				p[6] = 'F';
			}
			p[7] =1;
			// 다차원 배열에 넣기
				
			arr2[i] = p; 
		}
		// 순위
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr2[i][4]==arr2[j][4])continue;
				if(arr2[i][4] < arr2[j][4]) {
					arr2[i][7]++;
				}
			}
		}
		
		//  순위 정렬
		double[] tmp = new double[8];
		for (int i = 0; i < arr2.length-1; i++) {
			for (int j = i+1; j < arr2.length; j++) {
				if(arr2[i][7]>arr2[j][7]) {
					tmp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=tmp;
					
				}
			}
		}
		
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				// 국어 영어 수학은 제외하고 출력
				if(j==1 || j==2 || j==3) continue;
				if(j == 5) {
					System.out.print(arr2[i][j]+" ");
				}else if(j==6){
					System.out.print((char)(arr2[i][j])+" ");
				}else {
					System.out.print((int)(arr2[i][j])+" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
