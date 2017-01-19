#include <iostream>

using namespace std;

//Base class Shape
class Shape{
public: 
	void setWidth(int w){
		width = w;
	}

	void setHeight(int h){
		height = h;
	}

protected:
	int width;
	int height;
};

//Base class PinatCost
class PaintCost{
public: 
	int getCost(int area){
		return area * 70;
	}
};

//Derived class
class Rectangle: public Shape, public PaintCost{
public: 
	int getArea(){
		return (height * width);
	}
};



int main(){

	Rectangle rect;
	rect.setHeight(5);
	rect.setWidth(10);

	int area = rect.getArea();

	//Print the area of the object 
	cout << "Total area: " << rect.getArea();

	//Print the toal cost of painting
	cout << "Total paint: " << rect.getCost(area);


	return 0;
}