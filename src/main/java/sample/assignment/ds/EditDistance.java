package sample.assignment.ds;

public class EditDistance {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		String str1 = "sunday";
        String str2 = "saturday";
        System.out.println( editDitsance( str1 , str2 , str1.length(), str2.length()) );
	}
	
	static int min(int x,int y,int z)
    {
        if (x <= y && x <= z) return x;
        if (y <= x && y <= z) return y;
        else return z;
    }
	
	
	public static int editDitsance(String str1,String str2,int m, int n){
		int[][] dp = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i==0){
					dp[i][j] = j;
				} else if(j==0){
					dp[i][j]= i;
				} else if(str1.charAt(i-1)==str2.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1];
				} else {
					
					dp[i][j]= 1+min(dp[i][j-1],  // Insert
                            dp[i-1][j],  // Remove
                            dp[i-1][j-1]); // Replace
				}
			}
		}
		
		return dp[m][n];
	}
	

 
    static int editDistRecursion(String str1 , String str2 , int m ,int n)
    {
        // If first string is empty, the only option is to
    // insert all characters of second string into first
    if (m == 0) return n;
      
    // If second string is empty, the only option is to
    // remove all characters of first string
    if (n == 0) return m;
      
    // If last characters of two strings are same, nothing
    // much to do. Ignore last characters and get count for
    // remaining strings.
    if (str1.charAt(m-1) == str2.charAt(n-1))
        return editDistRecursion(str1, str2, m-1, n-1);
      
    // If last characters are not same, consider all three
    // operations on last character of first string, recursively
    // compute minimum cost for all three operations and take
    // minimum of three values.
    return 1 + min ( editDistRecursion(str1,  str2, m, n-1),    // Insert
    		editDistRecursion(str1,  str2, m-1, n),   // Remove
    		editDistRecursion(str1,  str2, m-1, n-1) // Replace                     
                   );
    }
	
	

}
