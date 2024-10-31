package PermutationOfArray;

import java.io.*;
import java.util.*;
//Here we dont need to carry index as a method paramter.
//we will iterate from index 0 to n.

public class RecusriveApproach {
	private static void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
		// Base Case
		if (ds.size() == nums.length) {
			// copy the ds to ans
			ans.add(new ArrayList<>(ds));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!freq[i]) {
				freq[i] = true;
				ds.add(nums[i]);
				recurPermute(nums, ds, ans, freq);
				ds.remove(ds.size() - 1);
				freq[i] = false;
			}

		}
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		boolean[] freq = new boolean[nums.length];
		recurPermute(nums, ds, ans, freq);
		return ans;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		List<List<Integer>> ans = permute(nums);
		System.out.println("All Permutations are");
		for (int i = 0; i < ans.size(); i++) {
			for (int j = 0; j < ans.get(i).size(); j++) {
				System.out.print(ans.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
