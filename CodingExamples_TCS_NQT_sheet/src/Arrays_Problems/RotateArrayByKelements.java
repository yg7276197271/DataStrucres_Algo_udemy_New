package Arrays_Problems;
//Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
//Output: 6 7 1 2 3 4 5
//Explanation: array is rotated to right by 2 position .

//Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
//Output: 9 10 11 3 7 8
//Explanation: Array is rotated to left by 3 position.

//Approach 2: Using ” Reversal Algorithm “

//Approach:

//For Rotating Elements to right n=7 k=2 int[] arr = {1,2,3,4,5,6,7};  +> {3,4,5,6,7,1,2};
//Step 1: Reverse the last k elements of the array. 1,2,3,4,5,7,6      TC -> O(k)

//Step 2: Reverse the first n-k elements of the array. 5,4,3,2,1,7,6   TC -> O(n-k)

//Step 3: Reverse the whole array.		6,7,1,2,3,4,5                  TC -> O(n)
														//		overall TC is O(2n)
public class RotateArrayByKelements {
		//Swap the elements at start & end 
		//then start++ end-- & repeat steps till start crosses end
	  public static void Reverse(int[] arr, int start, int end) {
		  	
		  while (start <= end){
			  int temp = arr[start];
			  arr[start] = arr[end];
			  arr[end] = temp;
			  
			  start++;
			  end--;
		  }
	  }
	  // Function to Rotate k elements to right

	  public static void Rotateeletoright(int[] arr, int n, int k) {
		  //Reverse the last k elements of the array n-k = 5 and n-1 =6
		  Reverse(arr,n-k,n-1);
		  //Reverse the first n-k elements of the array. n-k-1 = 4
		  Reverse(arr,0,n-k-1); 
		  //Reverse the whole array.
		  Reverse(arr,0,n-1);
		  
		/*  //In case of Left rotate 
		  //Reverse the first k elements of the array 
		  Reverse(arr,0,k);
		  //Reverse the last n-k elements of the array. 
		  Reverse(arr,k,n-1); 
		  //Reverse the whole array.
		  Reverse(arr,0,n-1); */
		  
	  }
	  public static void main(String args[]) {
		    int[] arr = {1,2,3,4,5,6,7};
		    int n = 7;
		    int k = 2;
		    Rotateeletoright(arr, n, k);
		    System.out.print("After Rotating the k elements to right ");
		    for (int i = 0; i < n; i++)
		      System.out.print(arr[i] + " ");
		    System.out.println();
		  }
	  
}
