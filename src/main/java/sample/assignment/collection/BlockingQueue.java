package sample.assignment.collection;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
	
	private int limit;
	private List queue = new LinkedList();
	public static void main(String[] arguments){
		System.out.println("Inside main");
	}
	
	public  BlockingQueue(int limit){
		this.limit = limit;
	}
	
	@SuppressWarnings("unchecked")
	public synchronized void enque(Object item) throws InterruptedException   {
		if(this.queue.size() == this.limit){
			wait();
		}
		if(this.queue.size()==0){
			notifyAll();
		}
		
		this.queue.add(item);
	}
	
	public synchronized Object deque() throws InterruptedException {
		if(this.queue.size()==0){
			wait();
		}
		if(this.queue.size()==this.limit){
			notifyAll();
		}
		return this.queue.remove(0);
	}
	
	
	

}
