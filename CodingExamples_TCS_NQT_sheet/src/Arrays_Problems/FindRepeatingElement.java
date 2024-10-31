package Arrays_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Input : arr[] = [1,1,2,3,4,4,5,2]
//Output: 1,2,4
//Algorithm : 
//Store the elements in the hashmap with its frequency of occurrence.
//Iterate through the hashmap. If occurrence is more than 1, return the element.
public class FindRepeatingElement {
	
	static void findRepeatingElements(int arr[]) {
		HashMap<Integer, Integer> elementCount = new HashMap<>();

		for (int i : arr) {
			if (elementCount.get(i) == null)
				elementCount.put(i, 1);
			else
				elementCount.put(i, elementCount.get(i) + 1);
		}
		System.out.print("The repeating elements are: ");
		for (Entry<Integer, Integer> entry : elementCount.entrySet()) {
			if (entry.getValue() > 1)
				System.out.print(entry.getKey() + " ");
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 4, 5, 2 };
		findRepeatingElements(arr);
	}
}
