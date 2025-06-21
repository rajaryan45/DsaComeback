package com.dsa.array.slidingwindow;

public class MaxConsecutiveOnesIII {
	
	/*
	 * 
	 * https://leetcode.com/problems/max-consecutive-ones-iii/description/
	 * 
	 */
	public int longestOnes(int[] nums, int k) {
		int mx = 0 , count = 0 ;
		int i = 0 , j = 0;
		for(j = 0 ; j<nums.length; j++) {
			if(nums[j] == 0) {
				count++;
			}
			while(!(count<=k)) {
				if(nums[i]==0)count--;
				i++;
			}
			mx = Math.max(mx, (j-i)+1);
			
		}
		
		return mx;
	}
}
