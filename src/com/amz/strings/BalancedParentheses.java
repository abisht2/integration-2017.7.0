package com.amz.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Abhishek Bisht
 *
 */
public class BalancedParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "[{()}]{}{}";
		System.out.println(validParentheses(str));
}

	private static boolean validParentheses(String str) {
		// TODO Auto-generated method stub

		if (str.isEmpty() || str == null || str.length() % 2 != 0)
			return false;

		Map<Character, Character> map = new HashMap<>();
		map.put('{', '}');
		map.put('[', ']');
		map.put('(', ')');

		Stack<Character> stack = new Stack<>();
		boolean iFlag = true;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				stack.push(ch);
			} else if (map.containsValue(ch)) {
				if (!stack.isEmpty() && map.get(stack.peek()) == ch) {
					stack.pop();

				} else
					return false;
			}
		}

		return iFlag;

	}

}
