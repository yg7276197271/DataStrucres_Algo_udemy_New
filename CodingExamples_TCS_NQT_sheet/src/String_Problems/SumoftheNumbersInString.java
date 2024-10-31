package String_Problems;
/*Problem: Given a string, 
calculate the sum of numbers in a string (multiple consecutive digits are considered one number)
*/
/*Example 1:
Input: string = “123xyz”
Output: 123

Example 2:
Input: string = “1xyz23”
Output: 24*/

/*Intuition : 

We will iterate in the whole string, if we encounter consecutive numbers we will store them in a temporary string.
After the end of consecutive numbers, we will add them to our final result. This process goes on till
 we reach the end of the string. At the end, we will print the sum.*/

/*Approach:

We will use a tempSum string to store the number
Using a for loop we will iterate through the string and if we encounter a number we will add this number to our tempSum.
If we encounter an alphabet , we will add the value of tempSum to the final result and empty the tempSum to get a new number in the string.
Finally we print the result.*/
public class SumoftheNumbersInString {
    static int findSum(String str) {
    	
    	String tempSum="0";
    	int sum=0;
    	int n = str.length();
    	
    	for(int i=0; i<n; i++){
    		
    		if(Character.isDigit(str.charAt(i))){
    			tempSum+=str.charAt(i);
    		}else{
    			sum+=Integer.parseInt(tempSum);
    			tempSum="0";
    		}
    	}
        return sum + Integer.parseInt(tempSum);
    }
    
    public static void main(String[] args) {

        String str = "1bc268";
        System.out.print("Sum: ");
        System.out.println(findSum(str));
 }
}
