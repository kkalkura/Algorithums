package sample.assignment.LRUCache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LRUCache {
    private int cap;
    private Map<Integer, Integer> cache;
    private List<Integer> history;
    
    /*Initialize an LRU cache with size N */
    public LRUCache(int N) {
        //Your code here
        this.cap = N;
        this.cache = new HashMap<>();
        this.history = new ArrayList<>();
    }

    /*Returns the value of the key x if
     present else returns -1 */
    synchronized public int get(int x) {
        //Your code here
        if (cache.containsKey(x)) {
            updateHistory(x);
            return cache.get(x);
        } else {
            return -1;
        }
    }

    /*Sets the key x with value y in the LRU cache */
    synchronized public void set(int x, int y) {
        //Your code here
        if (cache.size() == cap && !cache.containsKey(x)) {
            Integer leastKey = getLeastKey();
            cache.remove(leastKey);
            history.remove(leastKey);
        }

        cache.put(x, y);
        updateHistory(x);
    }

    private void updateHistory(Integer x) {
        if (history.contains(x)) history.remove(x);
        history.add(x);
    }

    private Integer getLeastKey() {
        return history.get(0);
    }
}