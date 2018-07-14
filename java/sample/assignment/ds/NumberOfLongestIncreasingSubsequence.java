package sample.assignment.ds;

import java.util.Arrays;

public class NumberOfLongestIncreasingSubsequence {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		int [] input = {1,2,4,3,5,4,7,2};
	//	System.out.println(findNumberOfLIS(input));
		System.out.println(LIS(input));
	}



public static int LIS( int[] nums)
{ 
	int[] lis = new int[nums.length];
	 int[] cnt = new int[nums.length];
	int max =0,counter=0;
	int n = nums.length;
	for (int i = 0; i < n; i++ )
		lis[i] = cnt[i] = 1;

	for (int i = 0; i < n; i++){
		for (int j = 0; j < i; j++ ) {
			if ( nums[i] > nums[j]){
				if(lis[i]==lis[j]+1){
					cnt[i]+=cnt[j];
				} 
				if(lis[i] < lis[j] + 1) {
					 lis[i] = lis[j] + 1;
					 cnt[i] = cnt[j];
				}
			
				
			}
				
		}
	}	
	 for (int i = 0; i < n; i++ ) {
	    	System.out.print(lis[i]);
	    	if(max == lis[i])counter += cnt[i];
	        if(max < lis[i]){
	            max = lis[i];
	            counter = cnt[i];
	        }
	    }
	 
	 for (int i = 0; i < n; i++ ) {
	    	System.out.print(cnt[i]); 
	    }
	 System.out.println(counter); 

	
	
	return counter;
			
}




}

