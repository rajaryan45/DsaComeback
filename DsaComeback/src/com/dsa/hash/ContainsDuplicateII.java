package com.dsa.hash;

import java.util.HashMap;

public class ContainsDuplicateII {
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for(int i = 0 ; i<nums.length ; i++) {
			if(hmap.containsKey(nums[i])) {
				if(Math.abs(i-hmap.get(nums[i])) <= k)
					return true;
				else {
					if(Math.abs(i-hmap.get(nums[i])) > k) hmap.put(nums[i], i);
				}
				
			}else {
				hmap.put(nums[i], i);
			}
		}
		
		return false;
	}

}
