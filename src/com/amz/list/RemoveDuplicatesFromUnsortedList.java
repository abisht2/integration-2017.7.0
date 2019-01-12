package com.amz.list;

import java.util.HashSet;

/**
 * @author Abhishek Bisht
 *
 */
public class RemoveDuplicatesFromUnsortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node = new Node(1);
		node.next = new Node(5);
		node.next.next = new Node(4);
		node.next.next.next = new Node(7);
		node.next.next.next.next = new Node(2);
		node.next.next.next.next.next = new Node(8);
		node.next.next.next.next.next.next = new Node(2);
		node.next.next.next.next.next.next.next = new Node(4);

		HashSet<Integer> result = removeDuplicate(node);
		System.out.println(result);
	}

	private static HashSet<Integer> removeDuplicate(Node head) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		Node current = head;
		Node prev = null;

		while (current != null) {
			int curVal = current.data;

			if (!set.contains(curVal)) {
				set.add(curVal);
				prev = current;
			} else {
				prev.next = current.next;
			}

			current = current.next;
		}
		
		return set;
	}

}
