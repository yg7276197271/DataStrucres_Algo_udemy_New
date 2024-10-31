package String_Problems;

import java.util.Stack;

//Input :" My Name is X "
//Output : "X is Name My"  remove spaces from input if any
public class ReverseWordInString {
	public String reverseWords(String s) {
		
		Stack<String> stack = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s.length();i++){
			
			char ch = s.charAt(i);
			if(ch == ' '){
				if(!sb.toString().isEmpty()){
					stack.push(sb.toString());
					sb = new StringBuilder();
				}

			}
			sb.append(ch);
			
		}
		sb = new StringBuilder();
		while(!stack.isEmpty()){
			String word = stack.pop();
			sb.append(word);
			if(stack.size()>0){
				sb.append(' ');
			}
		}
		return sb.toString();

	}
}
