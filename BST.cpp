/*

BST:
	Search(): search an element in a tree
	Insert(): Insert an element in a tree
	Pre-order Traversal: Traverses a tree in a pre-oder manner
	In-Order Traversal: Traverses a tree in a in-order manner
	Post-order Traversal: Traverses a tree in a post-order manner

*/

#include <iostream>
#include <queue>
#include <stack>
#include <cmath>
#include <vector>

using namespace std;


//define a node having some data, references to its left and right childs
struct TreeNode{
	/*data*/
	int data;
	TreeNode* left;
	TreeNode* right;
	TreeNode(int x): data(x), left(NULL), right(NULL){}
};



class BST{

public:
	TreeNode* search(TreeNode* r,int data){
		TreeNode* root = r;

		while(root->data != data){
			if(root != NULL){
				if(root->data > data){
					root = root->left;
				}else{
					root = root->right;
				}
			
				if(root == NULL) return NULL;
			}	
		}
		return root;
	}

	void insert(int);
	void del(int);
	void preoder(TreeNode*);
	void inoder(TreeNode*);
	void postoder(TreeNode*);
	void display(TreeNode*, int);
	bool isBST(TreeNode*);
	BST(){};
	~BST(){};
};

bool BST::isBST(TreeNode* r){
	/*
		1. left sub less than parent
		2. right sub greater then parent
		3. left and right must also follow 1,2
	*/
	if(r == NULL) return true;
	queue<TreeNode*> s;
	s.push(r);

	while(!s.empty()){
		TreeNode* t = s.front();
		cout << "val: " << t->data <<endl;
		s.pop();
		if(t->left != NULL){
			if(t->left->data < t->data)
				s.push(t->left);
			else return false;
		}
		if(t->right != NULL){
			if(t->right->data > t->data) 
				s.push(t->right);
			else return false;
		}
	}

	return true;
}

void BST::insert(int data){
	
}


int main(){

	BST sol;

	/*tree:
					 4
				   /   \
				  2	    7
				 / \   / \
                1   3  5  9
	*/

	TreeNode* r = new TreeNode(4);
	r->left = new TreeNode(2);
	r->right = new TreeNode(7);
	r->left->left = new TreeNode(1);
	r->left->right = new TreeNode(3);
	r->right->left = new TreeNode(5);
	r->right->right = new TreeNode(1);

	//sol.search(r, 1);
	
	string res = sol.isBST(r) == 1 ? "true" : "false"; 
	cout << "isBST: " << res <<endl;

	return 0;
}











