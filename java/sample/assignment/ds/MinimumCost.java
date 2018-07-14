package sample.assignment.ds;

public class MinimumCost {
	
	public static void main(String[] args){
		System.out.println("Inside the method");
		int[][]cost =  {{1,2,3},{4,8,2},{1,5,3}};
		System.out.println(minCostDP(cost,2,2));
	}
	
	
	
	public static int minCost(int[][] cost, int m, int n)
	{
	 if (n < 0 || m < 0) {
	    return Integer.MAX_VALUE;
	 }
	 else if (m == 0 && n == 0){
		 return cost[m][n]; 
	 }	    
	 else {
		 int min =  Math.min(minCost(cost, m-1, n-1),
                 minCost(cost, m-1, n));
		 min =  Math.min(min,minCost(cost, m, n-1)); 
	    return cost[m][n] +min;
	                             
	}
	}
	
	
	public static int minCostDP(int[][] cost, int m, int n)
	{
		int i,j;
	    int[][] tc = new int[3][3];
	    tc[0][0] = cost[0][0];
	 for (i = 1; i <= m; i++) {
		 tc[i][0] = tc[i-1][0] + cost[i][0];
	}
	for (j = 1; j <= n; j++) {
		tc[0][j] = tc[0][j-1] + cost[0][j];
		}
		for (i = 1; i <= m; i++)
			for (j = 1; j <= n; j++) {
				int min = Math.min(tc[i-1][j-1],
        				tc[i-1][j]);
				min = Math.min(min, tc[i][j-1]);
	            tc[i][j] = min + cost[i][j];
			}
	
			return tc[m][n];
	}
}


