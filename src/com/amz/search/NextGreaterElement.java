package com.amz.search;

import java.util.Stack;

/**
 * @author Abhishek Bisht
 *
 */
public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 13, 21, 3, 34, 32 };
		int n = arr.length;
		printNGE(arr, n);

	}

	private static void printNGE(int[] arr, int n) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[0]);
		int element, next;

		for (int i = 0; i < arr.length; i++) {
			next = arr[i];

			if (stack.isEmpty() == false) {
				element = stack.pop();

				while (element < next) {
					System.out.println(element + " --> " + next);
					if (stack.isEmpty() == true)
						break;
					element = stack.pop();

				}
				if (element > next)
					stack.push(element);

			}
			stack.push(next);
		}
		while (stack.isEmpty() == false) {
			element = stack.pop();
			next = -1;
			System.out.println(element + " --> " + next);
		}
	}

}
