#include <iostream>
#include "ArrayQueue.h"

using namespace std;

/*
	testing
*/

void int_test()
{
	int tmp = 0;
	ArrayQueue<int> * pq = new ArrayQueue<int>();

	//put 10, 20, 30 into queue
	pq->add(10);
	pq->add(20);
	pq->add(30);


	//put queue begaining to tmp, and delete it
	tmp = pq->pop();
	cout << "tmp = " <<tmp << endl;

	//only show first value without delete it 
	tmp = pq->front();
	cout << "tmp = " << tmp << endl;

	pq-> add(1000);

	//20, 30, 1000

	cout << "check if empty " << pq->is_empty() << endl;
	cout << "check count " << pq->size() << endl;


	while( !pq->is_empty() ){
		tmp = pq->pop();
		cout << "size " << pq->size() <<endl;
		cout << " element is: " << tmp << endl;
	}

}

int main(){

	int_test();

	return 0;
}