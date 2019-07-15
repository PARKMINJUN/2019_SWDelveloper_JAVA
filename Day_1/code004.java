public class code003 {
	public static void main( String[] args ){	
		for( int i = 0; /*1번*/ i<5; /*2번*/ i++ /*3번*/){
			System.out.println( i ); /*4번*/
		}
	}
}
/*
	i++은 i = i + 1 을 축약한 형태이다.
	코드와 결과 ( 0 1 2 3 4 ) 모두를 외운다.
*/

/* 
	1번 -> 2번 -> 4번 -> 3번 순으로 진행된다. 
	2번에서 식의 참 거짓에 따라 탈출 가능하다.
*/
