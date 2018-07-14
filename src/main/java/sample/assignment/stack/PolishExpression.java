package sample.assignment.stack;

import java.util.Stack;

public class PolishExpression {
	
	
	public static void main(String[] args){
		
	}
	
	 public int evalRPN(String[] tokens) {
		 Stack<String> values = new Stack<String>();
		 
		 for( int i = 0; i <= tokens.length - 1; i++)
		 {
			 if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") ||  tokens[i].equals("/"))
			 {
				 int first = Integer.valueOf(values.pop());
				 int second = Integer.valueOf(values.pop());
				 int result =0;
				 if(tokens[i].equals("+")){
						result = first+second;
				 } else if(tokens[i].equals("-")){
					 result = second-first;
				 } else if(tokens[i].equals("*")){
					 result = first*second;
				 }else{
					 if(second!=0){
						 result = second/first; 
					 }
					 
				 }
			
				 values.push(String.valueOf(result));
			 } else{
				 values.push(tokens[i]);
			 }
		      
		 }
		 return Integer.valueOf(values.pop());
	        
	    }
		

	}

