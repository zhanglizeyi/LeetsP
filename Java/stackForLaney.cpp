#include <iostream>
using namespace std;

struct Node {
	int x;
	Node *next;
	char data;
};
Node *head;

//helper class to create linkedlist
class stackForLaney {

public:
	// void push(char val);
	// char pop();
	// bool isEmpty();

	//constructor
	stackForLaney(){
		head = NULL; //set head to NULL
	}


	//push method
	void push(char val){
		struct Node *n = new Node;
		n->x = val; 
		n->next = head;
		head = n;
	}	

	//pop method
	char pop(){
		if(head == NULL){
			cout << "list is empty" << endl; 
			return ' ';
		}

		char ret = head->data;
		delete head;
		head = head->next;
		return ret; 
	}

	bool isEmpty(){
		if(head == NULL) return false;
		else return true;
	}
};

int main(){
	stackForLaney s; 
	//input your value
	s.push('H');
	s.push('a');
	s.push('p');
	s.push('p');
	s.push('y');

	//output
	// while(s.isEmpty()){
	// 	cout << s.pop() << endl;
	// }

	return 0; 
}

