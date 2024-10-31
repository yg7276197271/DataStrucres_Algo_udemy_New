package Ninja_Training_DP;

import java.util.Arrays;

public class Memoization {
	public static void main(String args[]) {

		// Define the points for each activity on each day
						  //t0 t1 t2
        int[][] points = {{10, 40, 70}, //Day 0
                          {20, 50, 80}, //Day 1
                          {30, 60, 90}};//Day 2

        int n = points.length; // Get the number of days
        System.out.println(ninjaTraining(n, points)); // Calculate and print the maximum points
		}
		
	public static int ninjaTraining(int n ,int[][] points){
		// Initialize a memoization table with -1 values
        int dp[][] = new int[n][4]; //4 is no of task -> t0 t1 t2 and one more which is for last step
        for (int[] row : dp)
            Arrays.fill(row, -1);
		//when we are last row then we dont have any last task.
		//so we consider it as 3
		int totalCount = findMaxPointsEarned(n-1,3,points,dp);
		return totalCount;
		
	}
	//start from last row of points array and we have to reach to 0th row
	public static int findMaxPointsEarned(int day,int last ,int[][] points,int dp[][]) {
		
		//Base Case:
		//when we are at 0th row then we first need to check what was the last task picked 
		//And then we need to take the maximum task from 0th row apart from last picked task
		if(day==0){
			int max0=0;
			for(int task=0;task<3;task++){
				if(points[0][task] != last){
					max0=Math.max(max0,points[0][task]);
				}
			}
			return dp[day][last] = max0;
		}
		
		if(dp[day][last]!=-1) return dp[day][last];
		
		int maxi=0;
		for(int task=0;task<3;task++){
			
			if(task!=last){
				
				int point = points[day][task] + findMaxPointsEarned(day-1,task,points,dp);
				 maxi = Math.max(maxi,point);
			}
		}
		return dp[day][last] = maxi;
		
	}
	
	
}
