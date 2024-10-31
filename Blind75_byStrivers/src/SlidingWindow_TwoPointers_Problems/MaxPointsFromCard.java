package SlidingWindow_TwoPointers_Problems;

public class MaxPointsFromCard {

	public static void main(String[] args) {
		int[] arr ={1,2,3,4,5,6,1};
		
		System.out.println("Max Sum is "+maxPointsFromCard(arr,3));;
	}
	public static int maxPointsFromCard(int[] arr , int k){
		
		int n= arr.length;
		int maxSum = 0;
		int leftSum=0;
		int rightSum=0;
		
		for(int i=0;i<k;i++){
			leftSum+=arr[i];
		}
		maxSum=leftSum;
		
		//Shrinking the window from Left and adding elements one by one from right (from last index)
		int rightIndex = n-1;
		for(int index=k-1;index>=0;index--){
			
			leftSum = leftSum - arr[index];
			rightSum = rightSum + arr[rightIndex];
			rightIndex--;
			maxSum = Math.max(maxSum, leftSum+rightSum);

		}
		
		return maxSum;
	}
}
