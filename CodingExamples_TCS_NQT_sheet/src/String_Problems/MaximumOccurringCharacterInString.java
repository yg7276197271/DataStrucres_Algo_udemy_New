package String_Problems;

/*Input: str = “takeuforward”
Output: a

Input: str = “apple”
Output: p*/
public class MaximumOccurringCharacterInString {
	static char maxOccurringChar(String str) {
		
		char ans = 'a';
		int freq[] = new int[256];
		int maxFreq = 0;
		int n = str.length();
		
		for(int i=0; i<n; i++){
			freq[str.charAt(i)]++;
			
			if(freq[str.charAt(i)] > maxFreq){
				maxFreq = freq[str.charAt(i)];
				ans = str.charAt(i);
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		String str = "takeuforward";
		System.out.println("Maximum occurring character is " + maxOccurringChar(str));
	}
}
