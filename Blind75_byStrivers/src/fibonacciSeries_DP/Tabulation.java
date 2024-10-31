package fibonacciSeries_DP;

public class Tabulation {
	
	
	public static void main(String[] args) {
		//declare dp array with size n+1 that is 7+1 = 8
		int dp[] = new int[8];
		//Initialize dp array with -1
		for(int i=0;i<dp.length-1;i++){
			dp[i]=-1;
		}
		dp[0]=0;
		dp[1]=1;
		for(int i= 2;i<7;i++){
			dp[i] = dp[i-2]+dp[i-1];
			System.out.println(dp[i]);

		}
	}
}
