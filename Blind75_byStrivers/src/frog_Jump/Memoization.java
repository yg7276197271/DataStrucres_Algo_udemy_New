package frog_Jump;

import java.util.Arrays;

public class Memoization {

	public static void main(String args[]) {

		int height[]={30,10,60 , 10 , 60 , 50};
		  int n=height.length;
		  int dp[]=new int[n+1];
		  Arrays.fill(dp,-1);
		  System.out.println(frogJump(n-1,height,dp));
		}
		
		
	public static int frogJump(int n ,int[] height,int[] dp){
		int totalCount = distinctWaystoJump(n,height,dp);
		return totalCount;
		
	}
	//start from last step and we have to reach to ground level
	public static int distinctWaystoJump(int index,int[] height,int[] dp) {
		
		//Base Case:
		// we are jumping from 0th step to 0th step. So cost will be zero
		
		if(index==0) return 0; // we are jumping from 0th step to 0th step. So cost will be zero
		//For overlapping Subproblems value of dp[index] may have been already calculated.so check that
		if(dp[index] !=-1) return dp[index];
		int jumpBy2Step=Integer.MAX_VALUE;
		int jumpBy1Step = distinctWaystoJump(index-1,height,dp) + Math.abs(height[index] - height[index-1]);
		
		//If we are at first step we can jump only by 1 step not by 2 steps 
		if(index>1){ 
		 jumpBy2Step = distinctWaystoJump(index-2,height,dp) + Math.abs(height[index-2] - height[index]);
		}
		//save value to dp[index]
		return dp[index] = Math.min(jumpBy1Step, jumpBy2Step);
		
	}
	
	

}
