package sample.assignment.ds;

import java.util.Arrays;

public class WordBreakProblem {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		WordBreakProblem wb = new WordBreakProblem();
		System.out.println(wb.wordBreak("ilikesamsung"));
	}
	
	
	private boolean dictionaryContains(String word)
	{
		boolean result = false;
	    String[] dictionary = {"mobile","samsung","sam","sung","man","mango",
	                           "icecream","and","go","i","like","ice","cream"};
	    int size = dictionary.length;
	    for (int i = 0; i < size; i++) {
	        if (dictionary[i].contains(word)){
	        	System.out.println("Insde True"+word);
	        		result=true;
	        		break;
	        }else {
	        	result= false;
	        }
	    }
	    
	    return result;
	    
	    
	          
	    
	}
	
	
	private boolean wordBreak(String str)
	{
	    int size = str.length();
	    if (size == 0)   return true;
	 
	   
	    boolean[]  wb = new boolean[size+1];
	    for(int i = 0; i <size + 1; i++){
           wb[i]= false;
	    }
	 
	    for (int i=1; i<=size; i++)
	    {
	        // if wb[i] is false, then check if current prefix can make it true.
	        // Current prefix is "str.substr(0, i)"
	        if (wb[i] == false && dictionaryContains(str.substring(0, i) )) {
	            wb[i] = true;
	        }
	 
	        // wb[i] is true, then check for all substrings starting from
	        // (i+1)th character and store their results.
	        if (wb[i] == true)
	        {
	        	
	            // If we reached the last prefix
	            if (i == size)
	                return true;
	 
	            for (int j = i+1; j <= size; j++)
	            {
	                // Update wb[j] if it is false and can be updated
	                // Note the parameter passed to dictionaryContains() is
	                // substring starting from index 'i' and length 'j-i'
	                if (wb[j] == false && dictionaryContains( str.substring(i, j-i) ))
	                    wb[j] = true;
	 
	                // If we reached the last character
	                if (j == size && wb[j] == true)
	                    return true;
	            }
	        }
	    }
	 
	    /* Uncomment these lines to print DP table "wb[]"*/
	     for (int i = 1; i <= size; i++)
	       System.out.println("Inside"+wb[i]);
	 
	    // If we have tried all prefixes and none of them worked
	    return false;
	}

}
