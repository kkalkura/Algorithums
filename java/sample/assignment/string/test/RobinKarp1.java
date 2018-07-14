package sample.assignment.string.test;

import sample.assignment.string.RobinKarp;

public class RobinKarp1 {
	
	private int prime =101;
	
	public int patternMatch(char[] text , char[] pattern){
		int patternLength = pattern.length;
		int textLength = text.length;
		long patternHash = createHash(pattern,patternLength-1);
		long textHash = createHash(text,patternLength-1);
		
		for (int i = 1; i <= textLength - patternLength + 1; i++) {
			
			if((textHash==patternHash) && checkEqual(text,i-1,i+patternLength-2,pattern,0,patternLength-1)){
				return i-1;
			}
			
			if(i < textLength - patternLength + 1) {
                textHash = recalculateHash(text, i - 1, i + patternLength - 1, textHash, patternLength);
            }
			
			
            
        }
		return -1;
	}
	
	public long createHash(char[] pattern , int end){
		long hash =0;
		for(int i=0;i<end;i++){
			hash += pattern[i]*Math.pow(prime, i);
		}
		return hash;
	}
	
	

	private long recalculateHash(char[] str,int oldIndex, int newIndex,long oldHash, int patternLen){
		long hash =oldHash-str[oldIndex];
		hash = hash/prime;
		hash +=  str[newIndex]*Math.pow(prime, patternLen-1);
		return hash;

		
	}
	
	

	private boolean checkEqual(char str1[],int start,int end, char str2[],int start1,int end1){
		if(end-start!=end1-start1){
			return false;
		}
		
		while(start<end && start1<end1){
			
			if(str1[start]!=str2[start1]){
				return false;
			}
			start++;
			start1++;
		}
		
		return true;
		
		
	}
	
	
	 public static void main(String args[]){
	    	RobinKarp rks = new RobinKarp();
	        System.out.println(rks.patternSearch("TusharRoy".toCharArray(), "sharRoy".toCharArray()));
	        System.out.println(rks.patternSearch("TusharRoy".toCharArray(), "Roy".toCharArray()));
	        System.out.println(rks.patternSearch("TusharRoy".toCharArray(), "shas".toCharArray()));
	        System.out.println(rks.patternSearch("TusharRoy".toCharArray(), "usha".toCharArray()));
	        System.out.println(rks.patternSearch("TusharRoy".toCharArray(), "Tus".toCharArray()));
	    }

}
