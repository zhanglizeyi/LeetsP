#include <iostream>
#include <stack>
#include <queue>
#include <string>

using namespace std;

struct TreeNode{

	int data;
	TreeNode* left;
	TreeNode* right;
	TreeNode(int x): data(x), left(NULL), right(NULL){}
};


class Solution{
public:
	vector<string> binaryTreePaths(TreeNode* root){
		vector<string> v;
		stack<TreeNode*> s;
		stack<string> sPath;

		if(root == NULL) return v;

		s.push(root);
		sPath.push(to_string(root->data));

		while(!s.empty()){
			TreeNode* r = s.top(); s.pop();
			string str = sPath.top(); sPath.pop();

			if(r->left == NULL && r->right == NULL){
				v.push_back(str);
			}
			if(r->left != NULL){
				s.push(r->left);
				sPath.push(str + "->" + std::to_string(r->left->data));
			}
			if(r->right != NULL){
				s.push(r->right);
				sPath.push(str + "->" + std::to_string(r->right->data));
			}

		}

		for(int i=0; i<v.size(); i++){
			cout << "val: " << v[i] << endl;
		}

		reverse(v.begin(),v.end());

		return v;
	}

	vector<string> binaryTreePathsRecursion(TreeNode* root){
		vector<string> res;

		// if(root==NULL) return res;
		// if(root->left==NULL && root->right==NULL) res.push_back(to_string(root->data));
		
		// if(root!=NULL){
		// 	res.push_back()
		// 	binaryTreePaths(root->left);
		// }
		// if(root!=NULL){
		// 	binaryTreePaths(root->right);
		// }
	}

};


int main(){

	Solution sol;
	vector<string> v;

	TreeNode* root = new TreeNode(1);
	root->left = new TreeNode(2);
	root->right = new TreeNode(3);
	root->left->right = new TreeNode(5);

	sol.binaryTreePaths(root);

	

	return 0;
}