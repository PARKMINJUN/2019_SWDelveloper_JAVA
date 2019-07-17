#include <stdio.h>
//함수가 들어간 코드는 무조건 와꾸부터 짠다 
int add(int i, int j) {
	int t;
	t = i + j;
	return t;
}

int main(){
	int r;
	// 아래와 같이 선언된 변수 fp는 함수를 가리킬 수 있다.(포인터변수) 
	// 리턴타입이 int, 매개변수가 int, int 형태로 선언된 함수 호출 
	int (*fp)(int, int);
	fp = add; 
	// fp라는 함수가 아닌 fp변수가 가리키는 함수를 호출한다
	r = fp(10, 20);
	printf("%d\n", r);
	return 0;
}
