#include <stdio.h>
//�Լ��� �� �ڵ�� ������ �Ͳٺ��� §�� 
float bokri (float money, int year, float rate){
	int i;
	for( i=0; i<100; i++) {
		money = money + money * rate;
	}
	return money;

}

int main(){
	float r;
	r = bokri(100.0, 100, 0.066);
	printf("%f\n", r);
	return 0;
}
