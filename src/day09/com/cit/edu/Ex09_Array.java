package day09.com.cit.edu;

public class Ex09_Array {
	public static void main(String[] args) {
		
		// 선언과 생성을 하나로
		// 자료형[][] 이름 = new 자료형[][];
		
		char[][] ch = new char[4][2];
		
		// 고정길이 일때만 가능
		ch[0][0] = 'A';
		ch[0][1] = 'a';
		
		ch[1][0] = 'B';
		ch[1][1] = 'b';
		
		ch[2][0] = 'C';
		ch[2][1] = 'c';
		
		ch[3][0] = 'D';
		ch[3][1] = 'd';
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.println(ch[i][j]);
			}
		}
		System.out.println("=================================");
		// 고정길이, 가변길이
		int[][] su = new int[3][];
		
		int[] k1 = {10,20,30};
		int[] k2 = {100,200};
		int[] k3 = {1000,2000,3000,4000};
		
		su[0]=k1;
		su[1]=k2;
		su[2]=k3;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		System.out.println("=================================");
		
		// 선언, 생성, 초기값, 저장
		
		String[][] str = {{"java","JAVA"},{"가나","초코렛"},{"12","89"},{"kkk","@@@"}};
		
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
		}
		
		
		
		
	}
}
