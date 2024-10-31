package String_Problems;

/*Example 1:
Input: c = ‘A’
Output: 65

Example 2:
Input: c = ‘e’
Output: 101*/

/*Approach: 

Basically, we store the character value in an integer which gives us the ASCII value of the character.
When we put character value inside an integer the type casting occurs which converts character value 
into integer which is ASCII value. 
And then we print the ASCII value.*/

public class FindtheASCIIvalueofCharacter {
	public static void value() {

	    char c = 'e';
	    int ascii = c;
	    System.out.println("The ASCII value of " + c + " is: " + ascii);
	  }
	  public static void main(String args[]) {

	    value();
	  }
}
