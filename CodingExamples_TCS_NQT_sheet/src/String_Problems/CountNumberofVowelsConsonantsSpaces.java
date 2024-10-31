package String_Problems;

//Approach:

/*Convert the given string into lowercase for uniformity while counting vowels,consonants,whitespaces.
This can be done by using towlower() and .toLowerCase() in C++ and Java respectively.
Traverse the entire modified string by applying the following conditions:
If any vowel then increment the vowel counter

Else if any consonant then increment the consonant counter else if
any whitespace then increment the whitespace counter*/


public class CountNumberofVowelsConsonantsSpaces {
	public static void solve(String str, int length) {
		int vowels = 0, consonants = 0, whitespaces = 0;
		str = str.toLowerCase(); // converting given string to lowercase

		for (int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowels++;
			else if (ch >= 'a' && ch <= 'z')
				consonants++;
			else if (ch == ' ')
				whitespaces++;
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("White spaces: " + whitespaces);
	}

	public static void main(String args[]) {
		String str = "Take u forward is Awesome";
		int length = str.length();
		solve(str, length);
	}
}
