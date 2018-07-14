package sample.assignment.heap;

import java.util.PriorityQueue;

public class KthLargestElement {
	
	  public int findKthLargest(int[] nums, int k) {
	  PriorityQueue<Integer> largeK = new PriorityQueue<Integer>(k + 1);
	    
      for(int el : nums) {
          largeK.add(el);
          if (largeK.size() > k) {
              largeK.poll();
          }
      }

      return largeK.poll();
  }
}


