class Node {
	int data = 0;
	Node next = null;
	
	Node( int i, Node n) {
		this.data = i;
		this.next = n;   
	}
}

public class Test004 {
	public static void main( String[] args ){
		Node head = new Node( 0, null );
		Node tail = head;
		
		tail.next = new Node( 10, null );
		tail = tail.next;
		
		tail.next = new Node( 20, null );  
		tail = tail.next;
		
		for( Node t = head.next ; t != null; t = t.next )  // 오른쪽이 가르키는 대상을 왼쪽이 가르킨다!!! //t가 가르키고 있는 인스턴스의 데이터가 가지고 있는 멤버 변수의 값
		System.out.println( t.data );
	}
}
/*
모든 참조형 변수에는 null 이라는 값을 대입 가능 : 가리키는 인스턴스 없다.
- 어떻게 돌아가는지 상황파악을 그림으로 설명 가능할 것.
*/
// 코드 외우기!!!!