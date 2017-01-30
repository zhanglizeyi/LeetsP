#include <iostream>
#include <cmath>
#include <vector>
#include <cstdlib>
using namespace std;


struct TreeNode
{
	int val;
	TreeNode* left;
	TreeNode* right;		
};

//BST
class BinarySearchTree
{
	public:
		//constructor
		BinarySearchTree();
		~BinarySearchTree();

		void insert(int data);
		TreeNode *search(int data);
		void destory_tree();

	private:
		void destory_tree(TreeNode* leaf);
		void insert(int key, TreeNode* leaf);
		TreeNode *search(int key, TreeNode* leaf);
		TreeNode* root;
};

BinarySearchTree::BinarySearchTree(){
	root = NULL;
}

BinarySearchTree::~BinarySearchTree(){
	destory_tree();
}

void BinarySearchTree::destory_tree(TreeNode* t){
	if(t != NULL){
		destory_tree(t->left);
		destory_tree(t->right);
		delete t;
	}
}

void BinarySearchTree::insert(int key, TreeNode* t){
	if(key < t->val){
		if(t->left != NULL)
			insert(key, t->left);
		else{
			t->left = new TreeNode;
			t->left->val = key;
			t->left->left=NULL;
			t->left->right=NULL;
		}
	}
	else if(key >= t->val){
		if(t->right != NULL)
			insert(key, t->right);
		else{
			t->right = new TreeNode;
			t->right->val = key;
			t->right->left = NULL;
			t->right->right = NULL;
		}
	}
}

TreeNode* BinarySearchTree::search(int key, TreeNode* t){
	if(t != NULL){
		if(key == t->val) return t;
		if(key < t->val) return search(key, t->left);
		else return search(key,t->right);
	}
	else return NULL;
}

void BinarySearchTree::insert(int d){
	if(root != NULL)
		insert(d,root);
	else{
		root=new TreeNode;
		root->val = d;
		root->left = NULL;
		root->right = NULL;
	}
}

void BinarySearchTree::destory_tree(){
	destory_tree(root);
}

TreeNode* BinarySearchTree::search(int k){
	return search(k,root);
}

int main(){


	return 0;
}







