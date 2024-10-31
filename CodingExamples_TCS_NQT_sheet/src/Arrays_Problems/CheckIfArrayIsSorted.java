package Arrays_Problems;

//Algorithm :
//If current element of n array is greater than previous element then array is sorted.
//We have to start iterating from index 1 . as we are doing arr[i] >= arr[i - 1]
//And we have to do this till last element index . i < n . where n is no of elements
public class CheckIfArrayIsSorted {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr1 = {1,2,1,4,5};

		System.out.println(isSorted(arr,5));;
		System.out.println(isSorted(arr1,5));;

	}
	public static boolean isSorted(int arr[], int n) {

		for (int i = 1; i < n; i++) {
			if (arr[i] >= arr[i - 1]) {
				
			} else {
				return false;
			}
		}
		return true;
	}
}
