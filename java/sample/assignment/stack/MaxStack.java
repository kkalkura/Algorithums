package sample.assignment.stack;

import java.util.Stack;

public class MaxStack {
	
	   /** initialize your data structure here. */
	 Stack<Integer> values = null;
	 Stack<Integer> maxvalues = null;
    public MaxStack() {
    	 values = new Stack<Integer>();
    	 maxvalues = new Stack<Integer>(); 
    }
    
    public void push(int x) {
    	
    	if(maxvalues.isEmpty()){
    		maxvalues.push(new Integer(x));
    	} else {
    		int max = maxvalues.peek();
    		maxvalues.push(max > x ? max : x);
    	}
    	values.push(new Integer(x));
  
    }
    
    public int pop() {
    	maxvalues.pop();
    	return values.pop();
        
    }
    
    public int top() {
    	if(values.empty()==false){
    		return values.peek().intValue();
    	}else {
    		return 0;
    	}
    	
    }
    
    public int peekMax() {
    	if(maxvalues.empty()==false){
    		return maxvalues.peek().intValue();
    	}else {
    		return 0;
    	}
    }
    
    // removing the element from regular stack and putting it back
    public int popMax() {
    	int max = peekMax();
    	  Stack<Integer> buffer = new Stack();
    	  while (top() != max) buffer.push(pop());
    	  pop();
    	  while (!buffer.isEmpty()) push(buffer.pop());
          return max;
    	
    }

}
