package sample.arrays;

public class FlipZeros {
	 static int arr[] = new int[]{1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
	 
	 public static void main(String[] args) 
	    {
	        int m = 2;
	        System.out.println("Indexes of zeroes to be flipped are ");
	          
	        findZeroes(m);
	    }
	
	 static void findZeroes(int m)
	    {
	      
	        int wL = 0, wR = 0; 
	      
	        
	        int bestL = 0, bestWindow = 0; 
	 
	        int zeroCount = 0; 
	      
	        // While right boundary of current window doesn't cross 
	        // right end
	        while (wR < arr.length)
	        {
	            // If zero count of current window is less than m,
	            // widen the window toward right
	            if (zeroCount <= 2)
	            {
	                if (arr[wR] == 0)
	                  zeroCount++;
	                wR++;
	            }
	      
	            // If zero count of current window is more than m,
	            // reduce the window from left
	            if (zeroCount > 1)
	            {
	                if (arr[wL] == 0)
	                  zeroCount--;
	                wL++;
	            }
	      
	            // Update widest window if this window size is more
	            if (wR-wL > bestWindow)
	            {
	                bestWindow = wR-wL;
	                bestL = wL;
	            }
	        }
	      
	        // Print positions of zeroes in the widest window
	        for (int i=0; i<bestWindow; i++)
	        {
	            if (arr[bestL+i] == 0)
	               System.out.print(bestL+i + " ");
	        }
	    }

}
