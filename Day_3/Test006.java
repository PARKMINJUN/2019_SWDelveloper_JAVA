class A {
	A(){System.out.println( "A constructor" );}
}

class B extends A{
	B(){
	// super(); �� �����Ǿ��ִ�.
	System.out.println( "B constructor" );
	}  //�����ڴ� ��ӵ��� �ʰ� ȣ�⸸ �ȴ�.
}

public class Test006{
	public static void main( String[] args ){
		B t = new B();
		//	t.b();
	}
}

/*
	- ��Ӱ��谡 ������ �� ( ����Ŭ����, �ڼ�Ŭ���� ) �ڼ��� �ν��Ͻ��� �����ϸ�
		������ �����ڰ� ���� ȣ��ǰ�, �ڼ��� �����ڰ� ȣ��ȴ�.
		
	- �����ڴ� ��ӵ��� �ʴ´�. �ٸ� ȣ��� ���̴�. ����Լ��� �ƴϴ�.
		( ������ ������ ȣ���� �� ����. )
*/