package String_Problems;
import java.util.*;

//Algorithm:
//We will first sort the products Array in ascending order
//Then we will iterate on search word and compare each character with the each word in Products array
//We are maintaining left and right index
//left is pointing to 1st word  right is pointing to last word of products sorted array.
//so we will do left++ if search word char is not matched. and right -- for not matching case
//And we have to print matching words from left to right pointers (upto 3 words only)

public class SearchSuggestionSystem {
	
	public static void main(String[] args) {
		String[] products ={"mobile","moneypot","monitor","mousepad","mouse"};
		String searchWord = "mouse";
		List<List<String>> result = suggestionSystem(products,searchWord);


	}
	public static List<List<String>> suggestionSystem(String[] products, String searchWord) {
		Arrays.sort(products);
		int leftIndex = 0;
		int rightIndex = products.length - 1;
		List<List<String>> output = new ArrayList<>();

		for (int index = 0; index < searchWord.length(); index++) {
			char charVal = searchWord.charAt(index);
			while (leftIndex <= rightIndex) {
				System.out.println(leftIndex);
				if (products[leftIndex].length()<= index ||charVal != products[leftIndex].charAt(index)) {
					leftIndex++;
				} else {
					break;
				}

			}
			while (rightIndex >= leftIndex) {
				System.out.println(rightIndex);
				if (products[rightIndex].length()<= index || charVal != products[rightIndex].charAt(index)) {
					rightIndex--;
				} else {
					break;
				}
			}
			
			int count = 1;
			List<String> tempOutput = new ArrayList<String>();
			for(int i=leftIndex;i==rightIndex && count<=3;i++){ 
				//We are maintaining count because we need only 3 String
				tempOutput.add(products[i]);
				count++;
			}
			output.add(tempOutput);
		}

		return output;

	}
	//products[leftIndex].length()<= index this condition is added becoz of below scenario
	//Suppose searchWord is mousePadmouse and products array's  field is mouse 
	//Then we can get ArrayIndexOutOfbounds
}
