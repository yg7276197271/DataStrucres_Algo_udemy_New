package Arrays_Problems;

public class insertElementsInArray {
	//arr= { 10, 9, 14, 8, 20, 48, 16, 9 } no of elements = 8
	//new arr = { 40 , 10, 9, 14, 8, 20, 48, 16, 9 } no of elements = 9
	//We need to right shift all the values by one position
	static void insertatbegin(int[] arr, int n, int value) {
		for(int i = n-1 ; i>=0 ; i --){ //start from index 7
			arr[i+1] = arr[i];  // arr[8] = arr[7] ; arr[7] = arr[6]  and so on
		}
	}

	static void insertatEnd(int[] arr, int n, int value) {
		arr[n] = value;
	}
	//Insert element 4  at position 5
	//{10,9,14,8,20,48,16,9}  we need insert after 8
	//from index 4 we need to right shift elements by 1 position
	//and arr[4] = 4; that is arr[pos-1] =4
	
	static void insertatposition(int[] arr, int n, int value, int pos) {
		for (int i = n; i >= pos; i--)
	    {
	        arr[i] = arr[i - 1]; // arr[8] = arr[7] .... arr[5] = arr[4]
	    }
	    arr[pos - 1] = value;
	}

	public static void main(String args[]) {
		int n = 8;
		int arr[] = { 10, 9, 14, 8, 20, 48, 16, 9};
		int value = 40;
		System.out.println("Before inserting the value at beginning:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		insertatbegin(arr, n, value);
		System.out.println("After inserting the value at beginning:");
		for (int i = 0; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		int n1=8;
	    int arr1[]={10,9,14,8,20,48,16,9};
	    int value1=40;
	    System.out.println("Before inserting the value at beginning:");
	     for(int i=0;i<n1;i++)
	    {
	        System.out.print(arr1[i]+" ");
	    }
	    System.out.println();
	    insertatEnd(arr1,n1,value1);
	    System.out.println("After inserting the value at beginning:");
	    for(int i=0;i<=n1;i++)
	    {
	        System.out.print(arr1[i]+" ");
	    }
	    System.out.println();
	    	
	    
	    
	    int n2=8;
	    int pos2=5;
	    int arr2[]={10,9,14,8,20,48,16,9};
	    int value2=40;
	    System.out.println("Before inserting the value at beginning:");
	     for(int i=0;i<n2;i++)
	    {
	        System.out.print(arr2[i]+" ");
	    }
	    System.out.println();
	    insertatposition(arr2,n2,value2,pos2);
	    System.out.println("After inserting the value at beginning:");
	    for(int i=0;i<=n2;i++)
	    {
	        System.out.print(arr2[i]+" ");
	    }
	    System.out.println();
	}
}
