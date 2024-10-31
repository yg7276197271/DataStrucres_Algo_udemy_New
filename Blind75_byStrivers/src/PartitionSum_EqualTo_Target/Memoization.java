package PartitionSum_EqualTo_Target;
import java.util.*;
//Represent in terms of index
// f(index , target) => till index can we form a target
//Value of index will range from n-1 to 0
//And target is what is given in problem.
//We will be starting from last index of an array
//At every step we have two options : take or Not take
//If we take a particular element then reduce the target and index
//If we do not take an element then reduce only index
//Go till index 0
public class Memoization {
	  static boolean subsetSumUtil(int ind, int target, int[] arr, int[][] dp) {
	       //At any point when target is zero we have to stop
	        if (target == 0)
	            return true;

	        // If we have considered all elements but haven't reached the target, return false
			//or in other words if we are at index 0 we can return true if arr[0] == target
			//else return false.
	        if (ind == 0)
	            return arr[0] == target;

	        // If the result for this subproblem has already been calculated, return it
	        if (dp[ind][target] != -1)
	            return dp[ind][target] == 0 ? false : true;

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
	        int arr[] = {2, 3, 3, 3, 4, 5};
	        int n = arr.length;

	        // Check if the array can be partitioned into two equal subsets
	        if (canPartition(n, arr))
	            System.out.println("The Array can be partitioned into two equal subsets");
	        else
	            System.out.println("The Array cannot be partitioned into two equal subsets");
	    }
	    static boolean canPartition(int n , int arr[]){
	    	int sum = 0;
	    	for(int i=0;i<n;i++){
	    		sum+=arr[i];
	    	}
	    	//If sum is odd number we cannot partition
	    	if(sum % 2 == 1){
	    		return false;
	    	}
	    	else{
	    		 // Calculate the target sum for each subset
	            int k = sum / 2;
	            // Create a memoization table
	            int dp[][] = new int[n][k + 1];
	            for (int row[] : dp)
	                Arrays.fill(row, -1);
	            
	            // Call the helper function to check if a valid subset exists
	            return subsetSumUtil(n - 1, k, arr, dp);
	    	}
	    	
	    }
	   
}
