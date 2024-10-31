package GridUniquePaths_2_DPonGrids;

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

	public static int mazeObstaclesUtil(int i, int j,int[][] maze, int[][] dp) {

		// Base condition
		
		//for all valid values of i and j we encounter a cell that contains -1 then we need to stop
				if(i>=0 && j>=0 && maze[i][j]==-1) return 0;
				
		
		if (i == 0 && j == 0)
			return 1;

		if (i < 0 || j < 0)
			return 0;

		if (dp[i][j] != -1)
			return dp[i][j]; // If value is already calculated then use that value
								

		int up = mazeObstaclesUtil(i - 1, j,maze, dp);

		int left = mazeObstaclesUtil(i, j - 1,maze, dp);

		return dp[i][j] = up + left;

	}

	static int mazeObstacles(int m, int n,int[][] maze) {
		int dp[][] = new int[m][n];
		for (int[] row : dp)
			Arrays.fill(row, -1);
		return mazeObstaclesUtil(m - 1, n - 1,maze, dp);
	}

	public static void main(String args[]) {
		
		int[][] maze = {
	            {0, 0, 0},
	            {0, -1, 0},
	            {0, 0, 0}
	        };

	        int m = maze.length;
	        int n = maze[0].length;

		System.out.println("No Of ways to reach from (0,0) to (2,2) in 2-D Matrix is : "+mazeObstacles(m, n,maze));
		//m is row , n is column

	}
}
