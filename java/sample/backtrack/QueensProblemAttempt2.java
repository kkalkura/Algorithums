package sample.backtrack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QueensProblemAttempt2 {
	
	  public List<List<String>> solveNQueens(int n) {
		  char[][] chessTable = new char[n][n];
		  for(int i=0;i<n;i++) {
			  	for(int j=0;j<n;j++){
			  		chessTable[i][j]='.';
			  }
		  }
		  List<List<String>> result = new ArrayList<List<String>>();
		  solve(result,chessTable,0);
		  return result;
	  }
	  
	  public void solve(List<List<String>> res, char[][] chess,int row) {
		  	if(row==chess.length){
		  		res.add(construct(chess));
		  		return;
		  	}
		  
		  for(int coulumn=0;coulumn<chess.length;coulumn++){
			  
			 if(valid(chess ,row,coulumn)){
				 chess[row][coulumn]='Q';
				 solve(res,chess,row+1);
				 chess[row][coulumn]='-';
				}
			  
		  }
		  
	  }
	  
	  public boolean valid(char[][] chess,int row,int coulumn ){
		  
		  // Check all the columns
		  
		  for (int i=0;i<chess.length;i++){
			  if(chess[i][coulumn]=='Q'){
				  return false;
			  }
		  }
		  
		  
		  // 45 degree
		  
		  for (int i=row-1,j=coulumn+1;i >= 0 && j < chess.length;i--,j++){
			  if(chess[i+1][j]=='Q'){
				  return false;
			  }
		  }
		  
 // 135 degree
		  for (int i=row-1,j=coulumn-1; i >=0 && j>=0 ;i--,j--){
			  if(chess[i][j]=='Q'){
				  return false;
			  }
		  }
		  return true;
	  }
	  
	  private List<String> construct(char[][] chess) {
	        List<String> path = new ArrayList<>();
	        for (int i = 0; i < chess.length; i++) {
	            path.add(new String(chess[i]));
	        }
	        return path;
	    }

}
