package fibonacciSeries_DP;

public class Memoization {
	
	public static int  fibonaciSeries(int index,int[] dp){
		if(index <=1 ) return index; //base case
		if(dp[index] !=-1) return dp[index]; //this is for overlapping subproblem
		return dp[index] =  fibonaciSeries(index-1,dp) + fibonaciSeries(index-2,dp);
		
	}
	
	public static void main(String[] args) {
		//declare dp array with size n+1 that is 7+1 = 8
		int dp[] = new int[8];
		//Initialize dp array with -1
		for(int i=0;i<dp.length-1;i++){
			dp[i]=-1;
		}
		for(int i= 0;i<7;i++){
			System.out.println(fibonaciSeries(i,dp));
		}
	}
}
