package com.amz.tree.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Abhishek Bisht
 *
 */
public class ZigZagTraversalQueue {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		BTree tree = new BTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);

		// To Print Zig Zag from Top to Bottom uaing only 1 Queue
		System.out.println("ZigZag Order traversal of binary tree is :");
		tree.printZigZagTraversal();

	}

}

class BTree {
	Node root;

	List<List<Integer>> printZigZagTraversal() {

		List<List<Integer>> result = new ArrayList<>();
		if (root == null)
			return result;

		// int level = 0
		
		int size = 0;
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			size = queue.size();
			ArrayList<Integer> list = new ArrayList<>();

			for (int i = 0; i < size; i++) {
				Node node = queue.poll();
				list.add(node.data);
				// if (level % 2 == 1)
				addChild(queue, node.left, node.right);
				// else
				// addChild(queue, node.right, node.left);
			}

			// level++;
			result.add(list);

		}

		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));
		}

		return result;
	}

	private void addChild(Queue<Node> queue, Node nodeA, Node nodeB) {

		if (nodeA != null)
			queue.offer(nodeA);

		if (nodeB != null)
			queue.offer(nodeB);
	}

}