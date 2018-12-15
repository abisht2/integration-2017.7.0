package com.amz.tree.traversal;

import java.util.Stack;

/**
 * @author Shashank
 *
 */
public class ZigZagTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);

		// To Print Zig Zag from Top to Bottom
		System.out.println("ZigZag Order traversal of binary tree is :");
		tree.printZigZagTraversal();

	}

}

class BinaryTree {
	Node root;

	void printZigZagTraversal() {

		if (root == null) {
			return;
		}

		Stack<Node> currentLevel = new Stack<>();
		Stack<Node> nextLevel = new Stack<>();
		Stack<Node> reverseDirection = new Stack<>();

		currentLevel.push(root);
		boolean leftToRight = true;

		while (!currentLevel.isEmpty()) {

			Node node = currentLevel.pop();
			reverseDirection.add(node);
			System.out.print(node.data + " ");

			if (leftToRight) {
				if (node.left != null) {
					nextLevel.push(node.left);
				}
				if (node.right != null) {
					nextLevel.push(node.right);
				}

			} 
			else {
				if (node.right != null) {
					nextLevel.push(node.right);
				}
				if (node.left != null) {
					nextLevel.push(node.left);
				}
			}

			if (currentLevel.isEmpty()) {
				leftToRight = !leftToRight;
				Stack<Node> temp = currentLevel;
				currentLevel = nextLevel;
				nextLevel = temp;

			}
		}
		// To Print node data from Bottom to Top

		System.out.println("\nReverse Zig Zag of Direction :");
		while (!reverseDirection.isEmpty()) {
			System.out.print(reverseDirection.pop().data + " ");
		}
	}
}
