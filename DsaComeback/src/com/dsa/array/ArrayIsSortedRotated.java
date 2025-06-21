package com.dsa.array;

public class ArrayIsSortedRotated {
	/*
	 *  https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
	 *  Array - easy
	 * 
	 */
	
	public boolean check(int[] nums) {
		int count = 0 ; 
		int temp = nums[0];
		int n = nums.length;
		for(int i = 1 ; i<n; i++) {
			if(temp>nums[i%n]) {
				count++;
			}
			temp = nums[i%n];
			if(count>1)return false;
		}
		return true;
    }

}
