package sample.arrays.test;

import java.util.Arrays;

public class findWater {
	
	
	public static void main(String[] arg){
		int[]nums = {1,5,0,7,8,9,0};
		System.out.println("Before Swapping"+Arrays.toString(nums));
		findWater mz = new findWater();
		System.out.println(mz.findwater(nums));
	}
	
	public int findwater(int[] nums){
		int size = nums.length ;
		
		int[] leftmax = new int[size];
		int[] rightmax = new int[size];
		
		leftmax[0] = -1;
		
		for(int i=1;i<size;i++){
			leftmax[i]= Math.max(nums[i],leftmax[i-1]);
		}
		rightmax[size-1] = -1;
		
		for(int i= size-2;i>0;i--){
			rightmax[i] = Math.max(nums[i],rightmax[i+1]);
		}
		
		int sum=0;
		for(int i=0;i<size-1;i++){
			sum = sum + Math.min(leftmax[i], rightmax[i]- nums[i]);
		}
		
		return sum;
	}

}
