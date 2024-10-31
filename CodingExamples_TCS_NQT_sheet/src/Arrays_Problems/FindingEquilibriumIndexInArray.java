package Arrays_Problems;
//An equilibrium Index is an index at which sum of elements on its left is equal to the sum of element on its right
//That is, nums[0] + nums[1] + … + nums[equilibriumIndex-1] == nums[equilibriumIndex+1] + nums[equilibriumIndex+2] + … + nums[nums.length-1]. 
//If equilibriumIndex == 0, the left side sum is considered to be 0. 
//Similarly, if equilibriumIndex == nums.length – 1, the right side sum is considered to be 0.

/*
Example 1:
Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4

Example 2:
Input: nums = [1,-1,4]
Output: 2
Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
The sum of the numbers after index 2 is: 0*/

//Algorithm :
//Calculate the sum = total sum of all the integers in the array.
//Keep leftSum = 0, rightSum = sum.
//leftSum = sum of all the integers to its left 
//rightSum = sum of all the integers to it’s right.

//At every index i rightSum would be rightSum excluding the current index value.
//now we will is Check if(leftSum == rightSum) 

//If yes then return that index else keep moving forward.
//while moving forward it can be seen that we are considering that current index value to be on left so update 
//the leftSum value. leftSum = leftSum + nums[i].

public class FindingEquilibriumIndexInArray {
	  public static int findEquilibriumIdx(int nums[], int n) {
		  int sum = 0;
		  for(int i=0 ; i < n;i ++){
			  sum += nums[i];
		  }
		  int rightSum = sum;
		  int leftSum=0;
		  for(int i=0;i<n;i++){
			  rightSum = rightSum - nums[i]; //16 - 2 = 14 11 12 4
			  if (leftSum == rightSum) {
			        return i;//3
			      }
			  leftSum = leftSum+ nums[i]; //2 5 4
		  }
		    return -1;

	  }
	 public static void main(String[] args) {
		    int n = 5;
		    int nums[] = {2, 3, -1, 8, 4};
		    int equilibriumidx = findEquilibriumIdx(nums, n);
		    System.out.println(equilibriumidx);
		 
		  }
}
