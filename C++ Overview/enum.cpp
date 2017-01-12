#include <iostream>

using namespace std;


enum color { red, green, blue } c;

// ostream & operator << (ostream& out, const color value){
// 	static map<color, string> strings; 

// 	if(strings.size() == 0){
// 		insert_element(p) strings[p] = "p"
// 		insert_element(red);
// 		insert_element(green);
// 		insert_element(blue);
// 		insert_element
// 	}

// 	return out << strings[value];
// }


int main(){

	enum color {red, green, blue } c;

	cout << " red " << red << " green " << green << " blue " << blue << endl;

	enum color1 {

		red1,
		green1 = 10,
		blue1
	};

	cout << " red1 " << red1 << " green1 " << green1 << " blue1 " << blue1 << endl;

	return 0;
}