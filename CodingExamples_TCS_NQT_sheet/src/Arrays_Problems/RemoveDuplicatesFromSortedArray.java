package Arrays_Problems;

public class RemoveDuplicatesFromSortedArray {
	//We have to add unique elements to the start of and existing array only
	// Use two pointer approach
	//Keep first pointer at 0th position and second pointer at 1st position
	//Move the second pointer by 1 step till the value at second pointer is not equal to value at first pointer
	//once that happens assign the value at second pointer to first pointer +1 position and also
	//move first pointer by 1 step and
	//keep on repeating the above steps till second pointer reaches to end of an array
	public static int removeDuplicates(int[] arr, int n) {

		int i = 0;
		for (int j = 1; j < n; j++) {
			if (arr[j] != arr[i]) {
				arr[i + 1] = arr[j];
				i++;
			} 
		}
		return i + 1; // No of unique elements

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 1, 2, 2, 2, 3, 3 };
		
		System.out.println("No of unique elements are :"+removeDuplicates(arr, arr.length));
	}
}
