package Arrays_Problems;

import java.util.HashMap;
import java.util.Map.Entry;

//Approach:

//Declare a hashmap for storing elements as the key and their number of occurrences as value..
//Iterate through the array and store elements and their occurrences in the map.
//Print elements whose occurrences were equals to 1.

public class FindNonRepeatingElements {

	static void findNonRepeatingElements(int arr[]) {
		HashMap<Integer, Integer> elementCount = new HashMap<>();

		for (int i : arr) {
			if (elementCount.get(i) == null)
				elementCount.put(i, 1);
			else
				elementCount.put(i, elementCount.get(i) + 1);
		}
		System.out.print("The Non repeating elements are: ");
		for (Entry<Integer, Integer> entry : elementCount.entrySet()) {
			if (entry.getValue() == 1)
				System.out.print(entry.getKey() + " ");
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 4, 5, 2 };
		findNonRepeatingElements(arr);
	}
}
