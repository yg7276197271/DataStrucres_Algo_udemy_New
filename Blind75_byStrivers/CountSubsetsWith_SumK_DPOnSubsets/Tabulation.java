package CountSubsetsWith_SumK_DPOnSubsets;

import java.util.Arrays;
//Tabulation is bottom up approach
public class Tabulation {

	
	// Helper function to find the number of ways to achieve a target sum
    static int findWaysUtil(int ind, int target, int[] arr , int dp[][]) {
		
		//base case
    	// at any point if target is 0 then it means you got the answer return 1
    	if(target == 0){
    		return 1;
    	}
    	//When you reach index 0 then that element is equal to sum then you can return 1 else 0
    	if(ind == 0){
    		
    		if(arr[0] == target) return 1;
    		else return 0;
    	}
    	
    	if(dp[ind][target] !=-1) return dp[ind][target];
    	//Explore other ways
    	//If we dont pick element we will move one step back in array
    	int notTake = findWaysUtil(ind-1,target,arr,dp);
    	
    	//If we  pick element we will move one step back in array and sum will also reduced
    	//You can take the element only if that element is less than or equal to target
    	int take = 0;
    	if(arr[ind] <= target){
       	 	take =findWaysUtil(ind-1,target-arr[ind],arr,dp);
    	}
        // Store and return the result for the current state

    	return dp[ind][target]= notTake + take;
	}

	
	public static void main(String args[]) {
        int arr[] = {1, 2, 2, 3};
        int target = 3; //Target 
        int n = arr.length;
        int dp[][] = new int[n][target + 1];
        
       //dp[index][target]
        //Base Case
        //When target is 0 return 1
        //Value of index can range from 0 to n-1
        for(int i=0;i<=n-1;i++){
        	dp[i][0] = 1;
        }
       //When ind == 0
        //and if arr[0] == target return 1
        
        if(arr[0] <= target)   dp[0][arr[0]] =1;
        
        //Now we need to form nested loops
        //Value of index can range from 1 to n-1 bcoz 0 is alredy covered in base case 1
        //For every index value target can range from 0 to target value 
        for(int ind=1;ind<=n-1 ;ind++){
        	for(int sum=0;sum<=target;sum++){
        		
            	int notTake = dp[ind-1][sum];
            	
            	int take = 0;
            	if(arr[ind] <= sum){
               	 	take =dp[ind-1][sum-arr[ind]];
            	}
            	dp[ind][sum]= notTake + take;
        	}
        }
        
        System.out.println("The number of subsets found are " + dp[n-1][target]); 

  
    }

}
