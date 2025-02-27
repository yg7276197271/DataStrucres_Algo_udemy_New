package sorting_algorithms;

//Time Complexity is O(n2)
public class SelectionSortImpl {

	//select minimums & swap is the algorithm
	
	//swap element at index 0 with the minimum element from 0 to n-1
	//swap element at index 1 with the minimum from 1 to n-1
	//swap element at index 2 with the minimum from 2 to n-1 And so on
	
	//swap element at index n-2 with the minimum   element from n-2 to n-1
	//Hence outer loop will be 0 to n-2 & inner loop to find min is from first element of outer loop to n-1
	
	
	public static void selection_sort(int[] arr,int n ){
		
		for(int i=0 ;i<=n-2;i++){
			
			int min = i;
			for(int j = i;j<=n-1;j++){
				
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
	}
	
	public static void main(String[] args) {

		int arr[]={12,60,34,1,99,88,0,999,111};
		selection_sort(arr,arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"");
		}
	
	}
}
