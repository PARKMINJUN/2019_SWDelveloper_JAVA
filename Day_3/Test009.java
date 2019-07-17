/*
��� X, �ܺγ��� X, �������°� (����) : private
��� O, �ܺγ��� X, �������°� (�𳪸���) : protected
��� O, �ܺγ��� O, �������°� (����) : public

"Ŭ���� ���� �������, ����Լ� �տ� �ٿ��ش�" ==> ����� ������(���м�)

1. java�� protected
- ���� ��Ű�������� ���ٰ���
- �ٸ� ��Ű�������� ���ٺҰ�
 
2. friendly
- ���� ��Ű�������� public ����..
- �ٸ� ��Ű�������� private ����..

*/
class A{
	private int mayak = 0;
	protected int monarisa = 0;
	public int house2 = 0;
}

class B extends A{
	void print() {
		System.out.println( monarisa );		// ����, �𳪸���, �� ���� ���� �� ���� �������� ���̰� �ִ�.
		}
}

public class Test009{
	public static void main( String[] args ){
		A look = new A();
		System.out.println( look.monarisa );
		}
	}
	
/*
	look.monarisa �� ���� ��Ű�������� ���� ����. �ٸ� ��Ű�������� ���� �Ұ�.
	
	protected �� ������ �������� �����ϸ� ����.
	���� ���� �ٸ� Ŭ�������Դ� �˷�������, �ٸ� ���� �Ҽӵ� Ŭ������ ���� �Ұ��ؾ� �Ѵ�.
	�Ĺ迡�� �����ٶ��� �翬�� ���� �����ؾ� �Ѵ�.
	
	( ���������� private / public ���� ���� )
*/