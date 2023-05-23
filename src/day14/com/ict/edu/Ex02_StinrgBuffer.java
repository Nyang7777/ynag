package day14.com.ict.edu;

import java.util.StringTokenizer;

public class Ex02_StinrgBuffer {
	public static void main(String[] args) {
		// 문자열을 추가할때 사용 (메모리 주소가 변경되지 않는다)
		// 추가할 때 append() 사용
		// toString() -> String 전환한다
		StringBuffer sb = new StringBuffer("ictedu");
		sb.append("대한민국");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		// StringTokenizer : 구분자를 이용해서 문자열 분리, 배열의 크기르 지정할 수 없다
		//					 구분자가 없으면 띄어쓰기 , 탭줄바꾸기 로 구분한다
		// nextToken()을 이용해서 문자열 분리
		
		String str = "사과 바나나 망고 오렌지 수박";
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreElements()){
			String res = st.nextToken();
			System.out.println(res);
		}
		System.out.println();
		
		str = "사과,바나나,망고,오렌지,수박";
		StringTokenizer st2 = new StringTokenizer(str,",");
		while(st2.hasMoreElements()){
			String res2 = st2.nextToken();
			System.out.println(res2);
		}
		System.out.println();
		
		// 추천하는 방식
		String[]arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
	}
}
