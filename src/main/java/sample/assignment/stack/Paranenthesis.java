package sample.assignment.stack;

import java.util.Stack;

public class Paranenthesis {
	
	
	public static void main(String[] args){
		
	}
	
	public boolean isValid(String s) {
		
	        Stack<Character> values = new Stack<Character>();
			  for(int i=0;i<s.length();i++){
				  char tmp = s.charAt(i);
			
				if(tmp=='('||tmp=='{' || tmp=='[') {
					  values.push(tmp);  
					  
				  }else if(tmp==')' && !values.empty() && values.peek()=='('){
					  values.pop(); 
				  }else if(tmp=='}'&& !values.empty() && values.peek()=='{'){
					  values.pop(); 
				  }else if(tmp==']'&& !values.empty() && values.peek()=='['){
					  values.pop(); 
				  } else{
					  return false;
				  }
	  
		} 
			  return values.empty();
		}
		
		

	}

