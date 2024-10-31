package String_Problems;

/*Example 1:
Input: string str = "take12% *&u ^$#forward"
Output: takeuforward

Example 2:
Input: String str = "1.Python & 2.Java"
Output: PythonJava*/

/*Approach: 

Keep on iterating the given string
If there is any lowercase or uppercase alphabet then add it to the resultant string
Don’t include any other remaining characters (even whitespaces) into the resultant string.
Return the resultant string
*/
public class RemoveCharactersFromStringExceptAlphabets {
	public static String solve(String str, int n) {
		StringBuffer ans = new StringBuffer();
		for (int i = 0; i < n; i++) {
			int ascii = (int) str.charAt(i); // ascii value
			if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) // if
				ans.append(str.charAt(i));
		}
		return ans.toString();
	}

	public static void main(String args[]) {
		String str = "take12% *&u ^$#forward";
		int n = str.length();

		System.out.println("Resultant string:");
		System.out.println(solve(str, n));
	}
}
