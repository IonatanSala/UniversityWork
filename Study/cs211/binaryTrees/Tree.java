

public class Tree {
	public static Node root;
	
	// add new node to binary tree
	public static void addNode(String name, int key) {

		Node newNode = new Node(name, key);

		if(root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;
			
			while(true) {
				parent = focusNode;
				
				if(key < focusNode.getKey()) {
					focusNode = focusNode.leftChild;

					if(focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {

					focusNode = focusNode.rightChild;

					if(focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}


	// inOrder traversal, so this method prints out the values of your tree from smallest to highest.
	// it is a recursive method
	public void inOrderTraverseTree(Node focusNode) {
		
		
		if(focusNode != null) {
			
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode.getValues());
			inOrderTraverseTree(focusNode.rightChild);
			
		}
	}
	 
	public static void main(String[] args) {
		Tree newTree = new Tree();
		
		newTree.addNode("jonatan", 10);
		newTree.addNode("daniel", 12);
		newTree.addNode("levin", 8);
		newTree.addNode("divya", 2);

		newTree.inOrderTraverseTree(root);
	}
}

