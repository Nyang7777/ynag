package day07.com.ict.edu2;

public class Ex02_String {
	public static void main(String[] args) {

		// String 클래스는 문자열을 처리하는 클래스
		// 기본자료형은 아니지만 기본자료형처럼 사용

		// String에서 자주사용되는 메서드들
		// 메서드(인자) : 실행 결과의 자료형
		// 인자 = 실행하기위한 재료를 받는것
		// 1. charAt(int index) : char
		// 위치정보 = index를 받아서 해당 위치에 존해하는 글자를 char형으로 반환

		String str = "한국 ICT 인재개발원 1강의장";
		char k1 = str.charAt(1);
		System.out.println(k1);

		str = "대한민국 I Love You 15";
		// 모두 대문자로 만들기 ( 대문자는 그대로, 소문자는 대문자로(-32) )
		// str.length() -> str의 길이를 구해준다
		for (int i = 0; i < 18 /* str.length() */; i++) {
			char k2 = str.charAt(i);
			if (k2 >= 'a' && k2 <= 'z') {
				System.out.print((char) (k2 - 32));
			} else {
				System.out.print(k2);
			}
		}
		System.out.println();
		System.out.println("=============================");

		// 2. concat(String str) : String
		// 입력된 문자열을 현재 문자열과 합친다 ( "문자열" + "문자열" )
		String s1 = "대한민국";
		String s2 = "KOREA";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1 + s2);
		System.out.println("=============================");

		// 3. contains(CharSequence s) : boolean
		// CharSequence : char 값을 읽을 수 있는 시퀀스 인터페이스, String 비슷함
		// 현재 갖고있는 문자열 중에 인자로 들어온 문자나 문자열을 갖고 있으면 true, 없으면 false
		String s4 = "KOREA @ 대한민국";
		System.out.println(s4.contains("@"));
		System.out.println(s4.contains("REA"));
		System.out.println(s4.contains("rea"));
		System.out.println("=============================");

		// 4. equals(Object anObject): boolean
		// 입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별함)
		// 5. equalsIgnoreCase(String anotherString) : boolean
		// 입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구별안함)

		String d1 = "Korea";
		String d2 = "KOREA";
		System.out.println(d1.equals(d2));
		System.out.println(d1.equalsIgnoreCase(d2));
		System.out.println("=============================");

		// 6. format(String format, Object... args) : static String
		// 형식을 지정하고 형식에 맞춰 생성
		String s7 = "ICT 인재 개발원";
		// 문자열 -> %s
		String s8 = String.format("%s", s7);
		System.out.println(s8);

		// %30s 30자리 차리하는 문자열 (남은 자리는 비워둔다) 자동 오른쪽 정렬
		// 숫자가 문자수보다 작을경우 원본 출력한다
		s8 = String.format("%30s", s7);
		System.out.println(s8);

		// %.?s ?숫자만큼만 출력
		s8 = String.format("%.5s", s7);
		System.out.println(s8);

		// %-30s 자동 왼쪽 정렬
		s8 = String.format("%-30s", s7);
		System.out.println(s8);
		System.out.println("=============================");

		// %d 정수 형식지정
		int s9 = 2313214;
		s8 = String.format("%d", s9);
		System.out.println(s8);

		// 오른쪽 정렬 + d
		// %05d 빈공간 0으로 채운다
		s8 = String.format("%05d", s9);
		System.out.println(s8);

		// 왼쪽 정렬 + d
		s8 = String.format("%-20d", s9);
		System.out.println(s8);

		// , 세자리마다 ,표시
		s8 = String.format("%,d", s9);
		System.out.println(s8);

		// %f = 실수형식
		double s10 = 1245.44567954;
		System.out.println(String.format("%f", s10));
		System.out.println(String.format("%20f", s10));
		System.out.println(String.format("%.3f", s10));
		System.out.println(String.format("%.1f", s10));
		System.out.println(String.format("%,.1f", s10));

		// printf()에 대해 알아보기

		System.out.println("=============================");

		// 7. getBytes() : byte[]
		// 해당 문자열을 byte[]로 변환시킨다
		// 입출력할때 많이 사용한다. (영어 대소문자 숫자 일부 특수문자만 가능 (아스키 코드))
		String a1 = "java";
		byte[] b1 = a1.getBytes();
		System.out.println(b1[0]);
		System.out.println(b1[1]);
		System.out.println(b1[2]);
		System.out.println(b1[3]);

		System.out.println("=============================");

		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}

		// 9. hashCode() : int
		// 일반적인 hashCode는 객체의 주소값을 변환하여 생성한 객체의 고유한 정수값
		// String hashCode는 각 문자열에서 정수값으로 변경

		String a2 = "홍길동";
		System.out.println(a2.hashCode());

		String a3 = "홍길동";
		System.out.println(a3.hashCode());

		// 문자열일때 == 주소가 같냐? 문자끼리 비교할때 사용X
		System.out.println(a2 == a3);

		// 문자열일때 equals 내용이 같냐? 문자끼리 비교할때 사용
		System.out.println(a2.equals(a3));
		System.out.println("=============hashCode================");

		// 9. indexOf(int ch), indexOf(String str) : int
		// 입력된 char, String 해당 문자열에 char나 String의 위치값을 알려준다
		// 찾는 문자나 문자열이 없으면 -1 반환
		String a4 = "BufferedReader";

		// 'R' 찾아
		System.out.println(a4.indexOf('R'));
		// 'r' 찾아
		System.out.println(a4.indexOf('r'));
		// 'K' 찾아
		System.out.println(a4.indexOf('K'));
		// 'er' 찾아
		System.out.println(a4.indexOf("er"));
		System.out.println("=============================");

		// 10. lastIndexOf(int ch), lastIndexOf(String str) : int
		// 마지막 위치값을 알려준다
		System.out.println(a4.lastIndexOf('R'));
		System.out.println(a4.lastIndexOf('r'));
		System.out.println(a4.lastIndexOf('K'));
		System.out.println(a4.lastIndexOf("er"));
		System.out.println("=============================");

		// 11. indexOf(int ch, int fromIndex), indexOf(String str, int fromIndex) : int
		// 문자나 문자열 찾기
		// fromIndex -> 시작 위치값
		System.out.println(a4.indexOf('e', 0));

		// 첫번째 'e'의 위치가 4
		System.out.println(a4.indexOf('e', 5));
		System.out.println(a4.indexOf('e', a4.indexOf('e', 0) + 1));

		// 두번째 'e'의 위치가 6
		System.out.println(a4.indexOf('e', 7));
		System.out.println(a4.indexOf('e', a4.indexOf('e', a4.indexOf('e', 0) + 1) + 1));
		System.out.println("=============================");

		// 12. length() : int -> 문자열의 길이 -> 1부터 시작
		// 문자열의 위치(index)-> 0부터시작
		System.out.println(a4.length());
		System.out.println("=============================");

		// 13. replace(char oldChar, char newChar) : String
		// replace(String oldStr, char newStr) : String
		// 새로운 문자나 문자열을 받아서 바꾼다

		String a5 = "대한민국";
		String a6 = a5.replace('한', '韓');
		String a7 = a5.replace("1", "(●'◡'●)");
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println("===============replace==============");

		// 이름 가운데 전부 '*'만들기
		String o = "가나다";
		int b = o.length();
		String c = "";

		for (int i = 0; i < o.length(); i++) {
			char q = o.charAt(i);
			if (i == 0 || i == o.length() - 1) {
				c += q;
			} else {
				c += "*";
			}

		}
		System.out.println(c);
		System.out.println("================String================");
		// 전화번호 끝자리 * 바꾸기
		o = "010-1111-2222";
		int t2 = o.length();
		int t3 = o.lastIndexOf("-");
		String res = "";

		for (int i = 0; i < o.length(); i++) {
			char s = o.charAt(i);
			if (i >= 0 && i <= t3) {
				res += s;
			} else {
				res += "*";
			}
		}
		System.out.println(res);

		// 전화번호 가운데 * 바꾸기
		o = "010-1111-2222";
		t2 = o.length();
		t3 = o.lastIndexOf("-");
		int t4 = o.indexOf("-");
		res = "";

		for (int i = 0; i < o.length(); i++) {
			char s = o.charAt(i);
			if (i >= t4 + 1 && i <= t3 - 1) {
				res += "*";
			} else {
				res += s;
			}
		}
		System.out.println(res);
		System.out.println("=============================");

		// 14. isEmpty() : boolean
		// 해당 문자열이 비어있으면 true, 있으면 false
		String t5 = "HelloWorld";
		System.out.println(t5.isEmpty());

		t5 = "";
		System.out.println(t5.isEmpty());
		System.out.println("=============================");

		// 15. split(String regex) : String[]
		// split(String regex, int limit) : String[]
		// regex -> 구분자(나누는 기준), limit -> 배열의 크기 (방의 갯수 마지막 방 안에는 남은거 다 들어감)

		t5 = "사과,딸기,망고,@오렌지,두리안,용과";
		String[] arr = t5.split(",");

		/*
		 * System.out.println(arr[0]); System.out.println(arr[1]);
		 * System.out.println(arr[2]); System.out.println(arr[3]);
		 * System.out.println(arr[4]); System.out.println(arr[5]);
		 */

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=============================");

		String[] arr2 = t5.split(",", 3);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		// 16. substring(int beginIndex) : String
		// 입력된 시작위치부터 끝까지 문자열 추출
		String t6 = "010-2222-3333";
		String t7 = t6.substring(4);
		System.out.println(t7);

		t7 = t6.substring(9);
		System.out.println(t7);

		t7 = t6.substring(t6.lastIndexOf("-") + 1);
		System.out.println(t7);
		System.out.println("=============================");

		// 16-2 substring(int beginIndex, int endIndex) : String
		// endIndex 위치는 포함하지 않는다
		t7 = t6.substring(4, 8);
		System.out.println(t7);

		// 첫글자 가져오기
		t7 = t6.substring(0, 1);
		System.out.println(t7);
		System.out.println("=============================");

		// 010-1111-3333 - > 010 - **** - 4444 -> 010-6666-7777
		String t8 = "010-6666-6666";
		String t9 = "****";
		String t10 = t8.replace(t8.substring(4, 8), t9);
		System.out.println(t10);

		t10 = t8.replace(t8.substring(t8.indexOf("-") + 1, t8.lastIndexOf("-")), t9);
		System.out.println(t10);

		String[] arr3 = t8.split("-");
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println("=============================");

		// 17. toLowerCase() : String -> 해당문자열을 모두 소문자로
		// toUpperCase() : String -> 해당문자열을 모두 대문자로

		String str1 = "JavaLand03Exam";
		String str2 = "";
		String str3 = str1.toLowerCase();

		for (int i = 0; i < str1.length(); i++) {
			char k = str1.charAt(i);
			if (k >= 'a' && k <= 'a') {
				str2 = str2 + (char) ((k - 32));
			} else {
				str2 = str2 + k;
			}
		}
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("=============================");

		// 18. toString : String
		// 객체(클래스)에서 toString : 모든 클래스에서 사용가능한 메서드
		// 클래스가 가지고있는 정보나 데이터들을 문자열로 만들어서 반환한다
		// String에서의 toString : 문자열 자체를 반환
		String u1 = "java 11 자바 11";
		String u2 = u1.toString();
		System.out.println(u2);
		System.out.println(u1);

		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println("=============================");

		// 19. trim() : String
		// 해당 문자열의 앞 뒤 공백 제거 중간은 제거 못함
		String u3 = "     java      자바      JAVA      ";
		System.out.println(u3.length());

		String u4 = u3.trim();
		System.out.println(u4.length());
		System.out.println(u4);
		System.out.println("=============================");

		// 20. startsWith(String prefix) : boolean
		// 주어진 문자열로 시작하는지 검색
		// startsWith(String prefix, int toffset) : boolean
		// 주어진 문자로 시작하는지 검색, toffset -> 시작위치
		// endWih(String fuffix) : boolean
		// 주어진 문자로 끝나는지 검사

		String u5 = "java   자바   JAVA";
		System.out.println(u5.startsWith("JAVA"));
		System.out.println(u5.startsWith("java"));
		System.out.println(u5.startsWith("자바"));

		System.out.println(u5.endsWith("JAVA"));
		System.out.println(u5.endsWith("java"));
		System.out.println(u5.endsWith("자바"));
		System.out.println("=============================");

		// 21. valueOf(기본자료형) : 들어온 기본 자료형을 String으로 바꿔버린다
		boolean bo1 = true;
		char ch1 = 'a';
		int num1 = 34;
		long num2 = 37l;
		double num = 345.127;
		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num);

		System.out.println(bo1); // 참 거짓이라 +1 오류
		System.out.println(ch1 + 1);
		System.out.println(num1 + 1);
		System.out.println(num2 + 1);
		System.out.println(num + 1);

		System.out.println(String.valueOf(bo1) + 1);
		System.out.println(String.valueOf(ch1) + 1);
		System.out.println(String.valueOf(num1) + 1);
		System.out.println(String.valueOf(num2) + 1);
		System.out.println(String.valueOf(num) + 1);

		// 22. Wrapper Class
		// 기본자료형의 형태를 가진 문자열을 해당 자료형으로 변경시키는 클래스들
		// 22-1. "true" 또는 "false" -> true, false : Boolean.parseBoolean[]
		String msg = "true";
		boolean msg2 = Boolean.parseBoolean(msg);
		System.out.println(msg);
		System.out.println(msg2);

		// 22-2. "142", "25" -> 142, 25 -> Integer.parseInt()
		msg = "142";
		int msg3 = Integer.parseInt(msg);
		System.out.println(msg + 10);
		System.out.println(msg3 + 10);

		// 22-3. "12321", "3456543" -> 12321, 3456543 -> Long.parseLong();

		// 22-4. "31.4" -> 31.4 -> Double.parseDouble()
		msg = "347.457";
		double msg5 = Double.parseDouble(msg);

		System.out.println(msg + 0.9);
		System.out.println(msg5 + 0.9);

		// 22-5 Character는 존재하지 않는다
		// String의 charAt() 이용하면 char를 가져올 수 있다

		//
		msg = "java 자바 JAVA 대한민국 2023 %*";
		// String.getBytes() -> byte[] ( 영어 대소문자, 숫자, 일부 특수문자만 가능)
		byte[] result = msg.getBytes();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] + " : " + (char) (result[i]));
		}

		// String.toCharArray -> char[] 모든 문자 처리가능

	}
}
