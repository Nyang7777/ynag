package day09.com.cit.edu;

public class Ex08_Array {
	public static void main(String[] args) {
		// 다차원 배열 : 1차원 배열이 여러개 모인것
		// 다차원 배열의 종류 : 기본자료형, 참조자료형, 고정길이배열, 가변길이배열
		
		// 고정길이 배열
		// 1. 선언 : 자료형 이름[][] ;
		int su[][];
		
		// 2. 생성 : 이름 = new 자료형[][]
		su = new int[2][3]; // 2x3개
		
		// 3. 데이터 저장
		su[0][0]=10;
		su[0][1]=20;
		su[0][2]=30;

		su[1][0]=100;
		su[1][2]=200;
		su[1][2]=300;
		
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		
		// 다차원 배열
		System.out.println(su[0][0]);
		System.out.println(su[0][1]);
		System.out.println(su[0][2]);

		System.out.println(su[1][0]);
		System.out.println(su[1][1]);
		System.out.println(su[1][2]);
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		
		
		
		
	}
}
