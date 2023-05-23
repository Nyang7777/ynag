package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex04_scanner4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("원하는 반복 횟수: ");
		int su = scan.nextInt();
		
		System.out.print("원하는 단어 : ");
		String str = scan.next();
		
		for (int i = 0; i < su ; i++) {
			System.out.println(str);
		}
		System.out.println("=====================");
		int i = 0;
		while (i<su) {
			System.out.println(str);
			i++;
		}
		*/
		
		
		//원하는 회수를 입력 받고 
		//숫자를 입력 받아서 
		//입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
		
		System.out.print("원하는 반복 횟수: ");
		int su2 = scan.nextInt();
		
		for (int j = 0; j < su2; j++) {
			
			System.out.print("숫자 : ");
			int su3 = scan.nextInt();
			
			if (su3%2==0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
		   } 
		}
		
		
		//이름, 국어, 영어, 수학를 입력 받아서 
		//총점, 평균, 학점을 구하고 
		//이름, 총점, 평균, 학점을 출력하는 코딩 
		//(평균은 소숫점 첫째자리까지 구하자)
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		double vudrbs= kor+eng+math;
		
		int gkrwja = 0;
		if (gkrwja >=90) {
			System.out.println("이름: "+name+" 총합: "+(kor+eng+math)+" 평균: "+((int)(vudrbs/3*10)/10.0)+" 학점: "+"A학점");
		 } else if (gkrwja >=80) {
			System.out.println("이름: "+name+" 총합: "+(kor+eng+math)+" 평균: "+((int)(vudrbs/3*10)/10.0)+" 학점: "+"B학점");
		 } else if (gkrwja >=70) {
			System.out.println("이름: "+name+" 총합: "+(kor+eng+math)+" 평균: "+((int)(vudrbs/3*10)/10.0)+" 학점: "+"C학점");
		 } else 
			System.out.println("이름: "+name+" 총합: "+(kor+eng+math)+" 평균: "+((int)(vudrbs/3*10)/10.0)+" 학점: "+"F학점");
			
			
		
		//첫번째 숫자 받기
		//두번째 숫자 받기
		//연산자 받기("1 => 첫번째수 + 두번째수 \n, 2 => 첫번째수-두번째수 \n, 3 => 첫번째수*두번째수 \n, 4 =>  첫번째수/두번째수 \n >>>> ")
		
		
		System.out.print("첫번째 수: ");
		int su = scan.nextInt();
		
		System.out.print("두번째 수: ");
		int su5 = scan.nextInt();
		
		System.out.print("연산: ");
		int su3 = scan.nextInt();
		
		int ekq =0;		
		if (su3==1) {
			ekq= su+su5;
		} else if (su3==2) {
			ekq= su-su5;
		} else if (su3==3) {
			ekq= su*su5;
		} else if (su3==4) {
			ekq= su/su5;
		} 
			System.out.println("정답: "+ekq);
			
		
		
	}
}
