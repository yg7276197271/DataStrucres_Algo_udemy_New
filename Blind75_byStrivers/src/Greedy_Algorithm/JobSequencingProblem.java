package Greedy_Algorithm;

import java.util.Arrays;
import java.util.Comparator;

class Job {
	int id, profit, deadline;

	Job(int x, int y, int z) {
		this.id = x;
		this.deadline = y;
		this.profit = z;
	}
}

class solve {
	// return an array of size 2 having the 0th element equal to the count
	// and 1st element equal to the maximum profit
	int[] JobScheduling(Job arr[], int n) {
		Arrays.sort(arr, (a, b) -> (b.profit - a.profit)); //Sort in the order where max profit is at first

		int maxDeadline = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i].deadline > maxDeadline) {
				maxDeadline = arr[i].deadline;
			}
		}

		int deadLineArray[] = new int[maxDeadline + 1]; //This is the deadline array

		for (int i = 0; i <= maxDeadline; i++) { //Fill the array with -1
			deadLineArray[i] = -1;
		}

		int countJobs = 0, jobProfit = 0;

		for (int i = 0; i < n; i++) { // Iterate on Job Array

			for (int j = arr[i].deadline; j >= 0; j--) { // iterate on result array from deadline till day 1
		//so here we know the startindex as deadline value of att[i] and end index is till day 0
		//so we used for loop instead of while
		// Free slot found when value i not -1
				if (deadLineArray[j] == -1) {
					deadLineArray[j] = i;
					countJobs++;
					jobProfit += arr[i].profit;
					break;
				}
			}
		}

		int ans[] = new int[2];
		ans[0] = countJobs;
		ans[1] = jobProfit;
		return ans;

	}
}

class JobSequencingProblem {
	public static void main(String[] args)  {

		// size of array
		
		Job[] arr = new Job[8];
		arr[0] = new Job(1, 4, 20);
		arr[1] = new Job(2, 5, 60);
		arr[2] = new Job(3, 6, 70);
		arr[3] = new Job(4, 6, 65);
		arr[4] = new Job(5, 4, 25);
		arr[5] = new Job(6, 2, 80);
		arr[6] = new Job(7, 2, 10);
		arr[7] = new Job(8, 2, 22);
		
		solve ob = new solve();

		// function call
		int[] res = ob.JobScheduling(arr, 8);
		System.out.println(res[0] + " " + res[1]);

	}
}