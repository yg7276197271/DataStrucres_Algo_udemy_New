package String_Problems;

public class CompressString {
	public int compress(char[] chars){
		
		int i =0;
		int newIndex =0;
		
		while(i<chars.length){
			char repeatingChar = chars[i];
			int counter = 0;

			while(i<chars.length && chars[i] == repeatingChar){
				counter++;
				i++;
			}
			chars[newIndex++] = repeatingChar;
			if(counter>1){
				String counterString = String.valueOf(counter);
				for(char ch : counterString.toCharArray()){
					chars[newIndex++]= ch;

				}
			}
			
		}
		return newIndex;
		
	}
}
