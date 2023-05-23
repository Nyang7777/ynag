package day14.com.ict.edu5;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_dog dog = new Ex02_dog();
		Ex02_cat cat = new Ex02_cat();
		
		dog.sound();
		dog.hobby();
		System.out.println(dog.color);
		System.out.println(dog.eyes);
		
		cat.sound();
		cat.hobby();
		System.out.println(cat.color);
		System.out.println(cat.eyes);
		
		// 객체생성
		// 부모클래스 변수 = new 자식클래스 생성자();
		Ex02_animal animal = null;
		int su = 1;
		if(su==1) { // 고양이
			animal = new Ex02_cat();
		}else if(su==2) { // 강아지
			animal = new Ex02_dog();
		}
		
		// 오버라이딩
		animal.sound();
		
		// 부모거나옴
		System.out.println(animal.color);
		System.out.println(animal.eyes);
		
		// 자식클래스만 갖고있는거 사용못함
		
	}
}
