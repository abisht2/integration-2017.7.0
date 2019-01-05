package com.amz.algorithm;

/**
 * @author Abhishek Bisht
 *
 */
public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int prices[] = { 5, 9, 1, 7, 3, 2 };

		System.out.print(maxProfit(prices));
		
	}

	private static int maxProfit(int[] prices) {
		// TODO Auto-generated method stub

		if (prices.length <= 1 || prices == null)
			return 0;

		int min = prices[0];
		int result = 0;

		for (int i = 1; i < prices.length; i++) {
			result = Math.max(result, prices[i] - min);
			min = Math.min(min, prices[i]);
		}
		return result;

	}

}
