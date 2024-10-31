package MinimumFallingPathSum_DPonGrids;

import java.util.Arrays;

//Recursion/Memoization is a top-down approach whereas tabulation is a bottom-up approach. 	
//As in recursion/memoization, we have moved from N-1 to 0, 
//in tabulation we move from 0 to N-1, i.e the first row to last row
public class Tabulation {

	public static void main(String args[]) {
        int matrix[][] = {{1, 2, 10, 4},
                          {100, 3, 2, 1},
                          {1, 1, 20, 2},
                          {1, 2, 2, 1}};

    	int n = matrix.length;
    	int m = matrix[0].length;
    	 int dp[][] = new int[n][m];
    	 
    	// Step 1 : Base Case
    	 //First row will be having i value as 0
    	 //So we need to fill j value from matrix
    	 
    	 for(int j=0;j<=m-1;j++){
    		 dp[0][j] = matrix[0][j];
    	 }
    	 
    	 //step 2 : 
    	 
         // Calculate the maximum path sum for each cell in the matrix
    	 //i = 0 is already calculated so i value will start from 1
    	 //for every i value j will start from column 0 to column m-1
    	 
    	 for(int i = 1;i<=n-1 ;i++){
    		 
    		 for(int j=0;j<=m-1;j++){
    			 
    			 int up = matrix[i][j] + dp[i-1][j];
    			 
 				//When we are moving diagonally left , we should not cross 0 boundary

    			 int digonallyLeft = matrix[i][j];
    			 	if(j-1 >= 0){
       		 		 digonallyLeft +=  dp[i-1][j-1];
    			 	}
    			 	else {
        			 	digonallyLeft += (int) Math.pow(-10, 9);
    			 	}
    				int digonallyRight = matrix[i][j];
    				//When we are moving diagonally right , we should not cross m-1 boundary
    				if(j+1 <=m-1){
        		 		 digonallyRight += dp[i-1][j+1];
    				}else{
    					digonallyRight += (int) Math.pow(-10, 9);
    				}

    		 		dp[i][j] = Math.max(up,Math.max(digonallyLeft, digonallyRight));
    		 }
    	 }
    
    	 //So now dp array is entirely filled 
    	 //so we started from row 0 to row n-1
    	 //so we need to find out max value stored in row n-1
    	 int maxi=Integer.MIN_VALUE;
    	 for(int j=0;j<=m-1;j++){
    		  maxi = Math.max(maxi, dp[n-1][j]);
    	 }
    	 System.out.println(maxi);
    }

}
