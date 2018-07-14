package sample.recursion;

public class QueenProblem {
	
	private int[][] chessTable;
	private int numberofQueens;
	
	
	public static void main(String[] args){
		QueenProblem problem =  new QueenProblem(8);
		problem.solve();
		
	}
	
	
	public QueenProblem( int numberofQueens) {
		super();
		this.chessTable = new int[numberofQueens][numberofQueens];
		this.numberofQueens = numberofQueens;
	}
	
	private void solve(){
		if(setQueens(0)) {
			 printQueen();
		} else {
			System.out.println("There is no Solutions");
		}
	}


	private boolean setQueens(int colIndex) {
		if(colIndex==numberofQueens){
			return true;
		}
		for(int rowIndex=0;rowIndex<numberofQueens;++rowIndex) {
			if(isPlaceValid(rowIndex,colIndex)) {
			
			chessTable[rowIndex][colIndex]=1;
			
			if(setQueens(colIndex+1))
			{
				return true;
			}
			
			// backtracking
			chessTable[rowIndex][colIndex]=0;
			}
			
		}
		
		return false;
	}


	private boolean isPlaceValid(int rowIndex, int colIndex) {
		for(int i=0;i<colIndex;i++)
			if( chessTable[rowIndex][i] == 1)
				return false;
		
		for(int i=rowIndex, j=colIndex;i>=0 && j>=0;i--,j--) {
			if( chessTable[i][j] == 1 ) 
				return false;
		}
		
		for(int i=rowIndex, j=colIndex;i<chessTable.length && j>=0;i++,j--) {
			if( chessTable[i][j] == 1)
				return false;
		}
		
		return true;
	}


	private void printQueen(){
		for(int i=0;i<chessTable.length;i++){
			for(int j=0;j<chessTable.length;j++){
				if(chessTable[i][j] ==1){
					System.out.print(" * ");
					
				} else {
					System.out.print(" - ");
					
				}
				
			}
			System.out.println();
		}
		
	
		
	}

}
