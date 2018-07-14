package sample.arrays.test;

import java.util.Arrays;

import sample.arrays.MoveZeroElements;

public class MoveZeroElement {
	
	
	public static void main(String[] args){
		System.out.println("Inside main");
		
		int[]nums = {1,5,0,7,8,9,0};
		System.out.println("Before Swapping"+Arrays.toString(nums));
		MoveZeroElements mz = new MoveZeroElements();
		mz.moveZero(nums);
		System.out.println("After Swapping"+Arrays.toString(nums));
	}
	
	
	
	 public int[] moveZero(int[] nums){
		 int i=0;int j=0;
		 
		 while(i<nums.length && j<nums.length){
			 
			 if(nums[j]==0){
        		 j++;
			 } else if(nums[i]!=0){
				 i++;
				 j++;
			 }else {
				 swap(nums, i,j);
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
