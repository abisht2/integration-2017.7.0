package com.amz.list;

/**
 * @author Abhishek Bisht
 *
 */
public class NthNodeRemovalFromLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);

		Node result = removeNthFromEnd(node, 1);

		printList(result);

	}

	private static void printList(Node result) {
		// TODO Auto-generated method stub

		while (result != null) {
			System.out.print(result.data + " ");
			result = result.next;
		}
		System.out.println();

	}

	private static Node removeNthFromEnd(Node head, int n) {
		// TODO Auto-generated method stub

		if (head == null)
			return null;

		Node fast = head;
		Node slow = head;

		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}

		if (fast == null) {
			head = head.next;
			return head;
		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;
		return head;

	}

}
