class A {
	private int data = 100;
	
	public int getData(){ return data; }
}

class B extends A{
	private int data = 200;
	
	public int getData(){ return data; }
}


public class Test010{
	public static void main( String[] args ){
		A t = new B();	
		System.out.println( t.getData() );		
	}
}
/*
	��������� ������ private �ϰ� �����Ѵ�.
	���� �а��� �� ���� getter �Լ��� �̿��Ͽ� �����Ѵ�.   ===> public���� �����ϴ� ���̴�.
	- A t = new B() ���� t.i �� ������ ��, t.print()�� �������̵� �Ȱ� ������ ...
	�̷� ���� �������� �ʰ� �Ǵ��� ...
	
	* ���󿡼� getXXX �� ���̸� �׷� ������ �ִ� �� �˰� XXX ������ ���ذ���.
*/