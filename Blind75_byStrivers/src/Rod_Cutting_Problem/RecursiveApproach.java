package Rod_Cutting_Problem;

//Try to pick rod lengths and sum that up to N.
//Once you pick the rod length add its value to answer
public class RecursiveApproach {
	static int cutRodUntil(int ind, int N,int[] cuts) {
		// Base case
		//Here we can take rod of length 1 ,N no of times
		if (ind == 0) {
			return ((int) (N) * cuts[0]);
		}
		int notTaken = 0 + cutRodUntil(ind-1,N,cuts);
		int taken = Integer.MIN_VALUE;
		
		int rodLength = ind+1;
		//When we cut the rod we have to subtract it from rod length to calculate remaining rod length.
		if (rodLength <= N)
			taken = cuts[ind] + cutRodUntil(ind,N-rodLength,cuts); 
		//Stay on same index as we can pick same index multiple time
		//It means we can have rod of length 2 , two times
		//And rod of length 1 , one time
		//So total rod length is 5 and value is 12 = 5+5+2
		
		return  Math.max(notTaken, taken);
	}

	static int minCost(int N, int[] cuts) {
		
		return cutRodUntil(N-1,N,cuts);
	}

	public static void main(String args[]) {
		int val[] = { 2,5,7,8,10 }; 
		//index = 0 1 2 3 4
		//Rod Length = 1 2 3 4 5 
		//Rod length = index +1
		int N = 5;

		System.out.println("Cut Rod until " + minCost(N, val));
	}
}
