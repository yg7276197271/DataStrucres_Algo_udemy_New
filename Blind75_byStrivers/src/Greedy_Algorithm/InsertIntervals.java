package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervals {
	// Input : intervals= [[1,2],[3,5],[6,7],[8,10],[12,16]] newInterval=[4,8]
	// output : [[1,2],[3,10],[12,16]]
	// Because [4,8] overlaps with [3,5] [6,7] [8,10]
	
	//Input : [[1,3],[6,9]]
	//new = [2,5]
	//output : [[1,5],[6,9]]


	public static int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> result = new ArrayList<>();
		int n = intervals.length;
		int i = 0;
		//Left part which is non overlapping
		while(i < n && intervals[i][1] < newInterval[0]){
			result.add(intervals[i]);
			i++;
		}
		//overlapping
		while(i < n && intervals[i][0] <= newInterval[1]){
			
			newInterval[0]= Math.min(newInterval[0], intervals[i][0]);
			newInterval[1]= Math.max(newInterval[1], intervals[i][1]);
			i++;
		}
		result.add(newInterval);
		
		//right part which is non overlapping
		while(i<n){
			result.add(intervals[i]);
			i++;
		}
		
		return result.toArray(new int[result.size()][]);

	}
}
