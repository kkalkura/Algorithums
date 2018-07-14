package sample.arrays;

import java.util.Arrays;

public class PivotofIndex {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		int[]nums = {-1,-1,-1,-1,-1,-1};
		System.out.println("Before Swapping"+Arrays.toString(nums));
		PivotofIndex mz = new PivotofIndex();
		
		System.out.println("Pivot of Index"+mz.pivotofIndex(nums));
		
	}
	
	public int pivotofIndex(int[] nums) {
		 int i=0,j=nums.length-1,frontCount=nums[0],backcount=nums[nums.length-1];
		 boolean equal = false;
		 while(j>=0 && i<nums.length-1)
		{
			 if(frontCount<backcount) {
			 frontCount= frontCount+nums[i];
			 i++;
			 } else if(backcount<frontCount) {
				 backcount = backcount+ nums[j];
				j--;
			 } else{
				 equal = true;
				 i++;
				 j--;
				// break;
			 }
		}
		 if(equal==true && nums.length%2!=0){
			 return i; 
		 } else {
			 return -1;
		 }
		
		 
			
		
			
		
		 
	 }
	
		
	        
	    

}
