package com.codewardev;

import java.util.Arrays;

public class LongestConsec {

	public static String longestConsec(String[] strarr, int k) {
		String output="";
		
		if(k <= 0) return output;
		
		for(int i=0; i<=strarr.length-k; i++) {
			String test = String.join("", Arrays.copyOfRange(strarr, i, i+k));
			output = output.length() < test.length() ? test: output;
		}
		return output;
	}

}


//package com.codewardev;
//
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//
//public class LongestConsec {
//	public static String longestConsec(String[] strArr, int k) {
//		return (k>0 && strArr.length > 0 && k<= strArr.length) ?
//				IntStream.rangeClosed(0, strArr.length-k)
//				.mapToObj(i->IntStream.range(0, k).mapToObj(j->strArr[i+j]).collect(Collectors.joining()))
//				.sorted((s1, s2)->Integer.compare(s2.length(), s1.length()))
//				.findFirst().get()
//				: "";
//	}
//}