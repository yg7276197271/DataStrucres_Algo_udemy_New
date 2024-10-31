package String_Problems;

/*Example 1:
Input: takeuforward
Output: a2 d1 e1 f1 k1 o1 r2 t1 u1 w1 */

/*Approach: Just count the frequency of every element in Str1 and iterate through the frequency array and
print the count of every letter in the string.*/

/*What is frequency array?

It’s simple, since we know that the string contains only lower case english alphabets, 
there are only 26 such characters possible. 
Now, we need an array of size 26 to store frequency of characters in the original string. 
This array is the frequency array.*/

/*How will this frequency array work?

Since we have only 26 possible lowercase english alphabets. 
The indexes of the array will represent all such characters and 
value at any index will represent the count or frequency of that character in the original array.
For example, index 0 will represent character ‘a’, index 1 will represent the character ‘b’, so on and so forth*/


public class CalculateFrequencyOfCharactersInString {
	
	public static void Printfrequency(String str)
	  {
	    int[] freq = new int[26];
	    for (int i = 0; i < str.length(); i++)
	    {
	      freq[str.charAt(i) - 'a']++;
	    }
	    for (int i = 0; i < 26; i++)
	    {
	      if (freq[i] != 0)
	      {
	        System.out.print((char)(i + 'a'));
	        System.out.print(freq[i] + " ");
	      }
	    }
	  }

	public static void main(String args[])
	  {
	    String str = "takeuforward";
	    Printfrequency(str);
	  }
}
