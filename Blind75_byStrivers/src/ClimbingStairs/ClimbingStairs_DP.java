package ClimbingStairs;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class ClimbingStairs_DP {
	//Start from the top
	//Either you can jump step 1 or step 2
	//If you reaches to zero then return 1
	//If you are at 1st stair then you can jump only step 1 
	public static void main(String[] args) {
		System.out.println("No of Distinct ways are "+climbStairs(4));;
	}
	//Create a dp array initilize it to -1
	//Base cases will remain as it is
	// for overlapping sub problems we need to use values which are already calculated
	//so every time we will store the value to dp
	//and we will check if dp[n]!=0. if it is then it means that value is already calculated so take that value.
	public static int climbStairs(int n){
		int[] dp = new int[n+1]; 
		for(int i=0;i<dp.length;i++){
			dp[i]=-1;
		}
		int totaCount = distinctWaysClimbStairs(n,dp);
		return totaCount;
	}
	 public static int distinctWaysClimbStairs(int n,int[] dp) {
		 //if(n<0) return 0;
		 if(n==0) return 1;
		 else if(n==1) return 1;
		  if(dp[n]!=-1) return dp[n];
		 dp[n] = distinctWaysClimbStairs(n-1,dp) + distinctWaysClimbStairs(n-2,dp);
		 return dp[n];
	    }
	 //Steps for the Tabulation approach
	 //Step 1 : Declare a dp[] array of size n+1.
	 //Step 2 : First initialize the base condition values,
	 //i.e i=0 and i=1 of the dp array as 1.
	 //Step 3 : Set an iterative loop that traverses the array( from index 2 to n) and
	  // for every index set its value as dp[i-1] + dp[i-2]. 
	 
	 public int[] climbStairsUsingDP(int n) {
		 
		 
	 int dp[] = new int[n+1];
	 dp[0]=1;
	 dp[1]=1;
	 
	 for(int i=2;i<=n;i++){
		 
		 dp[i]=dp[i-1]+dp[i-2];
	 }
	 return dp;
	 }
	 
	 
}

