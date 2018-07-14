package sample.arrays;

public class BestTimetoBuyStock {
	
	public int maxProfit(int[] prices) {
        
      
       int maxprofit = 0;
       for (int i = 0; i < prices.length; i++) {
           if (prices[i] < prices[i-1]){
        	   maxprofit +=prices[i]-prices[i-1];
           }              
       }
       return maxprofit;
   
       
   }
	

}
