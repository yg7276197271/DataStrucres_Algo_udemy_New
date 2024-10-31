package Arrays_Problems;

import java.util.Arrays;
import java.util.HashMap;

//Intuition: Sort the array and store the rank of the element in a map.
//Algorithm:
//Copy all the elements of the array in a dummy array.
//Sort the dummy array.
//Take a variable temp to calculate the rank of each element.Initially the value of temp is 1.
//Now traverse through the dummy array,if element is previously not stored in map 
//then store the value of element with the temp and then increament temp.
//Now traverse through the original array and print the rank of that corresponding element using map.
public class ReplaceElementByItsRankInArray {

	public static void main(String[] args) {
		int arr[] = { 20, 15, 26, 2, 98, 6 };
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
	    int n = arr.length;
		int[] brr = new int[arr.length];
		 for (int i = 0; i < n; i++) {
		      brr[i] = arr[i];
		    }		
		int temp = 1;
		Arrays.sort(brr); // 2,6,15,20,26,98

		for (int i = 0; i < brr.length; i++) { // map = {{2,1},{6,2},{15,3} ...
												// {98,6}}
			if (mp.get(brr[i]) == null) {
				mp.put(brr[i], temp);
				temp++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
		      System.out.print(mp.get(arr[i]) + " ");
		}

	}
}
