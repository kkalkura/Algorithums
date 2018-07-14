package sample.assignment.string;

public class KMPSearch2 {

public static void main(String[] arguments){
	System.out.println("Inside main");
}



private int[] computeTemporaryArray(char pattern[]){
	int[] lookuptable = new int[pattern.length];
	int j=0;
	for(int i=1;i<pattern.length;){
		if(pattern[i]==pattern[j]){
			lookuptable[i] = j+1;
			i++;
			j++;
		} else {
			if(j!=0){
				j = lookuptable[j-1];
			}
			else {
				lookuptable[i] =0;
				i++;
			}
		}
		
	}
	
	
	return lookuptable;
}


public boolean KMP(char []text, char []pattern){
	int[] lp = computeTemporaryArray(pattern);
	int i=0;
	int j=0;
	
	while(i<text.length && j<pattern.length){
		if(text[i]== pattern[j]){
			i++;
			j++;
		} else {
			if(j!=0){
				j = lp[j-1];
			} else {
				i++;
			}
		}
	} 
	if(j== pattern.length){
		return true;
	} else {
		return false;
	}
    
   
}

}
