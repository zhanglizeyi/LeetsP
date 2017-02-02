#include <iostream>
#include <queue>

using namespace std;

struct TreeNode
{
	/* data */
	int data;
	TreeNode * left;
	TreeNode * right;
	TreeNode(int x): data(x), left(NULL), right(NULL){}
};

class Solution{
public:
	int minDepth(TreeNode*);
};

int Solution::minDepth(TreeNode* root){
		if(root != NULL) return 0;
		//using BFS
		queue<TreeNode*> q;
		q.push(root);
		int level = 0;

		while(!q.empty()){
			cout << "outter: " <<endl;
			level++;
			cout << "level: " << level << endl;
			for(int i=0; i<q.size(); i++){
				TreeNode * in = q.front();
				cout << "inner: " << in->data << endl;
				q.pop();	
				if(in->left != NULL) q.push(in->left);
				if(in->right != NULL) q.push(in->right);
				if(in->left==NULL && in->right==NULL) return level;
			}
		}
		return 0;	
}


int main(){

	Solution sol;
	TreeNode* root = new TreeNode(1);
	root->left = new TreeNode(2);
	root->right = new TreeNode(3);
	root->left->left = new TreeNode(4);
	root->left->right = new TreeNode(6);
	root->left->left->left = new TreeNode(7);

	cout << "min Depth: " << sol.minDepth(root) << endl;

	return 0;
}


