class A {
	void print(){System.out.println( "A print" ); }
}

class B extends A{
	void print(){
		System.out.println( "B print" );
		
		// �������� �ڼ��ʿ��� �������� �Լ��� ȣ���ϰ� ������ super �� �̿��Ѵ�.
		super.print();
		}
}

public class Test007{
	public static void main( String[] args ){
		B t = new B();
		t.print();	// B A
		
		A t2 = new A();
		t2.print();		// A
	}
}
/*
	method overridding : ���󿡼� ������ ����Լ��� �ڼտ��� �ٽ� ������ �� �ִ�.
	: �ڼ��� �ν��Ͻ��� print�� ȣ��Ǹ� ( ����? �ڼ�? ) => �ڼ�
*/