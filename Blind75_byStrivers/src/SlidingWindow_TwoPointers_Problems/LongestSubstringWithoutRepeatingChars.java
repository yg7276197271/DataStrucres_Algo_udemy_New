package SlidingWindow_TwoPointers_Problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {

	 public static void main(String args[]) {
	        String str = "takeUforward";
	        System.out.println("The length of the longest substring without repeating characters is " + solve(str));

	    }
	 
	 static int solve(String str){
		 
		 int left=0,right=0,maxLength=0;
		 int n = str.length();
		 Map<Character,Integer> map  = new HashMap<Character,Integer>();
		 int length = 0;

		 while(right < n){
			 if(map.containsKey(str.charAt(right))){
				 if(map.get(str.charAt(right)) >= left){ //This condition will make sure that we will only
	//update the value of left when value in map is >= left
					 left = map.get(str.charAt(right)) +1;
				 }
			 }
			 map.put(str.charAt(right), right);
			 length = right-left +1;
			 maxLength = Math.max(maxLength,length);
			 right ++;
		 }
		 
		return maxLength;
	 }
}
