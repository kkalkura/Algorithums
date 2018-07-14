package sample.assignment.twosum;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TwoSum {
	
	private Map<Integer,Integer> Sum;
	
	public static void main(String[] args){
		System.out.println("Inside the main");
		
	}
	
	public TwoSum(){
		Sum = new HashMap<Integer,Integer>();
	}
	
	public void add(int number){
		if(Sum.containsKey(number)){
			Sum.put(number, 2);
		} else {
			Sum.put(number, 1);
		}
	}
	
	public boolean find(int value){
		Iterator<Integer> sumIterator = Sum.keySet().iterator();
		while(sumIterator.hasNext()){
			int num1 = sumIterator.next();
			int num2 = value - num1;
			if(Sum.containsKey(num2)){
				if(num1!=num2 || Sum.get(num2)==2){
					return true;
				}
			}
		}
		return false;
	}

}
