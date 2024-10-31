package fibonacciSeries_DP;
//Print fibonacci series 

//0,1,1,2,3,5,8,13,21,...

public class RecursiveSolution {
	
	
	public static int  fibonaciSeries(int index){
		if(index <=1 ) return index; //base case
		return fibonaciSeries(index-1) + fibonaciSeries(index-2);
		
	}
	
	
	public static void main(String[] args) {
		for(int i= 0;i<7;i++){
			System.out.println(fibonaciSeries(i));
		}
	}
}
