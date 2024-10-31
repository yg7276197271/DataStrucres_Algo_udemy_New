package Arrays_Problems;

//Below is Optimal Solution
public class RotateArrayByKElements_LeftShift_OptimalReverse_Approach {
	/*
	 * arr = {1,2,3,4,5,6,7} result = {3,4,5,6,7,1,2} d = 2 left shift by 2 ;;;
	 * n = 7
	 */

	// Swap the elements at start & end
	// then start++ end-- & repeat steps till start crosses end
	public static void Reverse(int[] arr, int start, int end) {

		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	private static void RotateElemntsToLeft(int[] arr, int n, int d) {
		//Reverse First d elements //Start will be 0 end will d-1
		Reverse(arr,0,d-1); 
		
		//Reverse  n-d elements //So start will be d end will be n-1

		Reverse(arr,d,n-1);
		
		//Reverse Entire array // start 0 end n-1
		Reverse(arr,0,n-1);
		
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = 7;
		int d = 2;
		RotateElemntsToLeft(arr, n, d);
		System.out.print("After Rotating the k elements to right ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
