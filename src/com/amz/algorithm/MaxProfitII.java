package com.amz.algorithm;

/**
 * @author Abhishek Bisht
 *
 */
public class MaxProfitII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prices [] = {5, 1, 2, 3, 4};
		System.out.print(maxProfitII(prices));

	}

	private static int maxProfitII(int[] prices) {
		// TODO Auto-generated method stub
		
		if (prices == null || prices.length <= 1) {
			return 0;
		}
		
		int profit = 0 ;
		
		for (int i = 1; i < prices.length; i++) {
		  int diff = prices[i] - prices[i-1];
		  if(diff > 0){
			  profit += diff;
		  }
		  
		}
		
		return profit;
	}

}
