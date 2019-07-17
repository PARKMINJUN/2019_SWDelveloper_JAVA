#include <stdio.h>

int main() {
	int* t;
	int* l;
	int i;
	
	i = 100;
	  
	t = &i;
	
	l = t;
	
	//*t와 i의 출력값은 동일하다. 이유는 ?!  
	//*는 t가 가리키는 기억 공간  
	printf("%d\n", *t); 
	printf("%d\n", *l);
	printf("%d\n", i); 
	return 0;
}
//c언어는 자료형의 포인터형 변수가 존재한다.
 
