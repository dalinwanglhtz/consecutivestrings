package com.codewardev;

import java.util.Arrays;

public class LongestConsec {

	public static String longestConsec(String[] strarr, int k) {
		String output="";
		
		if(k <= 0) return output;
		
		for(int i=0; i<strarr.length; i++) {
			if(i+k <= strarr.length) {
				String test = String.join("", Arrays.copyOfRange(strarr, i, i+k));
				output = output.length() < test.length() ? test: output;
			}
		}
		return output;
	}

}
