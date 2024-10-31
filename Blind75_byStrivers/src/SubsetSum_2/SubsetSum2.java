package SubsetSum_2;
import java.util.*;

//Sort the input array.Make a recursive function that takes the input array ,
//the current subset,the current index and  a list of list/ vector of vectors to contain the answer.
//Try to make a subset of size n during the nth recursion call and 
//consider elements from every index while generating the combinations. 
//Only pick up elements that are appearing for the first time during a recursion call to avoid duplicates.
//Once an element is picked up, move to the next index.
//The recursion will terminate when the end of array is reached.
//While returning backtrack by removing the last element that was inserted.

public class SubsetSum2 {
	static void printAns(List <List<Integer>>  ans) {
	    System.out.println("The unique subsets are ");
	    System.out.println(ans.toString().replace(","," "));
	}
	 public static void findSubsets(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ansList) {
	        ansList.add(new ArrayList<>(ds)); 
	        for(int i = ind;i<nums.length;i++) {
	            if(i!=ind && nums[i] == nums[i-1]) continue; 
	            ds.add(nums[i]); 
	            findSubsets(i+1, nums, ds, ansList); 
	            ds.remove(ds.size() - 1);
	        }
	        
	    }
	    public static List<List<Integer>> subsetsWithDup(int[] nums) {
	        Arrays.sort(nums); 
	        List<List<Integer>> ansList = new ArrayList<>(); 
	        findSubsets(0, nums, new ArrayList<>(), ansList); 
	        return ansList; 
	    }

	public static void main(String args[]) {
	  // int nums[]={1,2,2};
	   int nums[]={1,2,2,3,3};

	   List < List<Integer>> ans = subsetsWithDup(nums);
	   printAns(ans);
	   
	}
}
