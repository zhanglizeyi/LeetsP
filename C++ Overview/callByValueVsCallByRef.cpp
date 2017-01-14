#include <iostream>
//using namespace std;

void call_by_value( int a ){

	a+=10;

}


void call_by_reference( int *r ){

	(*r)+=10;

}

void call_by_pointer( int &p ){

	p+=10;
}

int main(){

	int x = 50; //init an int with value 50

	std::cout << "call by value: " << call_by_value(x) << std::endl;
	//call by value is a copy of x, and not going to affect value in function

	int y = 50;

	std::cout <<"call by reference: " << call_by_reference(&y) << std::endl;

	int z = 50;

	std::cout <<"call by pointer: " << call_by_pointer(z) << std::endl;


	return 0;
}