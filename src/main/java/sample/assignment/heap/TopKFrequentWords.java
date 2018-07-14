package sample.assignment.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentWords {
	
	public static void main(String[] arguments){
		System.out.println("Inside main");
		TopKFrequentWords tkfw = new TopKFrequentWords();
		String[] input = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		tkfw.topKFrequent(input, 2);
	}
	
	
	 public List<String> topKFrequent(String[] words, int k) {
		 Map<String,Integer> count = new HashMap();
		 int arraylength = words.length;
		 
		 for(String word: words) {
			 count.put(word,count.getOrDefault(word, 0)+1);
		 }
		 
		  System.out.println(count.keySet());
	       System.out.println(count.values());
		 PriorityQueue<String> heap = new PriorityQueue<String>( new Comparator<String>()
				 {
			 		public int compare(String s1,String s2){
			 			if(count.get(s1)!=count.get(s2)){
			 				return count.get(s2)-count.get(s1);
			 			} else {
			 				return s1.compareTo(s2);
			 			}
			 		}
				 });
		 for (String word: count.keySet()) {
	            heap.offer(word);
	         //   if (heap.size() > k) heap.poll();
	        }
		 
		 System.out.println(heap.size());
		 System.out.println(heap.peek());
	        

	        List<String> ans = new ArrayList();
	        while (!heap.isEmpty() && ans.size()<2) ans.add(heap.poll());
	     //   Collections.reverse(ans);
	        System.out.println(ans);
	        return ans;
		 
	 }

}
