/*
	1. take a array find a base value
	2. put all small at front and biggest at the back, in this branch and 基准stay middle
	3. recursive, "基准值前面的子数列" 和 “基准值后面的子数列” 进行排序

	a -- unsorted array
	l -- left array from l=0
	r -- right array from r = length-1

	running time and complex 
	数列里存a[i] = a[j]， 如果a[i]在a[j]前面， 排序后a[i]仍在a[j]前面，稳定的...

	worst time O(n^2) and aveage time O( n*log(n) )

	

*/

#include <iostream>

using namespace std;

void quickSort(int* a, int l, int r)
{
	if( l < r)
	{
		int i,j,x;

		i = l;
		j = r;
		x = a[i];
		//x = first array elem
		// l = 0 
		// r = 6

		while( i < j )
		{
			//position i and j, and 
			while( i < j && a[j] > x )
			{
				j--; //find the first less than x 
			}
			if( i < j )
			{
				a[i] = a[j];
				i++;
				//or a[i++] = a[j]; operator overwriting 	
			}
				
			while( i < j && a[i] < x )
			{
				i++;  //find from left to right of first bigger than x
			}
			if( i < j )
				a[j--] = a[i];
		}

		a[i] = x;
		quickSort(a, l , i-1);
		quickSort(a, i+1, r);
	}
}

int main()
{
	int a[] = {30,40,50,10,20,70};
	int length = (sizeof(a))/ (sizeof(a[0]));

	cout << "sizeof a " << sizeof(a) << " sizeof a[0] " << sizeof(a[0]) << " length :" << length << endl;

	cout << "---------------------testing---------------" << endl;

	for(int i = 0; i < length; i++){
		cout << a[i] << " ";
	}
	cout << endl;

	quickSort(a, 0, length-1);

	cout << "------------------after--------------" << endl;
	for(int i = 0; i < length; i++){
		cout << a[i] << " ";
	}
	cout << endl;


	return 0;
}


