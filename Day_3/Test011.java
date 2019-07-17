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
		// A t = null; 	// 변수를 선언 할 수는 있다.
		// new B();		abstract class 는 인스턴스를 못 만든다.
		A t = new B();  // B인스턴스를 생성할 수 있다. B같은 경우는 abstract 성질을 상실함.
		t.print();
	}
}
/*
	위의 print 함수는 선언은 되었지만 내용이 정의되지 않았다. 반드시 abstract 붙여준다.
		abstract 메소드를 하나라도 가진 클래스는 반드시 abstract 클래스라고 정의해야 한다.
		
	abstract 메소드를 오버라이딩 하면 abstract 성질이 없어지게 된다.
*/

// *** abstract 는 멤버함수가 함수 포인터는 존재하는데 실제 내용물은 없는 것이다.
// *** abstract 는 인스턴스를 만들 수 없어야 한다. 인스턴스가 생성되면 호출을 할 수 있기 때문!!