package Greedy_Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumNoOfPlatforms {
	static int findPlatform(int arr[], int dep[], int n) {
		Arrays.sort(arr);
		Arrays.sort(dep);

		int plat_needed = 1, result = 1;
		int i = 1, j = 0; //i=1 becoz first train always need platform

		while (i < n && j < n) {

			if (arr[i] <= dep[j]) { //Arrival of next train is before departure of current then we need new platform
				plat_needed++;
				i++;
			}

			else if (arr[i] > dep[j]) { //Train will depart first and then new train will arraive. no need of new platform
				plat_needed--;
				j++;
			}

			if (plat_needed > result)
				result = plat_needed;
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 900, 945, 955, 1100, 1500, 1800 };
		int[] dep = { 920, 1200, 1130, 1150, 1900, 2000 };
		int n = arr.length;
		int totalCount = findPlatform(arr, dep, n);
		System.out.println("Minimum number of Platforms required " + totalCount);
	}
}
