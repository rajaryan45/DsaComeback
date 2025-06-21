package com.dsa.array.binarysearch;

public class MinimumInSortedArr {
	public int findMin(int[] nums) {
		int s = 0 , e = nums.length-1;
		while(s<=e) {
			int mid = (s+e)/2;
			if(nums[s]>nums[mid]) {
				e = mid-1;
			}else {
				s = mid+1;
			}
			if(s==e)return nums[s];
		}
		
		
		return -1;
    }
}
