package day15.com.ict.edu2;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("선택하세요 -> 1. 고양이 2. 강아지");
			int su = scan.nextInt();

			// 다형성의 정적바인딩
//			switch (su) {
//			case 1:
//				Ex04_cat cat = new Ex04_cat();
//				cat.sound();
//				cat.play();
//				break;
//			case 2:
//				Ex04_dog dog = new Ex04_dog();
//				dog.sound();
//				dog.play();
//				break;
//			}

			// 다형성의 동적바인딩
			Ex04_abstract animal = null;
			switch (su) {
			case 1:
				animal = new Ex04_cat();
				break;
			case 2:
				animal = new Ex04_dog();
				break;
			}
			animal.sound();
			animal.play();
		}
	}
}
