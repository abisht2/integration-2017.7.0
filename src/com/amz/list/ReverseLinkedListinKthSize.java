package com.amz.list;

/**
 * @author Abhishek Bisht
 *
 */
public class ReverseLinkedListinKthSize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		node.next.next.next.next.next.next = new Node(7);
		node.next.next.next.next.next.next.next = new Node(8);

		Node result = reverse(node, 3);
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

	private static Node reverse(Node head, int a) {
		// TODO Auto-generated method stub

		Node current = head;
		Node prev = null;
		Node next = null;

		int count = 0;

		while (count < a && current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;

		}

		if (next != null)
			head.next = reverse(next, a);

		return prev;

	}

}
