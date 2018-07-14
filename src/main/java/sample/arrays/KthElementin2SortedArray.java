package sample.arrays;

public class KthElementin2SortedArray {
	
	public static void main(String[] args){
		int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        int k = 5;
        System.out.println(kth(arr1,arr2,0,0,arr1.length,arr2.length,8));
	}
	
	public static int kth(int[] arr1, int[] arr2, int start1 ,  int start2 ,  int end1,int end2, int k)
	{
	    if (start1==end1)
	        return arr2[k];
	    if (start2==end2)
	        return arr1[k];
	    int mid1 = (end1 - start1) / 2;
	    int mid2 = (end2 - start2) / 2;
	    if (mid1 + mid2 < k)
	    {
	        if (arr1[mid1] > arr2[mid2])
	            return kth(arr1,  arr2,start1,start2 + mid2 + 1, end1, end2,
	                k - mid2 - 1);
	        else
	            return kth(arr1,arr2,start1 + mid1 + 1, start2, end1, end2,
	                k - mid1 - 1);
	    }
	    else
	    {
	        if (arr1[mid1] > arr2[mid2])
	            return kth(arr1, arr2, start1,start2,start1 + mid1, end2, k);
	        else
	            return kth(arr1, arr2, start1,start2,end1, start2 + mid2, k);
	    }
	}
	

}
