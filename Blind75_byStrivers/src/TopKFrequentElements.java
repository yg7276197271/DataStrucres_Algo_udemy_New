import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
	// 1 1 1 2 2 2 3 3 4
	//Store elements in map with its frequency
	//map = {{1,3},{2,3},{3,2},{4,1}}
	//bucket = at the index 3 we have to store 1 & 2
	//at index 2 we have to store 2
	//at index 1 , we have to store 4
	public int[] topKFrequent(int[] nums , int k){
		List<Integer>[] bucket = new ArrayList[nums.length+1];
		
		Map<Integer,Integer> numFreqencyMap = new HashMap<>();
		
		for(int num : nums){
			numFreqencyMap.put(num, numFreqencyMap.getOrDefault(num, 0)+1);
		}
		
		for(Integer num : numFreqencyMap.keySet()){
			int frequency = (int)numFreqencyMap.get(num);
			if(bucket[frequency]==null){
				bucket[frequency] = new ArrayList<>(); 
			}
			bucket[frequency].add(num);
			
		}
		int[] output = new int[k];
		int index = 0;
		for(int i=bucket.length-1;i>=0 && index<k;i++){
			if(bucket[i]!=null){
				for(Integer value : bucket[i]){
					output[index] = value;
					index++;
					if(index==k) break;
				}
			}
		}
		return output;
		
	}
}
