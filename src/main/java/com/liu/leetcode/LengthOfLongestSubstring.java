package com.liu.leetcode;

public class LengthOfLongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		 int[] mOccur = new int[256];
	        int maxL = 0;
	        for(int i = 0, j = 0; i < s.length(); ++i){
	            char ch = s.charAt(i);
	            ++mOccur[ch];
	            while(mOccur[ch] > 1){
	                --mOccur[s.charAt(j++)];
	            }
	            maxL = Math.max(maxL, i - j + 1);
	        }
	        return maxL;
	}
}
