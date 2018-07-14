package sample.arrays.test;

import java.util.Arrays;



public class NextGreatestElement {
	
	public static void main(String[] args){
		int[]nums = {1,15,0,7,8,9,10};
		System.out.println("Before Swapping"+Arrays.toString(nums));
		NextGreatestElement mz = new NextGreatestElement();
		mz.nextGreterElement(nums);
		System.out.println("After Swapping"+Arrays.toString(nums));
	}
	
	
	public static int[] nextGreterElement(int[] nums){
		
		if(nums.length==0){
			return nums;
		}
		
		int size = nums.length;
		
		// store the value of last variable
		int max_right = nums[size-1];
		nums[size-1]= -1; 
		
		
		for(int i=size-2;i>=0;i--){			
			int temp = nums[i];
			nums[i] = max_right;			
			if(temp>max_right){
				max_right= temp;
			}
			
		}
		
		return nums;
	}

}
