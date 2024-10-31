package SlidingWindow_TwoPointers_Problems;

public class BinarySubArrayWithSum {

	public static int countSubArrayWithSum(int[] arr, int goal) {

		if (goal < 0)
			return 0; // This edge case is becoz we are calling (goal -1) also

		int left = 0, right = 0, cnt = 0, sum = 0;

		while (right < arr.length) {

			sum = sum + arr[right];

			// We need to shrink the window when sum > goal by moving left
			// pointer by 1 position ahead
			while (sum > goal) {
				sum = sum - arr[left];
				left = left + 1;
			}
			cnt = cnt + (right - left + 1);
			right = right + 1;
		}

		return cnt;
	}

	public static void main(String[] args) {
		int goal =2;
		int arr[] = {1,0,0,1,1,0};
		int ans = countSubArrayWithSum(arr,goal) - countSubArrayWithSum(arr,goal-1);
		System.out.println("Count is "+ans);
	}
}
