package day18.com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {
	public static void main(String[] args) {
		// setter를 이용해서 값 넣기
		// 생성자를 이용해서 값 너히
		Ex03 p1 = new Ex03();
		p1.setName("둘리");
		p1.setWeight(81.0);
		p1.setAge(24);
		
		Ex03 p2 = new Ex03("희동이", 3, 12.6);
		Ex03 p3 = new Ex03("마이콜", 21, 65.2);
		Ex03 p4 = new Ex03("또치", 36, 56.2);
		
		// 객체를 저장하는 방법 : 배열, 컬렉션
		// 배열 : 크기를 지정하면 변경됨
		Ex03[] arr = new Ex03[4];
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;
		
		// 컬렉션 : 크지지정 없음, 추가 기능
		HashSet<Ex03> set1 = new HashSet<>();
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);
		set1.add(new Ex03("공실이",24,51.4));
		
		// 이름만 꺼내기
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		for (Ex03 ex03 : arr) {
			System.out.println(ex03.getName());
		}
		
		// 컬렉션
		for (Ex03 ex03 : set1) {
			System.out.println(ex03.getName());
		}
		Iterator<Ex03> it = set1.iterator();
		while (it.hasNext()) {
			Ex03 ex03 = (Ex03) it.next();
			System.out.println(ex03.getName());
		}
		
	}
}
