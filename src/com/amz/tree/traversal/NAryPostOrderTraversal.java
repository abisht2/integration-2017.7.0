package com.amz.tree.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NAryPostOrderTraversal {
	NAryNode root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NAryNode node5 = new NAryNode(5);
		NAryNode node6 = new NAryNode(6);
		NAryNode node3 = new NAryNode(3);
		node3.children = new ArrayList<>();
		node3.children.add(node5);
		node3.children.add(node6);
		NAryNode node2 = new NAryNode(2);
		NAryNode node4 = new NAryNode(4);
		NAryNode root = new NAryNode(1);
		root.children = new ArrayList<>();
		root.children.add(node3);
		root.children.add(node2);
		root.children.add(node4);

		List<Integer> list = postordertraversal(root);
		System.out.println(list);

	}

	private static List<Integer> postordertraversal(NAryNode root) {
		// TODO Auto-generated method stub
		LinkedList<NAryNode> stack = new LinkedList<>();
		LinkedList<Integer> output = new LinkedList<>();

		if (root == null)
			return output;

		stack.add(root);
		while (!stack.isEmpty()) {
			NAryNode node = stack.pollLast();
			output.addFirst(node.data);

			for (NAryNode item : node.children) {
				if (item != null) {
					stack.add(item);
				}
			}
		}

		return output;
	}
}

class NAryNode {

	public int data;
	public List<NAryNode> children = new ArrayList<>();;
	public int level;

	public NAryNode() {
	}

	public NAryNode(int val) {
		data = val;
	}

	public NAryNode(int val, List<NAryNode> node) {
		data = val;
		children = node;
	}

}
