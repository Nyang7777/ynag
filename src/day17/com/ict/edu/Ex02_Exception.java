package day17.com.ict.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 catch : 예외가 하나가 아닌 여러가지 발생 할 경우
// 주의사항 : Exception을 사용한다면 가장 아래있는 catch문장에 사용한다
//			try{
//				예외 발생 가능한 문장;
//				예외가 발생되면 아래 문장들을 무시하고 catch문으로 이동한다
//				예외 발생 가능한 문장;
//				예외 발생 가능한 문장;
//				}catch(발생한 예외객체 e){
//					예외 발생 시 처리하는 문장;
//				}
//				}catch(발생한 예외객체 e){
//					예외 발생 시 처리하는 문장;
//				}
//				}catch(발생한 예외객체 e){
//					예외 발생 시 처리하는 문장;
//				}
public class Ex02_Exception {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			
			int su1 =50;
			System.out.println("정수 입력: ");
			
			int su2 =scan.nextInt();
			System.out.println("정답: "+(su1/su2));
			
		} catch (InputMismatchException e) {
			System.out.println("숫자 입력해");
		} catch (ArithmeticException e) {
			System.out.println("0 안되");
		}
		
		System.out.println("수고");
		
	}
}
