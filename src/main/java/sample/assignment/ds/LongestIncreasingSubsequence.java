package sample.assignment.ds;

public class LongestIncreasingSubsequence {
	
	public static void main(String[] args){
		System.out.println("Inside main");
		int [] input = {10, 22, 9, 33, 21, 50, 41, 60, 80};
		System.out.println(LIS(input,9));
	}



public static int LIS( int[] arr, int n )
{ 
	int[] lis = new int[arr.length];
	int max =0;
	for (int i = 0; i < n; i++ )
		lis[i] = 1;

	for (int i = 1; i < n; i++){
		for (int j = 0; j < i; j++ ) {
			if ( arr[i] > arr[j] && lis[i] < lis[j] + 1){
				 lis[i] = lis[j] + 1;
			}
				
		}
	
	}

	for (int i = 0; i < n; i++ )
		if (max < lis[i])
			max = lis[i];

	return max;
}

}