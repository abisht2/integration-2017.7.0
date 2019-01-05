package com.amz.search;

/**
 * @author Abhishek Bisht
 *
 */
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };

		System.out.print(linearSearch(arr, 110));

	}

	private static int linearSearch(int[] arr, int x) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == x) {
				// System.out.println(i);
				return i;
			}

		}
		return -1;
	}
	// The time complexity of above algorithm is O(n).

}
