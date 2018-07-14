package sample.assignment.search;

public class BitonicArraySearch {
	
	public static void main(String[] args){
		int arr[] = {5,1,3};
        int n = arr.length;
        BitonicArraySearch bsearch = new BitonicArraySearch();
        System.out.println(bsearch.search(arr, 1));
       
	}
	
	 public int search(int[] nums, int target) {
		 int pivot, index =-1;
		 pivot = pivotalElement2(nums);
		 if(pivot!=-1){
			 if((target>=nums[0]) && (target<=nums[pivot])){
				 index =  bseach(nums ,0 , pivot,target);
			 } else {
				 index =  bseach(nums ,pivot+1 , nums.length-1,target);
			 }
		 }
		 return index;
		 
	 }
	
public static int bseach(int[] input ,int left , int right,int x){
		
		
		while(left<=right){
			int middle = left+(right-1)/2;
			if(input[middle]==x){
				return middle;
			}
			if(input[middle]<x){
				left=middle+1;
			}else {
				right = middle-1;
			}
			
		}
		
		return -1;
	}

// Not working code 

public static int pivotalElement(int[] input){
	
	int left =0;
	int right = input.length -1;
	while(left<=right){
		if(left==right){
			return left;
		} else if(left == right-1){
			if(input[left]>input[right]){
				return left;
			} else {
				return right;
			}
		} else {
			int middle = left+(right-left)/2;
			if(( input[middle] > input[middle-1]) && (input[middle]>input[middle+1])){
				return middle;
			} else if ((input[middle-1]<input[middle]) && (input[middle] < input[middle+1])){
				left = middle+1;
			} else if((input[middle-1]>input[middle])&& (input[middle]>input[middle+1])) {
				right = middle -1;
			} 
				
		}
	
	}
	
	return -1;
}


public static int pivotalElement2(int[] input){
	
	int left =0;
	int right = input.length -1;
	while(left<=right){
			int middle = left+(right-left)/2;
			if(( middle==0 || input[middle] > input[middle-1]) && (middle==right || input[middle]>input[middle+1])){
				return middle;
			} else if ((input[middle]<input[right]) && (input[middle] < input[left])){
				right = middle-1;
			} else 
				left = middle +1;
			} 
				
	return -1;	

}




public static int pivotalElement3(int[] input){
	
	int left=0;
	int right = input.length-1;
	while(left<=right){
		int middle = left+(right-left)/2;
		if((middle==0 || input[middle]>input[middle-1] && (middle==right) || input[middle]>input[middle+1])) {
			return middle;
		}
			else if((input[middle]<input[left]) && (input[middle]<input[left])) {
				right = middle-1;
		} else {
			left = middle+1;
		}
	}
	return -1;

}






















public int bsearch(int[] input ,int left,int right, int x){
	
	if(left<right){
		int middle = left+(right-1)/2;
		if(input[middle]==x){
			return middle;
		}
		if(x>input[middle]){
			 bsearch(input ,middle+1,right,  x);
		} else {
			 bsearch(input ,left,middle-1,  x);
		}
	}
	return -1;
}


public int last(int[] input , int left,int right, int x ,int n){
	if(left<right){
		int middle = left+(right-1)/2;
		if((input[middle]==x && input[middle+1]>x) || middle==n-1){
			return middle;
		}
		if(x>input[middle]){
			last(input ,middle+1, right, x,n);
		} else {
			last(input ,left, middle-1, x,n);
		}
	}
	
	return -1;
}


public int first(int[] input , int left,int right, int x ,int n){
	if(left<right){
		int middle = left+(right-1)/2;
		if((input[middle]==x && input[middle+1]<x) || middle==0){
			return middle;
		}
		if(x>input[middle]){
			last(input ,middle+1, right, x,n);
		} else {
			last(input ,left, middle-1, x,n);
		}
	}
	
	return -1;
}



	

}
