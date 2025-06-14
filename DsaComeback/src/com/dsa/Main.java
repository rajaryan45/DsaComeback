package com.dsa;

import com.dsa.hash.TwoSums;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello Raj");
		TwoSums twoSums = new TwoSums();
		int[] res = twoSums.twoSum(new int[] {2,7,11,15}, 9);
		System.out.println(res.toString());
	}

}
