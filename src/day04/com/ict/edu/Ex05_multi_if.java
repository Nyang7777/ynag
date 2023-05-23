package day04.com.ict.edu;

public class Ex05_multi_if {
	public static void main(String[] args) {
		
		// 다중 if문
		// 형식 if(조건식1){
		//			조건식1 -> 참 실행할 문장;
		//			조건식1 -> 참 실행할 문장;
		//		}else if(조건식2){
		//			조건식1은 거짓이면서 조건식2가 참 실행할 문장;
		//			조건식1은 거짓이면서 조건식2가 참 실행할 문장;
		//		}else if(조건식3){
		//			조건식1,2가 거짓이면서 조건식3이 참 실행할 문장;
		//			조건식1,2가 거짓이면서 조건식3이 참 실행할 문장;
		//		}else{
		//			조건1,2,3 모두 거짓
		//		}
		
		// int k1이 점수가 90이상이면 A학점 80이상이면 B학점 70이상이면 C학점 나머지 F학점
		int k1 = 41;
		String gkrwja = "0";
		if (k1>=90) {
			gkrwja = "A학점";
		} else if (k1>=80) {
			gkrwja = "B학점";
		} else if (k1>=70) {
			gkrwja = "C학점";
		} else 
			gkrwja = "F학점";
		
		System.out.println(gkrwja);
		
		// char k2가 대문자냐 소문자냐 기타문자냐
		char k2 = '!';
		String answk = "0";
		if (k2>='A'&& k2<='Z') {
			answk = "대문자";
		} else if (k2>='a'&& k2<='z') {
			answk = "소문자";
		} else answk = "기타문자";
		
		System.out.println(answk);
		
		// char k3이 A, a 이면 아프리카 B, b이면 브라질 C, c이면 캐나다 나머지는 한국
		char k3 = 'd';
		if (k3 == 'A'||k3=='a') {
			answk = "아프리카";
		} else if (k3 == 'B'|| k3=='b') {
			answk = "브라질";
		} else if (k3 == 'C'|| k3=='c') {
			answk = "캐나다";
		} else answk = "한국";
		
		System.out.println(answk);
		
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000
		// 4이면 과일쥬스 3500 친구와 2잔을 10000 내고 먹었다
		// 잔돈 얼마냐 (부가세 10%포함), 친구와 같은 음료만 가능
		
		int menu = 3;
		int total = 10000;
		int moka = 3500;
		int late = 4000;
		int ame = 3000;
		int rhkdlf = 3500;
		int wnans = 2;
		int wksehs =0;
		
		if (menu==1) {
			wksehs= total-(int)(moka*wnans*1.1);
		} else if (menu==2) {
			wksehs= total-(int)(late*wnans*1.1);
		} else if (menu==3) {
			wksehs= total-(int)(ame*wnans*1.1);
		} else if (menu==4) {
			wksehs= total-(int)(rhkdlf*wnans*1.1);
		}
		System.out.println(wksehs);
		System.out.println("===========================");
		
		int menu2 = 3;
		int in = 10000;
		int su = 2;
		int dan = 0;
		String drink = "";
		
		if (menu==1) {
			drink = "카페모카";
			dan = 3500;
		}else if (menu==2) {
			drink = "카페라데";
			dan = 4000;
		}else if (menu==3) {
			drink = "아메리카노";
			dan = 3000;
		}else if (menu==4) {
			drink = "과일쥬스";
			dan = 3500;
		}
		
		int total2 = dan*su;
		int vat = (int)(total2*0.1);
		int out = in - (total2+vat);
		
		System.out.println(drink);
		System.out.println(out);
		}
		
	}

