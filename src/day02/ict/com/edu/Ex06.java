package day02.ict.com.edu;
class Ex06{
	public static void main(String[] args){
	// String : ���ڿ��� ó���ϱ� ���ؼ� ���� Ŭ����
	//	�⺻ �ڷ��� �ƴ�, Ŭ������ �ڷ������� ����ϱ� ������ ���� �ڷ���
	//	�⺻ �ڷ���ó�� ��� ����
	//	�ݵ�� " ���
	// 	String �����̸� = "data";

	String name = "ȫ�浿";
	int age = 17;

	// + ���� ���� ����� ������ String
	// ���� ���� ������ ���� �ʰ� ���ڿ� �����ϴ� ���� = String ����
	System.out.println(name);
	
	name = "1000";
	age = 1000;
	
	System.out.println(name+50);
	System.out.println(age+50);
	
	int su1 = 20;
	int su2 = 4;
	System.out.println(su1+su2);
	System.out.println("��� : " +(su1+su2));
	int su3 = su1 + su2;
	System.out.println("��� : " + su3);
  }
}