package com.dsa.array.binarysearch;

public class RotatedSortedArray {
	
/*
 *  https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 *  
 *  Binary Search 
 * 
 * 
 */
	public int search(int[] nums, int target) {
        int s = 0 , e = nums.length-1;
        if(nums[0] == target)
            return 0;
        if(nums[e] == target)
            return e;
        if(nums.length == 1 && nums[0] == target)
            return 0;
        else if(nums.length == 1 && nums[0] != target)
            return -1;
        while(s<=e) {
        	int mid = (e+s)/2;
        	if(nums[mid] == target) {
        		return mid;
        	}else if(nums[mid] >= nums[s]){
        		if(target>=nums[s] && target<= nums[mid])
        			e = mid -1 	;
        		else {
					s = mid + 1;
				}
			}else if(nums[mid] <= nums[s]){
        		if(target>=nums[mid] && target<= nums[e])
        			s = mid + 1;
        		else {
					e = mid - 1;
				}
        }
       }
        return -1;
    }
}
