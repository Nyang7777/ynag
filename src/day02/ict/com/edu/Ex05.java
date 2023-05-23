package day02.ict.com.edu;
class Ex05{
	public static void main(String[] args){

	int kor = 90;
	int eng = 80;
	int math = 80;
	
	// ����

	int sum = kor+eng+math;
	System.out.println(sum);

	// ���
	int avg = sum/3; // ������ �Ҽ����� ����
	
	System.out.println(sum);
	System.out.println(avg);
	
	// �Ҽ��� ���� ��� ���ϱ�
	double avg2 = sum/3;
	System.out.println(avg2);

	double avg3 = (double)(sum)/3;
	System.out.println(avg3);

	double avg4 = sum/3.0;
	System.out.println(avg4);
	
	// �Ҽ��� 2�ڸ����� ���ϱ�
	double avg5= sum/3.0;
	System.out.println(avg5);

	double avg6 = (int)(avg5*100)/100.0;
	System.out.println(avg6);	
	
	// 1472 �� ������ �����ؼ� 1470 �����
	int num = 1472;
	int num2 = (num/10)*10;
	System.out.println(num2);

  }
}