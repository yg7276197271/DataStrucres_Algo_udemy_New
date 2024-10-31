package sorting_algorithms;

//Insertion sort is Takes an element and places it at correct position
//TC => O(n2) 
//Best Case is o(n) No swaps happen
public class InsertionSortImpl {
	
	//iterate the array from 0 to n-1.
	//For every iteration If current element is smaller than its left element then swap 
	//And we can swap till 1st position not 0th
	//So the outer loop of i will be from o to n-1
	//and for every value of we need to compare values from i till 0
	//so j will be from i to 0 
	//0 can not be swapped with -1 . so somehow we need to restrict j till position 1
	private static void insertion_sort(int[] arr, int length) {

		for(int i=0;i<arr.length-1;i++){
			
			int j = i;
			while(j>0 && arr[j-1] > arr[j]){  //we can swap till 1st position not 0th hence j > 0
				//Swap
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = { 12, 60, 34, 1, 99, 88, 0, 999, 111 };
		insertion_sort(arr, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}

	}

	

}
