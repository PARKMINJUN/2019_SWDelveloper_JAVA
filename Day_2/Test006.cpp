#include <stdio.h>

int main() {
	int i;
	float l;
	void* t;
	//void* 변수는 어떤 기억공간이든 다 가리킨다.  
	//가리킬 순 있지만 실제로 접근하는 것은 불가능하다. 
	i = 100;
	l = 3.14;
	t = &i;
	
	int* h;
	h = (int*)t;
	printf("%d\n", *h); 
	return 0;
}
//c언어는 자료형의 포인터형 변수가 존재한다.
 
