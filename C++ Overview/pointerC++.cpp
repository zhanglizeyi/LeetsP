#include <iostream>
using namespace std;

int pointer(){

	int var = 20; //actual variable declaration
	int *ip; //pointer of int

	ip = &var;

	cout << "Value of var variable: ";
	cout << var << endl;

	//print the address stored in ip pointer variable
	cout << "Address stored in ip variable: ";
	cout << ip << endl;

	//access the value at the address 
	cout << "the value at the address: ";
	cout << *ip << endl;

	return 0;
}

int main(){

	int var1;
	char var2[10];

	cout << "Address of var1 variable: ";
	cout << &var1 << endl;

	cout << "Address of var2 char variable: " << &var2 << endl;

	cout << "This is the pointer testing method " << endl;
	pointer(); 


	return 0;
}