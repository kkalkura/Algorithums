package sample.arrays.test;

import java.util.Arrays;

public class MajorityElement {
	
	public static void main(String[] arg){
		 MajorityElement majorelement = new MajorityElement();
	        int a[] = new int[]{1, 3, 3, 1, 2,3,3,3,3};
	        int size = a.length;
	        majorelement.printMajority(a, size);
	}
	
	int findCandidate(int a[], int size) 
    {
		int maj_index = 0; int count =1;
		for(int i=0;i<size-1;i++){
			if(a[i]==a[maj_index]){
				count++;
			} else {
				count --;
			}
			if(count==0){
				maj_index = i;
				count=1;
			}
			
		}
        
        return a[maj_index];
    }
	
	
	
	boolean isMajority(int a[], int size, int cand) 
    {
		 int i, count = 0;
		for(i=0;i<size-1;i++){
			if(a[i]==cand){
				count++;
			}
		}
			
			if(count>size/2){
				return true;
			}else {
				return false;
			}
			
		}
       
    
	
	
	void printMajority(int a[], int size) 
    {
        /* Find the candidate for Majority*/
        int cand = findCandidate(a, size);
 
        /* Print the candidate if it is Majority*/
        if (isMajority(a, size, cand))
            System.out.println(" " + cand + " ");
        else
            System.out.println("No Majority Element");
    }
		

}
