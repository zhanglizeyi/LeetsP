
/*
	Propose of Huffman coding is a encode stucture that helps fast to find key
	words, use short 0 or 1 to repersent high frequency otherwise use long for 
	less frequency
	1. Give 256 askii franquency stat
	2. find two smallest to build a new binary tree and weight is sum 
	3. delete two smallest and gain new 
	4. repeat 2 and 3 util only one tree left 


	greedy algorithm idea to chose two lowest tree

*/
#include <iostream>
#include <string>
#include <fstream>
#include <iomanip>

#include "huffman.h"

using namespace std;
//Definition of buildDecodingTree();

void Huffman::buildDecodingTree(ifstream & codeIn){

	char ch; //a character
	string code; //its code
	for(;;){
		codeIn >> ch >> code;
		if( code.eof() ) return;
		insert(ch,code);
	}
}


//Definition of insert()
void Huffman::insert(char ch, string code){
	Huffman::BinNodePointer p = myRoot; //pointer to move down the tree
	for(int i = 0; i < code.length(); i++){
		switch (code[i]){
			case '0':	//descend left 
				if(p->left == 0) //create node along path
					p->left = new Huffman::BinNode('*');
				p = p->left;
				break;
			case '1':
				if(p->right == 1)
						p->right = new Huffman::BinNode('*');
				p = p->right;
			default:
				cerr << "*** Illegal character in code ***\n";
				exit(1);
		}
	}
	p->data = ch;
}

//Definition of decode()
void Huffman::decode(ifstream & messageIn)
{
	char bit;
	Huffman::BinNodePointer p; //pointer to trace path in decoding tree
	for(;;)
	{
		p = myRoot;
		while(p->left != 0 || p->right != 0)
		{
			messageIn >> bit;
			if(messageIn.eof()) return;
			cout<<bit;
			if(bit == '0')
			{
				p = p->left;
			}
			else if( bit == '1')
			{
				p = p->right;
			}else{
				cerr << "Illegal bit: " << bit << "  --ignored\n";
			}
		}
		cout << "--" << p->data <<endl;
	}

}

//Definition of printTree()
void Huffman:printTree(ostream & out, Huffman::BinNodePointer root, int indent){
	if(root != 0)
	{
		printTree(out, root->right, indent+8);
		out << setw(indent) << " " <<root->data <<endl;
		printTree(out, root->left, intdent+8);
	}
}

