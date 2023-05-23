package day03.com.ict.edu2;

public class Test01 {
	public static void main(String[] args) {
		
		// 이름이 홍길동인 사람의 점수가
		// 국어 90, 엉어 80, 수학 80
		// 총점과 평균을 구해라
		// 출력은 이름 총점 평균만 출력
		// 단, 평균은 소수점 첫째자리까지만
		
		String name = "홍길동";
		System.out.println(" 이름 : "+name);
		
		int kor = 90;
		int eng = 80;
		int math = 80;
		
		int total = kor+eng+math;
		System.out.println(" 합계 : "+total);
		
		double vudrbs = total/3.0;
		double vudrbs2 = (int)(vudrbs*10)/10.0;
		
		System.out.println(" 평균 : "+vudrbs2);
	}
}
