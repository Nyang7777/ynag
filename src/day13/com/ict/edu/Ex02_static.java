package day13.com.ict.edu;

public class Ex02_static {
	// static : 객체 생성과 상관없이 미리 만들어진다
	//			static 영역에서 생성된다
	//			(갹체 생성전에도 호출가능 = 클래스이름)
	//			공유 개념을 갖는다
	//			모든 클래스가 접근해 사용가능
	
	//			클래스와 지역변수에는 사용 불가능
	//			내부 클래스에서는 사용가능
	
	int su1 =10;
	static int su2 = 10;
	
	// 기본 생성자
	public Ex02_static() {
		su1++;
		su2++;
	}
	
}
