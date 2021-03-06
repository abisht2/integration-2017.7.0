package com.amz.tree.traversal;

/**
 * @author Abhishek Bisht
 *
 */
public class DiameterofTree {
	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiameterofTree tree = new DiameterofTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("The diameter of given binary tree is : "
				+ diameter(tree.root));

	}

	/**
	 * @param root
	 * @return
	 */
	private static int diameter(Node root) {
		// TODO Auto-generated method stub

		if (root == null)
			return 0;

		int lheight = height(root.left);
		int rheight = height(root.right);

		int ldiameter = diameter(root.left);
		int rdiameter = diameter(root.right);

		return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));

	}

	private static int height(Node node) {
		// TODO Auto-generated method stub

		if (node == null)
			return 0;

		return (1 + Math.max(height(node.left), height(node.right)));
	}
}