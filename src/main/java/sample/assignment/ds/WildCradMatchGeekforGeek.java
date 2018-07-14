package sample.assignment.ds;

import java.util.Arrays;

public class WildCradMatchGeekforGeek {
	
	public static void main(String[] args){
		System.out.println("Inaside Main");
	}
	
	
	 public boolean isMatch(String str, String pattern,int m,int n) {
		 if (m == 0){
			 return (n == 0);
		 }
		// lookup table for storing results of
	        // subproblems
	        boolean[][] lookup = new boolean[n + 1][m + 1];
	        for(int i = 0; i < n + 1; i++)
	            Arrays.fill(lookup[i], false);
	        lookup[0][0] = true;
	        for (int j = 1; j <= m; j++)
	            if (pattern.charAt(j - 1) == '*')
	                lookup[0][j] = lookup[0][j - 1];
	        
	        for (int i = 1; i <= n; i++)
	        {
	            for (int j = 1; j <= m; j++)
	            {
	                
	                if (pattern.charAt(j - 1) == '*')
	                    lookup[i][j] = lookup[i][j - 1] ||
	                                   lookup[i - 1][j];
	      
	   
	                else if (pattern.charAt(j - 1) == '?' ||
	                    str.charAt(i - 1) == pattern.charAt(j - 1))
	                    lookup[i][j] = lookup[i - 1][j - 1];
	      
	                // If characters don't match
	                else lookup[i][j] = false;
	            }
	        }
	        return lookup[n][m];
		
	 }
	 
	 
	

}
