package day03.com.ict.edu2;

public class Test03 {
	public static void main(String[] args) {
		
		// 3989초는 몇시간 몇분 몇초일까
		
		int time = 8456;
		
		double tlrks = time/(60*60);
		double tlrks2 = time%(60*60);
		double qns = (tlrks2) / 60;
		double ch = (qns *60 - (int)qns *60);
		
		System.out.println((int)tlrks+"시간");
		
		System.out.println((int)qns+"분");
		
		System.out.println((int)ch+"초");
		
		System.out.println((int)tlrks+"시간 "+(int)qns+"분 "+(int)ch+"초");

		System.out.println("=====================");
		
		int time2 =8456;
		int h = 0;
		int m = 0;
		int s = 0;
		int res = 0;
		
		h = time2/ (60*60);
		res = time2 % (60*60);
		m = res / 60;
		s = res % 60;
		
		System.out.println(h+"시간"+m+"분"+s+"초");
		
	}
}
