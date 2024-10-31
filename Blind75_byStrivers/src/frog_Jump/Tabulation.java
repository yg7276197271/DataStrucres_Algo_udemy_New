package frog_Jump;

import java.util.*;

class Tabulation {
	// This function uses dynamic programming to find the maximum possible sum
	// of non-adjacent elements.
	static int solveUtil(int n, int[] arr, int[] dp) {
		// Initialize the dp array with the first element of the input array.
		dp[0] = arr[0];

		// Iterate through the input array to fill the dp array.
		for (int i = 1; i < n; i++) {
			// Calculate the maximum sum by either picking the current element
			// or not picking it.
			int pick = arr[i];

			// If there are at least two elements before the current element,
			// add the value from dp[i-2].
			if (i > 1)
				pick += dp[i - 2];

			// The non-pick option is to use the maximum sum from the previous
			// element.
			int nonPick = dp[i - 1];

			// Store the maximum of the two options in the dp array for the
			// current index.
			dp[i] = Math.max(pick, nonPick);
		}

		// The final element of the dp array contains the maximum possible sum.
		return dp[n - 1];
	}

	// This function initializes the dp array and calls the solver function.
	static int solve(int n, int[] arr) {
		int dp[] = new int[n];

		// Initialize the dp array with -1 to indicate that values are not
		// calculated yet.
		Arrays.fill(dp, -1);

		// Call the solver function to find the maximum possible sum.
		return solveUtil(n, arr, dp);
	}

	public static void main(String args[]) {
		// Input array with elements.
		int arr[] = { 2, 1, 4, 9 };

		// Get the length of the array.
		int n = arr.length;

		// Call the solve function to find the maximum possible sum.
		int result = solve(n, arr);

		// Print the result.
		System.out.println(result);
	}
}
