package com.amz.strings;

import java.util.Arrays;

public class StringAnagram {

	static int NO_OF_CHARS = 256;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "LISTEN";
		String str2 = "SILENT";
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();

		if (areAnagram(ch1, ch2))
			System.out.println("The two strings are anagram of each other");
		else
			System.out.println("The two strings are not anagram of each other");

	}

	private static boolean areAnagram(char ch1[], char ch2[]) {
		// TODO Auto-generated method stub

		int count1[] = new int[NO_OF_CHARS];
		Arrays.fill(count1, 0);
		int count2[] = new int[NO_OF_CHARS];
		Arrays.fill(count2, 0);
		int i;

		for (i = 0; i < ch1.length && i < ch2.length; i++) {
			count1[ch1[i]]++;
			count2[ch2[i]]++;
		}

		if (ch1.length != ch2.length)
			return false;

		for (i = 0; i < NO_OF_CHARS; i++)
			if (count1[i] != count2[i])
				return false;

		return true;

	}

}
