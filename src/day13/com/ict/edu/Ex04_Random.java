package day13.com.ict.edu;

import java.util.Random;
import java.util.Scanner;

public class Ex04_Random {
	public static void main(String[] args) {

		// 난수를 발생하는 방법
		// Math.random(), Random 클래스

		// 1. Random 클래스
		Random ran = new Random();

		// 각종 기본자료형의 난수 발생 : 자료형 범위 안에서 난수 발생
		System.out.println("boolean형: " + ran.nextBoolean());
		System.out.println("int형: " + ran.nextInt());
		System.out.println("long형: " + ran.nextLong());

		// double은 0.0이상 1.0미만 사이 난수
		System.out.println("double: " + ran.nextDouble());

		// 특정 범위를 지정
		// 1. nextInt(범위): 0 ~ 범위미만 난수 (정수)
		System.out.println("int: " + ran.nextInt(5));

		// 2. (int)(nextDouble()범위) 0 ~ 범위미만 난수
		System.out.println("int: " + (int) (ran.nextDouble() * 5));
		System.out.println("======");
		// Math 클래스 : 전체메서드가 static, 객체 생성없이 호출 가능함
		// 1. random
		System.out.println("Math.random: " + Math.random()); // 0.0 ~ 1.0미만

		// 특정범위 지정
		System.out.println("Math.random: " + (int) (Math.random() * 5));

		// 올림 버림 반올림
		System.out.println("올림: " + Math.ceil(3.45));
		System.out.println("올림: " + Math.ceil(3.55));
		System.out.println();

		System.out.println("반올림: " + Math.round(3.45));
		System.out.println("반올림: " + Math.round(3.55));
		System.out.println();

		System.out.println("버림: " + Math.floor(3.45));
		System.out.println("버림: " + Math.floor(3.55));
		System.out.println();

		
	
		

		

	}
}
