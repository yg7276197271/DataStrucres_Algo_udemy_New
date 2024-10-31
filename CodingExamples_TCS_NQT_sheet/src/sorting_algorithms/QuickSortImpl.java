package sorting_algorithms;

//Time Complexity is o(N logN)
//Space complexity is o(1)
//Algorithm is :
//1.Pick a  pivot and place it at right position
//2.Smaller on left larger on right
public class QuickSortImpl {

	public static void qs(int arr[],int low , int high){
		
		if(low < high){ //Array has more than 1 element
			
			int pIndex = partition(arr,low,high); //Get the partition Index
			qs(arr,low,pIndex-1); //Recursive call for first half
			qs(arr,pIndex+1,high);//Recursive call for second half

			
		}
		
	}
	
	private static int partition(int[] arr, int low, int high) {
		//Let the first element in arr as Pivot
		//Get the first element from left which is greater than pivot
		//Get the first element from right which is lesser than pivot
		//Swap these two elements 
		//keep on doing above steps till j crosses i
		//Once j crosses i , then swap arr[pivot] with arr[j] 
		//Return j as partition element
		
		int pivot = arr[low];
		int i = low;
		int j = high;
		
		while(i < j){
			//Find first element from left which is greater than pivot
			//why high -1 ? if we are at last position then will do i++ then it will exceed array's boundary
			while(arr[i] <= pivot && i<= high-1){
				i++;
			}
			//Find first element from right which is lesser than pivot
			//why high -1 ? if we are at first position then will do j-- then it will exceed array's boundary
			while(arr[j] > pivot && j>= low+1){
				j--;
			}
			
			if(i<j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		//This will be executed once i crosss j
		//We need to swap arr[j] with pivot which is at arr[low]
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		
		return j;
	}

	public static int [] quickSort(int arr[]){
		
		qs(arr,0,arr.length-1);
		return arr;
		
	}
	
	
	
	public static void main(String[] args) {

		//int arr[]={12,60,34,1,99,88,0,999,111};
		int arr[]={9,8,7,6,5,4,13};

		quickSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"");
		}
	}

}
