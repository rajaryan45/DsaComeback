package com.dsa.string;

public class ScoreofString {
	/*
	 * 
	 * https://leetcode.com/problems/score-of-a-string/
	 * 
	 */
	public int scoreOfString(String s) {
		int ans = 0 ;
		for(int i = 1; i<s.length();i++) {
			ans += Math.abs(s.charAt(i-1) - s.charAt(i));
		}
		return ans;
	}

}
