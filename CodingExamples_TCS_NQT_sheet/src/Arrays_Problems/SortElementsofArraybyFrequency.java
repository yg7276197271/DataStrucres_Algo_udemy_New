package Arrays_Problems;
//Input: N = 8, array[] = {1,2,3,2,4,3,1,2}

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//Output: 2 2 2 1 1 3 3 4 

//Approach:
//STEP 1: Just store all elements on a map according to their count.
//STEP 2: Store all elements of the map in a vector one by one.
//STEP 3: Sort that vector according to its frequency.
//STEP 4: Now print them or push them into the answer vector.
class Pair {
	int first;
	int second;

	Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}

	Pair() {

	}
}

public class SortElementsofArraybyFrequency {
	static void Sortelementsbyfreq(int arr[], int n) {
			
		  HashMap<Integer, Integer> map=new HashMap<>();
		  
		  for(int i =0 ; i<n; i++){
			  	map.put(arr[i], map.getOrDefault(arr[i], 0)+1); 
		  }
		  

		 /* for(int i =0 ; i<n; i++){
			  	if(map.containsKey(arr[i])){
				  	map.put(arr[i], map.get(arr[i])+1); 

			  	}else{
				  	map.put(arr[i],1); 
			  	}
		  }*/
		  //map { {1,2} ,{2,3} ,{4,1},{3,2}...}
		  //Now we need to sort the values of map
		  ArrayList<Pair> vec = new ArrayList<>();
		  for(int x : map.keySet()){
			  
			  vec.add(new Pair(x,map.get(x)));
		  }
		  //vec list { {1,2} ,{2,3} ,{4,1},{3,2}}
		  
		  Collections.sort(vec,(a,b)->{
		        if(a.second == b.second)
		        return a.first-b.first;  // in case of 1,2 & 3,2 we need 1,2 first then 3,2
		        else
		        return b.second-a.second; // we need array to be sorted in descendig order of second element
		    });	
		  //vec list after sorting { {2,3} ,{1,2} {3,2} {4,1}}
		  
		  for(int i = 0 ;i<vec.size();i++){
			  
			  while(vec.get(i).second > 0){
				  System.out.print(vec.get(i).first+" ");
				  vec.get(i).second--;			  }
		  }
	}
	
	public static void main(String args[])
	{
	  int arr[] = {3, 3, 5, 2, 1, 1, 2 ,2};
	  int n = 8;
	  Sortelementsbyfreq(arr, n);
	 
	}

}
