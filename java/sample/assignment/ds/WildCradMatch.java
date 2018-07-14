package sample.assignment.ds;

public class WildCradMatch {
	
	public static void main(String[] args){
		System.out.println("Inaside Main");
	}
	
	
	 public boolean isMatch(String s, String p) {
		 return isMatch(s.toCharArray(),p.toCharArray());
	 }
	 
	 
	 public boolean isMatch(char[] s, char[] p) {
		 
		 int writeIndex = 0;
	        boolean isFirst = true;
	        for ( int i = 0 ; i < p.length; i++) {
	            if (p[i] == '*') {
	                if (isFirst) {
	                    p[writeIndex++] = p[i];
	                    isFirst = false;
	                }
	            } else {
	                p[writeIndex++] = p[i];
	                isFirst = true;
	            }
	        }
		 boolean T [][] = new boolean[s.length+1][writeIndex + 1];
		 T[0][0] = true;
		 if (writeIndex > 0 && p[0] == '*') {
	            T[0][1] = true;
	        }

		 for (int i = 1; i < T.length; i++) {
	            for (int j = 1; j < T[0].length; j++) {
	                if (p[j-1] == '?' || s[i-1] == p[j-1]) {
	                    T[i][j] = T[i-1][j-1];
	                } else if (p[j-1] == '*'){
	                    T[i][j] = T[i-1][j] || T[i][j-1];
	                }
	            }
	        }
		 
		 
		
		 return T[s.length][p.length];
	 }

}
