package sample.backtrack;

public class StringPermutation {
	
	public static void main(String[] args){
		System.out.println("Insdie Main");
		permute("MARTY");
	}
	
	public static void permute(String s){
		permuteHelper(s,0,s.length()-1);
	}
	
	public static void permuteHelper(String original,int l,int r){
		
		System.out.println("permuteHelper(" +original+","+l+","+r);
		if(l==r){
			System.out.println(original);;
		}
		for(int i=l;i<r;i++){
			original= swap(original,l,i);
			permuteHelper(original,l+1,r);
			original= swap(original,l,i);
		}
		
	}
	
	
	 public static String swap(String a, int i, int j)
	    {
		 System.out.println("swap"+","+i+","+j+")");
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }

}
