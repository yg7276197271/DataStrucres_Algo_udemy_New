package String_Problems;
//Approach:

//
//-> We will be using 2 pointers i and j, i will be initialized at 0 and j will also be initialized at 0.
//
//-> We will have max_length to store the maximum length of the string, max_start to store the 
//starting index of the maximum length word, max_word to store the largest word
//
//-> If we encounter ‘ ‘ or ‘\0’ in the Word, the current length of the word will be (j-i) and
//compare it with  max_length.
//
//->If it’s greater, we will update the max_length and max_start.
//
//->Finally we will update max_word by using max_start and max_length

public class LargestWordInString {
	
	static String maxLength(String str) {
		int len = str.length();
		int i = 0, j = 0;
		String maxWord = "";
		int max_length = 0, max_start = 0;

		while (j <= len) {
			if (j < len && str.charAt(j) != ' ') {
				j++;
			} else {  //j = 6
				int curr_length = j - i; // 6 - 0 = 6
				if (curr_length > max_length) { 
					max_length = curr_length;   //max length = 6
					max_start = i;  // max start = 0 so max word is substring(0,6)
				}
				j++; // j= 7
				i = j; // i = 7
			}

		}
		maxWord = str.substring(max_start, max_length);
		return maxWord;
	}

	public static void main(String[] args) {
		String str = "Google Docs";

		System.out.print("Largest Word is: " + maxLength(str));

	}
}
