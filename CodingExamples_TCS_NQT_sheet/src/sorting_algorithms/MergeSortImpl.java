package sorting_algorithms;

//Time Complexity is o(N logN)
//Space complexity is o(N)
public class MergeSortImpl {

	public static void mS(int arr[], int low, int high) {

		// base condition
		if (low >= high)
			return;

		int mid = (low + high) / 2;
		mS(arr, low, mid); //call recursion for left sub array
		mS(arr, mid + 1, high); //call recursion for right sub array
		merge(arr, low, mid, high); // merge the sub arrays

	}

	public static void merge(int[] arr, int low, int mid, int high) {
		int left = low;
		int right = mid + 1;
		int temp[] = new int[arr.length];
		int k=0;
		while (left <= mid && right <= high) {
			if (arr[left] < arr[right]) {
				temp[k] = arr[left];
				left++;
				k++;
			} else {
				temp[k] = arr[right];
				right++;
				k++;
			}
		}
		//Copy the remaining elements on left sub-array  if right array gets exhausted
		while (left <= mid) {
			temp[k]=arr[left];
			k++;
			left++;
			
		}
		//Copy the remaining elements on right sub-array if left array gets exhausted
		while (right <= high) {
			temp[k]=arr[right];
			k++;
			right++;
		}
		
		for(int i=low;i<=high;i++){   //low - low =0
										// low+1 - low = 1
			arr[i]=temp[i-low];			// low+2 - low = 2
			
		}
	}

	static void mergeSort(int arr[], int n) {
		mS(arr, 0, n - 1);
	}
	
	public static void main(String[] args) {
		int arr[]={12,60,34,1,99,88,0,999,111};
		mergeSort(arr,arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"");
		}
	}
}
