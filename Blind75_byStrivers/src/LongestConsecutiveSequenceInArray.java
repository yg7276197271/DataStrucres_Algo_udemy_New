import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceInArray {
	//This approach will take o(log) for sorting and O(n) for iterating the array
	public static int longestSuccessiveElements(int []a) {
        int n = a.length;
        if (n == 0) return 0;

        //sort the array:
        Arrays.sort(a);
       //{1,1,1,2,2,3,4,100,200};
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;
        
        for(int i=0;i<n;i++){
        	if(a[i]-1 == lastSmaller){
        		cnt++;
        		lastSmaller=a[i];
        	}else if(a[i] != lastSmaller){
        		cnt = 1;
        		lastSmaller=a[i];  //lastSmaller = 1 at first step
        	}
        	//if(a[i] == lastSmaller)  //do nothing
    		longest=Integer.max(longest,cnt);
    		
        }
        
        return longest;
	}

       
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,3,4,100,200};
        
        int[] a1= {150 ,8 ,250, 5, 7,6};
        //int ans = longestSuccessiveElements(a);
        int ans = longestSuccessiveElementsWithoutSorting(a1);
        System.out.println("The longest consecutive sequence is " + ans);
    }
	public static int longestSuccessiveElementsWithoutSorting(int []nums) {
		//150 8 250 5 7 6
		int n = nums.length;
        if (n == 0) return 0;

        int cnt = 0;
        int maxCount = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int a :nums){
        	set.add(a);
        }
        
        for(int i=0;i<n;i++){
        	if(set.contains(nums[i] - 1)){//It's not a start of sub sequence
        		continue;
        	}else{//It's  a start of sub sequence
        		
        		cnt=1;
        		while(set.contains(nums[i]+cnt)){ //if we found 5 then we have to check for 5+1=6
        			cnt++;							//if we found 6 then we have to check for 5+2=7 and so on
        		}
        		maxCount = Integer.max(cnt, maxCount);
        	}
        }
		return maxCount;
	}

    
    
}
