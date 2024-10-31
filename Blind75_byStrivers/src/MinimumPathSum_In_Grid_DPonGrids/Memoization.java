package MinimumPathSum_In_Grid_DPonGrids;

import java.util.Arrays;

//Dynamic programming is possible in case of overlapping subproblems
//If we check the recursion tree then we can see the overlapping states.
//Create a dp array of size [m][n]
//Whenever we want to find the answer of a particular row and column (say f(i,j)),
//we first check whether the answer is already calculated using the dp array(i.e dp[i][j]!= -1 ). 
//If yes, simply return the value from the dp array.
//If not, then we are finding the answer for the given values for the first time, 
//we will use the recursive relation as usual but before returning from the function, 
//we will set dp[i][j] to the solution we get. to compute its value.
//TC -> O(n*m) SC-> O(n-1) + (m-1)) + O(n*m)
public class Memoization {

	public static int minSumPathUtil(int i, int j, int[][] matrix, int[][] dp) {

		// Base condition

		if (i == 0 && j == 0)
			return matrix[0][0];

		if (i < 0 || j < 0)
			return (int) Math.pow(10, 9);;

		if (dp[i][j] != -1)
			return dp[i][j]; // If value is already calculated then use that value
								

		int up = matrix[i][j]+ minSumPathUtil(i - 1, j, matrix, dp);

		int left = matrix[i][j]+ minSumPathUtil(i, j - 1, matrix, dp);

		return dp[i][j] = Integer.min(up , left);

	}

	static int minSumPath(int m, int n, int[][] matrix) {
		int dp[][] = new int[m][n];
		for (int[] row : dp)
			Arrays.fill(row, -1);
		return minSumPathUtil(m - 1, n - 1, matrix, dp);
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
