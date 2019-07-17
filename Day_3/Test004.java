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
		
		for( Node t = head.next ; t != null; t = t.next )  // �������� ����Ű�� ����� ������ ����Ų��!!! //t�� ����Ű�� �ִ� �ν��Ͻ��� �����Ͱ� ������ �ִ� ��� ������ ��
		System.out.println( t.data );
	}
}
/*
��� ������ �������� null �̶�� ���� ���� ���� : ����Ű�� �ν��Ͻ� ����.
- ��� ���ư����� ��Ȳ�ľ��� �׸����� ���� ������ ��.
*/
// �ڵ� �ܿ��!!!!