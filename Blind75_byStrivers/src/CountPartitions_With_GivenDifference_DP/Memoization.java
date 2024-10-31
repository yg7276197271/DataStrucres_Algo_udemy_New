package CountPartitions_With_GivenDifference_DP;
import java.util.*;

public class Memoization {

	static int mod =(int)(Math.pow(10,9)+7);

	// Helper function to find the number of ways to achieve a target sum
	static int countPartitionsUtil(int ind, int target,int[] arr, int[][] dp){
		//This case will handle array elements 0
	     /*if(ind == 0){
	        if(target==0 && arr[0]==0)
	            return 2;
	        if(target==0 || target == arr[0])
	            return 1;
	        return 0;
	    }*/
		//This base will not handle array element zero test case
	     if(target == 0){
	    		return 1;
	    	}
	    	if(ind == 0){
	    		if(arr[0] == target) return 1;
	    		else return 0;
	    	}
	    	
	    if(dp[ind][target]!=-1)
	        return dp[ind][target];
	        
	    int notTaken = countPartitionsUtil(ind-1,target,arr,dp);
	    
	    int taken = 0;
	    if(arr[ind]<=target)
	        taken = countPartitionsUtil(ind-1,target-arr[ind],arr,dp);
	        
	    return dp[ind][target]= (notTaken + taken)%mod;
	}

    static int countPartitions(int d,int[] arr){
        int n = arr.length;
        int totSum = 0;
        for(int i=0; i<arr.length;i++){
            totSum += arr[i];
        }
        
        //Checking for edge cases
        if(totSum-d<0) return 0;
        if((totSum-d)%2==1) return 0; // odd number
        
        int s2 = (totSum-d)/2;
        
        int dp[][] = new int[n][s2+1];
        
        for(int row[]: dp)
        Arrays.fill(row,-1);
        //This is the same problem as Count Subsets with Sum K
        return countPartitionsUtil(n-1,s2,arr,dp);
    }
    public static void main(String args[]) {

    	  int arr[] = {5,2,6,4};
    	  int d=3;
    	                                 
    	  System.out.println("The number of subsets found are "+countPartitions(d,arr));
    	}

}
