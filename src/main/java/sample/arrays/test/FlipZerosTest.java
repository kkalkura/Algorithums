package sample.arrays.test;

public class FlipZerosTest {
	 static int arr[] = new int[]{1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
	 
	 public static void main(String[] args) 
	    {
	        int m = 2;
	        System.out.println("Indexes of zeroes to be flipped are ");
	          
	        findZeroesTest(m);
	    }
	
	 static void findZeroesTest(int m)
	    {
	      
	        int wL = 0, wR = 0; 
	      
	        
	        int bestL = 0, bestWindow = 0; 
	 
	        int zeroCount = 0; 
	      
	        while(wR<arr.length){
	        	
	        	if(zeroCount<2){
	        		if(arr[wR]==0){
	        			zeroCount ++;
	        			
	        		}
	        		wR++;
	        	}
	        	
	        	if(zeroCount>1){
	        		if(arr[wL]==0){
	        			zeroCount --;
	        		}
	        		wL++;
	        	}
	        	
	        	if(wR-wL>bestWindow){
	        		bestWindow = wR-wL;
	        		bestL = wL;
	        	}
	        }
	       
	    }

}
