#include <iostream>
using namespace std;

const int MAX_SIZE = 100;


class StackOverFlowException{

public:
	StackOverFlowException(){
		cout << "Stack Over Flow" << endl;
	}
};


class StackUnderFlowException(){

public:
	StackUnderFlowException(){
		cout << "StackUnderFlowException" << endl;
	}
};

class ArrayStack{
private:
	int data[MAX_SIZE];
	int top;

public:
	ArrayStack(){

	}
};

