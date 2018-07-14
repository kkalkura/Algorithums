package sample.arrays;

import java.util.Arrays;

public class SumArrayProblem {
	
	public static void main(String[] argument ){
		System.out.println("Inside Main");
		int[] input = {1,2,4,5,6};
		SumArrayProblem sm = new SumArrayProblem();
		sm.twoSumK(input,5);
	}
	
	
	public void twoSumK(int[] A, int k){
		int i ,j ,temp;
		Arrays.sort(A);
		for(i=0,j=A.length-1;i<j;){
			temp = A[i]+A[j];
			if(temp==k){
				System.out.println("Got the Sums"+ i+"   "+j);
				return;
			} else if(temp<k){
				i=i+1;
			} else {
				j = j-1;
			}
			 
		}
	}

}
