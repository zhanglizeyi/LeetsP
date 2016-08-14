#include <iostream>
#include "ArrayStack.h"

using namespace std;


void test()
{
	int tmp = 0;
	ArrayStack<int> *arr = new ArrayStack<int>();

	cout << "--------------test----------------" <<endl;

	cout << "empty -> " << arr->empty() << endl;
	arr->push(0);
	arr->push(1);
	arr->push(2);
	arr->push(3);

	cout << "empty -> " << arr->empty() << endl;

	cout << "size -> " << arr->size() << endl;
	//cout<< "peek -> " << arr->peek() << endl;
	arr->pop();

	cout << "size -> " << arr->size() << endl;

	while(!arr->empty())
	{
		cout << arr->pop() << endl;
	}

	arr->~ArrayStack();
}



void string_test()
{

	ArrayStack<string> *arr = new ArrayStack<string>();

	cout << "------------------string test---------------" <<endl;

	arr->push("a");
	arr->push("b");
	arr->push("c");
	arr->push("d");

	cout << "empty -> " << arr->empty() << endl;

	cout << "size -> " << arr->size() << endl;

	arr->pop();

	while(!arr->empty()){
		cout << arr->pop() << endl;
	}

	arr->~ArrayStack();
}

int main(){

	cout<< "----------------main-------------" <<endl;
	test();

	string_test();

	return 0;
}















