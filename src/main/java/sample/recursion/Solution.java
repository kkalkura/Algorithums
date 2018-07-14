package sample.recursion;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        boolean duplicate = false;
        int element ;
        for(int i=0;i<nums.length-1;i++) {
             element = nums[i];
        for(int j=0;j<i;j++){
            if(i!=j && element==nums[j]){
                duplicate= true;
                break;
            }
        }
        }
        
        return duplicate ;
    }
    
    public static void main(String[] args){
    	int[] nums = {1,2,3,4};
    	Solution s1 = new Solution();
    	boolean output = s1.containsDuplicate(nums);
    	System.out.println("Output is"+ output);
    	
    	
    }
}