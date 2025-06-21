package com.dsa.array.slidingwindow;

public class SellStock {
	/*
	 *  https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
	 * 
	 */
	
	public int maxProfit(int[] prices) {
		if(prices.length ==1 && (prices.length == 2 && prices[0]>prices[1])) return 0;
		if((prices.length == 2 && prices[0]<prices[1])) return prices[1] - prices[0];
		int ans = 0 ; 
		int i = 0 , j =1 ;
		int mx = prices[i];
		int returns = 0; 
		for(j =1; j<prices.length; j++) {
			if(prices[j]<prices[i]) {
				i = j;
			}else {
				returns = Math.max(prices[j]-prices[i], returns);
			}
		}
		
		return returns;
	}

}
