public class Test004 {
	public static void main( String[] args ){
		int i; 
		int j; 
		i = 10;
		j = i;  // 오른편 변수의 값이 복사되어 왼쪽 변수에 대입
		i = 20;
		System.out.println( i );
		System.out.println( j );
	}
}
