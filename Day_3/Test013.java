interface ICalc {
	public void print();
}

interface IUnkown{}
class Apple {}

class Calc extends Apple implements ICalc, IUnkown {
	public void print(){ System.out.println("A"); }
}

public class Test013 {
	public static void main ( String[] args ) {
		ICalc ic = new Calc();
		ic.print();
	}
}
// �������̽��� ����� method �� ���� abstract �ؾ� �Ѵ�.
// �������̽��� ����ؼ� Ŭ������ ������ �� �� implements �� �̿��ؾ� �Ѵ�.
// ��ӹ��� Ŭ������ �������̽��� ����� �޼ҵ带 ���� �������̵� �ؾ� �Ѵ�.
// �������̽��� ������ abstract Ŭ�����̴�. - ��������, ��Ӵ��� ����, �ν��Ͻ� ���� �Ұ�.
// 2�� �̻��� �������̽� ���? Ok, ���ÿ� Ŭ���� 1�� ���? Ok