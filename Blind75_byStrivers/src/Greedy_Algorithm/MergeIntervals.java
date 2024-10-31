package Greedy_Algorithm;
//First, we will group the closer intervals by sorting the given array of intervals(if it is not already sorted).

//After that, we will start traversing the array using a loop(say i) and insert the first element
//into our answer list(as the answer list is empty).
//Now, while traversing we will face two different cases
//Case 1: If the current interval can be merged with the last inserted interval of the answer list:
//In this case, we will update the end of the last inserted interval with the maximum(current intervalís end,
//last inserted intervalís end) and continue moving afterward. 
//Case 2: If the current interval cannot be merged with the last inserted interval of the answer list:
//In this case, we will insert the current interval in the answer array as it is. 
//And after this insertion, the last inserted interval of the answer list will obviously be updated to
//the current interval.
//Thus the answer list will be updated with the merged intervals and finally, we will return the answer list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

	public static int[][] mergeOverlappingIntervals(int[][] intervals) {
		//First Sort the array in such a way that start of every elements is <= start of next element
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
		int n = intervals.length;
		List<int[] >result = new ArrayList<>();
		int[] mergeInterval = intervals[0] ;
		int i = 0;
		while(i<n){
			if(mergeInterval[1] >= intervals[i][0]){
				mergeInterval[0] = Math.min(mergeInterval[0], intervals[i][0]);
				mergeInterval[1] = Math.max(mergeInterval[1], intervals[i][1]);
			}else{
				result.add(mergeInterval);
				mergeInterval=intervals[i];
			}
			i++;
		}
		result.add(mergeInterval);
		return result.toArray(new int[result.size()][]);
		
	}
	 public static void main(String[] args) {
	        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
	        int[][] ans = mergeOverlappingIntervals(arr);
	        System.out.print("The merged intervals are: \n");
	        for (int[] element : ans) {
	            System.out.print("[" + element[0] + ", " + element[1] + "] ");
	        }
	        System.out.println();
	    }
}
