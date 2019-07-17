// Test004와 같은 결과값이 나오는데 이거는 이해를 잘 못했음...물어볼것!!!

class Node {
	int data = 0;
	Node next = null;
	
	Node( int i, Node n) {
		this.data = i;
		this.next = n;   
	}
}

class LinkedList {
	Node head = null;
	Node tail = null;
	
	LinkedList(){
		this.head = new Node ( 0, null );
		this.tail = this.head;
	}
	
	void add( int i ){
		tail.next = new Node( i, null );
		tail = tail.next;
	}
	
	void print(){           //와꾸부터 짜보자.
		for( Node t = head.next ; t != null ; t = t.next){
			System.out.println( t.data );
		}
	}
}

public class Test005 {
	public static void main( String[] args ){
		LinkedList l = new LinkedList();
		l.add( 10 );
		l.add( 20 );
		l.print();
	}
}