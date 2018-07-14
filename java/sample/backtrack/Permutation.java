package sample.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Permutation {
	
public static void main(String[] args){
		
		System.out.println("Inside");
		Permutation sampleSet = new Permutation();
		int[] nums = {1,2,3};
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
	    backtrack(list, new ArrayList<>(), nums);
	    return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
		  if(tempList.size() == nums.length){
		      list.add(new ArrayList<>(tempList));
		   } else{
		      for(int i = 0; i < nums.length; i++){ 
		       if(tempList.contains(nums[i])) continue; // element already exists, skip
		         tempList.add(nums[i]);
		         backtrack(list, tempList, nums);
		         tempList.remove(tempList.size() - 1);
		      }
		   }
		} 

}
