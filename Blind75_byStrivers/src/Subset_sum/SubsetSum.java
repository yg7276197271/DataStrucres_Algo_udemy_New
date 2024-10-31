package Subset_sum;
import java.util.*;

//Pick and not pick approach for recursion
//If we pick the element then we have to add it to sum and increment index by 1
//If we don't pick the element then no addition to Sum.Increase the index by 1
//When the index goes out of boundary then add the sum to our data structure

public class SubsetSum {
	
	    static void subsetSumsHelper(int ind, int sum, ArrayList < Integer > arr, int N, ArrayList < Integer > sumSubset) {
	        if (ind == N) {
	            sumSubset.add(sum);
	            return;
	        }

	        // pick the element 
	        subsetSumsHelper(ind + 1, sum + arr.get(ind), arr, N, sumSubset);

	        // Do-not pick the element
	        subsetSumsHelper(ind + 1, sum, arr, N, sumSubset);
	    }

	    static ArrayList < Integer > subsetSums(ArrayList < Integer > arr, int N) {

	        ArrayList < Integer > sumSubset = new ArrayList < > ();
	        subsetSumsHelper(0, 0, arr, N, sumSubset);
	        Collections.sort(sumSubset);
	        return sumSubset;
	    }



	    public static void main(String args[]) {


	        ArrayList < Integer > arr = new ArrayList < > ();
	        arr.add(3);
	        arr.add(1);
	        arr.add(2);
	        ArrayList < Integer > ans = subsetSums(arr, arr.size());
	        Collections.sort(ans);
	        System.out.println("The sum of each subset is ");
	        for (int i = 0; i < ans.size(); i++)
	            System.out.print(ans.get(i) + " ");
	    }
}
