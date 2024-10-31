package String_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	/*
	 * output: [epam, pame, aepm] contains same character [java, ajav] contains
	 * same character [abcd, dcba] contains same character
	 */
	public static void main(String[] args) {
		String strs[] = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };
		Map<String, List<String>> map = new HashMap<>();

		for (String str : strs) {
			char[] tempArray = str.toCharArray();
			Arrays.sort(tempArray);
			String sortedValue = new String(tempArray);
			if (map.containsKey(sortedValue)) {
				map.get(sortedValue).add(str);

			} else {
				List list = new ArrayList<>();
				list.add(str);
				map.put(sortedValue, list);
			}

		}
		map.entrySet().stream().forEach(entry -> System.out.println(entry.getValue()));

	}

}
