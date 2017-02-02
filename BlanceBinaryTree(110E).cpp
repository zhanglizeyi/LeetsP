#include <iostream>
using namespace std;


struct TreeNode
{
	/* data */
	int data;
	TreeNode* left;
	TreeNode* right;
	TreeNode(int x): data(x), left(NULL), right(NULL){}
};


class Solution{

public:
	bool isBalanced(TreeNode* root){
		if(root == NULL) return true;
		return 1+height(root);
	}

	int height(TreeNode* root){
		if(root == NULL) return 0;
		int l = height(root->left);
		int r = height(root->right);
		if(abs(l-r)>1 || l<0 || r<0) return -1;
		return 1+max(l,r);
	}
};


int main(){

	Solution sol;
	TreeNode *root = new TreeNode(1);
	root->left = new TreeNode(2);
	root->right = new TreeNode(3);
	root->left->left = new TreeNode(4);
	root->left->left->left = new TreeNode(5);

	sol.isBalanced(root);
	cout<< (bool)sol.isBalanced(root) << endl;

	return 0;
}