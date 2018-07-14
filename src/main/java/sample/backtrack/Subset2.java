package sample.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Subset2 {
	
	public static void main(String[] argument){
		System.out.println("Inside main");
		int[] input = {1,2,3};
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Subset2 subset2 = new Subset2();
		List<List<Integer>> results = subset2.subsets(input);
		Iterator resultIterator = results.iterator();
		while(resultIterator.hasNext()){
			List<Integer> result1 =  (List<Integer>) resultIterator.next();
			System.out.println();
			for(int i=0;i<result1.size();i++){
			    System.out.print(result1.get(i));
			} 
		}
		
		
	}
	
	public List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    subset(nums,list, new ArrayList<>(), 0);
	    return list;
	}
	
	
	private void subset(int[] input, List<List<Integer>> results, List<Integer> tmplist , int start){
		results.add(new ArrayList(tmplist));
		for(int i=start;i<input.length;i++){
			tmplist.add(input[i]);
			subset(input,results,tmplist,start+1);
			tmplist.remove((tmplist.size() - 1));
		}
	}

}
