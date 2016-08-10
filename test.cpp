#include <iostream>//test

using namespace std;

int main () {
  cout<< "test" <<endl;


  const int a = 5;
  cout << a << " address is " << &a<<endl;
  const int *ptr = &a;
  cout << ptr << " ptr address" << ptr << " ptr value " << *ptr << endl;

  int b = 10;

  ptr = &b;



  
  return 0;
}