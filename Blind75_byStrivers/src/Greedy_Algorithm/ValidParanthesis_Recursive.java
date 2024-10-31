package Greedy_Algorithm;

public class ValidParanthesis_Recursive {

	//Example => (*()
	
	//We can represent function in terms of index and count
	//At every step we can do index+1
	
	public static boolean checkValid(String s,int index , int count){
		
		//Base cases :
		//If we reach to end of string and count is zero then we got the answer
		
		if(index == s.length()){
			return count==0;
		}
		//If at any point count becomes less that 0 then return false
		
		if(count < 0) return false;
		
		//If we encounter  (
		if(s.charAt(index) == '('){
			return checkValid(s,index+1,count+1);
		}else if(s.charAt(index) == ')'){
			return checkValid(s,index+1,count-1);

		}else{
			//We encounter *
			//We can treat * as ( or ) or blank
			//So there are total 3 options
			//And if either of them can give us valid result then we return true.
			return checkValid(s,index+1,count+1) || checkValid(s,index+1,count-1) || checkValid(s,index+1,count);
		}
		
	}
	public static void main(String[] args) {
		//(**(
		//(*()
		//(*)
		//)(
		//()
		if(checkValid("(*)",0,0))
			{
			System.out.println("It is valid ");
			}
		else {
			System.out.println("It is not valid ");

		}
	}
	
}
