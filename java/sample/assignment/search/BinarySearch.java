package sample.assignment.search;

public class BinarySearch {
	
	public static void main(String[] args){
		int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n = arr.length;
        int x = 8;
        System.out.println("First Occurrence = " + first(arr, 0, n-1,x,n));
        System.out.println("Last Occurrence = " + last(arr, 0, n-1, x, n));
		
	}
	
	public static int bseach(int[] input ,int x){
		
		int left =0;
		int right = input.length -1;
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
	
	
	public static int bseach(int[] input ,int left, int right ,int x){
		
		if(left<=right){
			int middle = left+(right-1)/2;
			
			if(input[middle]==x){
				return middle;
			}
			
			if(x>input[middle]){
				
				return bseach(input,middle+1,right,x);
				
			} else {
				return bseach(input,left,middle-1,x);
			}
			
		
	  } 
		return -1;
	}
	
	
public static int first(int[] input ,int left, int right ,int x,int n){
		
		if(left<=right){
			int middle = left+(right-1)/2;
			
			if(middle==0 || input[middle-1] <x && input[middle]==x){
				return middle;
			}
			
			if(x>input[middle]){
				
				return first(input,middle+1,right,x,n);
				
			} else {
				return first(input,left,middle-1,x,n);
			}
			
		
	  } 
		return -1;
	}





public static int last(int[] input ,int left, int right ,int x,int n){
	
	if(left<=right){
		int middle = left+(right-1)/2;
		
		if(middle==n-1 || input[middle+1] >x && input[middle]==x){
			return middle;
		}
		
		if(x>input[middle]){
			
			return last(input,middle+1,right,x,n);
			
		} else {
			return last(input,left,middle-1,x,n);
		}
		
	
  } 
	return -1;
}

}
