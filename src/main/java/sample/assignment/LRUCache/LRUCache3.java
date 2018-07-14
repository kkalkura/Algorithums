package sample.assignment.LRUCache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LRUCache3 {
   
	private int capcacity;
	private Map<Integer, Integer> cache;
	private List<Integer> history;
    
    public LRUCache3(int capacity) {
    	this.cache = new HashMap<Integer,Integer>();
    	this.capcacity = capacity;
    	 this.history = new ArrayList<>();
        
    }

    public  synchronized int get(int key){
    	if(cache.containsKey(key)){
    		updateHistory(key);
    		return cache.get(key);
    	}else {
    		return -1;
    	}
    	
    	
    }
    
    public synchronized void set(int key, int data){
    	if(this.capcacity==cache.size()){
    		cache.remove(getLeastKey());
    		history.remove(getLeastKey());
    	}
    	cache.put(key, data);
    	updateHistory(key);
    	
    }
    
    private void updateHistory(int key) {
    	if(history.contains(key)) history.remove(key);
    	history.add(key);
    }
    
    private int getLeastKey() {
    	return this.history.get(0);
    }
    
    
    
}