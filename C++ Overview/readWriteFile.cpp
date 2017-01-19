#include <iostream>
#include <fstream>

using namespace std;


int main(){

	char data[100];

	//open a file in write mode
	ofstream outfile;
	outfile.open("namefile.dat");

	cout << "Write to the file" <<endl;
	cout << "Enter name: ";
	cin.getline(data, 100);

	//write inputted data into the file
	outfile << data << endl;

	cout << "Enter your age: ";
	cin >> data;
	
	cin.ignore(); 
	//ignore function is ignore the extra characters left by previous read statment

	outfile.close();


	ifstream infile;
	infile.open("namefile.dat");

	cout << "the output will be: " << endl;
	infile >> data; //take in data

	//write the data at the screen
	cout << data << endl;

	//again read the data from the file and display it
	infile >> data;
	cout << data << endl;


	cout << infile.seekg(0, ios::end) << endl;

	


	//close everytime file opend
	infile.close();


	return 0;
}