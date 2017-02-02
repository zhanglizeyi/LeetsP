#include <iostream>
#include <vector>
using namespace std;


struct TreeNode{

	//data
	int data;
	TreeNode* left;
	TreeNode* right;
	TreeNode(int x): data(x), left(NULL), right(NULL) {}

};


class Solution
{
public:
	Solution(){};
	
	vector<int> bstOrder(TreeNode* node){
		vector<int> v;
		return v;
	}

	// void inorder(TreeNode* n, vector<int>& v);
	// void preorder(TreeNode* n, vector<int>& v);
	// void postorder(TreeNode* n, vector<int>& v);

	~Solution(){};

	/* data */
};

void inorder(TreeNode* n, vector<int>& v){
	if(n == NULL) return;
	inorder(n->left, v);
	cout<< n->data << endl;
	v.push_back(n->data);
	inorder(n->right, v);
}

void preorder(TreeNode* n, vector<int>& v){
	if(n == NULL) return;
	v.push_back(n->data);
	cout<< n->data << endl;
	inorder(n->left, v);
	inorder(n->right, v);
}

void postorder(TreeNode* n, vector<int>& v){
	if(n == NULL) return;
	inorder(n->left, v);
	inorder(n->right, v);
	v.push_back(n->data);
	cout<< n->data << endl;
}

int main(){
	vector<int> v;
	Solution sol;

	TreeNode* root = new TreeNode(1);
	*root->left = TreeNode(NULL);
	*root->right = TreeNode(2);
	*root->right->left = TreeNode(3);

	cout << " inorder: " << inorder(root,v) <<endl;
	cout << " preorder: " << preorder(root, v) <<endl;
	cout << " postorder: " << postorder(root, v) <<endl;

	return 0;
}