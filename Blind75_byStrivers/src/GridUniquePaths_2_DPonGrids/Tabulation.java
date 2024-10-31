package GridUniquePaths_2_DPonGrids;

import java.util.Arrays;

public class Tabulation {
	//Tabulation is Bottom Up Approach .You start from Base case and then go up
	//Whereas in Recursion is Top Down. Top guy will get answer by going down
	//Step 1 : Declare Base Case
	//Step 2 : express all states in for loops
	//Step 3: Copy the recurrence and write
	//TC -> O(m*n)  SC-> O(m*n) no recursion stack space
	public static int mazeObstaclesUtil(int m, int n,int[][] maze, int[][] dp) {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				//Write Base Case
				
				//for all valid values of i and j we encounter a cell that contains -1 then we need to stop
				if(i > 0 && j > 0 & maze[i][j]==-1){
					dp[i][j] = 0;
					continue;
				};
				
				if (i == 0 && j == 0) {
					dp[i][j] = 1;
					continue;
				}
				//Copy recursion
				int up = 0;
				int left = 0;

				if (i > 0)
					up = dp[i - 1][j]; // i-1 can go negative
				if (j > 0)
					left = dp[i][j - 1]; // j-1 can go negative

				dp[i][j] = up + left;
			}
		}
		//Return last element
		return dp[m - 1][n - 1];

	}

	static int mazeObstacles(int m, int n,int[][] maze) {
		int dp[][] = new int[m][n];
		for (int[] row : dp)
			Arrays.fill(row, -1);
		return mazeObstaclesUtil(m, n, maze , dp);
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
