package MinimumPathSum_In_Grid_DPonGrids;

import java.util.Arrays;
//SC->Recursive Stack space TC->2^n

//Express in terms of index
//Find all possible cases
//Find Base case to terminate the recursion
public class RecursiveApproach {

	public static void main(String args[]) {
		int matrix[][] = { { 5, 9, 6 }, { 11, 5, 2 } };

		int m = matrix.length;
		int n = matrix[0].length;

		// Calculate and print the minimum sum path in the matrix
		System.out.println(minSumPath(m, n, matrix));
		// m is row , n is column
	}

	public static int minSumPath(int m, int n, int[][] matrix) {
		return minSumPathUtil(m - 1, n - 1, matrix); // We will start at end
														// position (2,2) and go
														// till (0,0)

	}

	//
	public static int minSumPathUtil(int i, int j, int[][] matrix) {

		// Step 1 ; Base Case

		// When i=0 and j=0, that is we have reached the destination so we can
		// count the current path that is going on,
		// hence we return the matrix element at that position.
		// When i<0 and j<0, it means that we have crossed the boundary of the
		// matrix and
		// we dont want this path to return min value hence we assign max value
		// to it.
		if (i == 0 && j == 0)
			return matrix[0][0];

		if (i < 0 || j < 0)
			return (int) Math.pow(10, 9);
		// As we are writing a top-down recursion, at every index we have two
		// choices,
		// one to go up(â†‘) and the other to go left(â†?).
		// To go upwards, we will take that matrix element in the sum reduce i
		// by 1,
		// and move towards left we will reduce j by 1.

		// And as we need to calculate min sum , we will take min of up and left

		int up = matrix[i][j] + minSumPathUtil(i - 1, j, matrix);

		int left = matrix[i][j] + minSumPathUtil(i, j - 1, matrix);

		return Integer.min(up, left);

	}

}
