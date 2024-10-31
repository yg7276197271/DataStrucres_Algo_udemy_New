package CombinationSum2_DP;

import java.util.*;

public class RecursiveApproach {
	//this is the problem where can pick from any index .
	static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (target == 0) {
            ans.add(new ArrayList < > (ds));
            return;
        }
       
        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue; //if its first element then we have consider it
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
    public static List < List < Integer >> combinationSum2(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        Arrays.sort(candidates);//1,1,2,5,6,7,10
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }

    public static void main(String args[]) {
        //int v[]={10,1,2,7,6,1,5};
        int v1[]={1,1,1,2,2};
       // List < List < Integer >> comb = combinationSum2(v, 8);
        //System.out.println(comb.toString().replace(",", " "));
        
        List < List < Integer >> comb1 = combinationSum2(v1, 4);
        System.out.println(comb1.toString().replace(",", " "));
    }
}
