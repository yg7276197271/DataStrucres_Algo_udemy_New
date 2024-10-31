package SlidingWindow_TwoPointers_Problems;

//This problem is exactly same as BinarrySub array with sum
public class CountNoOfNiceSubArrays {

	public static int numberOfSubarrays(int[] nums, int k) {
		int ans = countSubArrayWithSum(nums, k) - countSubArrayWithSum(nums, k - 1);
		return ans;
	}

	public static int countSubArrayWithSum(int[] arr, int goal) {

		if (goal < 0)
			return 0; // This edge case is becoz we are calling (goal -1) also

		int left = 0, right = 0, cnt = 0, sum = 0;

		while (right < arr.length) {

			sum = sum + arr[right] % 2; //this will give odd or even

			// We need to shrink the window when sum > goal by moving left
			// pointer by 1 position ahead
			while (sum > goal) {
				sum = sum - arr[left] % 2; //this will give odd or even
				left = left + 1;
			}
			cnt = cnt + (right - left + 1);
			right = right + 1;
		}

		return cnt;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,2,1,1};
		int goal = 3;
		System.out.println("Count is "+numberOfSubarrays(arr,goal));
	}

}
