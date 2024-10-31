
public class ContainerWithMostWater {
	public static void main(String[] args) {
			int[] input = {1,8,6,2,5,4,8,3,7};
			System.out.println("Max Water of container is "+maxWaterStored(input));
			//Lets say we draw vertical lines with dimension equal to values of array element
			//then we have to find the quantity of most water stored in the container
			//So we will take two pointers. left pointing to 0th index and right pointing to last
			//Now we will check distance by using right -left
			//and multiply it with smaller height between height[left] and height[right].
			
			
	}
	
	public static int maxWaterStored(int[] height){
		int leftIndex=0;
		int rightIndex=height.length-1;
		int maxWater=0;
		
		while(leftIndex < rightIndex){
			
			int waterAmount = (rightIndex-leftIndex)*
					(height[leftIndex] >= height[rightIndex]? height[rightIndex]: height[leftIndex]);
					
					if (waterAmount > maxWater){
						maxWater=waterAmount;
					}
					if(height[leftIndex]<height[rightIndex]){
						leftIndex++;
						
					}else if(height[leftIndex]>height[rightIndex]){
						rightIndex--;
						
					}else{
						leftIndex++;
						rightIndex--;

					}
		}
		return maxWater;
	}
}
