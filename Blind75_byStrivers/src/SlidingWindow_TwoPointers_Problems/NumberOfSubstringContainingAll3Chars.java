package SlidingWindow_TwoPointers_Problems;

import java.util.Arrays;

public class NumberOfSubstringContainingAll3Chars {
//So here we are staring from index 0 to n.
//at every index we are checking how many substring are present till current char
//for given string bbacba , when we are at index 3 , then we can get bac , bbac.
//So we need to find minimum char string that consists of a b c 
//and then we have to add everything on left one by one
	//When we  are standing at index 5 ,we will get cba ,acba,bacba, bbacba
	//So we are adding 1 + index of c i.e 3
	//index of c we can get from the map i.e index of  char with min value
	public static int numberOfSubstrings(String s) {
		int cnt = 0;
		int lastSeen[] = new int[3];
		Arrays.fill(lastSeen, -1);

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			lastSeen[c - 'a'] = i; // we are marking the last seen value of current character in lastseen array

			
			if (lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1) {
				cnt = cnt + 1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
			}
		}
		return cnt;

	}
	
	public static void main(String[] args) {
		String s="bbacba";
		System.out.println(numberOfSubstrings(s));
	}

}
