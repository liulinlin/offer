package com.liu.leetcode;

public class ExcelSheetColumnNumber {
	public static int titleToNumber(String s) {
		int number = 0;
		if(s == null || s == ""){
			return number;
		}
		s = s.toUpperCase();
		for(int i =0;i<s.length();i++){
			number = (int) (number + (s.charAt(s.length()-i-1)-'A'+1)*Math.pow(26.0, i));
		}
		return number;
	}
}
