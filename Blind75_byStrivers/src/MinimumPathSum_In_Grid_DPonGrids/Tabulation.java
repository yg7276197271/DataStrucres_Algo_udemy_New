package MinimumPathSum_In_Grid_DPonGrids;

import java.util.Arrays;

public class Tabulation {
	// Tabulation is Bottom Up Approach .You start from Base case and then go up
	// Whereas in Recursion is Top Down. Top guy will get answer by going down
	// Step 1 : Declare Base Case
	// Step 2 : express all states in for loops
	// Step 3: Copy the recurrence and write
	// TC -> O(m*n) SC-> O(m*n) no recursion stack space
	public static int minSumPathUtil(int m, int n, int[][] matrix, int[][] dp) {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// Write Base Case

				if (i == 0 && j == 0) {
                    dp[i][j] = matrix[i][j]; // If we're at the top-left cell, the minimum sum is its value
					
				} else {
					// Copy recursion
					int up = 0;
					int left = 0;
					up = matrix[i][j];
					if (i > 0) {
						up += dp[i - 1][j]; // Add the value from above if it's not out of bounds

					} else {
						up += (int) Math.pow(10, 9); // Add a large value if out of bounds in the up direction
					}
					left = matrix[i][j];
					if (j > 0) {
						left += dp[i][j - 1]; // Add the value from left if it's not out of bounds

					} else {
						left += (int) Math.pow(10, 9); // Add a large value if out of bounds in the left direction
					}

					dp[i][j] = Integer.min(up, left);
				}

			}
		}
		// Return last element
		return dp[m - 1][n - 1];

	}

	static int minSumPath(int m, int n, int[][] matrix) {
		int dp[][] = new int[m][n];
		for (int[] row : dp)
			Arrays.fill(row, -1);
		return minSumPathUtil(m, n, matrix, dp);
	}

	public static void main(String args[]) {

		int matrix[][] = { { 5, 9, 6 }, { 11, 5, 2 } };

		int m = matrix.length;
		int n = matrix[0].length;

		// Calculate and print the minimum sum path in the matrix
		System.out.println(minSumPath(m, n, matrix));
		// m is row , n is column

	}
}
