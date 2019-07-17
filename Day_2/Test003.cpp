#include <stdio.h>

int main() {
	int* t;
	int* l;
	int i;
	
	i = 100;
	t = &i;
	
	printf("%d\n", *t); 
	printf("%d\n", i); 
	return 0;
}
//c언어는 자료형의 포인터형 변수가 존재한다.
 
