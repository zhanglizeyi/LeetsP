#include <iostream>

using namespace std;

class printData{

public:
	void print(int i){
		cout << "Printing int: " << i << endl;
	}

	void print(double f){
		cout << "Printing float: " << f << endl;
	}

    void print(char* c) {
       	cout << "Printing character: " << c << endl;
    }

};

int main(){
	printData p; 

	//call print to print integer
	p.print(5);

	//call print to print double
	p.print(5.5);	

	//call print to print char
	p.print("Hello C++");

	return 0;
}