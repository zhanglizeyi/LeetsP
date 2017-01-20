#include <iostream>

using namespace std;

class Box{

public: 
	double getVolume(void){
		return length * height * breadth;
	}

	void setLength(double l){
		length = l;
	}

	void setWidth(double w){
		breadth = w;
	}

	void setHeight(double h){
		height = h;
	}

	//Overload + operator to add two Box objects
	Box operator+(const Box& b){
		Box box;
		box.length = this->length + b.length;
		box.breadth = this->breadth + b.breadth;
		box.height = this->height + b.height;

		return b;
	}

protected:
	double length;
	double breadth;
	double height;
};

//Main function for the program
int main(){

	Box b1; //Declare b1 of type Box
	Box b2;
	Box b3;
	double volume = 0.0;

	//b1
	b1.setLength(5.0);
	b1.setWidth(5.0);
	b1.setHeight(5.0);

	//b2
	b2.setLength(7.0);
	b2.setWidth(6.0);
	b2.setHeight(5.0);

	cout << "Total Volume b1: " << b1.getVolume() << endl;

	cout << "Total Volume b2: " << b2.getVolume() << endl;

	b3 = b1 + b2;
	volume = b3.getVolume();
	cout << "Total Volume b3: " << volume << endl;

	return 0;
}