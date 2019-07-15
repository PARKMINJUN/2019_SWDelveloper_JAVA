// Q. 100만원을 저축했을 때  복리로 연이자율이 6.6이고  10년 후면 얼마일까?

public class code002{
	public static void main( String[] args ){	
		double money = 100;
		System.out.println( money );
		
		money = money * 0.066 + money;
		System.out.println( money );  // 1년치
		
		money = money * 0.066 + money;
		System.out.println( money );  // 2년치
		
		money = money * 0.066 + money;
		System.out.println( money );  // 3년치
		
		money = money * 0.066 + money;
		System.out.println( money );  // 4년치
		
		money = money * 0.066 + money;
		System.out.println( money );  // 5년치
		
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;

		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;

		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;

		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		money = money * 0.066 + money;
		System.out.println( money );  // 100년치 		
		}		
	}
/*
정수값의 대표형 : int
실수값의 대표형 : doble
*/
	
	
/*
public class code002{
	public static void main( String[] args ){	
		int money;
		money = money * 0.066 + money;
		System.out.println( money );
		}		
	}
*/	 //정수형과 실수형을 더했을 때 에러가 발생한다.
	
/*
public class code002{
	public static void main( String[] args ){	
		int money, lastMoney;
		money = 1000000;
		money += money*1.066;
		lastMoney = money*10;
		System.out.println( lastMoney );
		}		
	}
*/	
