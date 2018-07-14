package sample.assignment.ds;

public class LongestCommonSubsequence {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		 String X = "AGGTAB";
	        String Y = "GXTXAYB";
	        int m = X.length();
	        int n = Y.length();
	        lcs(X, Y, m, n);
	}
	
	 public static void lcs(String X, String Y, int m, int n){
		 
		 int[][] L = new int[m+1][n+1];
		 
		 for(int i=0;i<=m;i++){
			 for(int j=0;j<=n;j++){
				 if(i==0 || j==0){
					 L[i][j] =0;
				 } else if(X.charAt(i-1)== Y.charAt(j-1)){
					 L[i][j] = L[i-1][j-1]+1;
				 } else {
					 L[i][j] = Math.max(L[i-1][j],L[i][j-1]);
				 }
			 }
		 }
		 

		 
		 int index = L[m][n];
		 int temp = index;
		 
		 char[] lcs = new char[index+1];
	   //   lcs[index] = '\0'; // Set the terminating character
		 int i=m;
		 int j=n;
		 while(i>0 && j>0){
			 if(X.charAt(i-1)==Y.charAt(j-1)){
				 lcs[index] = X.charAt(i-1);
				 i--;
				 j--;
				 index--;
			 } else if(L[i-1][j]>L[i][j-1]){
				 i--;
			 } else {
				 j--;
			 }
		 }
		 
		 System.out.print("LCS of "+X+" and "+Y+" is ");
	        for(int k=0;k<=temp;k++)
	            System.out.print(lcs[k]);
		 
	 }
	 
	 
	 /* Returns length of LCS for X[0..m-1], Y[0..n-1] */
	  int lcs( char[] X, char[] Y, int m, int n )
	  {
	    if (m == 0 || n == 0)
	      return 0;
	    if (X[m-1] == Y[n-1])
	      return 1 + lcs(X, Y, m-1, n-1);
	    else
	      return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
	  }
	 
	  /* Utility function to get max of 2 integers */
	  int max(int a, int b)
	  {
	    return (a > b)? a : b;
	  }
	 
	 
	 
	 
	 
	

}
