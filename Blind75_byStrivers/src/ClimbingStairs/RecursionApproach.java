package ClimbingStairs;

public class RecursionApproach {
	public static void main(String[] args) {
		System.out.println("No of distinct ways are  "+climbStairs(4));
	}
	public static int climbStairs(int n ){
		int totalCount = distinctWaystoClimbStairs(n);
		return totalCount;
		
	}
	//start from last step and we have to reach to ground level
	public static int distinctWaystoClimbStairs(int index) {
		
		//Base Case:
		//If you are at 1st step then you can jump by 1 then index can be 0
		//If you are at 1st step and you jump by 2 then index can go negative
		
		if(index<0) return 0;
		if(index==0) return 1;
		
		return distinctWaystoClimbStairs(index-1) + distinctWaystoClimbStairs(index-2);
		
	}
	//start from last step and we have to reach to ground level
	@SuppressWarnings("unused")
	private int distinctWaystoClimbStairs(int index,int[] stairsCount) {
		
		//Base Case:
		//If you are at 1st step then you can jump by 1 then index can be 0
		//If you are at 1st step and you jump by 2 then index can go negative
		
		if(index<0) return 0;
		else if(index==0) return 1;
		else if (stairsCount[index]>0) return stairsCount[index];
		return stairsCount[index] = distinctWaystoClimbStairs(index-1,stairsCount) + distinctWaystoClimbStairs(index-2,stairsCount);
		
	}
	
}
