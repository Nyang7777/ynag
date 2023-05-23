package day15.com.ict.edu3;

// 추상클래스, 인터페이스를 부모로 갖고있다 ( 순서 : extends, implements)
public class Ex02_calc extends Ex02_oper implements Ex02_Add, Ex02_sub{

	@Override
	public double minus(double s1, double s2) {
		// TODO Auto-generated method stub
		return s1-s2;
	}

	@Override
	public double plus(double s1, double s2) {
		// TODO Auto-generated method stub
		return s1+s2;
	}

	@Override
	public double mul(double s1, double s2) {
		// TODO Auto-generated method stub
		return s1*s2;
	}

	@Override
	public double div(double s1, double s2) {
		// TODO Auto-generated method stub
		return s1/s2;
	}
	
	
	
}
