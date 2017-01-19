/*
	Binary Tree:
		Root, left pointer, right pointer and data elements
		The root pointers point to topmost node in the tree.
		The left and right ponters recursively point to smaller
		"subtrees" on either side.
	
		There has one null pointer represents a binary tree with 
		no elelments, the empty tree.

		          root
		          /  \		
				 /    \
			  left   right
			  /  \    /  \ 
			 l.. r.. l.. r..

		Binary search trees are fast at insert and lookup. 
		log(N) is average case...

		BST method
			lookup()
			insert()

*/

struct node{
	int data;
	struct node* left;
	struct node* right;

	//for insert
}

/*
	lookup():

		Give a binary search tree and a "target" value, search the tree
		to see if it contains the target. 
*/

static bool lookup(struct node* node, int target){
	//first to check if root equal to NULL
	if(node == NULL)
		return false; //0

	//To see if there has a match
	if(target == node->data) return true; //1
	//if node data smaller than tar, go right to compair 
	if(node->data < target) return lookup(node->right, target);
	//node data larger than tar, go left to compair
	else return lookup(node->left, target);
}

/*
	Insert():
	
		Insert function that will add a data into BST, first we gonna 
		check if tree is empty(NULL) if yes , then node will be root.
		otherwise, we will have root then, we have to check 
			1. node larger than the subtree node pointers, recursively call
				node->right to compair
			2. node smaller than the subtree node pointers, recursively call
				node->left to compair
		Until either path for it could not find any any further, then insert it.
		Since the tree structure will take log(N) times
*/

static node* insert(struct node* node, int data){

	//empty tree
	if(node == NULL) node->data = data;
	//not empty tree, has two cases need to check
	if(data <= node->data)
		node->left = insert(node->left, data);
	else 
		node->right = insert(node->right, data);

	return node;
}













