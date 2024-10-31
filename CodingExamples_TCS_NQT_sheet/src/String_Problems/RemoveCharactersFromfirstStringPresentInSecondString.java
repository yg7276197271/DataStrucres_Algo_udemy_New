package String_Problems;

import java.util.HashMap;

/*Example 1:
Input: String str1 = “abcdef”
       String str2 = “cefz”
Output: abd
Explanation: The common characters in both strings are c, e, f.
So after removing these characters from string 1 we get string resulting string as abd.
*/

/*Example 2:
Input: String str1 = “xyzpw”
       String str2 = “lmno”
Output: xyzpw*/

/*Approach: 

Using HashMap in Java , unordered_map in C++

Hashmap / unordered_map actually helps us to keep the record of string2 characters, 
which we will eventually compare with string1 characters to find the common characters

Declare the hashmap wherein the keys will be the string2 characters and its corresponding value will be 1.

Now,iterate through string1 and if that character is not present in the HashMap /
 unordered_map then add that character to the resulting string.

Return the resulting string after the iteration of string1 is over.*/

public class RemoveCharactersFromfirstStringPresentInSecondString {
	
	 public static String solve(String str1, String str2) {
		    HashMap < Character, Integer > mp = new HashMap < > ();
		    StringBuffer ans = new StringBuffer();
		    for (int i = 0; i < str2.length(); i++) {
		      mp.put(str2.charAt(i), 1);
		    }
		    for (int i = 0; i < str1.length(); i++) {
		      if (mp.get(str1.charAt(i)) == null)
		        ans.append(str1.charAt(i));
		    }
		    return ans.toString();
		  }

		  public static void main(String args[]) {
		    String str1 = "abcdef"; // string 1
		    String str2 = "cefz"; // string 2

		    System.out.println("Final string 1:");
		    System.out.println(solve(str1, str2));
		  }
}
