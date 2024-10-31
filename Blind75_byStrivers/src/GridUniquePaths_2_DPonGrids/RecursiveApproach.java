package GridUniquePaths_2_DPonGrids;

import java.util.Arrays;
//SC->Recursive Stack space TC->2^n

//Express in terms of index
//Find all possible cases
//Find Base case to terminate the recursion
public class RecursiveApproach {

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

	public static int mazeObstacles(int m, int n,int[][] maze) {
		return mazeObstaclesUtil(m - 1, n - 1,maze); //We will start at end position (2,2) and go till (0,0)

	}
	//
	public static int mazeObstaclesUtil(int i, int j,int[][] maze) {
		
		//Step 1 ; Base Case
		//for all valid values of i and j we encounter a cell that contains -1 then we need to stop
		if(i>=0 && j>=0 && maze[i][j]==-1) return 0;
		
		//When i=0 and j=0, that is we have reached the destination so we can count the current path that is going on, hence we return 1.
		//When i<0 and j<0, it means that we have crossed the boundary of the matrix and we couldn’t find a right path, hence we return 0
		if(i==0 && j==0) return 1; 
		
		if(i<0 || j<0) return 0;
		//As we are writing a top-down recursion, at every index we have two choices,
		//one to go up(↑) and the other to go left(�?). 
		//To go upwards, we will reduce i by 1, and move towards left we will reduce j by 1.
		
		int up =  mazeObstaclesUtil(i-1,j,maze);
		
		int left = mazeObstaclesUtil(i,j-1,maze);
		
		return up + left;

	}
	
	

}
