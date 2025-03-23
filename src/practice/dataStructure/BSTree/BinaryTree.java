package practice.dataStructure.BSTree;

public class BinaryTree {

	public static void main(String[] args) {

	}

}

class Node {
	int value;
	Node left, right;

	Node(int value) {
		this.value = value;
		left = right = null;
	}
}

class BSTree {
	Node root;
	
	BSTree(){
		root = null;
	}
	
	public void insert(int value){
		root = insertVal(root,value);
	}
	private Node insertVal(Node root,int val) {
		if(root==null) {
			root = new Node(val);
			return root;
		}
		if(val < root.value){
			root.left = insertVal(root.left,val);
			
		}else if(root.value > val) {
			root.right = insertVal(root.right,val);
		}
		return root;
		
	}
}
