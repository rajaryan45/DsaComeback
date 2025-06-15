package com.dsa;

import com.dsa.array.binarysearch.RotatedSortedArray;
import com.dsa.hash.TwoSums;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello Raj");
		RotatedSortedArray rotatedSortedArray = new RotatedSortedArray();
		int res = rotatedSortedArray.search(new int[] {4,5,6,7,0,1,2}, 3);
		System.out.println(res);
	}

}
