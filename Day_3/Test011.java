abstract class A {
	abstract public void print();
}

class B extends A {
	public void print(){
		System.out.println( 100 );
	}
}



public class Test011{
	public static void main( String[] args ){
		// A t = null; 	// ������ ���� �� ���� �ִ�.
		// new B();		abstract class �� �ν��Ͻ��� �� �����.
		A t = new B();  // B�ν��Ͻ��� ������ �� �ִ�. B���� ���� abstract ������ �����.
		t.print();
	}
}
/*
	���� print �Լ��� ������ �Ǿ����� ������ ���ǵ��� �ʾҴ�. �ݵ�� abstract �ٿ��ش�.
		abstract �޼ҵ带 �ϳ��� ���� Ŭ������ �ݵ�� abstract Ŭ������� �����ؾ� �Ѵ�.
		
	abstract �޼ҵ带 �������̵� �ϸ� abstract ������ �������� �ȴ�.
*/

// *** abstract �� ����Լ��� �Լ� �����ʹ� �����ϴµ� ���� ���빰�� ���� ���̴�.
// *** abstract �� �ν��Ͻ��� ���� �� ����� �Ѵ�. �ν��Ͻ��� �����Ǹ� ȣ���� �� �� �ֱ� ����!!