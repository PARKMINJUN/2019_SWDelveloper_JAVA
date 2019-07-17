abstract class Bank {
	abstract public double calc ( double money, int years, double rate );
	public void print(){	//어떠한 함수를 상속 받아도 일정하게 필요한 함수
	double r = calc( 100.0, 100, 0.066 );
		System.out.println( r );
	}
}

class BokriBank extends Bank {
	public double calc ( double money, int years, double rate ) {
		return 59665.1234;
	}
}

public class Test012 {
	public static 

// 클라우드에 Test037 참조
	
	
/*
자주 변하는 것들을 abstract를 이용하고 
자주 변하지 않는 것들은 그냥 정의 해준다
*/