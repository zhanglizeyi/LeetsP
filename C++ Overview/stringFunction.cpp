#include <iostream>
#include <cstring>
using namespace std;

int stringTest(){

	string s1 = "Hello";
	string s2 = "World";
	string s3;
	int len;

	//copy str1 into str3
	s3 = s1;
	cout << s3 << endl;

	//concatnates s3 + s2
	s3 += s2;
	cout << s3 << endl;

	//total length of str1 after concatenation
	len = s3.size();
	cout << len << endl;

	return 0;
}

int main(){

	//string way to define
	char str1[10] = "hello";
	char str2[10] = "world";
	char str3[10];
	int len;
	
	string s1 = "this is string1";
	string s2 = "!!!";


	//copy s2 into s1
	strcpy(str3, str1);
	cout << "strcpy(str3, str1): " << str3 << endl;

	//concatenates str1 and str2
	strcat( str1, str2 );
	cout << "strcpy(str3, str1);" << str1 << endl;

	//total length of str1 after concatenation
	len = strlen( str1 );
	cout << len << endl;


	cout << " starting string testing for another way " <<endl;
	stringTest();

	return 0;
}
