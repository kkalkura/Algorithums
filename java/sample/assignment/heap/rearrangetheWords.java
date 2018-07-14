package sample.assignment.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class rearrangetheWords {
	
	public static void main(String[] args){
		System.out.println("Inisde main");
		String input = "This is a on way roads";
		StringTokenizer tokenizer = new StringTokenizer(input, " ");
		List<String> parts = new ArrayList<String>();
		 PriorityQueue<String> heap = new PriorityQueue<String>( new Comparator<String>()
		 {
	 		public int compare(String s1,String s2){
	 			if(s1.length()>s2.length()){
	 				return 1;
	 			} else if(s1.length() <s2.length()){
	 				return -1;
	 			} else {
	 				return s1.compareTo(s2);
	 			}
				
	 		}
		 });
		while(tokenizer.hasMoreTokens()) { 
		    String part = tokenizer.nextToken();
		    heap.add(part);
		}
		
		StringBuffer result = new StringBuffer();
	   while(!heap.isEmpty()){
		   result.append(heap.remove());
		   result.append(" ");
	   }
	   
	   System.out.println(result.toString());
	   
		
	}

}
