#include <stdio.h>
//�Լ��� �� �ڵ�� ������ �Ͳٺ��� §�� 
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
