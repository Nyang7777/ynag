package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex11_Map {
	public static void main(String[] args) {
		// 한국 캐나다 영국 스위스의 수도가 각각 HashMap에 저장
		// 원하는 나라가 key, 화면에서 나라를 물어보면 출력됨

		Scanner scan = new Scanner(System.in);

		HashMap<String, String> map = new HashMap<>();
		map.put("한국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		Set<String> keys = map.keySet();

		esc: while (true) {
			
			System.out.println("나라입력: ");
			String str = scan.next();
			
			if (keys.contains(str)) {
				String res = map.get(str);
				System.out.println("수도: ");
			} else {
				System.out.println("데이터에 없음");
			}
			while (true) {
				System.out.println("계속?");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue;
				}
				
			}
			
		}

//		while(true) {
//			
//			System.out.println("나라 입력");
//			scan.next();
//			
//			if (map1.containsKey(str)) {
//				System.out.println(map1.get(str));
//			} else {
//				System.out.println("데이터 없음");
//			}
//			
//			System.out.println("한번 더? 'Y or N'");
//			if (str.equalsIgnoreCase("Y")) {
//				continue;
//			} else {
//				break;
//			}
//			
//		}

	}
}
