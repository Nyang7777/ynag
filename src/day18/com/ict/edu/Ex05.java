package day18.com.ict.edu;

import java.util.TreeSet;

public class Ex05 {
	public static void main(String[] args) {
		// 로또 : 1~45 ,중복 불가, 6자리, 랜덤
		TreeSet<Integer> lotto = new TreeSet<>();
		for (int i = 0; i < 6; i++) {
			int su = (int)(Math.random()*45)+1;
			if(! lotto.add(su)) {
				i--;
			}
		}
		System.out.println(lotto);
		
		
	}
}
