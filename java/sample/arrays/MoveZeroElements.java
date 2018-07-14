package sample.arrays;

import java.util.Arrays;

public class MoveZeroElements {
	
	public static void main(String[] args){
		int[]nums = {1,5,0,7,8,9,0};
		System.out.println("Before Swapping"+Arrays.toString(nums));
		MoveZeroElements mz = new MoveZeroElements();
		mz.moveZero(nums);
		System.out.println("After Swapping"+Arrays.toString(nums));
	}
	
	 public int[] moveZero(int[] nums) {
		 int i=0,j=0;
		
		 
		 while(j<nums.length && i<nums.length)
		{
			if(nums[j]==0){
				j++;
			} else if(nums[i]!=0){
				i++;
				j++;
			} else {
				swap(nums,i,j);
				i++;
				j++;
			}
		
			
		}
		return nums;
	        
	    }
	 public void swap(int[] a , int i,int j){
		 int temp = a[j];
		 a[j]=a[i];
		 a[i] = temp;
	 }
}
