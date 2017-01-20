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

class Triangle: public Shape{
public:
	Triangle(int a=0; int b=0;):Shape(a,b){
		int area(){
			cout << "Triangle class area: " << endl;
			return (width*height/2);
		}
	}
};

int main(){
	
	Shape *shape;
	Rectangle rect;

	Triangle tri(10,7);

	rect.setWith(5);
	rect.setHeight(10);

	cout << "Area: " << rect.area() << endl;

	shape = &tri;
	shape->area();

	return 0;
}