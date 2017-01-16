#include <iostream>
using namespace std;

int main(){

	//declare simple cariable
	int i = 5;
	double d = 11.7;

	//declare ref
	int & iRef = i;
	double & dRef = d;

	cout << "ref int: " << iRef << endl;
	cout << "ref double: " << dRef << endl;

	//declare pointer
	int *ip;
	double *dp;

	ip = &i;
	dp = &d;

	cout << "pointer int: " << *ip << endl;
	cout << "pointer double: " << *dp << endl;

		
	return 0;
}