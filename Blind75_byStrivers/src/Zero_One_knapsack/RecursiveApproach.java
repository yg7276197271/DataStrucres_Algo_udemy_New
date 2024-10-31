package Zero_One_knapsack;

import java.util.Arrays;

public class RecursiveApproach {
	static int knapsackUtil(int[] wt, int[] val, int ind, int W) {

	      // Base case: If there are no items or the knapsack capacity is zero
        if (ind == 0) {
            if (wt[0] <= W) {
                // Include the item if its weight is within the capacity
                return val[0];
            } else {
                // Otherwise, exclude the item
                return 0;
            }
        }

        // Calculate the maximum value when the current item is not taken
        int notTaken = 0 + knapsackUtil(wt, val, ind - 1, W);

        // Calculate the maximum value when the current item is taken
        int taken = Integer.MIN_VALUE;
        if (wt[ind] <= W) {
            taken = val[ind] + knapsackUtil(wt, val, ind - 1, W - wt[ind]);
        }

        return Math.max(notTaken, taken);
     
		
	}

	static int knapsack(int[] wt, int[] val, int n, int W) {

		// Call the recursive knapsackUtil function to solve the problem starting from last index
		return knapsackUtil(wt, val, n - 1, W);

	}
}