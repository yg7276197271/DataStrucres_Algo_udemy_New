package MinimumPathSum_In_TriangulerGrid_DPonGrids;

import java.util.Arrays;
//SC->Recursive Stack space TC->2^n

//Express in terms of index
//Find all possible cases
//Find Base case to terminate the recursion
public class RecursiveApproach {

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
	       

	        // Call the utility function to find the minimum path sum starting from the top
	        return minimumPathSumUtil(0, 0, triangle, n);
	    }
	//
	public static int minimumPathSumUtil(int i, int j, int[][] triangle,int n) {

		// Step 1 : Base Case
		//Here we are starting from oth index and will move in trainguler shape
		//and when we reach last row then we need to stop
		//So i will be n-1 and j values can vary
		
		if(i == n-1){
			return triangle[n-1][j];
		}

		//Either we can move down or diagonally
		//If we move down i will be +1 and j will be same .as j is column
		int down = triangle[i][j] + minimumPathSumUtil(i+1,j,triangle,n);
		
		//If we move diagonal i will be +1 and j will +1  .as i is row & j is column

		int diagonal = triangle[i][j] + minimumPathSumUtil(i+1,j+1,triangle,n);

		return Integer.min(down,diagonal);

	}

}
