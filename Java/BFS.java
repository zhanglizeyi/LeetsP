import java.util.Queue;
import java.util.List;


class BFS{

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

	BFS(){
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

	protected BSTNode root;
	
	public List<BSTNode> bfs(){
		List ret = new LinkedList();

		Queue q = new LinkedList();
		q.add(root);

		while(!q.isEmpty()){
			//node n = q.remove();
			List<BSTNode> l = new LinkedList();
			while(q.size() > 0){
				node n = q.remove();
				l.add(n);
				if(q.left != null) q.add(q.left);
				if(q.right != null) q.add(q.right);
			}
			ret.add(0, l);
		}
		return ret;
	}

	public static void main(String[] args){
		BFS b = new BFS();
		b.insert(5);b.insert(8);
		b.insert(2);b.insert(4);b.insert(1);
		//b.insert(2);b.insert(10);b.insert(9);
		// b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		System.out.println("Original Tree : ");
	}

}