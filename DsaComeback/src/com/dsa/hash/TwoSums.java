package com.dsa.hash;


import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/two-sum/description/
 * Two Sums problem
 * 
 */

public class TwoSums {
	 public int[] twoSum(int[] nums, int target) {
		 Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		 for(int i = 0 ; i<nums.length; i++) {
			 if(hMap.containsKey(target-nums[i])) {
				 return new int[] {hMap.get(target-nums[i]),i};
			}else {
				hMap.put(nums[i], i);
			}
		 }
		 
		 return new int[] {};
	 }
}
