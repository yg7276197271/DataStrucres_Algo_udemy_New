package MinimumFallingPathSum_DPonGrids;

import java.util.Arrays;
//SC->Recursive Stack space TC->2^n

//Express in terms of index
//Find all possible cases
//Find Base case to terminate the recursion
public class RecursiveApproach {

	public static void main(String args[]) {
        int matrix[][] = {{1, 2, 10, 4},
                          {100, 3, 2, 1},
                          {1, 1, 20, 2},
                          {1, 2, 2, 1}};

        // Call the getMaxPathSum function and print the result
        System.out.println(getMaxPathSum(matrix));
    }

    // Function to find the maximum path sum in the matrix
	    static int getMaxPathSum(int[][] matrix) {
	       
	    	int n = matrix.length;
	    	int m = matrix[0].length;
	    	
	    	//We can start from any index on last row and can reach to any cell on first row
	    	//which ever path will give us max result that will be our answer
	    	//so we need to call recursion from every index of last row
	    	int maxi = Integer.MIN_VALUE;
	    	for(int j=0;j<=m-1;j++){
		        // Call the utility function to find the max path sum starting from the last row 

	    		int ans  = getMaxPathSumUtil(n-1,j,m,matrix);
	            maxi = Math.max(maxi, ans);
	    		//n => row m=> column
	    		
	    	}
	    	return maxi;
	    }
	//
	public static int getMaxPathSumUtil(int i, int j, int m ,int[][] matrix) {

		// Step 1 : Base Case
		
		//Here we are starting from last row and reaching to first row any cell .
		
		//We are moving from top to down in 3 directions 
		//below , diagonally left , diagonally right
		if(j<0 || j>=m) 
			return (int) Math.pow(-10, 9);
				
		//i => row j=> column
		if(i == 0)
			return matrix[0][j];
		
		
		//We are moving up in 3 directions
		int up = matrix[i][j] + getMaxPathSumUtil(i-1,j,m,matrix);
	
		int digonallyLeft = matrix[i][j] + getMaxPathSumUtil(i-1,j-1,m,matrix);
				
		int digonallyRight = matrix[i][j] + getMaxPathSumUtil(i-1,j+1,m,matrix);

		return Math.max(up,Math.max(digonallyLeft, digonallyRight));

	}

}
