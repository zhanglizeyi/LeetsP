/*
	Merge sort

	-Two ways to do it, "from up to bottom" , "from bottom to up"

	1. "from up to bottom" :
		1. break down from one to two, mid = (low + high)/2
		2. recursive call a[low...mid] and a[mid+1...high] merge and sort. 
		3. merge the two already sorted part a[low...mid] and a[mid+1...high]merge tem into a[low...high] 

	2. "from bottom to up"
		from single sub key and merge to the two and sort them, and keep merge them until they become a full array.

	
	a -- contain two ordered array
	start -- the first block begaining (0)
	mid -- the first block ending, and also the second block begain (0, n) (n+1)
	end -- the second end (m)



	TIME COMPLEXITY: O(N*log(N))
	

*/

#include <iostream>
using namespace std;


void merge(int *a, int start, int mid, int end)
{

	int i = start;
	int j = mid+1;
	int *tmp = new int[end-start+1]; 

	int k = 0;

	while( i <= mid && j <= end )
	{
		if( a[i] <= a[j] )
			tmp[k++] = a[i++];
		else
			tmp[k++] = a[j++];
	}

	while( i <= mid )
	{
		tmp[k++] = a[i++];
	}

	while( j <= end )
	{
		tmp[k++] = a[j++];
	}

	//put order elem, and all in array a 
	for(int n = 0; n < k; n++)
	{
		a[start + n] = tmp[n];
	}

	delete[] tmp;
}

/*
	merge (from top to bottom)

	a - array
	start - array begain address
	end - array end address
*/


void mergeSortUp2Down( int * a, int start, int end)
{
	if( a == NULL || start >= end )
	{
		return ;
	}

	int mid = (end + start)/2; //divide half
	mergeSortUp2Down(a, 0, mid);
	mergeSortUp2Down(a, mid+1, end);

	//a[start...mid] with a[mid...end] are two blocks
	//put them into a ordered a[start...end]

	cout << " start : " << start << " mid : " << mid << " end : " << end << endl;

	//3 4 1 2 7 8
	// 0 , 3, 6

	merge(a, start, mid, end);
}

void mergeGroup(int * a, int len, int gap)
{
	int i;
	int twolen = 2 * gap; //neihbors array length

	//merge the two closest neihbors

	if( i+gap-1 < len-1 )
	{
		merge(a, i, i + gap-1, len-1);
	}
}

void mergeSortDown2Up(int * a, int len)
{
	int n;

	if( a=NULL && len <= 0 )
		return;

	for(n=1; n<len; n*=2)
	{
		mergeGroup(a, len, n);
	}
}



int main()
{

	int arr[] = { 3, 4, 1, 2, 7 ,8};
	int length = (sizeof(arr)) / (sizeof(arr[0]));

	for( int i = 0; i < length; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;


	mergeSortUp2Down(arr, 0, length);

	for( int i = 0; i < length; i++)
	{
		cout << arr[i] << " ";
	}
	cout << endl;


	return 0;
}




