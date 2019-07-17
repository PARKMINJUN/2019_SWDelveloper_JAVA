#include <stdio.h>
//함수가 들어간 코드는 무조건 와꾸부터 짠다 
float danri(float money, int year, float rate){
	money = money * rate + money;
	return money;
}
float bokri(float money, int year, float rate){
	return 200;
}
int main(){
	int r;
	int (*fp)(int, int);
	fp = danri;
	r = danri(10, 20);
	printf("%d\n", r); 
	
	fp = bokri;
	r = bokri(10, 20);
	printf("%d\n", r); 
	
	return 0;
}
