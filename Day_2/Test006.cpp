#include <stdio.h>

int main() {
	int i;
	float l;
	void* t;
	//void* ������ � �������̵� �� ����Ų��.  
	//����ų �� ������ ������ �����ϴ� ���� �Ұ����ϴ�. 
	i = 100;
	l = 3.14;
	t = &i;
	
	int* h;
	h = (int*)t;
	printf("%d\n", *h); 
	return 0;
}
//c���� �ڷ����� �������� ������ �����Ѵ�.
 
