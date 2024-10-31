package String_Problems;

public class CheckAnagram {
/*	Approach:
		Just count the frequency of every element in Str1 and iterate through Str2 and 
		decrease the count of every element in the frequency array.
		Now iterate again, if the frequency at any point is not 0 this means,
		strings are not anagrams of each other.
*/
	

	  public static boolean checkAnagrams(String str1, String str2) {
	    // when both of the strings have different lengths
	    if (str1.length() != str2.length())
	      return false;
	 
	    int[] freq = new int[26];
	    for (int i = 0; i < str1.length(); i++) {
	      freq[str1.charAt(i) - 'A']++;
	    }
	    for (int i = 0; i < str2.length(); i++) {
	      freq[str2.charAt(i) - 'A']--;
	    }
	    for (int i = 0; i < 26; i++) {
	      if (freq[i] != 0)
	        return false;
	    }
	    return true;
	  }
	  public static void main(String args[]) {
	    String Str1 = "INTEGER";
	    String Str2 = "TEGERNI";
	    System.out.println(checkAnagrams(Str1, Str2));
	  }

}
