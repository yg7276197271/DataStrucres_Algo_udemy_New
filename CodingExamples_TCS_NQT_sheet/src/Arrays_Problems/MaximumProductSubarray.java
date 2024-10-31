package Arrays_Problems;

//Observations
//1. all positive nos
//2.even negative => product + ve
//3.odd negative => product -ve
//4. zero => need to ignore zero

//Approach: 
//Iteration from left to right once to get maximum product for forward direction.
//If zero is encountered, we set all variables again to initial value. i.e 1
//Iteration from right to left once again to get maximum product for backward direction.
////If zero is encountered, we set all variables again to zero to find a new subarray with maximum product.
//Once both iterations are completed, the overall result for the maximum product subarray 
//of the given array is the maximum product obtained from both the iterations. 
//We can achieve prefix and suffix sum in one iteration as well as written below
public class MaximumProductSubarray {

	static int maxProductSubArray(int arr[]) {
		int n = arr.length;
		int pre = 1, suffix = 1;
		int maxi = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (pre == 0)
				pre = 1;
			if (suffix == 0)
				suffix = 1;
			pre = pre * arr[i];
			suffix = suffix * arr[n - i - 1];

			maxi = Integer.max(maxi , Integer.max(pre, suffix));
		}

		return maxi;

	}

	public static void main(String[] args) {
		/*int nums[] = { 1, 2, -3, 0, -4, -5 };
		int answer = maxProductSubArray(nums);
		System.out.print("The maximum product subarray is: " + answer);*/
		
		
		int nums1[] = {-2, 3, 4, -1, 0, -2, 3, 1, 4, 0, 4, 6, -1, 4};
		int answer1 = maxProductSubArray(nums1);
		System.out.print("The maximum product subarray is: " + answer1);
	}
}
