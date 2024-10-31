package String_Problems;

public class RemoveSpacesfromString {
	public static String RemoveVowels(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				str = str.substring(0, i) + str.substring(i + 1);
				i--;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String str = "take u forward";
		System.out.println("String after removing the vowels \n" + RemoveVowels(str));
	}
}
