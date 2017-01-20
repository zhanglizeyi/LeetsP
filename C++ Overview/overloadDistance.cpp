#include <iostream>

using namespace std;

class Distance{
private:
	int feet;
	int meter;

public:
	//required constructors
	Distance(){
		feet = 0;
		meter = 0;
	}

	Distance(int f, int m){
		feet = f;
		meter = m;
	}

	//method to display dis
	void displayDistance(){
		cout << "F: " << feet << " M: " << meter << endl;
	}

	//overload
	Distance operator- (){
		feet = -feet;
		meter = -meter;
		return Distance(feet, meter);
	}

	bool operator< (const Distance& d){
		if(feet < d.feet){
			return true;
		}
		if(feet == d.feet && meter < d.meter){
			return true;
		}
		return false;
	}
};

int main(){

	Distance D1(11, 10), D2(-5, 11);

	-D1;
	D1.displayDistance();

	-D2;
	D2.displayDistance();

	if(D1 < D2){
		cout << "D1 is less than D2: " << endl;
	}
	else{
		cout << "D2 is less than D1: " << endl;
	}
	return 0;
}