#include <iostream>
using namespace std;

class Box{

public:
	double length;
	double breadth;
	double heigth;

};

int main(){

	Box box1;
	Box box2;

	double volume = 0.0;

	//box 1 specification
	box1.length = 5.0;
	box1.breadth = 7.0;
	box1.heigth = 10;

	//vol

	volume = box1.heigth * box1.breadth * box1.length;
	cout << "vol: " << volume << endl;


	return 0;
}