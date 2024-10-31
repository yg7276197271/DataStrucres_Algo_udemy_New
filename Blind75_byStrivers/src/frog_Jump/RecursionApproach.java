package frog_Jump;

public class RecursionApproach {
	public static void main(String args[]) {

		  int height[]={30,10,60 ,10 ,60 ,50};
		  int n=height.length;
		  System.out.println(frogJump(n-1,height));
		}
		
	public static int frogJump(int n ,int[] height){
		int totalCount = distinctWaystoJump(n,height);
		return totalCount;
		
	}
	//start from last step and we have to reach to ground level
	public static int distinctWaystoJump(int index,int[] height) {
		
		//Base Case:
		// we are jumping from 0th step to 0th step. So cost will be zero
		
		if(index==0) return 0; // we are jumping from 0th step to 0th step. So cost will be zero
		
		int jumpBy1Step = distinctWaystoJump(index-1,height) + Math.abs(height[index] - height[index-1]);
		int jumpBy2Step=Integer.MAX_VALUE;
		//If we are at first step we can jump only by 1 step not by 2 steps 
		if(index>1){ 
		 jumpBy2Step = distinctWaystoJump(index-2,height) + Math.abs(height[index] - height[index-2]);
		}
		
		return Math.min(jumpBy1Step, jumpBy2Step);
		
	}
	
	
}
