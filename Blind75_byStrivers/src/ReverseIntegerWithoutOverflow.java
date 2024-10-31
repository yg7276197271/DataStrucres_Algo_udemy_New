
public class ReverseIntegerWithoutOverflow {
	
	//x = 123
		public static int reverse(int x){
			
			int result = 0;
			int previousVal=0;
			while(x>0){
				int mod = x%10;
				result = result*10  + mod;
				if((result - mod )/10 != previousVal) return 0; //these two step are used to avoid the overflow of bit
				previousVal=result;
				x=x/10;
			
			}
			return result;
			
		}
		
		public static void main(String[] args) {
			System.out.println("Reverse Integer is "+reverse(Integer.MAX_VALUE));
		}
}
