package sample.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Permutation2 {
	
public static void main(String[] args){
		
		System.out.println("Inside");
		Permutation2 sampleSet = new Permutation2();
		int[] nums = {1,1,2};
		List<List<Integer>> results = sampleSet.subsets(nums);
		Iterator resultIterator = results.iterator();
		
		while(resultIterator.hasNext()){
			List<Integer> result =  (List<Integer>) resultIterator.next();
			System.out.println();
			for(int i=0;i<result.size();i++){
			    System.out.print(result.get(i));
			} 
		}
		
		
	}
	
	public List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
	    return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean [] used){
		  if(tempList.size() == nums.length){
		      list.add(new ArrayList<>(tempList));
		   } else{
		      for(int i = 0; i < nums.length; i++){ 
		    	  if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue; // element already exists, skip
		    	 used[i] = true;
		         tempList.add(nums[i]);
		         backtrack(list, tempList, nums,used);
		         used[i] = false; 
		         tempList.remove(tempList.size() - 1);
		      }
		   }
		} 

}
