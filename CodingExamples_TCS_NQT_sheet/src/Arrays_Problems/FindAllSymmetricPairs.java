package Arrays_Problems;
//Input: (1,2),(2,1),(3,4),(4,5),(5,4)

import java.util.HashMap;

//Output: (2,1) (5,4)
//Explanation: Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.
//Algorithm : 
//Intuition: We will store the pairs in a hash map and then check if the symmetric pair exists or not.

//Store pairs in the hashmap.
//Let “first” be the first element of the pair and “second” be the second element of the pair.
//While iterating through the pairs we will check if {second,first} exists by using map.
//If {second,first} exists then print the pair,else store it in the map.

public class FindAllSymmetricPairs {
	public static void main(String args[]) {
		int arr[][] = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 4, 5 }, { 5, 4 } };
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		System.out.println("The Symmetric Pairs are: ");

		for(int i=0 ; i<arr.length ; i++){
			//for { 1, 2 }
			int first = arr[i][0]; //1
			int second = arr[i][1]; //2
			
			if(mp.get(second)!= null && mp.get(second) == first){
		        System.out.print("("+first + " " + second+") ");
			}
			else{
				mp.put(first, second);
			}
			
		}
	}
}
