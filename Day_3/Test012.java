abstract class Bank {
	abstract public double calc ( double money, int years, double rate );
	public void print(){	//��� �Լ��� ��� �޾Ƶ� �����ϰ� �ʿ��� �Լ�
	double r = calc( 100.0, 100, 0.066 );
		System.out.println( r );
	}
}

class BokriBank extends Bank {
	public double calc ( double money, int years, double rate ) {
		return 59665.1234;
	}
}

public class Test012 {
	public static 

// Ŭ���忡 Test037 ����
	
	
/*
���� ���ϴ� �͵��� abstract�� �̿��ϰ� 
���� ������ �ʴ� �͵��� �׳� ���� ���ش�
*/