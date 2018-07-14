package sample.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CombinationSum {
	
public static void main(String[] args){
		
		System.out.println("Inside");
		CombinationSum sampleSet = new CombinationSum();
		int[] nums = {2,3,6,7};
		List<List<Integer>> results = sampleSet.CombinationSum(nums,7);
		Iterator resultIterator = results.iterator();
		
		while(resultIterator.hasNext()){
			List<Integer> result =  (List<Integer>) resultIterator.next();
			System.out.println();
			for(int i=0;i<result.size();i++){
			    System.out.print(result.get(i));
			} 
		}
		
		
	}
	
	public List<List<Integer>> CombinationSum(int[] nums,int target ) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums,target,0);
	    return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums,int remain, int start){
		if(remain<0) return;
		else if (remain==0) list.add(new ArrayList<>(tempList));
		else {
			for(int i=start;i<nums.length;i++){
				tempList.add(nums[i]);
				backtrack(list,tempList,nums,remain-nums[i],i);
				tempList.remove(tempList.size()-1);
			}
		}
		} 

}
