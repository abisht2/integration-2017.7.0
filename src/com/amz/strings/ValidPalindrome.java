package com.amz.strings;

/**
 * @author Abhishek Bisht
 *
 */
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Red rum, sir, is murder";
		System.out.println(validPalindrome(str));

	}

	private static boolean validPalindrome(String str) {
		// TODO Auto-generated method stub
		if(str==null||str.length()==0) return false;
		 
		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		int i = 0 ;
		int j = str.length()-1;
		
		while(i < j){
			if(str.charAt(i) == str.charAt(j)){
				i++;
				j--;
			}
			else 
				return false;
		}
		
		return true;
	}

}
