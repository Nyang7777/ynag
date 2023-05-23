package day18.com.ict.edu;

import java.util.Iterator;
import java.util.Stack;

public class Ex06_List {
	// List 인터페이스 : 배열과 매우 비슷하다 삽입 삭제 추가 자유롭다 크기지정 안해도됨
	// List 인터페이스를 구현한 클래스 : Stack ArrayList Vector
	// Stack : LIFO(Last In First Out) 마지마에 들어온 데이터가 먼저 나간다
	
	// add.push , addElement 추가
	// add(index, E) 삽입
	// pop : 맨 위에 존재하는 객체르 반환하고 삭제ㅏㄴ다
	// peek : 맨 위에 존재하는 객체 반환 삭제안함
	// search : 검색 오른쪽부터 1 스택 관점
	// indexOf : 검색 왼쪽부터 0 배열 관점
	// elementAt(index) : 요소반환
	// get(index) : 요소 반환
	// firstElements(): 처음 요소 반환
	// lastElements(): 마지막 요소 반환
	// setElements(Elements, index) : 치환
	
	public static void main(String[] args) {
		Stack<String>stack = new Stack<>();
		stack.add("둘리");
		stack.push("공실이");
		stack.addElement("마이콜");
		
		stack.add(0,"고길동");
		stack.add(2,"희동이");
		System.out.println(stack);
		
		// 마지막 객체 보기 : pop(삭제 peek(삭제암함
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println();
		// 둘리 있냐
		if(stack.contains("둘리2")) {
			System.out.println(stack.indexOf("둘리")); // 왼쪽, 0부터
			System.out.println(stack.search("둘리")); // 오른쪽, 1부터
			
		System.out.println(stack.get(1));
		System.out.println(stack.elementAt(1));
		System.out.println(stack.get(stack.indexOf("둘리")));
		}else {
			System.out.println("없음");
		}
		if(stack.contains("고길동")) {
			stack.setElementAt("도우너", stack.indexOf("고길동"));
		}
		System.out.println(stack);
		
		// 중복 가능
		stack.add("둘리");
		stack.add("고길동");
		System.out.println(stack);
		
		// 하나씩 꺼내기 (배열, 왼쪽, 0부터)
		for (String string : stack) {
			System.out.println(string);
		}
		System.out.println();
		
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}
		System.out.println();
		
		// 스택방식으로 (오른쪽)
		while (! stack.isEmpty()) {
			String string = stack.pop();
			System.out.println(string+""+stack.size());
		}
		System.out.println(stack);
	}
}
