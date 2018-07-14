package sample.arrays;

import java.util.Arrays;

public class RotateArray {
	
	public static void main(String[] args){
		int[]nums = {1,2,3,5,7,8,9};
		int k = 2;
		System.out.println("Before Swapping"+Arrays.toString(nums));
		RotateArray mz = new RotateArray();
		if(k>nums.length){
			k= k % nums.length;
		}
		mz.rotate(nums,0,k-1);
		mz.rotate(nums,k,nums.length-1);
		mz.rotate(nums,0,nums.length-1);
		System.out.println("After Swapping"+Arrays.toString(nums));
	}
	
	 public int[] rotate(int[] nums,int left,int right) {
		 
		 while(left<right){
			 swap(nums,left,right);
			 left ++;
			 right --;
		 }
		 return nums;
		
		
	        
	    }
	 public void swap(int[] a , int i,int j){
		 int temp = a[j];
		 a[j]=a[i];
		 a[i] = temp;
	 }
}
