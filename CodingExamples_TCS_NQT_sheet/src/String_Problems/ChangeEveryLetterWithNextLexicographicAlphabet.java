package String_Problems;
/*Example 1:
Input: string str = “abcdxyz”
Output: bcdeyza*/

/*Approach: 

Keep on Iterating and calculating the ascii value of the corresponding string character.
If the ascii value of the character is 90 (i.e character Z) then set that string character to character A.
Else if ascii value of the character is 122 (i.e character z) then set that string character to character a
Else if any other uppercase or lowercase alphabet then set that string character to its next character
Steps 1 and 2 are edge cases while step 3 is a generalized case.*/

public class ChangeEveryLetterWithNextLexicographicAlphabet {
	
	 public static String solve(String str, int length) {
		    StringBuffer ans = new StringBuffer();
		    
		    for (int i = 0; i < length; i++) {
		      int ascii = (int)(str.charAt(i));
		      if (ascii == 90)
		        ans.insert(i, (char)(65));

		      else if (ascii == 122)
		        ans.insert(i, (char)(97));

		      else if ((ascii >= 65 && ascii < 90) || (ascii >= 97 && ascii < 122))
		        ans.insert(i, (char)(ascii + 1));
		    }
		    return ans.toString();
		  }

		  public static void main(String args[]) {
		    String str = "abcdxyz";
		    int length = str.length();
		    System.out.println("Original string: ");
		    System.out.println(str);
		    System.out.println("New string: ");
		    System.out.println(solve(str, length));
		  }
}
