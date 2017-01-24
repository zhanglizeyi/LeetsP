#include <iostream>
using namespace std;


int main(){

	int const d = 5;
	const int & e = d;

	cout << "d: " <<  d << endl;
	cout << "e: " << e << endl;

	e = 10;

	cout << "d: " <<  d << endl;
	cout << "e: " << e << endl;
	return 0;
}