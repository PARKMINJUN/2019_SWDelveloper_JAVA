/*
Ŭ������ ���� �� �� �ִ�. class [�̸�]{...} : c�� Ŭ���� ����.
- ��������, �Լ����� �����ϴ�.
- ������ ����, ����, �Լ� ȣ�� ��� ...�� �Ұ����ϴ�.
*/
class Apple {
int i;
// i = 100;
int add( int i, int j ){
	int k;//���ú��� 
 return 100; }
// System.out.println( add(10,20));
}
/*
Ŭ����(=���赵)�� �����ϰ�, �� �̸����� ���� ������ �����ѵ�
�̷� ������ ������ ������� �Ѵ�. (���� �� ������)

Ŭ������ �����ϰ�, new�� �̿��ؼ� �ν��Ͻ��� ���� �� �ִ�.
(Ŭ������ new�� �̿��ϸ� ������ ��������� : instance)

Ŭ���� �̸����� ����� ������ ������ �����̰�,
�̰��� �ش� Ŭ������ �̿��� ������� �ν��Ͻ��� ����ų �� �ִ�.
new�� �̿��ؼ� �ν��Ͻ��� �����. �� �ȿ��� ������ �Լ��� ����ִ�.
�ν��Ͻ��� �̸��� ����. �� �����ͷ� ��ü�� ������ �����ϴ�.

t.i : �̰��� t�� ����Ű�� �ν��Ͻ��� ������ �ִ� ���� i ��� ���.
t.add( 10, 20 ) : t�� ����Ű�� �ν��Ͻ��� ������ �ִ� �Լ� add ȣ��
*/

public class Test004{
	public static void main( String[] args ){
		Apple t = new Apple();  // new�� ����, t = ������ ����, Apple t = �ν��Ͻ� = �̸� ���� �κ�
		t.i = 100; 
		System.out.println( t.add(10,20));
	}
}
