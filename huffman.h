#include <string>
#include <iostream>
#include <fstream>

#ifndef HUFFMAN
#define HUFFMAN
class Huffman
{
//node structure
	private: 

	class BinNode
	{

		public:
			char data;
			BinNode *left, *right;
		//BinNode constructor
		

		BinNode( char item)
		{
			data = item;
			left = right = 0;
		}
	};

typedef BinNode * BinNodePointer;

public: //function members
	Huffman(); //constructor 
	void buildDecodingTree(ifstream & codeIn);
	void insert(char ch, string code);
	void decode(ifstream & messageIn);
	void printTree(ostream & out, BinNodePointer root, int indent);
	void displayDecodingTree(ostream & out);


/*Data members*/
private:
	BinNodePointer myRoot;

};

// Definition of constructor

inline Huffman::Huffman(){
	myRoot = new BinNode('*');
}

// Definition of displayDecondingTree();
inline void Huffman::displayDecodingTree(ostream & out){
	printTree(out, myRoot, 0);
}

#endif