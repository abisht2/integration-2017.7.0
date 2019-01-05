package com.amz.search;

/**
 * @author Abhishek Bisht
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 3, 4, 10, 40 };
		int len = arr.length;

		int result = binarySearch(arr, 0, len - 1, 10);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);

	}

	private static int binarySearch(int[] arr, int l, int r, int x) {
		// TODO Auto-generated method stub

		if (r >= 1) {
			int mid = l + r - 1 / 2;

			if (arr[mid] == x)
				return mid;
			if (x > arr[mid])
				return binarySearch(arr, mid + 1, r, x);

			return binarySearch(arr, l, mid - 1, x);
		}

		return -1;
	}

}
