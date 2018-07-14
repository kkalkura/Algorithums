package sample.backtrack;

public class QueensProblem {
	
	private int[][] chesstable;
	private int numberofQueens;
	
	public static void main(String[] args) {
		
		System.out.println("Inside main");
		
		QueensProblem qp = new QueensProblem(8);
		qp.solve();
		
		
	}
	
	public QueensProblem(int numOfQueens) {
		this.chesstable = new int[numOfQueens][numOfQueens];
		this.numberofQueens = numOfQueens;
	}
	
	public void solve(){
		
		
			
			if(setQueen(0)){
				System.out.println("Able to find the solution");
				printQueens();
			} else {
				System.out.println("Not able to find Queen");
			}
			
		}
		
	
	
	private boolean setQueen(int colIndex){
		if(colIndex== numberofQueens){
			System.out.println("reached");
			return true;
		}
		
		for(int rowIndex=0;rowIndex<numberofQueens;rowIndex++){
			if(isPlaceValid(rowIndex,colIndex)){
				chesstable[rowIndex][colIndex]=1;
			 
			if(setQueen(colIndex+1)){
				return true;
			}
			
			//
			chesstable[rowIndex][colIndex]=0;
		}
		}
		
		return false;
	}
	
	
	private boolean isPlaceValid(int rowIndex, int colIndex) {
		
		for(int i=0;i<colIndex;i++)
			if( chesstable[rowIndex][i] == 1)
				return false;
		
		for(int i=rowIndex, j=colIndex;i>=0 && j>=0;i--,j--) {
			if( chesstable[i][j] == 1 ) 
				return false;
		}
		
		for(int i=rowIndex, j=colIndex;i<chesstable.length && j>=0;i++,j--) {
			if( chesstable[i][j] == 1)
				return false;
		}
		
		return true;
	}

	private void printQueens() {
		
		for(int i=0;i<chesstable.length;i++) {
			for(int j=0;j<chesstable.length;j++) {
				if( chesstable[i][j] == 1 ) {
					System.out.print(" * ");
				} else {
					System.out.print(" - ");
				}
			}
			
			System.out.println();
		}
	}
	
	
private void resetChessBoard() {
		
		for(int i=0;i<chesstable.length;i++) {
			for(int j=0;j<chesstable.length;j++) {
				 chesstable[i][j] = 0 ;
			}
		
		}
	}


}
