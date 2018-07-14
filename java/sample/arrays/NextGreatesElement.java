package sample.arrays;

// Array Class 01 
import java.util.Arrays;

public class NextGreatesElement {
	
	public static void main(String[] args){
		int[]nums = {1,15,0,7,8,9,10};
		System.out.println("Before Swapping"+Arrays.toString(nums));
		NextGreatesElement mz = new NextGreatesElement();
		mz.nextGreterElement(nums);
		System.out.println("After Swapping"+Arrays.toString(nums));
	}
	
	 public int[] nextGreterElement(int[] nums) {
		 	int  size = nums.length;
		 	if(size==0) return nums;
		 	// store the max_right in variable
			int max_right = nums[size-1];
			nums[size-1]= -1;
		 
		 	for(int i=size-2;i>=0;i--){
		 		int temp = nums[i];
		 	
		 		nums[i]= max_right;
		 		if(temp>max_right){
		 			max_right= temp;
		 		}
		 		
		 	}
		 	return nums;
		 	
		
	    }
	 
	 
	
}
