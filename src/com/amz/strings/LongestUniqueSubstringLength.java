package com.amz.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Abhishek Bisht
 *
 */
public class LongestUniqueSubstringLength {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "GEEKSFORGEEKS";

		int length = lengthofLongestSubtring(str);
		System.out.println(length);

	}

	private static int lengthofLongestSubtring(String str) {
		// TODO Auto-generated method stub

		if (str.isEmpty() || str == null)
			return 0;
		
		int result = 0;
		int k = 0;
		Set<Character> set = new HashSet<>();
		
		for (int i = 0; i < str.length(); i++) {
			if (!set.contains(str.charAt(i))) {
				set.add(str.charAt(i));
				result = Math.max(result, set.size());
			
			} else {
				while (k < i) {
					if (str.charAt(k) == str.charAt(i)) {
						k++;
						break;
						
					} else {
						set.remove(str.charAt(k));
						k++;
						
					}
				}
			}
		}
		return result;
	}
}
