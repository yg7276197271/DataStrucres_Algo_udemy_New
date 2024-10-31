package MaxSumOfNonAdjacentElements;

import java.util.Arrays;

public class Memoization {
	public static void main(String args[]) {

		  int arr[]={2,1,4,9};
		  int n=arr.length;
		  int dp[]=new int[n+1];
		  Arrays.fill(dp,-1);
		  System.out.println(maximumNonAdjacentElementSum(n-1,arr,dp));
		}
		
	public static int maximumNonAdjacentElementSum(int n ,int[] arr,int[] dp){
		int totalCount = findMaxSum(n,arr,dp);
		return totalCount;
		
	}
	//start from last step and we have to reach to ground level
	public static int findMaxSum(int index,int[] arr,int[] dp) {
		
		//Base Case:
		
		if(index==0) return arr[0]; // when we are at 0th index then we have to consider it in sum
		if(index < 0) return 0; //when we are at 1st index and next call is index-2 we will end up
		//with negative index hence we have to return 0
		if(dp[index]!=-1) return dp[index];
		
		int pick = arr[index] + findMaxSum(index-2,arr,dp); // we dont want adjaent element hence ind-2
		int nonPick=0+findMaxSum(index-1,arr,dp);
		
		
		return dp[index] = Math.max(pick, nonPick);
		
	}
	
	
}
