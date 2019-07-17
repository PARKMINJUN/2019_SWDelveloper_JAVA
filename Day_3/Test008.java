class A {
	int i = 100;
	void print(){System.out.println( "A print" ); }
}

class B extends A{
	int i = 200;
	void print2(){System.out.println( "B print2" );}
	void print(){System.out.println( "B print" ); }
}

public class Test008{
	public static void main( String[] args ){
		A t = new B();	// B의 인스턴스가 만들어 진것이고 가리키는 것은 A이다.
		t.print();
		System.out.println( t.i );		//  왜 100 이 나오는지 그 이유를 정리하자. => 멤버변수에는 오버라이딩 개념이 없다!!
		//  t.print2();
	}
}
/*
	조상타입의 변수로 자손의 인스턴스를 가리킬 수 있다.
	조상에서 선언된 멤버함수 멤버변수만 호출이 가능하다.
	- B의 인스턴스 안에 print2는 존재한다. 하지만 호출할 수 없다.
	
	만일 오버라이딩 된 함수를 호출한다면 이때는 오버라이딩 된 것이 호출된다. (외워!!!!!!!!!!!!!)
*/


