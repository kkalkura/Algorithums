package sample.arrays;

import java.util.Arrays;

public class ArrayDecoder {
	
	public static void main(String[] arg){
		char[]nums = {'a','a','b','b','b'};
		
		ArrayDecoder mz = new ArrayDecoder();
		try {
			mz.arrayDecode(nums);
			System.out.println("After Swapping"+Arrays.toString(nums));
		}catch(Exception exp){
			System.out.println("Array can not be  converted");

		}
	
					
	
		
	}
	
	public char[] arrayDecode(char[] nums) {
		int i = 0;
		int j =1;
		int counter =1;
		int charindex =1;
		while (i <= nums.length - 1 && j <= nums.length - 1) {
			char a = nums[i];
			char b = nums[j];
			if (a == b) {
				counter++;
				if(charindex+counter==nums.length){
					nums[charindex] = b;
					charindex++;
					nums[charindex] = String.valueOf(counter).charAt(0);
					
				}
			} else {
				nums[charindex] = String.valueOf(counter).charAt(0);
				charindex++;
				if (charindex < nums.length - 1)
					nums[charindex] = b;
				
				if (charindex > nums.length - 1)
					throw new RuntimeException("Array out of Bound");
				counter = 1;
				
				if (j == nums.length - 1 && charindex == nums.length - 2) {
					charindex++;
					nums[charindex] = String.valueOf(counter).charAt(0);
				}
				

			}
			i++;
			j++;
		}
			
			
	       		return nums;
	}


	
	
}
