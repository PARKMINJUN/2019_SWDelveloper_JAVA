public class Test007 {
	public static void main( String[] args ){	
		double j = 10.0;  // 실수를 저장 할 수 있는 공간 j 
		System.out.println( j );
		System.out.println( j + 10 );
		System.out.println( (int)j + 10 );
	}
}
/* byte < short < int < long < float(32bit)) < double(64bit)
작은 타입에서 큰 타입은 자동 변환 되지만
큰 타입에서 작은 타입은 강제변환 없으면 에러난다.

'기본적으로 같은 타입형 변수만이 연산가능하다'
*/