package SubSetSum_EqualTo_Target;

import java.util.Arrays;
import java.util.*;

public class Recursion {
	//Represent in terms of index
	// f(index , target) => till index can we form a target
	//Value of index will range from n-1 to 0
	//And target is what is given in problem.
	//We will be starting from last index of an array
	//At every step we have two options : take or Not take
	//If we take a particular element then reduce the target and index
	//If we do not take an element then reduce only index
	//Go till index 0
	
	static boolean subsetSumUtil(int ind, int target, int[] arr) { // If the target sum is achieved, return true
       //At any point when target is zero we have to stop
		if (target == 0)
            return true;

        // If we have considered all elements but haven't reached the target, return false
		//or in other words if we are at index 0 we can return true if arr[0] == target
		//else return false.
        if (ind == 0)
            return arr[0] == target;

        // If we don't take element move one step down the array
        boolean notTaken = subsetSumUtil(ind - 1, target, arr);

        //If we take the element then target will get reduced and also we need to move one step back
        //We can only take the element if it is less than or equal to target.
        boolean taken = false;
        if (arr[ind] <= target)
            taken = subsetSumUtil(ind - 1, target - arr[ind], arr);

        //return the OR of both. 
        return notTaken || taken;
        }

	// Main function to check if there exists a subset with a given target sum
	static boolean subsetSumToK(int n, int k, int[] arr) {

		// Call the recursive helper function
		return subsetSumUtil(n - 1, k, arr);
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4 };
		int k = 4;
		int n = arr.length;

		// Check if there exists a subset with the given target sum
		if (subsetSumToK(n, k, arr))
			System.out.println("Subset with the given target found");
		else
			System.out.println("Subset with the given target not found");
	}

}
