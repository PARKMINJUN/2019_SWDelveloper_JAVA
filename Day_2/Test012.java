class Apple {
	int i = 0;
	int add( int i, int j ) {return 100;}
	/*
	����Ÿ���� ����, Ŭ������� �Լ����� �����ϸ� ������ �Լ��̴�.
	( Constructor ) - �Լ���� ����� �� ��ƴ�. ( �����ͷ� ȣ�� X )
	�ν��Ͻ� ���� ������ ȣ��ǰ�, 
	�� �뵵�� �ν��Ͻ� ���� ������ �ʱⰪ�� �� �� ���ȴ�.
	*/

	Apple( int j ) {
		i = j;
	}
}

public class Test006 {
	public static void main( String[] args ) {
		Apple t = new Apple( 100 );
		System.out.println(t.i+t.add(10,20));
	}
}