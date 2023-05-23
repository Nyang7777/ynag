package day03.com.ict.edu2;

public class Test04 {
	public static void main(String[] args) {

		// 카페모카 6500
		// 친구와 둘이서 15000원을 내고 주문했다
		// 잔돈은 얼마인가 (단, 부가세10% 포함)

		String coeffe = "카페모카";

		int ahzk = 6500;

		int gkqtks = ahzk * 2;

		int qnrktp = gkqtks / 10;

		int wksehs = 15000 - qnrktp - gkqtks;

		System.out.println(" 잔돈 : " + wksehs + "원");
		
		System.out.println("=====================");

		int dan = 6500;
		int su = 2;
		int in = 15000;

		// 부가세를 구하기위해 총 금액 구하기
		int total = dan * su;

		// 둘 중 하나만 사용하기
		int vat = total / 10;
		int vat2 = (int) (total * 0.1);
		int out = in - (total + vat);

		System.out.println("잔돈 : " + out);

		// 한번에 계산하기

		int out2 = in - (int)(total*1.1);
		System.out.println("잔돈 : " + out2);
	}
}
