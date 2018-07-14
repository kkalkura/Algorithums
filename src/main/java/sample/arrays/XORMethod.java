package sample.arrays;

public class XORMethod {
	
	public static void main(String[] argument){
		System.out.println("Inside the main");
		int[] input = {3,2,1,2,2,3};
		System.out.println(FindMissingNumber(input));
	//	System.out.println(FindMissingNegation(input));
	}
	
	
	public static int FindMissingNumber(int[] A){
		int i, X = 0,Y=0, n=A.length;
		for(i=0;i<n;i++){
			X^= A[i];
		}
		
		for(i = 1; i <= n+1; i++ ){
			Y^= i;
		}
		
		return X^Y;
	}
	
	public static int FindMissingNegation(int[] A){
		for(int i=0;i<A.length;i++){
			if(A[Math.abs(A[i])] <0) {
				System.out.println("Duplicate Exist");
				return i;
			} else {
				A[Math.abs(A[i])] = -A[Math.abs(A[i])];
			}
			
		}
		System.out.println("No Dupicate Exist");
		return -1;
	}
}
