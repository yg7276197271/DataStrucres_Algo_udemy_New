package Greedy_Algorithm;

import java.util.Arrays;

public class NonOverlappingIntervals {
	//Here the problem is similar to N meetings in One rooom.
	//We need to fisrt sort the array in asc order of end time 
	//So we need to now find out and remove overlapping elements
	//So we will iterate on an array from start to end
	//and the interval is non overlapping if start time of current element >= end time of pevious
	//if above codition is not satisfied then igonore that 
	//if satisfied increase the count
	public static int eraseOverlapIntervals( int[][] intervals){
		
		Arrays.sort(intervals, (a , b) -> a[1] - b[1]);
		int cnt=1;
		int[] lastnonOverlappingInterval = intervals[0];
		
		for(int i=1;i<intervals.length;i++){
			
			if(intervals[i][0] >= lastnonOverlappingInterval[1]){
				cnt++;
				lastnonOverlappingInterval = intervals[i];
			}
		}
		return intervals.length - cnt;
		
	}
	 public static void main(String[] args) {
	        int[][] arr = {{0,5}, {3,4}, {1,2}, {5,9},{5,7},{7,9}};
	        int ans = eraseOverlapIntervals(arr);
	       
	        System.out.println(ans);
	    }
}
