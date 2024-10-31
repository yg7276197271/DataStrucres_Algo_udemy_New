package MinimumPathSum_In_TriangulerGrid_DPonGrids;

import java.util.Arrays;


public class Memoization {

	 public static void main(String args[]) {
	        int triangle[][] = {{1},
	                            {2, 3},
	                            {3, 6, 7},
	                            {8, 9, 6, 10}};

	        int n = triangle.length;

	        // Call the minimumPathSum function and print the result
	        System.out.println(minimumPathSum(triangle, n));
	    }

	// Function to find the minimum path sum in the triangle
	    static int minimumPathSum(int[][] triangle, int n) {
	       
	    	// Create a 2D array to store computed results, initialize with -1
	        int dp[][] = new int[n][n];
	        for (int row[] : dp)
	            Arrays.fill(row, -1);
	        // Call the utility function to find the minimum path sum starting from the top
	        return minimumPathSumUtil(0, 0, triangle, n,dp);
	    }
	//
	public static int minimumPathSumUtil(int i, int j, int[][] triangle,int n,int dp[][]) {

		// Step 1 : Base Case
		//Here we are starting from oth index and will move in trainguler shape
		//and when we reach last row then we need to stop
		//So i will be n-1 and j values can vary
		
		if(i == n-1){
			return triangle[n-1][j];
		}

		if(dp[i][j] !=-1) return dp[i][j];
		//Either we can move down or diagonally
		//If we move down i will be +1 and j will be same .as j is column
		int down = triangle[i][j] + minimumPathSumUtil(i+1,j,triangle,n,dp);
		
		//If we move diagonal i will be +1 and j will +1  .as i is row & j is column

		int diagonal = triangle[i][j] + minimumPathSumUtil(i+1,j+1,triangle,n,dp);

		return dp[i][j] = Integer.min(down,diagonal);

	}

}
