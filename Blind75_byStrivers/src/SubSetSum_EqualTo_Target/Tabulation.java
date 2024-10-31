package SubSetSum_EqualTo_Target;

import java.util.Arrays;
//Tabulation is bottom up approach
public class Tabulation {

	  static boolean subsetSumUtil(int ind, int target, int[] arr, int[][] dp) {
	       
	       

	        // If we don't take element move one step down the array
	        boolean notTaken = subsetSumUtil(ind - 1, target, arr, dp);

	        //If we take the element then target will get reduced and also we need to move one step back
	        //We can only take the element if it is less than or equal to target.
	        boolean taken = false;
	        if (arr[ind] <= target)
	            taken = subsetSumUtil(ind - 1, target - arr[ind], arr, dp);

	        // Store the result in the DP table and return whether either option was successful
	        dp[ind][target] = notTaken || taken ? 1 : 0;
	        return notTaken || taken;
	    }

	   

	    public static void main(String args[]) {
	        int arr[] = { 1, 2, 3, 4 };
	        int k = 4;
	        int n = arr.length;

	        // Create a boolean DP table with dimensions [n][k+1]
	        boolean dp[][] = new boolean[n][k + 1];	 
	        //Base cases
	        //Case 1
	        for(int i=0;i<n;i++){
	        	dp[i][0] = true;
	        }
	        //Case 2

	        dp[0][arr[0]]= true;
	        
	        //now we need to think what can be possible values of index and target
	        //index 0 is already calculated in 1st base case
	       //so index loop will start from 1 to n-1
	        //At every index target can be from 1 to k
	        for(int ind=1;ind<n;ind++){
	        	for(int target = 1;target<=k;target++){
	        		//copy pase recuurece 
	        		
	        		 boolean notTaken = dp[ind - 1][target];

	     	        boolean taken = false;
	     	        if (arr[ind] <= target)
	     	            taken = dp[ind - 1][target - arr[ind]];

	     	        // Store the result in the DP table and return whether either option was successful
	     	        dp[ind][target] = notTaken || taken ;
	     	        
	        	}
	        }
	        if (dp[n-1][k])
				System.out.println("Subset with the given target found");
			else
				System.out.println("Subset with the given target not found");
	        
	    } 

}
