package sample.assignment.heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKfrequentElements {
	
	public static void main(String[] arguments){
		System.out.println("Inside main");
		TopKfrequentElements tkf = new TopKfrequentElements();
		int[] input = {1,1,1,2,2,3};
		tkf.topKFrequent(input,2);
	}
	
	
	 public List<Integer> topKFrequent(int[] nums, int k) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int n: nums){
	            map.put(n, map.getOrDefault(n,0)+1);
	        }
	       
	        System.out.println(map.keySet());
	       System.out.println(map.values());
	        
	           
	        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = 
	                         new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
	        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
	            maxHeap.add(entry);
	           
	        }
	        
	        System.out.println(maxHeap.peek());
	        
	        List<Integer> res = new ArrayList<>();
	        while(res.size()<k){
	            Map.Entry<Integer, Integer> entry = maxHeap.poll();
	            res.add(entry.getKey());
	        }
	        return res;
	    }



}
