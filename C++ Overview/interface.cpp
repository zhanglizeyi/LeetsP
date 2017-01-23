#include <iostream>
using namespace std;

//Base class 
class Shape{

public:
	//pure virtual function providing interface framework
	virtual int getArea() = 0;

	void setWidth(int w){
		width = w;
	}

	void setHeight(int h){
		height = h;
	}

protected:
	double width;
	double height;

};

//Derived classes
class Rectangle: public Shape{

public:
	int getArea(){
		return (width * height);
	}

};

class Triangle: public Shape{

public:
	int getArea(){
		return (width * height)/2;
	}
};

int main(){

	Rectangle rec;
	Triangle tri;

	rec.setWidth(5);
	rec.setHeight(10);

	cout << "Total rectangle area: " << rec.getArea() << endl;


	tri.setWidth(3);
	tri.setHeight(5);
	cout << "Total Triangle area: " << tri.getArea() << endl;

	return 0;
}

