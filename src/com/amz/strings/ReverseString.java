package com.amz.strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABHISHEK BISHT";

		/*
		 * for(int i=0, j=str.length()-1; i<j; i++,j--){
		 * 
		 * System.out.print(str.charAt(j) + "" + str.charAt(i));
		 * 
		 * }
		 */
		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));

		}
	}

}
