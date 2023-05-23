package day14.com.ict.edu;

public class Ex01_String {
	public static void main(String[] args) {
		String s1 = "ictdeu";
		String s2 = "ictdeu";
		String s3 = new String("ictdeu");
		String s4 = new String("ictdeu");
		char[] ch = {'i','c','t','e','d','e'};
		String s5 = new String(ch);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		if(s1==s2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(s1==s3) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(s1==s4) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(s1==s5) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		System.out.println();
		
		if(s1.equals(s3)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(s1.equals(s4)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(s1.equals(s5)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		s1 = s1 + "대한민국";
		System.out.println(s1);
		System.out.println(s2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
