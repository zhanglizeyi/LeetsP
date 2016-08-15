/*
*/

#ifndef BUBBLE_SORT_HPP
#define BUBBLE_SORT_HPP

#include <iostream>
using namespace std;


void bubbleSort(int* a, int n)
{
	int i, j, tmp; 

	for(i = n-1; i > 0; i--)
	{
		//put a[0..i]the biggest to last
		for(j=0; j<i; j++)
		{
			if(a[j] > a[i])
			{
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp; 
			}
		}
	}
}


void bubbleSort2(int * a, int n)
{
	int i,j,tmp;
	int flag;

	for(i = n-1; i > 0; i--){
		flag = 0; //initial as 0

		//put a[0...1] biggest in the last
		for(j = 0; j < i; j++)
		{
			//change a[j] and a[j+1]
			if(a[j] > a[j+1])
			{
				tmp = a[j];
				a[j] = a[j+1];
				a[j+1] = tmp;

				flag = 1;
			}
		}
		if(flag == 0)
			break; //if not 0, the order is not changed
	}
}

#endif