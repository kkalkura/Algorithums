package sample.assignment.heap;

public class Heap1 {
	int count;
	int heapType;
	int capacity;
	int[] array;
	
	
	public int leftchild(int i){
		int left = 2*i+1;
		if(left>=count) return -1;
		return array[left];
			
		
	}
	
	public int rightChild(int i){
		int right = 2*i+1;
		if(right>=count) return -1;
		return array[right];
		
	}
	
	public int parent(int i){
		int parent = i-1/2;
		if(i<0 || i>count) return -1;
		return array[parent];
		
	}
	
	public int getMaximum(){
		if(this.count==0) return -1;
		return array[0];
		
	}
	
	public int deleteMax(){
		if(this.count==0){
			return -1;
		}
		int data = this.array[0];
		this.array[0]=this.array[count-1];
		this.count--;
		perculateDown(0);
		return data;
		
	}
	
	public int  insert(int data){
		if(this.count== this .capacity){
			 resizeHeap();
		}
		this.count++;
		int i = this.count-1;
		while(i>0 && data > this.array[i-1/2]){
			this.array[i]= this.array[i-1/2];
			i = 1-1/2;
		} 
		this.array[i] = data;
		return this.array[i];
		
		
	}
	
	public void buildHeap(Heap1 h ,int[] input , int size){
		if(h==null) return;
		
		while(size>h.capacity){
			h.resizeHeap();
		}
		for(int i=0;i<size;i++){
			h.array[i] = input[i];
		}
		h.count =size;
		for(int i=(size-1)/2;i>=0;i--){
			h.perculateDown(i);
		}
		
		
		
	}
	
	public void perculateDown(int i){
		int left,right,max,temp;
		left = 2 *i+1/2;
		right = 2*i+2/2;
		if(array[left] > array[i]){
			max = left;
		} else 
		{
			max = i;
		}
		if(array[right]> array[max]){
			max = right;
		}
		if(max!=i){
			temp = this.array[i];
			this.array[i] = this.array[max];
			this.array[max]= this.array[i]; 
		}
		perculateDown(max);
		
	}
	
	public void resizeHeap(){
	}
	
	

}
