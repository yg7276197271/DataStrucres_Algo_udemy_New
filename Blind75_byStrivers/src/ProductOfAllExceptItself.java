
import java.util.*;

//input : [1,2,3,4]
//output: [24,12,8,6]

//algo:
//Left Array: 1, 2, 6, 24  => element at index 1 is element[0] * element[1]
//Right Array: 24 ,24 ,12, 4  => element at index n-2 = element[n-1] * element[n-2]
//output : element at index 1 is multiplication of index0 of left array and index 2 of right array
public class ProductOfAllExceptItself {

	public static void main(String[] args) {
		int[] input = {1,2,3,4};
		int[] output = productExcludingEslfNumber(input);
		for(int i : output)
		System.out.println(i);
	}
	public static int[] productExcludingEslfNumber(int[] nums) {
		int[] leftNums = new int[nums.length];
		int[] rightNums = new int[nums.length];

		leftNums[0] = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			leftNums[i] = leftNums[i - 1] * nums[i];
		}
		
		rightNums[nums.length - 1] = nums[nums.length - 1];
		
		for (int i = nums.length - 2; i >= 0; i--) {
			rightNums[i] = rightNums[i + 1] * nums[i];
		}
		int[] output = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				output[i] = rightNums[i + 1];

			} else if (i == nums.length - 1) {
				output[i] = leftNums[i - 1];
			} else {
				output[i] = leftNums[i - 1] * rightNums[i + 1];
			}
		}
		return output;
	}
}
