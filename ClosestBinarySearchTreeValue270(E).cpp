#include <iostream>
#include <cmath>
using namespace std;

struct TreeNode
{
	int val;
	TreeNode *left;
	TreeNode *right;
	TreeNode(int x): val(x),left(NULL),right(NULL){}
};


class solution{
public:
	int closestValue(TreeNode* root, double target){
		int cloest = root->val;
	

	while(root != NULL){
		if(abs(cloest-target) >= abs(root->val-target)){
			cloest = root->val;
		}
		root = target > root->val ? root->left : root->right;
	}

		return cloest;
	}
};

int main(){

	// solution sol;

	// cout << "the cloest num: " << sol.closestValue([1,2,3], 2.4) << endl;

	return 0;
}