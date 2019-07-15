public class Test001 {
	public static void main( String[] args ){
		int i; // 변수선언(자료형 + 이름)  :::: 자바는 자료형이 8개(정수값 저장용 변수(byte/short/int/long)/float/double/boolean/char) ==> 자료형으로 변수선언을 한다 :::: 변수는 값을 저장하는 기억공간
		i = 100; // 대입
		System.out.println( i );
	}
}

// Test001.java
// byte(8bit)/short(16bit)/int(32bit)/long(64bit)
// 변수선언은 자료형의 크기만큼의 기억공간을 새로이 확보하는 것이다.