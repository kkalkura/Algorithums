package sample.arrays;

import java.util.Arrays;

public class ArrayCloseToZero {
	
	public static void main(String[] argument ){
		System.out.println("Inside Main");
		int[] input = {60,-10,70,-80,85};
		ArrayCloseToZero sm = new ArrayCloseToZero();
		sm.twoSumClosetoZero(input);
	}  
	
	
	public void twoSumClosetoZero(int[] A){
		int i=0,j=A.length-1,temp;
		int positiveCloset= Integer.MAX_VALUE;
		int negativeCloset = Integer.MIN_VALUE;
		Arrays.sort(A);
		while(i<j) {
			temp = A[i]+A[j];
			if(temp>0){
				if(temp<positiveCloset) {
					positiveCloset =temp;
				}
				
					j--;
				
				}else if(temp<0) {
					if(temp>negativeCloset) {
						negativeCloset = temp;
					}
						i++;
					
				}
					else{
						System.out.println("Close Sum"+A[i]+A[j]);
					}
				}
		System.out.println("Close Sum"+ Math.abs(negativeCloset) + "   " +  Math.abs(positiveCloset));
				
			}
		
		
		
	}
	

