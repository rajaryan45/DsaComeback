package com.dsa.array;

public class RotateArray {
	/*
	 *  https://leetcode.com/problems/rotate-array/description/
	 * 
	 */
	
	private void reverse(int[]nums, int s , int e) {
		while(s<e) {
			int temp = nums[s];
			nums[s] = nums[e];
			nums[e] = temp;
			s++;
			e--;
		}
	}
	 public void rotate(int[] nums, int k) {
		 if(k%nums.length == 0)return;
		 int n = nums.length;
		 k = k%n;
		 // now we will reverse... 
		 reverse(nums, 0, n-1);
		 reverse(nums, 0,k-1 );
		 reverse(nums, k,n-1 );
		 
	 }

}
