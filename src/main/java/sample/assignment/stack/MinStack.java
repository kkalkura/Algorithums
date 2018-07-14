package sample.assignment.stack;

import java.util.Stack;

public class MinStack {
	
	   /** initialize your data structure here. */
	 Stack<Integer> values = new Stack<Integer>();
	 Stack<Integer> minvalues = new Stack<Integer>();
    public MinStack() {
        
    }
    
    public void push(int x) {
    	
    	if(minvalues.isEmpty()){
    		minvalues.push(new Integer(x));
    	} else if(minvalues.peek().intValue()>=x){
    		minvalues.push(new Integer(x));
    	}
    	values.push(new Integer(x));
  
    }
    
    public void pop() {
    	if(values.empty()==false && minvalues.empty()==false){
    		if(minvalues.peek().intValue()== values.peek().intValue()){
            	minvalues.pop();
            	values.pop();
            } else {
            	values.pop();
            }
    	}
        
    }
    
    public int top() {
    	if(values.empty()==false){
    		return values.peek().intValue();
    	}else {
    		return 0;
    	}
    	
    }
    
    public int getMin() {
    	if(minvalues.empty()==false){
    		return minvalues.peek().intValue();
    	}else {
    		return 0;
    	}
    
        
    }

}
