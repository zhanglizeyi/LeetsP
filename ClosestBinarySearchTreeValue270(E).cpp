
/*
	解题思路：
		因为我们需要知道，如何比较target和每一个tree node
		里面的值，所以要有两个check
			1.第一个是我们要时刻检查root 不能为空，这个会在loop里面实现root的update
			2.我们先在最开始的时候拿到root的值， 然后去和每一次root下面的孩子去比较，
				如果下面的子root有比之前更小的， update
			最后，我们要update我们的子root给我回我们的root，遍历所有的tree node
			
		recursion 在这个里面是最方便的方法，9ms. 相对来讲iteration会增加很多代码量
*/


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


class Solution{
public:
	int closestValue(TreeNode* root, double target){
		int cloest = root->val;
		cout << "in func: " << cloest << endl;

		while(root != NULL){
			if(abs(cloest - target) >= abs(root->val - target))
				cloest = root->val;
			root = root->val > target ? root->left : root->right;
		}
		return cloest;
	}
};

int main(){

	Solution sol;
	TreeNode *root; 
	double target = 4.45;
	
	sol.closestValue(root, target);

	// cout << "the cloest num: " << sol.closestValue([1,2,3], 2.4) << endl;

	return 0;
}