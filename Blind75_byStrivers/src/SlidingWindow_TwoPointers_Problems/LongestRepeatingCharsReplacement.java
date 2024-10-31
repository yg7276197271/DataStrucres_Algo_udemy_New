package SlidingWindow_TwoPointers_Problems;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharsReplacement {

	public int characterReplacement(String s, int k) {
		HashMap<Character, Integer> map = new HashMap<>();

		int left = 0, right = 0, maxL = 0;
		int mostFreq = 0;

		while (right < s.length()) {
			char c = s.charAt(right);

			// Store each character along with its frequency
			// and get the most freq char in the current window
			map.put(c, map.getOrDefault(c, 0) + 1);
			mostFreq = Math.max(map.get(c), mostFreq);

			if (right - left + 1 - mostFreq <= k) {
				maxL = Math.max(maxL, right - left + 1);
			} else {
				// Move the left pointer to the next charater
				// and update its frequency in map
				map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
				left++;
			}

			right++;
		}

		return maxL;
	}
}
