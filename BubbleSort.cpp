#include "BubbleSort.h"
#include <iostream>

using namespace std;


int main(){
	int i;
	int a[] = {20,40,30,10,60,50};
	int ilen = (sizeof(a)) / (sizeof(a[0]));

	cout << "before sort: ";
	for(i = 0; i < ilen; i++){
		cout << a[i] << " ";
	}
	cout <<endl;


	bubbleSort(a, ilen);


	cout << "count after bubble sort" << endl;

	for(int j = 0; j < ilen; j++)
	{
		cout << a[j] << " ";
	}
	cout << endl;



	int b[] = {5, 2, 4, 9, 10};
	int length = (sizeof(b) / (sizeof(b[0])));

	cout << "length -> " << length << endl;


	bubbleSort2(b, length);
	for(int j = 0; j < length; j++)
	{
		cout << b[j] << " ";
	}
	cout << endl;



	return 0;
}