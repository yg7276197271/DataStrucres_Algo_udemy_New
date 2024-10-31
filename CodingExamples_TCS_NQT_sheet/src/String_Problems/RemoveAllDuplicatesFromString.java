package String_Problems;
/*Input: s = "bcabc"
Output: “bca"
*/
/*Solution 2: Using a boolean array

The input string will only contain lowercase alphabets. 
So let’s create a boolean array of size 26 initialized to false.

Consider the index as the ASCII value of the character.

For example: for character ch = ‘c’. 
The index value will be 2.this can be achieved by doing s[i] – ‘a’ => 99 – 97 = 2 
(Since ascii value of ‘c’ = 99 and ‘a’ = 97).

Keep a pointer i at the starting of the string. 
check if the character is already visited or not. if(s[i] – ‘a’) is false then 
add that character to ans and make it true. 

Repeat it till we reach the end of the string.*/

public class RemoveAllDuplicatesFromString {
	public static String removeDuplicateLetters(String s) {
		 
	    String ans = "";
	    boolean[] map = new boolean[26];
	    for (int i = 0; i < s.length(); i++) {
	      if (map[s.charAt(i) - 'a'] == false) {
	        ans += s.charAt(i);
	        map[s.charAt(i) - 'a'] = true;
	      }
	    }
	    return ans;
	  }
	  public static void main(String[] args) {
	    String str = "cbacdcbc";
	    System.out.println("Original String: "+str+"\n After removing duplicates:"+removeDuplicateLetters(str));
	 
	  }
}
