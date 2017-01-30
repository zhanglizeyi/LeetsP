#include <iostream>
#include <vector>
using namespace std;


struct TreeNode
{
	int val;
	TreeNode* left;
	TreeNode* right;
	TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};


class Solution{

public:
	TreeNode* sortedArrayToBST(vector<int> &num){
		//initial with case null and case 1
		if(num.size() == 0) return NULL;//change!!!!!!
		if(num.size() == 1) return new TreeNode(num[0]);
	
		int mid = num.size()/2;
		TreeNode* root = new TreeNode(num[mid]);

		vector<int> leftH(num.begin(), num.begin()+mid);
		vector<int> rightH(num.begin()+mid+1, num.end());
		

		root->left = sortedArrayToBST(leftH);
		if(root->left != NULL)
			cout << "val left" << root->left->val <<endl;
		root->right = sortedArrayToBST(rightH);
		if(root->right != NULL)
			cout << "val right" << root->right->val <<endl;

		return root;
	}

	void inorder(TreeNode* p){

		if(p != NULL){
			cout << "before left" << p->val << endl;
			inorder(p->left);
			cout << "after left" << p->val << endl;
			cout<< "======" << p->val << endl;
			cout << "before right" << p->val << endl;
			inorder(p->right);
			cout << "after right" << p->val << endl;
		}
	}

private:

	int count = 0;
};

int main(){

	Solution sol;
	vector<int> v; 
	v.push_back(9);
	v.push_back(5);
	v.push_back(3);
	v.push_back(7);
	v.push_back(8);

	for(int i=0; i<v.size(); i++){
		cout << "val: " << v[i] <<endl;
	}

	sol.sortedArrayToBST(v);
	TreeNode* root;
	root = sol.sortedArrayToBST(v);
	cout << "root value:  " << root->val << endl;
	//inorder
	sol.inorder(root);

	return 0;
}