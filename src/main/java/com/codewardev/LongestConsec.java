package com.codewardev;

public class LongestConsec {

	public static String longestConsec(String[] strarr, int k) {
		StringBuilder result;
		String output="";
		for(int i=0; i<strarr.length; i++) {
			result = new StringBuilder();
			if(i+k <= strarr.length) {
				for(int j=i; j<i+k; j++) {
					result.append(strarr[j]);
				}
				if(output.length() < result.toString().length()) {
					output = result.toString();
				}
			}
		}
		return output;
	}

}
