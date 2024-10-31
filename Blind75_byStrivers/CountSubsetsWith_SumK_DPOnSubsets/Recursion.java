package CountSubsetsWith_SumK_DPOnSubsets;

import java.util.Arrays;
import java.util.*;

public class Recursion {
	//Represent in terms of index
	// f(index , target) => till index in how many no of ways we can  form a target
	//Value of index will range from n-1 to 0
	//And target is sum what is given in problem.
	//We will be starting from last index of an array 
	//At every step we have two options : take or Not take
	//If we take a particular element then reduce the target and index
	//If we do not take an element then reduce only index
	//Go till index 0
	//And in every count problem , at base cases we return either 0 or 1
	//and we sum up take and not take options
	
	// Helper function to find the number of ways to achieve a target sum
    static int findWaysUtil(int ind, int target, int[] arr) {
		
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
    	
    	//Explore other ways
    	//If we dont pick element we will move one step back in array
    	int notTake = findWaysUtil(ind-1,target,arr);
    	
    	//If we  pick element we will move one step back in array and sum will also reduced
    	//You can take the element only if that element is less than or equal to target
    	int take = 0;
    	if(arr[ind] <= target){
       	 	take =findWaysUtil(ind-1,target-arr[ind],arr);
    	}
    	
    	return notTake + take;
	}

	// Main function to find the number of ways to form subsets with a target sum
    static int findWays(int[] num, int k) {
        int n = num.length;

        return findWaysUtil(n - 1, k, num);
    }
	public static void main(String args[]) {
        int arr[] = {1, 2, 2, 3};
        int k = 3; //Target 

        // Calculate and print the number of subsets that sum up to k
        System.out.println("The number of subsets found are " + findWays(arr, k));
    }

}
