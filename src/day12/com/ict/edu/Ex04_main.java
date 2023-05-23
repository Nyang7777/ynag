package day12.com.ict.edu;

import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {

		// 5명 이름 국어 영어 수학 받기
		// 이름 총점 평균 학점 순위 구하기
		// 순위 정렬하기

		Scanner scan = new Scanner(System.in);

		// Ex04_getset로 만들어진 객체만 저장하는 배열 (객체형 배열 참조자료형 배열)
		// int[] k1= new int[];
		Ex04_getset[] arr = new Ex04_getset[5];

		for (int i = 0; i < arr.length; i++) {
			Ex04_getset person = new Ex04_getset();

			System.out.println("이름: ");
			person.setName(scan.next());

			System.out.println("국어: ");
			person.setKor(scan.nextInt());

			System.out.println("영어: ");
			person.setEng(scan.nextInt());

			System.out.println("수학: ");
			person.setMath(scan.nextInt());

			person.setSum(person.getKor() + person.getEng() + person.getMath());

			person.setAvg((int) (person.getSum() / 3.0 * 10) / 10.0);

			if (person.getAvg() >= 90) {
				person.setHak("A학점");
			} else if (person.getAvg() >= 80) {
				person.setHak("B학점");
			} else if (person.getAvg() >= 70) {
				person.setHak("C학점");
			} else {
				person.setHak("A학점");
			}
			person.setRank(1);

			arr[i] = person;
		}

		// 순위 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}

		// 정렬하기
		Ex04_getset tmp = new Ex04_getset();

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + " ");
			System.out.print(arr[i].getSum() + " ");
			System.out.print(arr[i].getAvg() + " ");
			System.out.print(arr[i].getHak() + " ");
			System.out.println(arr[i].getRank() + " ");

		}
		
		
		

	}
}
