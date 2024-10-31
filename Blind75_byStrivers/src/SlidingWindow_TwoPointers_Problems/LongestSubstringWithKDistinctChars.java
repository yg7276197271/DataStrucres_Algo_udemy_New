package SlidingWindow_TwoPointers_Problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDistinctChars {
	public static void main(String[] args) {
		System.out.println("Max Length is "+findLongestSubstring("aaabbccd",2));
	}
	public static int findLongestSubstring(String str,int k){
		int left=0,right=0,maxLength=0;
		
		Map<Character,Integer> freqMap = new HashMap<>();
		
		while (right < str.length()){
			char c = str.charAt(right);
	
			freqMap.put(c,freqMap.getOrDefault(c, 0)+1);
			
			if(freqMap.size() <=k){
				maxLength = Math.max(maxLength, right - left +1);
			}else{
				//We need to shrink the window from left pointer
				//Check the element in map and decrease its freq
				//when freq is 0 then remove the element 
				//do it till freq is <=k
				
				while(freqMap.size() > k){
					
					char leftChar = str.charAt(left);
					freqMap.put(leftChar,freqMap.getOrDefault(leftChar,0) -1 );
					if(freqMap.get(leftChar) == 0){
						freqMap.remove(leftChar);
					}
					left++;
				}
			}
			
			right++;
		}
		return maxLength;
		
		
	}
	//Optimized Code :
	//We will remove inner while loop
	//str = aaabbccd
	//when right is at 5 , max length  is 5.
	//In earlier approach we are moving left index all the way to 3 and then max length is coming as 3
	//There is no point in shrinking maxLength beyond 5. we need to find greater maxLength
	//So here we will increase left index by only one position
	//So left index will become 1 
	public static int findLongestSubstringOptimized(String str,int k){
		int left=0,right=0,maxLength=0;
		
		Map<Character,Integer> freqMap = new HashMap<>();
		
		while (right < str.length()){
			char c = str.charAt(right);
	
			freqMap.put(c,freqMap.getOrDefault(c, 0)+1);
			
			if(freqMap.size() <=k){
				maxLength = Math.max(maxLength, right - left +1);
			}else{
				//We need to shrink the window from left pointer
				//Check the element in map and decrease its freq
				//when freq is 0 then remove the element 
				//do it till freq is <=k
				
				if(freqMap.size() > k){ //we will shrink winodw by removing only one char
					
					char leftChar = str.charAt(left);
					freqMap.put(leftChar,freqMap.getOrDefault(leftChar,0) -1 );
					if(freqMap.get(leftChar) == 0){
						freqMap.remove(leftChar);
					}
					left++;
				}
			}
			
			right++;
		}
		return maxLength;
		
		
	}
}
