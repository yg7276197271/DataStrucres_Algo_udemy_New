package Arrays_Problems;

//Intuition: We can maintain a min variable which will update whenever
//the current value is less than the value in the min variable

//Approach: 

//Create a min variable and initialize it with arr[0].
//Use a for loop and compare it with other elements of the array
//If any element is less than the min value, update min value with element’s value
//Print the min variable

public class FindSmallestElementInArray {
	public static void main(String args[]) {
		 
	    int arr1[] =  {2,5,1,3,0};
	    System.out.println("The smallest element in the array is: "+SmallestElement(arr1));
	 
	    int arr2[] =  {8,10,5,7,9};
	    System.out.println("The smallest element in the array is: "+SmallestElement(arr2));
	  }
	  static int SmallestElement(int arr[]) {
	    int min = arr[0];
	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] < min) {
	        min = arr[i];
	      }
	    }
	    return min;
	  }
}
