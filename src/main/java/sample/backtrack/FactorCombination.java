package sample.backtrack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FactorCombination {
	
	public static void main(String[] args){
		System.out.println("Inside man");
		FactorCombination fc = new FactorCombination();
		List<List<Integer>> results = 	fc.getFactors(12);
		Iterator resultIterator = results.iterator();
		
		while(resultIterator.hasNext()){
			List<Integer> result =  (List<Integer>) resultIterator.next();
			System.out.println();
			for(int i=0;i<result.size();i++){
			    System.out.print(result.get(i)+",");
			} 
		}
	
		
	}
	
	
	public List<List<Integer>> getFactors(int n) {
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	    helper(result, new ArrayList<Integer>(), n, 2);
	    return result;
	}
	
	public void helper(List<List<Integer>> results , List<Integer> tmplist , int n, int start){
		
		if(n<=1){
			if(tmplist.size()>1){
				results.add(new ArrayList<Integer>(tmplist));
			}
			return;
		}
		
		for(int i=start;i<=n;++i){
			if(n%i==0){
				tmplist.add(i);
				helper(results,tmplist,n/i,i);
				tmplist.remove(tmplist.size()-1);
			}
		}
	}

}
