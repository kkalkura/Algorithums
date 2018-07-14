package sample.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CharPermutation {
	
public static void main(String[] args){
		
		System.out.println("Inside");
		CharPermutation sampleSet = new CharPermutation();
		char[] nums = {'M','A','T'};
		List<List<String>> results = sampleSet.subsets(nums);
		Iterator resultIterator = results.iterator();
		
		while(resultIterator.hasNext()){
			List<Integer> result =  (List<Integer>) resultIterator.next();
			System.out.println();
			for(int i=0;i<result.size();i++){
			    System.out.print(result.get(i));
			} 
		}
		
		
	}
	
	public List<List<String>> subsets(char[] nums) {
	    List<List<String>> list = new ArrayList<>();
	   
	    backTrack(list, new ArrayList<>(), nums);
	    return list;
	}

	 public void backTrack(List<List<String>> results,List<String> tempString,char[] input ){
		if(tempString.size()== input.length){
			 results.add(new ArrayList<>(tempString));
		 } else {
		 
		 for(int i=0;i<input.length;i++){
		  if(tempString.contains(String.valueOf(input[i]))) continue;
			 tempString.add(String.valueOf(input[i]));
			 backTrack(results,tempString,input);
			 tempString.remove(tempString.size() - 1);
		 }
		 
	 }
	 }

}
