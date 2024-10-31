package Greedy_Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

	public static void main(String[] args) {
		int n = 4, weight = 90;
		Item arr[] = { new Item(100, 20), new Item(60, 10), new Item(200, 50) ,  new Item(100, 50)};
		double ans = fractionalKnapsack(weight, arr, n);
		System.out.println("The maximum value is " + ans);
	}

	static double fractionalKnapsack(int W, Item arr[], int n) {

		Arrays.sort(arr, new ItemComparator());

		double totalValue = 0.0;
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i].weight <= W){
				totalValue = totalValue+arr[i].value;
				W = W-arr[i].weight;
			}else{
				totalValue+= (double)(arr[i].value) / (double)(arr[i].weight) * W;
				break;
			}
		}
		return totalValue;
	}
}

class Item {
	int value;
	int weight;
	public Item(int value, int weight) {
		super();
		this.value = value;
		this.weight = weight;
	}

	

}

class ItemComparator implements Comparator<Item> {
	@Override
	public int compare(Item o1, Item o2) {

		double r1 = (o1.weight / o1.value);
		double r2 = (o2.weight / o2.value);
		if (r1 < r2)
			return 1;
		else if (r1 > r2)
			return -1;
		else
			return 0;
	}
}