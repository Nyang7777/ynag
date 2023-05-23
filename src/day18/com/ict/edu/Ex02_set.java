package day18.com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02_set {
	public static void main(String[] args) {
		// set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복안됨, 특정기준으로 정렬 불가능
		//			TreeSet은 항상 오름차순을 유지
		// HashSet<제네릭타입> 참조변수 = new HashSet<[<제네릭타입>]>();
		// TreeSet<제네릭타입> 참조변수 = new TreeSet<[<제네릭타입>]>();
		
		// 컬렉션 생성 (랩퍼클래스 : 기본자료형들을 클래스로 만들어주는 클래스)
		//			Integer, Double, Character, String
		HashSet<Integer> h1 = new HashSet<>();
		HashSet<Double> h2 = new HashSet<>();
		HashSet<Character> h3 = new HashSet<>();
		HashSet<String> h4 = new HashSet<>();
		
		System.out.println(h1);
		
		// 컬렉션에 객체 넣기(add)
		h1.add(new Integer(14));
		h1.add(new Integer(16));
		h1.add(20); // 오토박싱 : 기본자료형이 해당 객체로 만들어진다
					// 오토 언박싱 : 해당 객체를 기본자료형으로 되돌리는 것
		System.out.println(h1);
		
		h2.add(new Double(30.1));
		h2.add(new Double("35.1"));
		h2.add(38.1);
		// h2.add(1); 무조건 같아야됨 int라서 불가능
		
		System.out.println(h2);
		
		h3.add('j');
		h3.add('a');
		h3.add('v');
		h3.add('a');
		
		System.out.println(h3);
		
		System.out.println("하나씩 처리하기(개선된 for문)");
		for (Integer Integer : h1) {
			System.out.println(Integer);
		}
		System.out.println("하나씩 처리하기(iterator)");
		Iterator<Double> it = h2.iterator();
		
		while (it.hasNext()) {
			Double double1 = (Double) it.next();
			System.out.println(double1);
		}
		System.out.println();
		Iterator<Character> it2 = h3.iterator();
		while (it2.hasNext()) {
			Character character = (Character) it2.next();
			System.out.println(character);
		}
	}
}
