#include <iostream>
using namespace std;

class Box{

public:
	double length;
	double breadth;
	double height;
};


int main(){


	Box box1;

	box1.length = 5.0;
	box1.breadth = 20.5;
	box1.height = 10.5;


	cout << "length: " << box1.length << " breadth: " << box1.breadth << 
	 "height: " << box1.height << endl; 


	return 0;
}