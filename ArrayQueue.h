/*
	1.FIFO, First In First Out
	2.Only allow in deletion in 队首, only insertion in 队尾

	template< 类型形式参数表 > 返回类型（形式参数表）{
		//函数定义体
	}



*/

#ifndef ARRAY_QUEUE_HPP
#define ARRAY_QUEUE_HPP

#include <iostream>
using namespace std;

template<class T> class ArrayQueue
{
	public:
		ArrayQueue();
		~ArrayQueue();

		void add(T t);
		T front();
		T pop();
		int size();
		int is_empty();


	private:
		T *arr;
		int count;
};

template<class T> ArrayQueue<T>::~ArrayQueue()
{
	if(arr)
	{
		delete[] arr;
		arr = NULL;	
	}
}

//create queue, default in 20
template<class T> ArrayQueue<T>::ArrayQueue()
{
	arr = new T[20];
	if( !arr )
	{
		cout << "arr malloc error!" << endl;
 	}
}

//delete queue
template<class T>void ArrayQueue<T>::add(T t)
{
	arr[count++] = t;
}

//return "queue beginning"
template<class T>T ArrayQueue<T>::front()
{
	return arr[0];
}

//return and delete "queue last"
template<class T>T ArrayQueue<T>::pop()
{
	T ret = arr[0];

	count--; //losing one 
	for(int i=0; i <= count; i++)
	{	
		cout << "i " << i <<endl;
		arr[i-1] = arr[i];
	}
	int i = 0;
	// while ( i++ < count )
	// {
	// 	cout << "i " << i <<endl;
	// 	arr[i-1] = arr[i];
	// }

	return ret;
}

//return "queue" size
template<class T>int ArrayQueue<T>::size()
{
	return count;
}

//check if queue empty or not 
template<class T> int ArrayQueue<T>::is_empty()
{
	return count==0;
}


#endif


