package String_Problems;

import java.util.Arrays;

//Input : school , summer , salt , science , salsa 
//Output : s
//Input : ccc, c, cc
//output : c
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		
		Arrays.sort(strs);
		String firstString = strs[0];
		String lastString = strs[strs.length-1];
		int i = 0;
		
		while(i < firstString.length() && i< lastString.length()){
			
			if(firstString.charAt(i) == lastString.charAt(i)){
				i++;
			}
			break;
			
		}
		return firstString.substring(0 , i); //index i is exclusive here

	}
}
