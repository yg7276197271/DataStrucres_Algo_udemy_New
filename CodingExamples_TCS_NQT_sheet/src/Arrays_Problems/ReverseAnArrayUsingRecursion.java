package Arrays_Problems;


public class ReverseAnArrayUsingRecursion {
	
	static void printArray(int arr[], int n) {
		System.out.print("Reversed array is:- \n");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	// Function to reverse array
	static void reverseArray(int i ,int arr[], int n) {
		
		//Base Condition
		if(i>=n/2) return;	//arr size is 5.so n/2 = 2; till n/2 we need to do swapping
		
		//Swap elements 
		int tmp = arr[i];
		arr[i] = arr[n-i-1];  //swap(0,n-1) swap(1,n-2)  swap(2,n-3) and so on
		arr[n-i-1] = tmp;
		
		//Call recursion
		reverseArray(i+1,arr,n);
	}

	public static void main(String[] args) {
		int n = 5;
		int arr[] = { 5, 4, 3, 2, 1 };
		reverseArray(0,arr, n);
		printArray(arr,n);
	}
	
	
}
