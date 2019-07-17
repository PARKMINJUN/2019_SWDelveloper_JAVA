/*
상속 X, 외부노출 X, 내가쓰는거 (마약) : private
상속 O, 외부노출 X, 내가쓰는거 (모나리자) : protected
상속 O, 외부노출 O, 내가쓰는거 (별장) : public

"클래스 안의 멤버변수, 멤버함수 앞에 붙여준다" ==> 감출건 감추자(은닉성)

1. java의 protected
- 같은 패키지에서는 접근가능
- 다른 패키지에서는 접근불가
 
2. friendly
- 같은 패키지에서는 public 으로..
- 다른 패키지에서는 private 으로..

*/
class A{
	private int mayak = 0;
	protected int monarisa = 0;
	public int house2 = 0;
}

class B extends A{
	void print() {
		System.out.println( monarisa );		// 마약, 모나리자, 집 값을 넣을 때 마다 컴파일의 차이가 있다.
		}
}

public class Test009{
	public static void main( String[] args ){
		A look = new A();
		System.out.println( look.monarisa );
		}
	}
	
/*
	look.monarisa 은 같은 패키지에서는 접근 가능. 다른 패키지에서는 접근 불가.
	
	protected 를 포수의 사인으로 이해하면 좋다.
	같은 팀의 다른 클래스에게는 알려지지만, 다른 팀에 소속된 클래스는 접근 불가해야 한다.
	후배에게 물려줄때는 당연히 접근 가능해야 한다.
	
	( 실전에서는 private / public 많이 쓴다 )
*/