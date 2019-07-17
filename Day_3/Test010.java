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
	멤버변수는 무조건 private 하게 선언한다.
	값을 읽고자 할 때는 getter 함수를 이용하여 접근한다.   ===> public으로 접근하는 것이다.
	- A t = new B() 에서 t.i 는 조상의 값, t.print()는 오버라이딩 된게 나오고 ...
	이런 일이 벌어지지 않게 되더라 ...
	
	* 조상에서 getXXX 가 보이면 그런 변수가 있는 줄 알고 XXX 변수는 피해간다.
*/