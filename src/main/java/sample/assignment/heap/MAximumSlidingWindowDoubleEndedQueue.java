package sample.assignment.heap;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class MAximumSlidingWindowDoubleEndedQueue {
	
	 public static void main(String[] args){
		 System.out.println("Inside main");
	 }
	 
	 
	  public int[] maxSlidingWindow(int[] nums, int k) {
		  int len = nums.length;
		    int[] result = new int[len - k + 1];
		    if(nums.length == 0) return new int[0];
		    int ri =0;
		    Deque<Integer> dq = new ArrayDeque<Integer>();
		    // for the first windows
		    for(int i=0;i<nums.length;i++) {
		    	while(!dq.isEmpty() && dq.peek() <i-k+1){
		    		dq.poll();
		    	}
		    	while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i] ){
		    		dq.pollLast();
		    	}
		    	
		    	dq.offer(i);
		    	if(i>=k-1){
		    		result[ri++] = nums[dq.peek()];
		    	}
		    }
		    return result;
		  
	  }
	  
	  
	  
	  public int[] maxSlidingWindow2(int[] nums, int k) {
		  int len = nums.length;
		    int[] result = new int[len - k + 1];
		    if(nums.length == 0) return new int[0];
		    int ri =0;
		    Deque<Integer> dq = new ArrayDeque<Integer>();
		    // for the first windows
		    for(int i=0;i<k;i++){
		    	while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
		    		dq.pollLast();
		    	}
		    	dq.offer(i);
		    }
		    for(int i=0;i<nums.length;i++) {
		    	while(!dq.isEmpty() && dq.peek() <i-k+1){
		    		dq.poll();
		    	}
		    	while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i] ){
		    		dq.pollLast();
		    	}
		    	
		    	dq.offer(i);
		    	if(i>=k-1){
		    		result[ri++] = nums[dq.peek()];
		    	}
		    }
		    return result;
		  
	  } 


}
