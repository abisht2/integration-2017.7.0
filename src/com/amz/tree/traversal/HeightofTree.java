package com.amz.tree.traversal;

public class HeightofTree {

	static Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree = new Tree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(6);
		tree.root.left.right.right = new Node(9);
		tree.root.left.right.right.right = new Node(10);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);
		tree.root.right.right.right = new Node(8);

		// Height of a tree
		System.out.println("Height of a tree : " + tree.height(tree.root));

	}

}

class Tree {

	Node root;
	int height(Node node) {
		// TODO Auto-generated method stub

		if (node == null)
			return 0;
		
		else {
			
			int lHeight = height(node.left);
			int rHeight = height(node.right);

			if (lHeight > rHeight)
				return lHeight + 1;
			else
				return rHeight + 1;
			
	       // return (1 + Math.max(height(node.left), height(node.right))); 


		}
	}
}
