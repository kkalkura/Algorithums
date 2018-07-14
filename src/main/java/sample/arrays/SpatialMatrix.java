package sample.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpatialMatrix {
	
	public static void main(String[] args){
		System.out.println("Inside main");
	}
	
	List<Integer> printSpaMatrix(int[][] input){
		List<Integer> results = new ArrayList<Integer>();
		if(input.length==0){
			return results;
		}
		
		int r1 =0;
		int r2= input.length-1;
		int c1 =0;
		int c2 = input[0].length-1;
		
		while(r1<=r2 && c1<=c2){
			for(int c = c1;c<=c2 ; c++) results.add(input[r1][c]);
			for(int r=r1+1;r<=r2;r++) results.add(input[r][c2]);
			if(r1<r2 && c1<c2){
				for(int c=c2-1;c>c1;c--) results.add(input[r2][c]);
				for(int r=r2;r>r1;r--) results.add(input[r][c1]);
			}
			r1++;
			r2--;
			c1++;
			c2--;
		}
		
		return results;
	}

}
