#include <iostream>
#include <cmath>
#include <time>
#include <cstdlib>
using namespace std;

#define NUM_INT 6
#define NUM_DOUBLE 5.7

int main(){

	//call each build-in function 

	cout << "Number of cosine: " << cos(NUM_DOUBLE) << endl;

	cout << "Number of sine: " << sin(NUM_DOUBLE) << endl;	

	cout << "Number of tangent: " << tan(NUM_DOUBLE) << endl;

	cout << "Number of log: " << log(1) << endl;

	cout << "Number of pow: " << pow(2,2) << endl;

	cout << "Number of hypot: " << hypot(2,2) << endl;

	cout << "Number of square root: " << sqrt(8) << endl;

	cout << "Number of absolute: " << abs(-5) << endl;

	cout << "Number of absolute value: " << fabs(NUM_DOUBLE) << endl;

	cout << "Number of floor: " << floor(NUM_DOUBLE) << endl;

	for(int j=0; j<10; j++){
		int i = rand();

		cout << "random number: " << i << endl;
	}


	srand((unsigned) time(NULL));
	
	


	return 0;
}