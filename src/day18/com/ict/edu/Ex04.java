package day18.com.ict.edu;

import java.util.HashSet;

public class Ex04 {
	public static void main(String[] args) {
		// 컬렉션을 배열로 -> toArray();
		// 배열을 컬렉션으로 -> ArrayS.asList();
		
		String[] str = {"java","Java", "JAVA","자바"};
		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();
		
		for (String string : str) {
			set1.add(string);
		}
			System.out.println(set1);
			System.err.println();
			
		// set1을 모두 set2에 넣기 addAll()
		set2.addAll(set1);
		System.out.println(set2);
		System.out.println();
		
		// 삭제 : clear(), remove(Object o)
		// 비어있는지 확인 : isEmpty();
		set1.clear();
		System.out.println(set1);
		System.out.println(set1.isEmpty());
		System.out.println();
		
		System.out.println(set2.remove("JAVA"));
		System.out.println(set2.remove("ds"));
		System.out.println();
		
		// 중복불가
		System.out.println(set2.add("JAVA"));
		System.out.println(set2);
		System.out.println(set2.add("JAVA"));
		System.out.println(set2);
		
		
	}
}
