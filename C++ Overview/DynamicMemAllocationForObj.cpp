#include <iostream>
using namespace std;

class Box{

public:
	Box(){
		cout << "Constructor called!" << endl;
	}

	~Box(){
		cout << "Destructor called!" <<endl;
	}
};


int main(){

	// Box * myBox = new Box[4];

	// delete [] myBox; // delete array

	Box box;

	delete box;

	return 0;
}
