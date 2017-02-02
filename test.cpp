#include <iostream>//test
#include <vector>
using namespace std;

int main () {
  cout<< "test" <<endl;


  const int a = 5;
  cout << a << " address is " << &a<<endl;
  const int *ptr = &a;
  cout << ptr << " ptr address" << ptr << " ptr value " << *ptr << endl;

  int b = 10;

  ptr = &b;


        vector< vector<int> > test;
        vector<int> t; 

        t.push_back(3);
        test.push_back(t);
        test.push_back([]);
        t.clear();
        t.push_back(9);
        t.push_back(20);
        test.push_back(t);

        for(auto vec: test){
        	for(auto x: vec){
        		cout << x << endl;
        	}
        }
  
  return 0;
}