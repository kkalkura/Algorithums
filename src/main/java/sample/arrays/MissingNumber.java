package sample.arrays;

public class MissingNumber {
	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		int[] input = {1,2,4,6,3,7,8};
		System.out.println(FindMissingNumber(input));
	}
	
	
	public static int FindMissingNumber(int[] A){
		int i, X = 0,Y=0, n=A.length;
		for(i=0;i<n;i++){
			X^= A[i];
		}
		System.out.println("The Value of X"+X);
		for(i=1;i<=n+1;i++){
			Y^= i;
		}
		System.out.println("The Value of Y"+Y);
		
		return X^Y;
	}

}
