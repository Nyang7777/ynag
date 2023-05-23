package day11.com.ict.edu;

public class Ex06_method {
	/*
	int rnrdj;
	int duddj;
	int tnrkgr;
	int sum;
	
	// 총점 구하고 반환하는 메서드
		public void setkor(int kor) {
			rnrdj = kor;
		}
		
		public int qksghkskor() {
			return rnrdj;
		}
		
		public void seteng(int eng) {
			duddj = eng;
		}
		
		public int qksghkseng() {
			return duddj;
		}
		
		public void setmath(int math) {
			tnrkgr = math;
		}
		
		public int qksghksmath() {
			return tnrkgr;
		}
		*/
	// 총점 구하고 반환하는 메서드
	public int getSum(int kor, int eng, int math) {
		int sum = kor +eng + math;
		return sum;
	}
	
	// 평균 구하는 메서드
	public double getAvg(int sum) {
		double avg = (int)(sum/3.0*10)/10.0;
		return avg;
	}
	
	// 학점 구하는 메서드
	public String getHak(double avg) {
		String hak = "";
		if(avg>=90) {
			hak = "A학점";
		}else if(avg>=80) {
			hak = "B학점";
		}else if(avg>=70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
		return hak;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
