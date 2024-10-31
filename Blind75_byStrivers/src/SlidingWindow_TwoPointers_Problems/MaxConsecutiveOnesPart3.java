package SlidingWindow_TwoPointers_Problems;

public class MaxConsecutiveOnesPart3 {

	public static int longestOnes(int[] nums, int k) {
		int n = nums.length;
		int left=0,right=0;
		int noOfZeros = 0;
		int length ,maxLength = 0;
		
		while(right < n){
			
			if(nums[right] == 0){
				noOfZeros++;
			}
			while(noOfZeros > k){
				if(nums[left] == 0)  {
					noOfZeros--;
				}
				left++;
			}
			if(noOfZeros<=k){
				length = right-left+1;
				maxLength = Math.max(length, maxLength);	
			}
			right++;
		}
		return maxLength;

	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
		
		System.out.println("Longest possible string with 1 is "+longestOnes(arr,2));
	}
}
