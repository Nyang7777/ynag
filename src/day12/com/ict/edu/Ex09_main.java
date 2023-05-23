package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Ex09_constructor[] arr = new Ex09_constructor[5];

		for (int i = 0; i < arr.length; i++) {

			System.out.print("이름: ");
			String name = scan.next();

			System.out.print("국어: ");
			int kor = scan.nextInt();

			System.out.print("영어: ");
			int eng = scan.nextInt();

			System.out.print("수학: ");
			int math = scan.nextInt();

			Ex09_constructor person = new Ex09_constructor(name, kor, eng, math);

			arr[i] = person;
		}
		// 순위

		// 순위 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}

		// 정렬하기
		Ex09_constructor tmp = new Ex09_constructor();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		// 정렬

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + " ");
			System.out.print(arr[i].getSum() + " ");
			System.out.print(arr[i].getAvg() + " ");
			System.out.print(arr[i].getHak() + " ");
			System.out.println(arr[i].getRank() + " ");

		}

	}
}
