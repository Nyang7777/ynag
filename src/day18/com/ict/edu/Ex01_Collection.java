package day18.com.ict.edu;

public class Ex01_Collection {
	// 제네릭과 컬렉션(자료구조)
	// 제네릭 : 컬렉션이 어떤 객체들로 이루어져있는지를 표시하는 객체타입
	// 컬렉션 : 객체들을 모아서 관리하는 인터페이스들을 말한다
	// API :<T>->객체타입 <E>->요소(Element)컬렉션안에 존재하는 객체 하나
	//			Map형식 :<K,V>->Key,Value 1:1대응 Key를 호출하면 Value가 나온다
	//	컬렉션<제네릭>
	
	// 최상위 컬렉션은 Collection<E>, Map<K,V>
	// Collection<E>을 상속받아서 사용하는 인터페이스 Set<E>,List<E>,Queue<E>
	
	// Collection 주요메서드
	// add(E e) : boolean->해당 컬렉션의 객체 추가, 성공하면 true, 실패하면 false
	//						보통은 리턴을 받지않는다(set 중복검사 시 받는다)
	// addAll(Collection<?extends E>c): boolean
	//		특정 컬렉셔넹 있는 모든 요소들을 다른 컬렉션에 추가
	// clear(): void 모든 요소 삭제
	// contains(Object o): 인자로 들어온 객체가 포함되어 있으면 true
	// isEmpty(): boolean 해당 컬렉션이 비어 있으면 true
	// iterator(): Iterator<E> 컬렉션안에 존재하는 객체들을 순서대로 접근하기 위해서 Iterator 객체를 반환 요소들을 하나씩 꺼내서 작업할때 사용(for문도 사용가능)
	// remove(Object o): boolean 인자로 들어온 객체를 삭제 성공하면 true
	// size(): int 컬렉션안에 존재는 요소의 수 (for문 사용가능)
	// toArray(): Object[] 컬렉션을 배열로 만든다
	//		Arrays.asList() 배열을 컬렉션(ArrayList으로 만든다
	
	
}
