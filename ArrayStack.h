/*
	Stack: 
		push, peek, pop 

		1. LIFO, last in first out 
		2. add in stack and del stack, and only work in top of stack
*/

#ifndef ARRAY_STACK_HPP
#define ARRAY_STACK_HPP

#include <iostream>
#include "ArrayStack.h"

using namespace std;

template<class T>class ArrayStack
{
	public:
		ArrayStack();
		~ArrayStack(); //finish and delete

		void push(T t);
		T peek();
		T pop();
		int size();
		int  empty();

	private:
		T * arr;
		int count;
};


//create stack
template<class T> ArrayStack<T>::ArrayStack()
{
	arr = new T[20]; //default 20
	if(!arr)
	{
		cout << "arr malloc error! " <<endl;
	}
}

//delete stack
template<class T> ArrayStack<T>::~ArrayStack()
{
	if(arr)
	{
		delete[] arr;
		arr = NULL;
	}
}

template<class T>T ArrayStack<T>::peek()
{
	return arr[count-1];
}

//put value to stack
template<class T>void ArrayStack<T>::push(T t)
{
	arr[count++] = t;
}

//pop
template<class T>T ArrayStack<T>::pop()
{
	int tmp = arr[count-1];
	count--;
	return tmp;
}

//return stack size
template<class T>int ArrayStack<T>::size()
{
	return count;
}

//return stack if empty
template<class T>int ArrayStack<T>::empty()
{
	return size() == 0;
}

#endif

























