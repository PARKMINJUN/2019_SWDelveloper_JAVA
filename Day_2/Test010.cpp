#include <stdio.h>
//�Լ��� �� �ڵ�� ������ �Ͳٺ��� §�� 
int add(int i, int j) {
	int t;
	t = i + j;
	return t;
}

int main(){
	int r;
	// �Ʒ��� ���� ����� ���� fp�� �Լ��� ����ų �� �ִ�.(�����ͺ���) 
	// ����Ÿ���� int, �Ű������� int, int ���·� ����� �Լ� ȣ�� 
	int (*fp)(int, int);
	fp = add; 
	// fp��� �Լ��� �ƴ� fp������ ����Ű�� �Լ��� ȣ���Ѵ�
	r = fp(10, 20);
	printf("%d\n", r);
	return 0;
}
