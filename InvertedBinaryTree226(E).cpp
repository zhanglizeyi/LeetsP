/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
#include <iostream>
#include <stack>
using namespace std;


class Solution{
public:
	TreeNode* invertTree(TreeNode* root){
		//using stack dfs

		stack<TreeNode*> s;
		s.push(root);

		while(!s.empty()){
			TreeNode* p = s.top();
			s.pop();

			if(p != NULL){
				s.push(p->left);
				s.push(p->right);
				swapFunc(p->left, p->right);
				
			}
		}

		//======Recursive Solution======

		// if(root!=NULL){
		// 	invertTree(root->left);
		// 	invertTree(root->right);
		// 	swap(root->left, root->right);
		// }
		return root;
	}

	void swapFunc(TreeNode* l, TreeNode* r){
		TreeNode* tmp = l;
		l = r;
		r = tmp;
	}
};



int main(){

	Solution s; 



	return 0;
}