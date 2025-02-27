package sorting_algorithms;

//TC -> O(n2) 
//TC -> O(n) if array is already sorted
public class BubbleSortImpl {
	// Bubble sort is push the maximum to the last by adjacent swaps

	// iterate array from 0 to n-1 , 0 to n-2 .... , 0 to 1
	// i -> n-1 to 1
	// j -> 0 to i-1 we can not swap last element with its next .. array length exceeds.hence its i-1 not i

	public static void main(String[] args) {

		int arr[] = { 12, 60, 34, 1, 99, 88, 0, 999, 111 };
		bubble_sort(arr, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}

	}

	public static void bubble_sort(int[] arr, int n) {
		for (int i = n - 1; i >= 0; i--) {
			int didSwap=0; //if array is already sorted then we will not iterate //arr = [1, 2 ,3 ,4 ,5 ,6 ]
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					didSwap=1;
				}
			}
			if(didSwap==0){
				break;
			}
		}}
}
