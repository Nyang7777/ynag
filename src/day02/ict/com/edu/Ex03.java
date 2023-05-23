package day02.ict.com.edu;
class Ex03{
	public static void main(String[] args){
	// ���� : �Ҽ����� ���� ����
	// �Ǽ� : �Ҽ����� �ִ� ����
	// ���� < �Ǽ�
	// ���� : byte < short < int < long
	// 	�⺻�� int 

	// �Ǽ� : float < double
	// 	�⺻�� double

	// byte : -128 ~ + 127 (256 = 2^8)
	byte su1 = 125;
	System.out.println(su1);
	
	// short : -32768 ~ +32767
	short su2 = 125;
	System.out.println(su2);
	
	// int : ������ �⺻
	int su3 = 125;
	System.out.println(su3);
	
	// long : int���� �� ���� ������ ������ ����
	//	���ڵڿ� L �Ǵ� l ���δ� (�������� = ���θ��)
	//	���θ�� : �� ū �ڷ����� ���� �� �� �ִ�

	long su4 = 125L;
	System.out.println(su4);

	// ���� �ڷ����� ū �ڷ����� ����ϸ� ū �ڷ������� ����� ����
	// ���� �ڷ����� ū �ڷ����� ������ �� �ִ� (= ���θ��)

	long su5 = 125;
	System.out.println(su5);

	long su6 = 10;
	System.out.println(su6);
	long su7 = su6;
	System.out.println(su7);
	
	char c1 = 'A';
	int su8 = c1;
	System.out.println(su8);
	
	//int su9 = 97;
	//char c2 = su9;

	// �Ǽ� : float < double
 	//	double
	// float : ���ڵڿ� F �� f �� ���δ�
	
	float su10 = 13.3f;
	System.out.println(su10);

	double su11 = 15.3;
	System.out.println(su11);
	
	su11 = su10;
	System.out.println(su11);

	// char�� double, int �� double ����(���θ��)
	
	char c3 = 'a';
	int su12 = 37;

	double su13 = c3;
	System.out.println(su13);
	
	su13 = su12;
	System.out.println(su13);

	
	}
}