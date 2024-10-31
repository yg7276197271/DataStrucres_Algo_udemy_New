package String_Problems;

import java.util.Stack;
// Input = ((*)
// Input = )(* 
// Input = (())(*

public class ValidParanthesisWithStar {
	boolean checkValidString(String s) {

		Stack<Integer> paranthesisStack = new Stack<>();
		Stack<Integer> starStack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if(ch =='('){
				paranthesisStack.push(i);
			}else if (ch ==')'){
				if(!paranthesisStack.isEmpty()){
					paranthesisStack.pop();
				}
				else if(!starStack.isEmpty()){
					starStack.pop();
				}else{
					return false;
				}
			}else{
				starStack.push(i);
			}
			
		}
		
		while(!paranthesisStack.isEmpty()){
			if(starStack.isEmpty()) return false;
			
			if( starStack.peek() < paranthesisStack.peek() ){
				return false;
			}
			starStack.pop();
			paranthesisStack.pop();
		}
		return true;

	}
}
