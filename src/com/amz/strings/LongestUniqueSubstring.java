package com.amz.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Abhishek Bisht
 *
 */
public class LongestUniqueSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "DATASTRUCTURE";
		System.out.println(printLongestSubstring(str));

	}

	private static String printLongestSubstring(String str) {
		// TODO Auto-generated method stub

		if (str.isEmpty() || str == null)
			return null;

		int st = 0;
		int currlen = 0;
		int maxlen = 0;
		int start = 0;
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), i);

			} else {
				if (i > st) {
					currlen = i - st;
					if (maxlen < currlen) {
						maxlen = currlen;
						start = st;
					}

					st = i;

				}
				map.clear();
				map.put(str.charAt(i), i);
			}
		}

		return str.substring(start, maxlen + start);

	}

}
