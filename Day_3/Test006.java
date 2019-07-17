class A {
	A(){System.out.println( "A constructor" );}
}

class B extends A{
	B(){
	// super(); 가 생략되어있다.
	System.out.println( "B constructor" );
	}  //생성자는 상속되지 않고 호출만 된다.
}

public class Test006{
	public static void main( String[] args ){
		B t = new B();
		//	t.b();
	}
}

/*
	- 상속관계가 존재할 때 ( 조상클래스, 자손클래스 ) 자손의 인스턴스를 생성하면
		조상의 생성자가 먼저 호출되고, 자손의 생성자가 호출된다.
		
	- 생성자는 상속되지 않는다. 다만 호출될 뿐이다. 멤버함수도 아니다.
		( 참조형 변수로 호출할 수 없다. )
*/