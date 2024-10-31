package Arrays_Problems;
//Below is BruteForce Solution
public class RotateArrayByKElements_LeftShift_BruteForce {
	/*arr =  {1,2,3,4,5,6,7}
	result = {3,4,5,6,7,1,2}  d = 2 left shift by 2 ;;; n = 7
	 
	temp =  {1,2,3,4,5,6,7}
	------------------------
	First we will start our loop from position 2 i.e d.
	left shift every element by 2 positions starting from d
	i=d i.e  i=2 at starting point
	arr[0] = arr[2]  i-d ; = 2-2 = 0
	arr[1] = arr[3]  i-d  ; 3-2 = 1
	and so on till position n
	-------------------------------
	After this array will look like below

	{3,4,5,6,7} still we have to add first two elements here 
	so now we will now start from poistion 5 i.e n-d and will go till n
	i=n-d ; 7-2 = 5
	arr[5] = temp[i-(n-d)] = temp[5-{7-2)] = temp[0]
	arr[6] = temp[6-(7-2)] = temp[1] 
	-------------------------------------------
	After this the result array will look like below 
	arr = {3,4,5,6,7,1,2}*/
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
	    int n = 7;
	    int d = 2;
	    RotateElemntsToLeft(arr, n, d);
	    System.out.print("After Rotating the k elements to right ");
	    for (int i = 0; i < n; i++)
	      System.out.print(arr[i] + " ");
	    System.out.println();
	  }

	private static void RotateElemntsToLeft(int[] arr, int n, int d) {
		
		 d = d%n;  
		 //If d > n then we have to do above  // d=10 then d%n = 3
		 //So we have to left shift by 3 positions
		 int[] temp = new int[n];
		 for(int i=0;i< d;i++){
			 temp[i] = arr[i];
		 }
		 for(int i= d; i<n ;i++){
			 arr[i-d] = arr[i];  //arr[0] = arr[2] // arr[1] = arr[3] till n
		 }
		 for(int i= n-d; i<n ;i++){
			 arr[i] = temp[i -(n-d)];							//arr[5] = temp[0] //arr[6] =temp[1] 
		 }
		
	}

}
