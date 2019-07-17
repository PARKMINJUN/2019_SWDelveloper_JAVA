class A {
	void print(){System.out.println( "A print" ); }
}

class B extends A{
	void print(){
		System.out.println( "B print" );
		
		// 물려받은 자손쪽에서 물려받은 함수를 호출하고 싶을때 super 를 이용한다.
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
	method overridding : 조상에서 선언한 멤버함수를 자손에서 다시 선언할 수 있다.
	: 자손의 인스턴스의 print를 호출되면 ( 조상? 자손? ) => 자손
*/