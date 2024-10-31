package Arrays_Problems;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromUnsortedArray {

	static void duplicate(int arr[], int n) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (!map.containsKey(arr[i])) {
				System.out.print(arr[i]+" ");
				map.put(arr[i], 1);
			}
		}
	}

	public static void main(String[] args) {
		int n = 9;
		int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };

		duplicate(arr, n);
	}
}
