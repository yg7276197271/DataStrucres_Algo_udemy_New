
package Arrays_Problems;

public class SecondLargestElementInArray {
	//Algorithm :
	//Assign Largest as first element of an array & secondLargest as -1
	//Iterate through the entire array starting from index 1
	//if arr[i] > Largest then largest is now arr[i]
	//But before that we have to assign secondLargest as previous Largest Value
	//And one more condition we have to check
	//If the element of an array is less than largest but greater than second Largest i.e arr = 5
	//then we have to change the SecondLargest to that element .
	//TC => o(n)
	public static void main(String[] args) {
		int arr[] = {1,2,4,7,7,5};
		System.out.println(secondLargest(arr,6));;
	}
	public static int secondLargest(int[] arr,int n){
		
		int largest = arr[0];
		int secondLargest = -1;
		
		for(int i = 1; i<n;i++){
			
			if(arr[i] > largest){
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] < largest && arr[i] > secondLargest){
				secondLargest = arr[i];
			}
		}
		return secondLargest	;
		
	}
}
