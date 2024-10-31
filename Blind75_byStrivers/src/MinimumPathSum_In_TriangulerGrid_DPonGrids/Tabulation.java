package MinimumPathSum_In_TriangulerGrid_DPonGrids;

import java.util.Arrays;

//Recursion/Memoization is a top-down approach whereas tabulation is a bottom-up approach. 	
//As in recursion/memoization, we have moved from 0 to N-1, 
//in tabulation we move from N-1 to 0, i.e the last row to the first one.
public class Tabulation {// Function to find the minimum path sum in the triangle using dynamic programming
    static int minimumPathSum(int[][] triangle, int n) {
        // Create a 2D array to store intermediate results
        int dp[][] = new int[n][n];
        //Base Case 
        //Last row of dp array  we need to fill out with proper values of triangle array
        //For Last row i is fixed which is n-1
        //j will vary from 0 to n-1
        
        for(int j = 0;j<n;j++){
        	dp[n-1][j] = triangle[n-1][j];
        }
        
        //then we have to move from n-2 row till the 0th row
        //And for every row we need to fill column values 
        //We need to fill traingular shaped matrix
        //We have to think in a way that how many values of j we have for every i
        //so for 0th row , i = 0 and there will be 0 column
        //for 1st row , i = 1 and there are 0,1 column values 
        //for 2nd row , i = 2 and there are 0,1,2 column values 
        //for n-1 row , i = n-1 and there are 0 to n-1 column values 
        
        for(int i = n-2;i>=0;i--){
        	for(int j=i ;j>=0;j--){
        		int down = triangle[i][j] + dp[i+1][j];
        		int diagonal = triangle[i][j] + dp[i+1][j+1];
        		 dp[i][j] = Integer.min(down,diagonal);
        	}
        }
        

        // The result is stored at the top of dp array
      return dp[0][0];
    }

    public static void main(String args[]) {
        int triangle[][] = {{1},
                            {2, 3},
                            {3, 6, 7},
                            {8, 9, 6, 10}};

        int n = triangle.length;

        // Call the minimumPathSum function and print the result
        System.out.println(minimumPathSum(triangle, n));
    }}
