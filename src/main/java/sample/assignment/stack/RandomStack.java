package sample.assignment.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class RandomStack {
	 ArrayList<Integer> arr;   // A resizable array
	 HashMap<Integer, Integer>  hash;
	
	public static void main(String[] args){
		
	}

	public RandomStack() {
		arr = new ArrayList<Integer>();
	     hash = new HashMap<Integer, Integer>();
	}
	
	void add(int x)
	   {
	      if (hash.get(x) != null)
	          return;
	      int s = arr.size();
	      arr.add(x);

	      hash.put(x, s);
	   }
	
	
	void remove(int x)
	   {
	
	       Integer index = hash.get(x);
	       if (index == null)
	          return;
	       hash.remove(x); // Remove from HashMap
	       int size = arr.size();
	       Integer last = arr.get(size-1);
	       Collections.swap(arr, index,  size-1);
	       arr.remove(size-1);
	 	       hash.put(last, index);
	    }
	
	int getRandom()
    {
      
       Random rand = new Random();  // Choose a different seed
       int index = rand.nextInt(arr.size());
       return arr.get(index);
    }
 
   
    Integer search(int x)
    {
       return hash.get(x);
    }

}
