package JavaActivity1;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args)
	
	{
		int[] Arrayvalue= {10, 77, 10, 54, -11, 10};
		System.out.println("original Array:" + Arrays.toString(Arrayvalue));
		
		int number=10;
		int fixednum=30;
		
		System.out.println("Result: " + result(Arrayvalue, number, fixednum));
	}
		
		public static boolean result(int[] numbers, int number, int fixednum) {
	        int temp_sum = 0;
	        
	        for (int number1 : numbers) {
	             if (number1 == number) {
	             temp_sum += number;
	            }

	        
	            if (temp_sum > fixednum) {
	                break;
	            }
	        }

	        return temp_sum == fixednum;
		
	}
}
