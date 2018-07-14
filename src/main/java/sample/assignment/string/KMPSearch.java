package sample.assignment.string;

public class KMPSearch {

public static void main(String[] arguments){
	System.out.println("Inside main");
}



private int[] computeTemporaryArray(char pattern[]){
	int[] results = new int[pattern.length];
	int j=0;
	
	for(int i=1;i<pattern.length;){
		if(pattern[i]==pattern[j]){
			results[i]= j+1;
			j++;
			i++;
		}else {
			if(j!=0){
				j=results[j-1];
			} else {
				results[i]=0;
				i++;
			}
		}
	}
	 return results;
}


public boolean KMP(char []text, char []pattern){
    
    int lps[] = computeTemporaryArray(pattern);
    int i=0;
    int j=0;
    while(i < text.length && j < pattern.length){
        if(text[i] == pattern[j]){
            i++;
            j++;
        }else{
            if(j!=0){
                j = lps[j-1];
            }else{
                i++;
            }
        }
    }
    if(j == pattern.length){
        return true;
    }
    return false;
}

}
