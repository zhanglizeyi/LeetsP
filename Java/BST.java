import java.util.*;

class BST <T extends Comparable<? super T>> {
	
	//inner class for bst node
	class BSTNode{
		BSTNode left;
		BSTNode right;
	 	int elem;

		public BSTNode(int data){
			this.elem = data;
			this.left = null;
			this.right = null;
		}
	}

	protected BSTNode root;

	BST(){
		this.root = null;
	}

	public void insert(int data){
		BSTNode newNode = new BSTNode(data);
		
		if(root == null){
			root = new BSTNode(data);
			return;
		}

		BSTNode current = root;
		BSTNode parent = null;

		while(true){
			parent = current;
			if(current.elem > data){
				current = current.left;
				if(current == null){
					parent.left = newNode;
					return;
				}
			}else{
				current = current.right;
				if(current == null){
					parent.right = newNode;
					return;
				}
			}
		}
	}

	public boolean toFind(int data){

		while(root != null){
			if(root.elem == data){
				return true;
			}else if( root.elem > data){
				root = root.left;
			}else{
				root = root.right;
			}
		}
		return false;
	}

	public boolean delete(int data){

		BSTNode parent = root;
		BSTNode current = root;
		boolean isLeftChild = false;

		//loop through data is in the bst
		while(current.elem != data){	
			parent = current; //update everytime
			if(current.elem > data){
				isLeftChild = true;
				current = current.left;
			}else if(current.elem < data){
				isLeftChild = false;
				current = current.right;
			}

			//if not find 
			if(current == null) return false;
		}

		//if found, case has no child 
		if(current.left == null && current.right == null){
			if(current == root) root = null;
			if(isLeftChild == true) parent.left = null;
			else parent.right = null; 
		//case has one child
		}else if(current.right == null){
			//left child exsit
			if(current == root) {
				root = current.left; 	
			}else if(isLeftChild){
				parent.left = current.left;
				current = null;
			}else{
				parent.right = current.left;
				current = null;
			}
		}else if(current.left == null){
			if(current == root){
				root = current.right;
			}else if(isLeftChild){
				parent.left = current.right;
				current = null;
			}else{
				parent.right = current.right;
				current = null;
			}
		}else if(current.left != null && current.right != null){
		
			BSTNode node = getBSTNode(current);

			if(current == root){
				root = node;
			}else if(isLeftChild){
				current.right = node;
			}else{
				current.left = node;
			}
			node.left = current.left;
		}

		return true;
	}

	public BSTNode getBSTNode(BSTNode cur){
		BSTNode suc = null;
		BSTNode sucp = null;
		BSTNode current = cur.right;

		while(current != null){
			sucp = suc;
			suc = current;
			current = current.left;
			if(current != null){
				System.out.println("sucp: " + sucp.elem + " suc: " + suc.elem + " current: " + current);
			}
		}

		System.out.println("finished loop === ");
		if(suc != cur.right){
			sucp.left = suc.right;
			suc.right = cur.right;
			if(current != null){
				System.out.println("sucp: " + sucp.elem + " suc: " + suc.elem + " current: " + current);
			}
		}

		return suc;
	}


	public void display(BSTNode root){
		if(root != null){
			display(root.left);
			System.out.println(root.elem);
			display(root.right);
		}
	}

	public static void main(String[] args){
		//construct bst over here
		//1. left nodes always less than right and parent
		//2. right nodes always greater than left and parent
		//3. no same value 

		BST b = new BST();
		b.insert(5);b.insert(8);
		b.insert(2);b.insert(4);b.insert(1);
		//b.insert(2);b.insert(10);b.insert(9);
		// b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		System.out.println("Original Tree : ");

		/*
					5
				2		8
			 1	   4
		
					4
				2
			1	
		*/

		//inorder
		b.display(b.root);
		b.delete(5);
		System.out.println("after Tree : ");		
		b.display(b.root);

		System.out.println("looking for 25: "+ b.toFind(25));
		System.out.println("looking for 35: "+ b.toFind(35));

	}

}