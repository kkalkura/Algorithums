package sample.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
	
	public static void main(String[] args) {
		System.out.println("Inside main");
		int[]nums = {3,2,4};
		int target = 6;
		int[] results = twoSum(nums,target);
		 printArray(results);

	}
		public static int[] twoSum(int[] nums, int target) {
	        int[]results = new int[2];
	         for(int i=0;i<nums.length;i++){
	             for(int j=i+1;j<nums.length;j++)
	             {
	                 if(nums[i]+nums[j]==target & i!=j) {
	                	 System.out.println("The Value of i"+nums[i]);
	                	 System.out.println("The Value of j"+nums[j]);
	                     results[0]=i;
	                     results[1]=j;
	                     return results;
	                 }
	             }
	         }
	        return results;
	        
	        
	    }
		
		
		public List<List<Integer>> threeSum(int[] nums){
			 List<List<Integer>> res = new ArrayList<>();
			    Arrays.sort(nums);
			    for (int i = 0; i + 2 < nums.length; i++) {
			        if (i > 0 && nums[i] == nums[i - 1]) {              // skip same result
			            continue;
			        }
			        int j = i + 1, k = nums.length - 1;  
			        int target = -nums[i];
			        while (j < k) {
			            if (nums[j] + nums[k] == target) {
			                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
			                j++;
			                k--;
			                while (j < k && nums[j] == nums[j - 1]) j++;  // skip same result
			                while (j < k && nums[k] == nums[k + 1]) k--;  // skip same result
			            } else if (nums[j] + nums[k] > target) {
			                k--;
			            } else {
			                j++;
			            }
			        }
			    }
			    return res;
			
		}
		
		private static void printArray(int[] anArray) {
		      StringBuilder sb = new StringBuilder();
		      for (int i = 0; i < anArray.length; i++) {
		         if (i > 0) {
		            sb.append(", ");
		         }
		         sb.append(anArray[i]);
		      }
		      System.out.println(sb.toString());
		   }
	
        
        
    

}
