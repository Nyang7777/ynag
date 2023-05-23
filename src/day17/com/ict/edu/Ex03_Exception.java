package day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

// finally : 예외처리와 상관없이 반드시 실행해야하는 문장
//				주로 데이터베이스, 입력출력, 네트워크에서 사용
//				try{
//					예외 발생 가능한 문장;
//					예외가 발생되면 아래 문장들을 무시하고 catch문으로 이동한다
//					예외 발생 가능한 문장;
//					예외 발생 가능한 문장;
//					}catch(발생한 예외객체 e){
//						예외 발생 시 처리하는 문장;
//					}
//					}catch(발생한 예외객체 e){
//						예외 발생 시 처리하는 문장;
//					}
//					}finally{
//						반드시 실행 해야하는 문장;
//					}
public class Ex03_Exception {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			
			int su1 =50;
			System.out.println("정수 입력: ");
			
			int su2 =scan.nextInt();
			System.out.println("정답: "+(su1/su2));
			
		} catch (InputMismatchException e) {
			System.out.println("숫자 입력해");
			//return;
		} catch (ArithmeticException e) {
			System.out.println("0 안되");
			//return;
		} finally {
			System.out.println("반드시 수행되는 문장");
			scan.close();
		}
		
		System.out.println("수고");
	}
}
