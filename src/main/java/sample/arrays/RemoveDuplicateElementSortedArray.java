package sample.arrays;

import java.util.Arrays;

public class RemoveDuplicateElementSortedArray {
	
	public static void main(String[] args){
		int[]nums = {1,5,0,7,8,9,0};
		System.out.println("Before Swapping"+Arrays.toString(nums));
		RemoveDuplicateElementSortedArray mz = new RemoveDuplicateElementSortedArray();
		mz.removeDuplicates1(nums);
		System.out.println("After Swapping"+Arrays.toString(nums));
	}
	
	 public int removeDuplcates(int[] nums) {
		if(nums.length==0) return 0;
		int i=0;
		for(int j=1;j<nums.length;j++){
			if(nums[j]!=nums[i]){			
				nums[i++]=nums[j];
			}
		}
		return i+1;
	        
	    }
	 
	 
	 public int removeDuplicates1(int[] nums) {
	        int n=nums.length;
	     if (nums.length==0) return 0;
	    int j=0;
	    for (int i=0; i<nums.length; i++)
	        if (nums[i]!=nums[j]) nums[++j]=nums[i];
	    return ++j;
	}
	 
	 public int removeElement(int[] nums, int val) {
	        
         int m = 0;    
   for(int i = 0; i <nums.length; i++){
       
       if(nums[i] != val){
           nums[m] = nums[i];
           m++;
       }
   }
   return m;
}
}
