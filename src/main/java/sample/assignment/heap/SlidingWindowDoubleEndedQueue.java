package sample.assignment.heap;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowDoubleEndedQueue {
	
	
	public static void main(String[] args){
		
		System.out.println("Inside Main");
		int[] nums = {1,3,-1,-3,5,3,6,7};
		SlidingWindowDoubleEndedQueue sld = new SlidingWindowDoubleEndedQueue();
		sld.slidingWindow(nums, nums.length, 3);
		
		 
		
	}
	
	public  void slidingWindow(int[] nums, int n, int k){
		
		 Deque<Integer> deque = new ArrayDeque<Integer>();
		 
		 // First Window
		 int i;
		 for(i=0;i<k;i++){
			 while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
				 deque.removeLast();
			 }
			 deque.addLast(i);
		 }
		 
		 for(;i<n;++i){
			 System.out.println(nums[deque.peek()]+"");
			 
			 // Removing element going out of window
			 while(!deque.isEmpty() && deque.peek()<= i-k){
				 deque.removeFirst();
			 }
			 while(!deque.isEmpty() && nums[i] >= nums[ deque.peekLast()]){
				 deque.removeLast();
			 }
			 deque.addLast(i);
		 }
		 System.out.println(nums[deque.peek()]+"");
		 
		 }
	
}
