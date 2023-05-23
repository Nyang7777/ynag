package day15.com.ict.edu3;

public class Ex01_main {
	public static void main(String[] args) {
		
		System.out.println(Ex01_interface.SU1);
		System.out.println(Ex01_interface.SU2);
		System.out.println(Ex01_interface.su3);
		System.out.println(Ex01_interface.su4);
		
		Ex01_interface.like();
		
		Ex01_extends t1 = new Ex01_extends();
		t1.sound();
		t1.sound();
		
		// 익명 내부 클래스 (추천안함)
		Ex01_extends2 t2 = new Ex01_extends2() {
			
			@Override
			public void sound() {
				// TODO Auto-generated method stub
				System.out.println("뮤직");
			}
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.println("오락실 게임하기");
			}
		};
		System.out.println(t2.name);
		t2.tour();
		t2.sound();
		t2.play();
		
		Ex01_extends4 t3 = new Ex01_extends4();
		System.out.println(t3.name);
		t3.tour();
		t3.sound();
		t3.play();
		
		
		
	}
}
