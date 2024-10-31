package String_Problems;
/*Intuition :

We will create an array where we will store occurrences of each character. 
Then iterating through the string we will increment the count of that particular character in the frequency array.
While iterating if we encounter a space (‘ ‘) we will skip it because it is not considered a character.

Approach:*/

/*We will create an integer array freq.
Using a for loop we will iterate through the string and increment each character’s occurrence
At last we print only those characters whose frequency is 1.*/

public class FindNonRepeatingCharsInString {

	static void printFrequency(String st, int n) {

		int[] freq = new int[200];

		for (int i = 0; i < n; i++) {
			if (st.charAt(i) == ' ') { // ignoring the space in the string
				continue;
			} else {
				freq[(int) st.charAt(i)]++; // incrementing each character's
											// frequency
			}
		}
		// Printing the frequency of the string
		for (int i = 0; i < n; i++) {
			if (st.charAt(i) != ' ' && freq[st.charAt(i)] == 1) {
				System.out.print(" " + st.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		String st = "take u forward";

		int n = st.length();

		System.out.print("Non-Repeating characters: ");
		printFrequency(st, n);

	}
}
