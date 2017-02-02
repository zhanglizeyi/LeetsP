#include <iostream>
#include <stack>
#include <vector>
using namespace std;


struct TreeNode
{
	/* data */
	int val;
	TreeNode* left;
	TreeNode* right;
	TreeNode(int x): val(x), left(NULL), right(NULL){}
};


class Solution{

public:
	vector<int> TreeInorderTraversal(TreeNode* root){
		vector<int> v;
		stack<TreeNode*> s;

		while(!s.empty() || root){
			if(root != NULL){
				s.push(root);
				root = root->left;
			}else{
				root = s.top();
				v.push_back(root->val);
				s.pop();
				root = root->right;
			}
		}
		return v;
	}


	//helper method for recursion 
	/*
	example for [1,null,2,3]
					1
				   / \
			     null 2
					 /
					3

		init: root: 1   v:[]
			1.inOrder 
		root->left:null  v:[]
			2. return 
		root->right: 2   v:[1]
			3. left
		root->left: 3  v:[]
			4. null 
		push in to v (3)

	*/
	void inOrder(TreeNode* root, vector<int>& v){
		if(root != NULL) return;
		inOrder(root->left, v);
		v.push_back(root->val);
		inOrder(root->right, v);
	}
};

int main(){

	return 0;
}