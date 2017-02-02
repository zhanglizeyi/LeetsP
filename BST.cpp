/*

BST:
	Search(): search an element in a tree
	Insert(): Insert an element in a tree
	Pre-order Traversal: Traverses a tree in a pre-oder manner
	In-Order Traversal: Traverses a tree in a in-order manner
	Post-order Traversal: Traverses a tree in a post-order manner

*/

#include <iosteam>
#include <queue>
#include <stack>
#include <cmatch>
#include <vector>

using namespace std;


//define a node having some data, references to its left and right childs
struct TreeNode{
	/*data*/
	int data;
	TreeNode* left;
	TreeNode* right;
	TreeNode(int x): data(x), left(NULL), right(NULL){}
};



class BST{

public:
	TreeNode* search(TreeNode* r,int data){
		TreeNode* root = r;

		while(root->data != data){
			if(root != NULL){
				if(root->data > data){
					root = root->left;
				}else{
					root = root->right;
				}
			
				if(root == NULL) return NULL;
			}	
		}
		return root;
	}

	void insert(int);
	void del(int);
	void preoder(TreeNode*);
	void inoder(TreeNode*);
	void postoder(TreeNode*);
	void display(TreeNode*, int);
	BST(){ root = NULL };
	~BST();
};

void BST::insert(int data){


}


int main(){

	

	return 0;
}











