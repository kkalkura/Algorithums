package sample.assignment.heap;

public class Heap {
	public int[] array;
	public int count;
	public int capacity;
	public int heapType;
	
	public Heap(int capacity, int heapType) {
		super();
		this.capacity = capacity;
		this.heapType = heapType;
		this.count =0;
		this.array = new int[capacity];
	}
	
	public int Parnet(int i){
		if(i<=0 || i >= count){
			return -1;
		}
		return i-1/2;
	}
	
	public int leftChild(int i){
		int left = 2*i+1;
		if(left>=this.count){
			return -1;
		}
		return left;
	}
	
	public int rightChild(int i){
		int right = 2*i+2;
		if(right>=this.count){
			return -1;
		}
		return right;
	}
	
	
	public int getMaximum(){
		if(this.count==0){
			return -1;
		}
		return this.Parnet(0);
	}
	
	public void perculateDown(int i){
		int l,r ,max,temp;
		l = leftChild(i);
		r = rightChild(i);
		if(l!=-1 && this.array[l] > this.array[i]){
			max=l;
		} else {
			max=i;
		}
		if(r!=-1 && this.array[r] > this.array[max]){
			max=r;
		}
		if(max!=i){
			temp = this.array[i];
			this.array[i]= this.array[max];
			this.array[max] = temp;
			perculateDown(max);
		}
		
	}
	
	public int DeleteMax(){
		if(this.count==0){
			return -1;
		}
		int data = this.array[0];
		this.array[0]= this.array[count-1];
		this.count--;
		perculateDown(0);
		return data;
	}
	
	public int Insert(int data){
		int i;
		if(this.count== this.capacity){
			resizeHeap();
		}
		this.count++;
		i = this.count-1;
		while(i>=0 && data>this.array[(i-1)/2]){
			this.array[i]= this.array[(i-1/2)];
			i = i-1/2;
		}
		this.array[i] =data;
		return this.array[i];
		
	}
	
	public void buildHeap(Heap h , int[] A, int n) {
		if(h==null) return;
		
		while(n>h.capacity){
			h.resizeHeap();
		}
		for(int i=0;i<n;i++){
			h.array[i] = A[i];
		}
		h.count =n;
		for(int i=(n-1)/2;i>=0;i--){
			h.perculateDown(i);
		}
	}
	
	
	public void resizeHeap(){
		int[] array_old = new int[this.capacity];
		System.arraycopy(this.array, 0, array_old, 0, this.count-1);
		this.array = new int[this.capacity * 2];
		if(this.array==null){
			System.out.println("Memory Error");
			return;
		}
		for(int i=0;i<this.capacity;i++){
			this.array[i] = array_old[i];
		}
		this.capacity *=2;
		array_old=null;
		
		}
	}
	


