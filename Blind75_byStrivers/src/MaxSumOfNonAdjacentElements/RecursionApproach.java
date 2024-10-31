package MaxSumOfNonAdjacentElements;

public class RecursionApproach {
	public static void main(String args[]) {

		  int arr[]={2,1,4,9};
		  int n=arr.length;
		  System.out.println(maximumNonAdjacentElementSum(n-1,arr));
		}
		
	public static int maximumNonAdjacentElementSum(int n ,int[] arr){
		int totalCount = findMaxSum(n,arr);
		return totalCount;
		
	}
	//start from last step and we have to reach to ground level
	public static int findMaxSum(int index,int[] arr) {
		
		//Base Case:
		// we are jumping from 0th step to 0th step. So cost will be zero
		
		if(index==0) return arr[0]; // when we are at 0th index then we have to consider it in sum
		if(index < 0) return 0; //when we are at 1st index and next call is index-2 we will end up
		//with negative index hence we have to return 0
		
		int pick = arr[index] + findMaxSum(index-2,arr); // we dont want adjaent element hence ind-2
		int nonPick=0+findMaxSum(index-1,arr);
		
		
		return Math.max(pick, nonPick);
		
	}
	
	
}
