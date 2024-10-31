package String_Problems;
//Solution 2: Using the two-pointer Approach

//Intuition: 

//To reverse a string we need to think in terms of swapping the characters. 
//The first index character needs to be swapped with the last character. 
//Similarly, the second character needs to be swapped with the second last character and so on

/*Approach:

The algorithm approach can be stated as:

Set up two pointers i and j ( i=0 and j=(length of string -1)).
Set up a while loop to iterate till i<j
In every iteration swap the values at str[i] and str[j].
Increment i and decrement j.*/

public class ReverseString {
	public static String swap(String s, int i, int j) {
	    StringBuilder str = new StringBuilder(s);
	    str.setCharAt(i, s.charAt(j));
	    str.setCharAt(j, s.charAt(i));

	    return str.toString();
	  }
	  public static void main(String[] args) {
	    String str = "HELLO";
	    int i = 0;
	    int j = str.length() - 1;

	    // reversing a String
	    while (i < j) {
	      str = swap(str, i, j);
	      i++;
	      j--;
	    }

	    System.out.print("The reversed string is- "+ str);
	  }
}
