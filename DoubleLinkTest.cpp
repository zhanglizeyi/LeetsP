#include <iostream>
#include "DoubleLink.h"
using namespace std;

//two direction 

void int_test()
{
	int iarr[4] = {10, 20, 30, 40};


	cout << "---------int_test-----------" <<endl;

	//create double linklist

	DoubleLink<int> * pdlink = new DoubleLink<int>();

	pdlink->insert(0, 20); //insert 20 into first position 
	pdlink->append_last(10); 
	pdlink->insert_first(40);

	cout << "is_empty() = " << pdlink->is_empty() << endl;

	cout << "size() = " << pdlink->size() << endl;

	int size = pdlink->size();

	for(int i = 0; i < size; i++){
		cout << "pdlink(" << i << ") = " << pdlink->get(i) <<endl;
	}

}


void string_test()
{
	string sarr[4] = {"ten", "twenty", "thirty", "forty"};

	cout << "-----------------string test-----------------" << endl;

	DoubleLink<string> * pdlink = new DoubleLink<string>();

	//create doublelink string

	pdlink->insert(0, sarr[0]);
	pdlink->insert_first(sarr[1]);
	pdlink->append_last(sarr[3]);

	int size = pdlink->size();

	cout << " is_empty() " << pdlink->is_empty() << endl;
	cout << " size is " << pdlink->size() << endl;

	for(int i = 0; i < size; i++){
		cout << "pdlink ("<< i <<") = " << pdlink->get(i) << endl;
	}

}


struct stu
{
	/* data */
	int id;
	char name[20];
};

static stu arr_stu[] = 
{
	{10, "first"},
	{20, "second"},
	{30, "third"},
	{40, "forth"},
};

void object_test(){
	cout<< "--------------------object_test------------------" << endl;

	DoubleLink<stu> * pdlink= new DoubleLink<stu>();

	pdlink->insert(0, arr_stu[1]); 
	pdlink->insert_first(arr_stu[0]);
	pdlink->append_last(arr_stu[2]);

	//two ways 
	cout<< "is_empty() " << pdlink->size() << endl;
	//two ways 
	cout << "size()= " << pdlink->size() << endl;

	int size = pdlink->size();
	struct stu p;
	for (int i = 0; i < size; i++)
	{
		/* code */
		p = pdlink->get(i);
		cout << "pdlink (" << i << ") = [" <<p.id <<", " << p.name << "]" << endl;
	}
}

int main(){
	cout<< " -------------------main function-----------------" << endl;

	int_test();

	string_test();

	object_test();

	return 0;
}







