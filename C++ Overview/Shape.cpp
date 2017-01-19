#include <iostream>

using namespace std;

//Base class
class Shape {
public:
	void setWith(int w){
		width = w;
	}

	void setHeight(int h){
		height = h;
	}

protected:
	int width;
	int height;
};

//Derived class
class Rectangle: public Shape{
public:
	int area(){
		return (height * width);
	}
};

int main(){
	
	Rectangle rect;

	rect.setWith(5);
	rect.setHeight(10);

	cout << "Area: " << rect.area() << endl;

	return 0;
}