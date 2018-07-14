package sample.arrays;

// Array Zig Zag Fashion
import java.util.Arrays;

public class ArrayZigZag {
	
	public static void main(String[] arg){
		// int[]nums = {1,5,0,7,8,9,0};
		int[]nums = {4,3,7,8,6,2,1};
		
		System.out.println("Before Swapping"+Arrays.toString(nums));
		ArrayZigZag mz = new ArrayZigZag();
		mz.arrayZigZag(nums);
		System.out.println("After Swapping"+Arrays.toString(nums));
		
	}
	
	public int[] arrayZigZag(int[] nums) {

		boolean flag= true;
		int j=1;
		int length = nums.length;
		for(int i=0;i<length-1;i++){
			if(flag){
				if(nums[i]>nums[j]){
					swap(nums,i,j);
				}
			}else {
				if(nums[i]<nums[j]){
					swap(nums,i,j);
				}
				
			}
			j++;
			if(flag){	
			flag=false;
			}else{
				flag = true;
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
