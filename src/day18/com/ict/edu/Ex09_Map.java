package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex09_Map {
	// Map 인터페이스 : Key와 Value가 1:1 매핑 구조를 갖는다
	//				Key중복 안됨 (Value를 덮어씌운다)
	//				Value 중복 가능
	//				Key를 호출하면 Value가 나온다
	//				key를 별도로 관리 -> keySet()
	//				add()사용 추가 못함
	//				put(key,Value)로 추가한다
	// 관련 클래스: HashMap
	
	public static void main(String[] args) {
		// 생성 key가 숫자인경우
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(0, "한국");
		map1.put(1, "미국");
		map1.put(2, "영국");
		map1.put(8, "태국");
		map1.put(10, "중국");
		map1.put(5, "공화국");
		System.out.println(map1);
		
		map1.put(10, "대만");
		System.out.println(map1);
		
		// Key를 호출하면 Value가 나온다
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		
		// key value 삭제
		map1.remove(5);
		System.out.println(map1);
		
		System.out.println("===================");
		
		// key를 set에서 관리하게 한다
		for (Integer string : map1.keySet()) {
			System.out.println(map1.get(string));
		}
		System.out.println();
		
		Iterator<Integer> it =  map1.keySet().iterator();
		while (it.hasNext()) {
			Integer k = (Integer) it.next();
			System.out.println(map1.get(k));
		}
		
		
		// entrySet() 메서드는 key, value 모두 필요할 때
		Set set1 = map1.entrySet();
		Iterator it2 = set1.iterator();
		while (it2.hasNext()) {
			Entry entry = (Entry) it2.next();
			Integer key = (Integer)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println(key+""+value);
		}
	}
}
