package String_Problems;

public class CheckPalindrome {

	
    static boolean palindrome(int i, String s){
    	//Base Condition
    	// If i exceeds half of the string, means all the elements 
        // are compared, we return true.
    	if(i >=s.length()/2) return true;
    	  // If start is not equal to end, not palindrome.
    	if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        // If both characters are same, increment i and check start+1 and end-1.
    	return palindrome(i+1,s);
		
	}
    //here end is written as n-i-1 
    //n=5 madam
    //i = 0 n-i-1=4 
    //i=1  n-i-1= 3
    //and so on
    
    public static void main(String[] args) {

        // Example string.
        String s = "madam";
        System.out.println(palindrome(0,s));
        String s1 = "madsm";
        System.out.println(palindrome(0,s1));
     }
}
