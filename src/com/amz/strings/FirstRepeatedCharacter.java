package com.amz.strings;

import java.util.HashSet;

/**
 * @author Abhishek Bisht
 *
 */
public class FirstRepeatedCharacter {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "geks";
		char arr[] = str.toCharArray();
		System.out.print("First repeated character in the String is :"
				+ findCharacter(arr));

	}

	private static char findCharacter(char[] arr) {
		// TODO Auto-generated method stub

		HashSet<Character> hash = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {

			if (hash.contains(arr[i])) {
				return arr[i];
			}
			hash.add(arr[i]);
		}
		return '\0';
	}

}
